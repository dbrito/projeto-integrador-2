
package br.com.ads.DAO;

import br.com.ads.connection.ConnectionFactory;
import br.com.ads.model.produtos.Produto;
import br.com.ads.model.vendas.ItemVenda;
import br.com.ads.model.vendas.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendaDAO {
    
    //Insere um cliente na tabela "cliente" do banco de dados
    public static void criar(Venda venda) throws SQLException, Exception {
        //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do clientes passados como parâmetro
        String sql = "INSERT INTO venda (id_cliente, data_venda) VALUES (?, ?)";
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionFactory.getConnetion();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setInt(1, venda.getCliente().getId());
            java.sql.Date dt = new java.sql.Date ((new Date()).getTime());
            preparedStatement.setDate(2, dt);
            preparedStatement.execute();
            
            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()) {
                int idVenda = rs.getInt(1);
                salvarItensVenda(venda, idVenda);
            }            
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static void salvarItensVenda(Venda venda, int idVenda) throws SQLException, Exception {
        for (ItemVenda item : venda.getItens()) {            
            Produto prd = item.getProduto();
            prd.setQuantidade(prd.getQuantidade() - item.getQuantidade());
            
            salvarItenVenda(item, idVenda);
            atualizarEstoque(item);
        }
    }
    
    public static void salvarItenVenda(ItemVenda item, int idVenda) throws SQLException, Exception {
        String sql = "INSERT INTO item_venda (id_produto, quantidade, id_venda) VALUES (?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionFactory.getConnetion();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, item.getProduto().getId());
            preparedStatement.setInt(2, item.getQuantidade());
            preparedStatement.setInt(3, idVenda);
            preparedStatement.execute();            
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    
    public static void atualizarEstoque(ItemVenda item) throws SQLException, Exception {        
        Produto prd = item.getProduto();        
        String sql = "UPDATE produto SET quantidade=? WHERE (id=?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionFactory.getConnetion();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, prd.getQuantidade());
            preparedStatement.setInt(2, prd.getId());
            preparedStatement.execute();            
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    
    
    public static List<Venda> pegaRelatório() throws SQLException, Exception {
        Connection con = ConnectionFactory.getConnetion();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Venda> vendas = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM venda");
            rs = stmt.executeQuery();
            while (rs.next()) {                
                Date d = new Date(rs.getTimestamp("data_venda").getTime());
                Venda venda = new Venda();
                venda.setId(rs.getInt("id_venda"));
                venda.setData(d);                
                venda.setCliente(ClienteDAO.obter(rs.getInt("id_cliente")));                
                List<ItemVenda> itens = pegaItens(venda.getId());    
                for (ItemVenda item : itens) {
                    venda.addItem(item);
                }
                vendas.add(venda);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);            
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
            return vendas;
        }
    }
    
    public static List<Venda> pegaRelatório(Date de, Date ate) throws SQLException, Exception {
        Connection con = ConnectionFactory.getConnetion();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Venda> vendas = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM venda WHERE data_venda >= ? AND data_venda <= ?");
            stmt.setDate(1, (new java.sql.Date(de.getTime())));
            stmt.setDate(2, (new java.sql.Date(ate.getTime())));
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Date d = new Date(rs.getTimestamp("data_venda").getTime());
                Venda venda = new Venda();
                venda.setId(rs.getInt("id_venda"));
                venda.setData(d);                
                venda.setCliente(ClienteDAO.obter(rs.getInt("id_cliente")));                
                List<ItemVenda> itens = pegaItens(venda.getId());    
                for (ItemVenda item : itens) {
                    venda.addItem(item);
                }
                vendas.add(venda);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);            
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
            return vendas;
        }
    }
    
    private static List<ItemVenda> pegaItens(int idVenda) throws SQLException, Exception {
        Connection con = ConnectionFactory.getConnetion();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<ItemVenda> itens = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM item_venda where id_venda=?");
            stmt.setInt(1, idVenda);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                
                ItemVenda item = new ItemVenda();
                item.setQuantidade(rs.getInt("quantidade"));
                item.setProduto(ProdutoDAO.obter(rs.getInt("id_produto")));                
                itens.add(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);            
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
            return itens;
        }
    }

}
