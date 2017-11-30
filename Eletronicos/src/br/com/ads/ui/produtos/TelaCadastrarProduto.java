package br.com.ads.ui.produtos;

import br.com.ads.DAO.ProdutoDAO;
import br.com.ads.model.produtos.Produto;
import br.com.ads.service.produto.ServicoProduto;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 * Tela de cadastro de produtos
 */
public class TelaCadastrarProduto extends javax.swing.JInternalFrame {

    /**
     * Construtor e inicialização de componentes
     */
    public TelaCadastrarProduto() {
        initComponents();
    }

    /**
     * Método criado pelo GUI Builder para montagem da tela
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonFechar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fieldCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldPreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        fieldDescricao = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Produto");

        buttonFechar.setText("Fechar");
        buttonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFecharActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        jLabel7.setText("Código:");

        jLabel1.setText("Nome:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Preço (BRL):");

        jLabel4.setText("Quantidade:");

        jLabel6.setText("Categoria:");

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TVs", "Audio", "SmartPhone", "Consoles", "Computadores" }));

        jLabel5.setText("Descrição:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonFechar)
                        .addGap(226, 226, 226)
                        .addComponent(buttonSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldMarca)
                            .addComponent(fieldDescricao)
                            .addComponent(fieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fieldPreco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fieldQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonFechar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Listener de fechamento
    private void buttonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonFecharActionPerformed

    //Listener do botão salvar
    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        //Cria uma instância do produto e obtém
        //seus valores dos campos da tela
        Produto produto = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        
        produto.setCodigo(fieldCodigo.getText());
        produto.setNome(fieldNome.getText());
        produto.setMarca(fieldMarca.getText());
        produto.setPreco(Integer.parseInt(fieldPreco.getText()));
        produto.setQuantidade(Integer.parseInt(fieldQuantidade.getText()));
        produto.setCategoria((String) comboCategoria.getSelectedItem());
        produto.setDescrição(fieldDescricao.getText());
        dao.create(produto);
        
//        produto.setCodigo(fieldCodigo.getText().trim());
//        produto.setNome(fieldNome.getText().trim());
//        produto.setMarca(fieldMarca.getText().trim());
//        produto.setCategoria((String) comboCategoria.getSelectedItem());
//        produto.setDescrição(fieldDescricao.getText().trim());
        
        try {
            //converto para o formato de moeda
            String preco = fieldPreco.getText().trim();
            if (preco.indexOf("R$") != 0) preco = "R$ " + preco;
            preco = String.valueOf(NumberFormat.getCurrencyInstance().parse(preco));
            produto.setPreco(Float.parseFloat(preco));
            Integer quantidade = Integer.parseInt(fieldQuantidade.getText());
            produto.setQuantidade(quantidade);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            //Chama o serviço para cadastrar o produto
            ServicoProduto.cadastrarProduto(produto);
        } catch (Exception e) {
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Caso tenha cadastrado exibe a mensagem de sucesso
        JOptionPane.showMessageDialog(rootPane, "Produto cadastrado com sucesso",
                "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);

        //Limpa os campos da tela após realizar a inserção        
        fieldCodigo.setText("");
        fieldNome.setText("");
        fieldPreco.setText("");
        fieldMarca.setText("");
        fieldQuantidade.setText("");
        comboCategoria.setSelectedIndex(0);
        fieldDescricao.setText("");        
    }//GEN-LAST:event_buttonSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFechar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldDescricao;
    private javax.swing.JTextField fieldMarca;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldPreco;
    private javax.swing.JTextField fieldQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
