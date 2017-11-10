package br.com.ads.ui.quartos;

import br.com.ads.exceptions.QuartoException;
import br.com.ads.model.produtos.Produto;
import br.com.ads.service.produto.ServicoProduto;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Tela de consulta de quartos
 */
public class TelaConsultarQuartos extends javax.swing.JInternalFrame {

    //Instância do form de edição de quartos
    TelaEditarQuarto formEditarQuarto = new TelaEditarQuarto();
    //Armazena a última pesquisa realizada
    Long ultimaPesquisa = null;
    
    /**
     * Construtor e inicialização de componentes
     */
    public TelaConsultarQuartos() {
        initComponents();
    }

    //Atualiza a lista de quartos. Pode ser chamado por outras telas
    public boolean refreshList() throws QuartoException, Exception {
        //Realiza a pesquisa de quartos com o último valor de pesquisa
        //para atualizar a lista
        List<Produto> resultado = ServicoProduto.
                procurarQuarto(ultimaPesquisa);

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
            Produto cli = resultado.get(i);
            if (cli != null) {
                Object[] row = new Object[5];
                row[0] = cli.getId();
                row[1] = cli.getNumero();
                row[2] = cli.getAndar();
                row[3] = cli.getTipo();
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
        buttonExcluir = new javax.swing.JButton();
        buttonPesquisar = new javax.swing.JButton();
        fFieldPesquisa = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Quartos");

        labelPesquisarQuarto.setText("Pesquisar: ");

        tabelaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Número", "Andar", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaResultados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaResultadosMouseClicked(evt);
            }
        });
        scrollTabelaResultados.setViewportView(tabelaResultados);

        buttonFechar.setText("Fechar");
        buttonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFecharActionPerformed(evt);
            }
        });

        buttonAlterar.setText("Alterar");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
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
                        .addComponent(fFieldPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(fFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTabelaResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFechar)
                    .addComponent(buttonAlterar)
                    .addComponent(buttonExcluir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Listener do botão fechar
    private void buttonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonFecharActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        //Verifica se há itens selecionados para exclusão.
        //Caso negativo, ignora o comando
        if (tabelaResultados.getSelectedRow() >= 0) {
            
            //Obtém a linha do item selecionado
            final int row = tabelaResultados.getSelectedRow();
            //Obtém o nome do quarto da linha indicada para exibição
            //de mensagem de confirmação de exclusão utilizando seu número
            Long numero = (Long) tabelaResultados.getValueAt(row, 1);
            //Mostra o diálogo de confirmação de exclusão
            int resposta = JOptionPane.showConfirmDialog(rootPane,
                "Excluir o quarto \"" + numero + "\"?",
                "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
            //Se o valor de resposta for "Sim" para a exclusão
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    //Obtém o ID do quarto
                    Integer id = (Integer) tabelaResultados.getValueAt(row, 0);
                    //Solicita ao serviço a inativação do quarto com o ID
                    ServicoProduto.excluirQuarto(id);
                    //Atualiza a lista após a "exclusão"
                    this.refreshList();
                } catch (Exception e) {
                    //Se ocorrer algum erro técnico, mostra-o no console,
                    //mas esconde-o do usuário
                    e.printStackTrace();
                    //Exibe uma mensagem de erro genérica ao usuário
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                            "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        try {
            //Obtém a linha selecionada na tabela de resultados
            final int row = tabelaResultados.getSelectedRow();
            //Verifica se há linha selecionada na tabela
            if (row >= 0) {
                //Obtém a linha selecionada na tabela
                Integer id = (Integer) tabelaResultados.getValueAt(row, 0);
                
                //Solicita ao serviço a obtenção do quarto a partir do
                //ID selecionado na tabela
                Produto quarto = ServicoProduto.obterQuarto(id);

                //Cria uma nova instância da tela de edição,
                //configura o quarto selecionado como elemento a
                //ser editado e mostra a tela de edição.
                //Para exibir a tela, é necessário adicioná-la ao
                //componente de desktop, o "pai" da janela corrente
                formEditarQuarto.dispose();
                formEditarQuarto = new TelaEditarQuarto();
                formEditarQuarto.setQuarto(quarto);
                formEditarQuarto.setTitle("Quarto " + quarto.getNumero() + ", "
                    + "Andar " + quarto.getAndar());
                this.getParent().add(formEditarQuarto);
                this.openFrameInCenter(formEditarQuarto);                
                formEditarQuarto.toFront();
            }
        } catch (Exception e) {
            //Se ocorrer algum erro técnico, mostra-o no console,
            //mas esconde-o do usuário
            e.printStackTrace();
            //Exibe uma mensagem de erro genérica ao usuário
            JOptionPane.showMessageDialog(rootPane, "Não é possível "
                + "exibir os detalhes deste quarto.",
                "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void tabelaResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaResultadosMouseClicked
        //Verifica se o clique é um clique duplo       
        if (evt.getClickCount() == 2) {
            try {                
                //Obtém a linha selecionada da tabela de resultados
                final int row = tabelaResultados.getSelectedRow();
                //Obtém o valor do ID da coluna "ID" da tabela de resultados
                Integer id = (Integer) tabelaResultados.getValueAt(row, 0);
                
                //Com o ID da coluna, chama o serviço de quarto para
                //obter o quarto com dados atualizados do mock
                Produto quarto = ServicoProduto.obterQuarto(id);

                //Cria uma nova instância da tela de edição,
                //configura o quarto selecionado como elemento a
                //ser editado e mostra a tela de edição.
                //Para exibir a tela, é necessário adicioná-la ao
                //componente de desktop, o "pai" da janela corrente
                formEditarQuarto.dispose();
                formEditarQuarto = new TelaEditarQuarto();
                formEditarQuarto.setQuarto(quarto);
                formEditarQuarto.setTitle("Quarto " + quarto.getNumero() + ", "
                    + "Andar " + quarto.getAndar());
                this.getParent().add(formEditarQuarto);
                this.openFrameInCenter(formEditarQuarto);                
                formEditarQuarto.toFront();
            } catch (Exception e) {
                //Se ocorrer algum erro técnico, mostra-o no console,
                //mas esconde-o do usuário
                e.printStackTrace();
                //Exibe uma mensagem de erro genérica ao usuário
                JOptionPane.showMessageDialog(rootPane, "Não é possível "
                    + "exibir os detalhes deste quarto.",
                    "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_tabelaResultadosMouseClicked

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        //Inicializa o sucesso da pesquisa com valor negativo, indicando que
        //a pesquisa de quartos não obteve resultados (situação padrão)
        boolean resultSearch = false;
        
        //Grava o campo de pesquisa como a última pesquisa válida. O valor
        //de última pesquisa válida é utilizado na atualização da lista
        if (fFieldPesquisa.getText() != null &&
                !fFieldPesquisa.getText().equals("")) {
            try {
                ultimaPesquisa = Long.parseLong(fFieldPesquisa.getText());
            } catch (Exception e) {
                //Exibe mensagens de erro na fonte de dados e para o listener
                JOptionPane.showMessageDialog(rootPane, "Só é possível"
                        + " pesquisar por um valor inteiro válido",
                        "Campo de pesquisa inválido", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        else {
            ultimaPesquisa = null;
        }

        try {
            //Solicita a atualização da lista com o novo critério
            //de pesquisa (ultimaPesquisa)
            resultSearch = refreshList();
        } catch (Exception e) {
            //Exibe mensagens de erro na fonte de dados e para o listener
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Exibe mensagem de erro caso a pesquisa não tenha resultados
        if (!resultSearch) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou "
                + "resultados ", "Sem resultados",
                JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonFechar;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JTextField fFieldPesquisa;
    private javax.swing.JLabel labelPesquisarQuarto;
    private javax.swing.JScrollPane scrollTabelaResultados;
    private javax.swing.JTable tabelaResultados;
    // End of variables declaration//GEN-END:variables
}
