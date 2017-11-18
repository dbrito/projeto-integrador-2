package br.com.ads.ui.vendas;

import br.com.ads.exceptions.ProdutoException;
import br.com.ads.model.produtos.Produto;
import br.com.ads.model.vendas.ItemVenda;
import br.com.ads.service.produto.ServicoProduto;
import br.com.ads.ui.principal.TelaPrincipal;
import java.awt.Dimension;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Tela de consulta de produtos
 */
public class TelaSelecionarProdutos extends javax.swing.JInternalFrame {

    //Instância do form de edição de produtos
    //TelaEditarProduto formEditarProduto = new TelaEditarProduto();

    /**
     * Construtor e inicialização de componentes
     */
    public TelaSelecionarProdutos() {
        initComponents();
    }

    //Atualiza a lista de produtos. Pode ser chamado por outras telas
    public boolean refreshList() throws ProdutoException, Exception {
        //Realiza a pesquisa de produtos com o último valor de pesquisa
        //para atualizar a lista
        String termo = fieldPesquisa.getText().trim();
        List<Produto> resultado = ServicoProduto.procurarProduto((!termo.equals("") ? termo : null));

        //Obtém o elemento representante do conteúdo da tabela na tela
        DefaultTableModel model = (DefaultTableModel) tabelaResultados.getModel();
        //Indica que a tabela deve excluir todos seus elementos
        //Isto limpará a lista, mesmo que a pesquisa não tenha sucesso
        model.setRowCount(0);

        //Verifica se não existiram resultados. Caso afirmativo, encerra a
        //atualização e indica ao elemento acionador o não sucesso da pesquisa
        if (resultado == null || resultado.size() <= 0) {
            return false;
        }

        //Percorre a lista de resultados e os adiciona na tabela
        for (int i = 0; i < resultado.size(); i++) {
            Produto prd = resultado.get(i);
            if (prd != null) {
                Object[] row = new Object[6];
                row[0] = prd.getCodigo();
                row[1] = prd.getNome();
                row[2] = prd.getMarca();
                row[3] = prd.getCategoria();
                row[4] = NumberFormat.getCurrencyInstance().format(prd.getPreco());
                row[5] = 1;
                model.addRow(row);
            }
        }

        //Se chegamos até aqui, a pesquisa teve sucesso, então
        //retornamos "true" para o elemento acionante, indicando
        //que não devem ser exibidas mensagens de erro
        return true;
    }

    /**
     * Código criado pelo GUI Builder para montagem da tela
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPesquisarQuarto = new javax.swing.JLabel();
        scrollTabelaResultados = new javax.swing.JScrollPane();
        tabelaResultados = new javax.swing.JTable();
        buttonFechar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();
        buttonPesquisar = new javax.swing.JButton();
        fieldPesquisa = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Selecionar Produtos");

        labelPesquisarQuarto.setText("Pesquisar: ");

        tabelaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Códgio", "Nome", "Marca", "Categoria", "Preco", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaResultados.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        scrollTabelaResultados.setViewportView(tabelaResultados);

        buttonFechar.setText("Fechar");
        buttonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFecharActionPerformed(evt);
            }
        });

        buttonAlterar.setText("Selecionar");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelecionarActionPerformed(evt);
            }
        });

        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTabelaResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPesquisarQuarto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAlterar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPesquisarQuarto)
                    .addComponent(buttonPesquisar)
                    .addComponent(fieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTabelaResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFechar)
                    .addComponent(buttonAlterar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Listener do botão fechar
    private void buttonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonFecharActionPerformed

    private void buttonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelecionarActionPerformed
        try {
            if (this.getDesktopPane().getTopLevelAncestor() instanceof TelaPrincipal) {
                TelaPrincipal principal = (TelaPrincipal) this.getDesktopPane().getTopLevelAncestor();
                if (principal != null) {                    
                    int[] meuk = tabelaResultados.getSelectedRows();
                    for (int i : meuk) {
                        ItemVenda item = new ItemVenda();                                                                        
                        item.setProduto(ServicoProduto.obterProduto((String)tabelaResultados.getValueAt(i, 0)));
                        item.setQuantidade((Integer)tabelaResultados.getValueAt(i, 5));                        
                        principal.getRealizaVenda().adicionaItem(item);
                        this.dispose();
                    }                                                                                
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }        
    }//GEN-LAST:event_buttonSelecionarActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        Boolean resultSearch;
        try {
            resultSearch = refreshList();
        } catch (Exception e) {
            //Exibe mensagens de erro na fonte de dados e para o listener
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Exibe mensagem de erro caso a pesquisa não tenha resultados
        if (!resultSearch) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou " + "resultados ", "Sem resultados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonPesquisarActionPerformed

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
    private javax.swing.JButton buttonFechar;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JTextField fieldPesquisa;
    private javax.swing.JLabel labelPesquisarQuarto;
    private javax.swing.JScrollPane scrollTabelaResultados;
    private javax.swing.JTable tabelaResultados;
    // End of variables declaration//GEN-END:variables
}
