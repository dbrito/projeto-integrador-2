package br.com.ads.ui.principal;

import br.com.ads.ui.clientes.*;
import br.com.ads.ui.produtos.*;
import br.com.ads.ui.vendas.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 * Tela principal do sistema
 */
public class TelaPrincipal extends javax.swing.JFrame {
    private TelaCadastrarCliente cadastrarCliente = null;
    private TelaConsultarClientes consultarClientes = null;
    private TelaCadastrarProduto cadastrarProduto = null;
    private TelaConsultarProdutos consultarProdutos = null;
    private TelaSelecionarProdutos selecionarProdutos = null;
    private TelaRealizarVenda realizarVenda = null;
    private TelaRelatorioVendas relatorioVendas = null;

    /**
     * Construtor e inicialização de componentes
     */
    public TelaPrincipal() {
        initComponents();
        //Faz com que a janela seja aberta no meio da tela
        this.setLocationRelativeTo(null);
    }

    //Métodos de acesso para os formulários abertos pela tela principal
    public TelaCadastrarCliente getCadastrarCliente() {
        return cadastrarCliente;
    }

    public TelaConsultarClientes getConsultarClientes() {
        return consultarClientes;
    }

    public TelaCadastrarProduto getCadastrarProduto() {
        return cadastrarProduto;
    }

    public TelaConsultarProdutos getConsultarProdutos() {
        return consultarProdutos;
    }
    
    public TelaRealizarVenda getRealizaVenda() {
        return realizarVenda;
    }
    
    public TelaRelatorioVendas getRelatorioVendas() {
        return relatorioVendas;
    }

    /**
     * Código de construção dos componentes do GUI Builder
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane() {
            private Image image;
            {
                try {
                    image = ImageIO.read(new File("src/assets/bg3.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        barraMenus = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        menuCadastrarCliente = new javax.swing.JMenuItem();
        menuConsultarCliente = new javax.swing.JMenuItem();
        menuPrincipal = new javax.swing.JMenu();
        menuCadastrarProduto = new javax.swing.JMenuItem();
        menuConsultarProduto = new javax.swing.JMenuItem();
        menuVenda = new javax.swing.JMenu();
        menuRealizarVenda = new javax.swing.JMenuItem();
        menuRelatorioVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja de Eletrônicos");
        setIconImage(new ImageIcon(getClass().getResource("/assets/icon3.png")).getImage());
        setPreferredSize(new java.awt.Dimension(900, 600));

        desktop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desktop.setDoubleBuffered(true);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        menuCliente.setText("Cliente");

        menuCadastrarCliente.setText("Cadastrar Cliente");
        menuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(menuCadastrarCliente);

        menuConsultarCliente.setText("Consultar Clientes");
        menuConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(menuConsultarCliente);

        barraMenus.add(menuCliente);

        menuPrincipal.setText("Produto");

        menuCadastrarProduto.setText("Cadastrar Produto");
        menuCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarProdutoActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuCadastrarProduto);

        menuConsultarProduto.setText("Consultar Produto");
        menuConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarProdutoActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuConsultarProduto);

        barraMenus.add(menuPrincipal);

        menuVenda.setText("Venda");

        menuRealizarVenda.setText("Realizar Venda");
        menuRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRealizarVendaActionPerformed(evt);
            }
        });
        menuVenda.add(menuRealizarVenda);

        menuRelatorioVendas.setText("Relatório de Vendas");
        menuRelatorioVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioVendasActionPerformed(evt);
            }
        });
        menuVenda.add(menuRelatorioVendas);

        barraMenus.add(menuVenda);

        setJMenuBar(barraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Listener do item de menu
    private void menuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarClienteActionPerformed
        //Verifica se não há uma janela de cadastro de cliente visível.
        //Caso afirmativo, cria uma janela de cadastro de cliente e a exibe
        if (cadastrarCliente == null || !cadastrarCliente.isDisplayable()) {
            cadastrarCliente = new TelaCadastrarCliente();
            desktop.add(cadastrarCliente);
            this.openFrameInCenter(cadastrarCliente);
        }
        cadastrarCliente.toFront();
    }//GEN-LAST:event_menuCadastrarClienteActionPerformed

    //Listener do item de menu
    private void menuConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarClienteActionPerformed
        //Verifica se não há uma janela de consulta de cliente visível.
        //Caso afirmativo, cria uma janela de consulta de cliente e a exibe
        if (consultarClientes == null || !consultarClientes.isDisplayable()) {
            consultarClientes = new TelaConsultarClientes();
            desktop.add(consultarClientes);
            this.openFrameInCenter(consultarClientes);
        }
        consultarClientes.toFront();
    }//GEN-LAST:event_menuConsultarClienteActionPerformed

    //Listener do item de menu
    private void menuCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarProdutoActionPerformed
        //Verifica se não há uma janela de cadastro de produtos visível.
        //Caso afirmativo, cria uma janela de cadastro de produtos e a exibe
        System.out.println((cadastrarProduto == null || !cadastrarProduto.isDisplayable()));
        if (cadastrarProduto == null || !cadastrarProduto.isDisplayable()) {
            cadastrarProduto = new TelaCadastrarProduto();
            desktop.add(cadastrarProduto);
            this.openFrameInCenter(cadastrarProduto);

        }
        cadastrarProduto.toFront();
    }//GEN-LAST:event_menuCadastrarProdutoActionPerformed

    //Listener do item de menu
    private void menuConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarProdutoActionPerformed
        //Verifica se não há uma janela de consulta de produtos visível.
        //Caso afirmativo, cria uma janela de consulta de produtos e a exibe
        if (consultarProdutos == null || !consultarProdutos.isDisplayable()) {
            consultarProdutos = new TelaConsultarProdutos();
            desktop.add(consultarProdutos);
            this.openFrameInCenter(consultarProdutos);
        }
        consultarProdutos.toFront();
    }//GEN-LAST:event_menuConsultarProdutoActionPerformed

    //Listener do item de menu
    private void menuRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRealizarVendaActionPerformed
        //Verifica se não há uma janela de consulta de produtos visível.
        //Caso afirmativo, cria uma janela de consulta de produtos e a exibe
        if (realizarVenda == null || !realizarVenda.isDisplayable()) {
            realizarVenda = new TelaRealizarVenda();
            desktop.add(realizarVenda);
            this.openFrameInCenter(realizarVenda);
        }
        realizarVenda.toFront();
    }//GEN-LAST:event_menuRealizarVendaActionPerformed

    //Listener do item de menu
    private void menuRelatorioVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioVendasActionPerformed
        if (relatorioVendas == null || !relatorioVendas.isDisplayable()) {
            relatorioVendas = new TelaRelatorioVendas();
            desktop.add(relatorioVendas);
            this.openFrameInCenter(relatorioVendas);
        }
        relatorioVendas.toFront();
    }//GEN-LAST:event_menuRelatorioVendasActionPerformed

    //Abre um internal frame centralizado na tela
    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = desktop.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }

    /**
     * Método de inicialização da classe e do sistema
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem menuCadastrarCliente;
    private javax.swing.JMenuItem menuCadastrarProduto;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenuItem menuConsultarCliente;
    private javax.swing.JMenuItem menuConsultarProduto;
    private javax.swing.JMenu menuPrincipal;
    private javax.swing.JMenuItem menuRealizarVenda;
    private javax.swing.JMenuItem menuRelatorioVendas;
    private javax.swing.JMenu menuVenda;
    // End of variables declaration//GEN-END:variables
}
