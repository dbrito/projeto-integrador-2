package br.com.ads.ui.vendas;

import br.com.ads.model.clientes.Cliente;
import br.com.ads.model.produtos.Produto;
import br.com.ads.exceptions.ClienteException;
import br.com.ads.mock.MockVenda;
import br.com.ads.model.vendas.ItemVenda;
import br.com.ads.model.vendas.Venda;
import br.com.ads.service.cliente.ServicoCliente;
import br.com.ads.service.produto.ServicoProduto;
import br.com.ads.service.venda.ServicoVenda;
import br.com.ads.ui.principal.TelaPrincipal;
import br.com.ads.ui.produtos.TelaEditarProduto;
import java.awt.Dimension;
import java.text.NumberFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Tela de consulta de clientes
 */
public class TelaRealizarVenda extends javax.swing.JInternalFrame {
    //Instância do form de edição de clientes
    //TelaEditarCliente formEditarCliente = new TelaEditarCliente();
    //Armazena a última pesquisa realizada
    String ultimaPesquisa = null;
    Venda venda = new Venda();
    TelaSelecionarCliente selecionaCliente = new TelaSelecionarCliente();
    TelaSelecionarProdutos selecionaProdutos = new TelaSelecionarProdutos();

    //Construtor e inicialização de componentes
    public TelaRealizarVenda() {
        initComponents();
    }

    //Código gerado do GUI Builder
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPesquisa = new javax.swing.JLabel();
        tabelaResultadosScroll = new javax.swing.JScrollPane();
        tabelaResultados = new javax.swing.JTable();
        buttonCancelar = new javax.swing.JButton();
        buttonSelecionarCliente = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();
        lbCliente = new javax.swing.JLabel();
        labelPesquisa1 = new javax.swing.JLabel();
        buttonSelecionarItens = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Realizar Venda");

        labelPesquisa.setText("Selecionar Cliente");

        tabelaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preco", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaResultados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaResultadosScroll.setViewportView(tabelaResultados);

        buttonCancelar.setText("Fechar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonSelecionarCliente.setText("Selecionar");
        buttonSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelecionarClienteActionPerformed(evt);
            }
        });

        buttonAlterar.setText("Vender");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelecionarActionPerformed(evt);
            }
        });

        lbCliente.setBackground(new java.awt.Color(108, 106, 106));
        lbCliente.setText(".");

        labelPesquisa1.setText("Selecionar Produtos");

        buttonSelecionarItens.setText("Selecionar");
        buttonSelecionarItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelecionarItensActionPerformed(evt);
            }
        });

        lbTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTotal.setText("Total: R$ 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelaResultadosScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAlterar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPesquisa)
                                .addGap(18, 18, 18)
                                .addComponent(buttonSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPesquisa1)
                                .addGap(18, 18, 18)
                                .addComponent(buttonSelecionarItens, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPesquisa)
                    .addComponent(buttonSelecionarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCliente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPesquisa1)
                    .addComponent(buttonSelecionarItens))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabelaResultadosScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonAlterar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Listener do botão de pesquisa
    private void buttonSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelecionarClienteActionPerformed
        selecionaCliente.dispose();
        selecionaCliente = new TelaSelecionarCliente();
        this.getParent().add(selecionaCliente);
        this.openFrameInCenter(selecionaCliente);                
        selecionaCliente.toFront();
    }//GEN-LAST:event_buttonSelecionarClienteActionPerformed
        
    public void defineCliente(Cliente clt) {
        venda.setCliente(clt);
        lbCliente.setText(clt.getNome());
    }
    
    public void adicionaItem(ItemVenda item) {
        venda.addItem(item);
        try {
            refreshList();
        } catch (Exception ex) {
            Logger.getLogger(TelaRealizarVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Atualiza a lista de clientes. Pode ser chamado por outras telas
    public boolean refreshList() throws ClienteException, Exception {        
        List<ItemVenda> resultado = venda.getItens();        
        DefaultTableModel model = (DefaultTableModel) tabelaResultados.getModel();        
        model.setRowCount(0);

        if (resultado == null || resultado.size() <= 0) {
            return false;
        }

        //Percorre a lista de resultados e os adiciona na tabela
        float total = 0;
        for (int i = 0; i < resultado.size(); i++) {
            ItemVenda item = resultado.get(i);
            if (item != null) {                
                Produto prd = item.getProduto();
                Object[] row = new Object[3];
                row[0] = prd.getNome();
                row[1] = NumberFormat.getCurrencyInstance().format(prd.getPreco() * item.getQuantidade());
                row[2] = item.getQuantidade();
                model.addRow(row);
                total += prd.getPreco() * item.getQuantidade();
            }
        }
        lbTotal.setText("Total: " + NumberFormat.getCurrencyInstance().format(total));                
        return true;
    }

    //Listener do botão cancelar
    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    //Trata o clique no botão de alteração
    private void buttonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelecionarActionPerformed
        try {
            //Chama o serviço para realização da venda
            ServicoVenda.realizarVenda(venda);
        } catch (Exception e) {
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(rootPane, "Venda realizada com sucesso", "Venda efetuada", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();        
    }//GEN-LAST:event_buttonSelecionarActionPerformed

    private void buttonSelecionarItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelecionarItensActionPerformed
        selecionaProdutos.dispose();
        selecionaProdutos = new TelaSelecionarProdutos();
        this.getParent().add(selecionaProdutos);
        this.openFrameInCenter(selecionaProdutos);                
        selecionaProdutos.toFront();
    }//GEN-LAST:event_buttonSelecionarItensActionPerformed

    //Abre um internal frame centralizado na tela
    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = this.getParent().getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSelecionarCliente;
    private javax.swing.JButton buttonSelecionarItens;
    private javax.swing.JLabel labelPesquisa;
    private javax.swing.JLabel labelPesquisa1;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tabelaResultados;
    private javax.swing.JScrollPane tabelaResultadosScroll;
    // End of variables declaration//GEN-END:variables
}
