package br.com.ads.ui.produtos;

import br.com.ads.model.produtos.Produto;
import br.com.ads.service.produto.ServicoProduto;
import br.com.ads.ui.principal.TelaPrincipal;
import javax.swing.JOptionPane;

/**
 * Tela de atualização de produtos
 */
public class TelaEditarProduto extends javax.swing.JInternalFrame {
    private Produto produto = new Produto();
    /**
     * Construtor e inicialização de componentes
     */
    public TelaEditarProduto() {
        initComponents();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * Método criado pelo GUI Builder para montagem da tela
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonFechar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
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
        setResizable(true);
        setTitle("Alterar Produto");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

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

        jLabel1.setText("Nome:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Preço:");

        jLabel4.setText("Quantidade:");

        jLabel6.setText("Categoria:");

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TVs", "Audio", "SmarthPhone", "Consoles", " ", " ", " " }));

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
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldNome)
                            .addComponent(fieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldMarca)
                            .addComponent(fieldPreco)
                            .addComponent(fieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
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
        produto.setNome(fieldNome.getText());
        produto.setMarca(fieldMarca.getText());
        produto.setCategoria((String) comboCategoria.getSelectedItem());
        produto.setDescrição(fieldDescricao.getText());

        try {
            Float preco = Float.parseFloat(fieldPreco.getText()) ;
            produto.setPreco(preco);
            Integer quantidade = Integer.parseInt(fieldQuantidade.getText());
            produto.setQuantidade(quantidade);
        } catch (Exception e) {
        }

        try {
            //Chama o serviço para atualização do produto
            ServicoProduto.atualizarProduto(produto);
        } catch (Exception e) {
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Atualiza a tela de consulta de clientes, caso possível. Para isso,
        //obtém o "top level ancestor" (ou seja, o componente pai mais acima
        //do formulário, no nosso caso, o desktop) para conseguir o frame
        //de consulta e daí solicitar a atualização da lista através da
        //chamada de seu método público de atualização
        try {
            if (this.getDesktopPane().getTopLevelAncestor() instanceof TelaPrincipal) {
                TelaPrincipal principal = (TelaPrincipal) this.getDesktopPane().getTopLevelAncestor();
                if (principal != null) {
                    principal.getConsultarProdutos().refreshList();
                }
            }
        }
        catch(Exception e) {
            //Exibe erros de atualização da lista no
            //console, mas esconde-os do usuário
            e.printStackTrace();
        }

        //Caso tenha chegado até aqui, o produto foi atualizado com sucesso
        //Então exibe uma mensagem de sucesso para o usuário
        JOptionPane.showMessageDialog(rootPane, "Produto atualizado com sucesso", "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);

        //Limpa os campos da tela após realizar a ataulização
        fieldNome.setText("");
        fieldPreco.setText("");
        fieldMarca.setText("");
        fieldQuantidade.setText("");
        comboCategoria.setSelectedIndex(0);
        fieldDescricao.setText("");
        this.dispose();
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        fieldNome.setText(produto.getNome());
        fieldMarca.setText(produto.getMarca());
        fieldPreco.setText(String.valueOf(produto.getPreco()));
        fieldQuantidade.setText(String.valueOf(produto.getQuantidade()));
        fieldDescricao.setText(produto.getDescricao());

        for (int i = 0; i < comboCategoria.getItemCount(); i++) {
            if (comboCategoria.getItemAt(i).equals(produto.getCategoria())) {
                comboCategoria.setSelectedIndex(i);
                break;
            }
        }
    }//GEN-LAST:event_formInternalFrameOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFechar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboCategoria;
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
    // End of variables declaration//GEN-END:variables
}
