package br.com.ads.ui.produtos;

import br.com.ads.model.produtos.Produto;
import br.com.ads.service.produto.ServicoProduto;
import br.com.ads.ui.principal.TelaPrincipal;
import javax.swing.JOptionPane;

/**
 * Tela de atualização de quartos
 */
public class EditarProduto extends javax.swing.JInternalFrame {
    private Produto quarto = new Produto();
    /**
     * Construtor e inicialização de componentes
     */
    public EditarProduto() {
        initComponents();
    }

    public Produto getQuarto() {
        return quarto;
    }

    public void setQuarto(Produto quarto) {
        this.quarto = quarto;
    }   

    /**
     * Método criado pelo GUI Builder para montagem da tela
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNumero = new javax.swing.JLabel();
        labelAndar = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        buttonFechar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        fFieldNumero = new javax.swing.JFormattedTextField();
        fFieldAndar = new javax.swing.JFormattedTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Quartos");
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

        labelNumero.setText("Número: ");

        labelAndar.setText("Andar: ");

        labelTipo.setText("Tipo: ");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Simples", "Luxo" }));

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

        fFieldNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        fFieldAndar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAndar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTipo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboTipo, 0, 332, Short.MAX_VALUE)
                            .addComponent(fFieldNumero)
                            .addComponent(fFieldAndar))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSalvar)
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero)
                    .addComponent(fFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAndar)
                    .addComponent(fFieldAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipo)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
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
        /*Long numero = null;
        try {
            Number number = (Number) fFieldNumero.getValue();
            numero = number.longValue();
        } catch (Exception e) {

        }
        quarto.setNumero(numero);
        
        Long andar = null;
        try {
            Number number = (Number) fFieldAndar.getValue();
            andar = number.longValue();
        } catch (Exception e) {

        }
        quarto.setAndar(andar);
        
        quarto.setTipo((String) comboTipo.getSelectedItem());

        try {
            //Chama o serviço para atualização do quarto
            ServicoProduto.atualizarQuarto(quarto);
        } catch (Exception e) {
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        //Atualiza a tela de consulta de clientes, caso possível. Para isso,
        //obtém o "top level ancestor" (ou seja, o componente pai mais acima
        //do formulário, no nosso caso, o desktop) para conseguir o frame
        //de consulta e daí solicitar a atualização da lista através da
        //chamada de seu método público de atualização
        try {
            if (this.getDesktopPane().getTopLevelAncestor()
                    instanceof TelaPrincipal) {
                TelaPrincipal principal = (TelaPrincipal) this.
                        getDesktopPane().getTopLevelAncestor();
                if (principal != null) {
                    principal.getConsultarQuartos().refreshList();                
                }
            }
        }
        catch(Exception e) {
            //Exibe erros de atualização da lista no
            //console, mas esconde-os do usuário
            e.printStackTrace();
        }

        //Caso tenha chegado até aqui, o quarto foi atualizado com sucesso
        //Então exibe uma mensagem de sucesso para o usuário
        JOptionPane.showMessageDialog(rootPane, "Quarto atualizado com sucesso",
                "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);

        //Limpa os campos da tela após realizar a ataulização        
        fFieldNumero.setText("");
        fFieldNumero.setValue(null);
        fFieldAndar.setText("");
        fFieldAndar.setValue(null);
        comboTipo.setSelectedIndex(0);
        this.dispose();*/
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        /*fFieldNumero.setValue(quarto.getNumero());
        fFieldAndar.setValue(quarto.getAndar());
        for (int i = 0; i < comboTipo.getItemCount(); i++) {
            if (comboTipo.getItemAt(i).equals(quarto.getTipo())) {
                comboTipo.setSelectedIndex(i);
                break;
            }
        }*/
    }//GEN-LAST:event_formInternalFrameOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFechar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JFormattedTextField fFieldAndar;
    private javax.swing.JFormattedTextField fFieldNumero;
    private javax.swing.JLabel labelAndar;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelTipo;
    // End of variables declaration//GEN-END:variables
}
