
package br.com.ads.DAO;

import br.com.ads.connection.ConnectionFactory;
import br.com.ads.model.produtos.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    // inserir no banco de dados
    public void create(Produto produto){
        Connection con = ConnectionFactory.getConnetion();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO produto ( nome, marca, preco, quantidade, categoria, descricao) VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, produto.getCodigo());
            stmt.setString(2, produto.getNome());
            stmt.setString(3, produto.getMarca());
            stmt.setDouble(4, produto.getPreco());
            stmt.setInt(5, produto.getQuantidade());
            stmt.setString(6, produto.getCategoria());
            stmt.setString(7, produto.getDescricao());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar! "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
 }
    
}
