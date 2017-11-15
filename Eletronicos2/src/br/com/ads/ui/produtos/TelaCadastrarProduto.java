package br.com.ads.ui.produtos;

import br.com.ads.model.produtos.Produto;
import br.com.ads.service.produto.ServicoProduto;
import javax.swing.JOptionPane;


public class TelaCadastrarProduto extends javax.swing.JInternalFrame {

    /**
     * Construtor e inicialização de componentes
     */
    public TelaCadastrarProduto() {
        initComponents();
        System.out.println("uol");
    }

    /**
     * Método criado pelo GUI Builder para montagem da tela
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCodigo = new javax.swing.JLabel();
        buttonFechar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        fFieldCodigo = new javax.swing.JFormattedTextField();
        labelNumero1 = new javax.swing.JLabel();
        fFieldNome = new javax.swing.JFormattedTextField();
        labelNumero2 = new javax.swing.JLabel();
        fFieldCategoria = new javax.swing.JFormattedTextField();
        labelNumero3 = new javax.swing.JLabel();
        fFieldMarca = new javax.swing.JFormattedTextField();
        labelNumero4 = new javax.swing.JLabel();
        fFieldQuantidade = new javax.swing.JFormattedTextField();
        labelNumero5 = new javax.swing.JLabel();
        fFieldPreco = new javax.swing.JFormattedTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Produto");

        labelCodigo.setText("Código:");

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

        fFieldCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        fFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fFieldCodigoActionPerformed(evt);
            }
        });

        labelNumero1.setText("Nome:");

        fFieldNome.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        fFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fFieldNomeActionPerformed(evt);
            }
        });

        labelNumero2.setText("Categoria:");

        fFieldCategoria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        fFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fFieldCategoriaActionPerformed(evt);
            }
        });

        labelNumero3.setText("Marca: ");

        fFieldMarca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        fFieldMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fFieldMarcaActionPerformed(evt);
            }
        });

        labelNumero4.setText("Quantidade:");

        fFieldQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        labelNumero5.setText("Preço:");

        fFieldPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNumero4)
                    .addComponent(labelNumero5)
                    .addComponent(labelCodigo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelNumero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelNumero1)
                        .addComponent(labelNumero3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(fFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(fFieldNome)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(buttonSalvar)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero1)
                    .addComponent(fFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodigo)
                    .addComponent(fFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNumero2)
                    .addComponent(fFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero3)
                    .addComponent(fFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero4)
                    .addComponent(fFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero5)
                    .addComponent(fFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
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
        //Cria uma instância do produtos e obtém
        //seus valores dos campos da tela
        Produto produto = new Produto();
        
        /*Long numero = null;
        try {
            Number number = (Number) fFieldNumero.getValue();
            numero = number.longValue();
        } catch (Exception e) {

        }
        qua.setNumero(numero);
        
        Long andar = null;
        try {
            Number number = (Number) fFieldAndar.getValue();
            andar = number.longValue();
        } catch (Exception e) {

        }
        qua.setAndar(andar);
        
        qua.setTipo((String) comboTipo.getSelectedItem());*/

        try {
            //Chama o serviço para cadastro do produto
            ServicoProduto.cadastrarProduto(produto);
        } catch (Exception e) {
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Caso tenha chegado até aqui, o produto foi inserido com sucesso
        //Então exibe uma mensagem de sucesso para o usuário
        JOptionPane.showMessageDialog(rootPane, "Produto inserido com sucesso!",
                "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);

        //Limpa os campos da tela após realizar a inserção        
        fFieldCodigo.setText("");
        fFieldCodigo.setValue(null);
        fFieldNome.setText("");
        fFieldNome.setValue(null);
        fFieldCategoria.setText("");
        fFieldCategoria.setValue(null);
        fFieldMarca.setText("");
        fFieldMarca.setValue(null);
        fFieldQuantidade.setText("");
        fFieldQuantidade.setValue(null);
        fFieldPreco.setText("");
        fFieldPreco.setValue(null);
        
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void fFieldMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fFieldMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fFieldMarcaActionPerformed

    private void fFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fFieldCategoriaActionPerformed

    private void fFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fFieldCodigoActionPerformed

    private void fFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fFieldNomeActionPerformed
        // TODO add your handling code here:
        fFieldNome.setText("");
        fFieldNome.setValue(null);
    }//GEN-LAST:event_fFieldNomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFechar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JFormattedTextField fFieldCategoria;
    private javax.swing.JFormattedTextField fFieldCodigo;
    private javax.swing.JFormattedTextField fFieldMarca;
    private javax.swing.JFormattedTextField fFieldNome;
    private javax.swing.JFormattedTextField fFieldPreco;
    private javax.swing.JFormattedTextField fFieldQuantidade;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNumero1;
    private javax.swing.JLabel labelNumero2;
    private javax.swing.JLabel labelNumero3;
    private javax.swing.JLabel labelNumero4;
    private javax.swing.JLabel labelNumero5;
    // End of variables declaration//GEN-END:variables
}
