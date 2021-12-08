package trabalhoarqsoft;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import telas.UIEvento;
import telas.UIEspectador;
import telas.UIApresentacao;
import telas.UICadastro;
import telas.UILogin;

public class MainFrame extends javax.swing.JFrame {

    public static int user;
    final CardLayout menu;
    
    //final CardLayout opcoesSec;
    /**
     * Creates new form NewJFrame
     */
    public MainFrame() {
        initComponents();
        menu = (CardLayout) (cardMenu.getLayout());
        setHeaderAndMenuBar(user);
//        System.out.println(user);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        cardMenu = new javax.swing.JPanel();
        headerUnlogged = new javax.swing.JPanel();
        botaoCadastro = new javax.swing.JButton();
        botaoHome = new javax.swing.JButton();
        botaoLogin = new javax.swing.JButton();
        pesquisaTextField = new javax.swing.JTextField();
        headerEspectadorLogged = new javax.swing.JPanel();
        pesquisaEspecTextField = new javax.swing.JTextField();
        botaoCompras = new javax.swing.JButton();
        botaoConta = new javax.swing.JButton();
        botaoSairConta = new javax.swing.JButton();
        bodyPainel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaConteudo = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        apresentacoesBox = new javax.swing.JCheckBox();
        eventosBox = new javax.swing.JCheckBox();
        menuBar = new javax.swing.JMenuBar();
        menuPalestras = new javax.swing.JMenu();
        criarApresentacaoMenuItem = new javax.swing.JMenuItem();
        minhasApresentacoesMenuItem = new javax.swing.JMenuItem();
        menuEventos = new javax.swing.JMenu();
        criarEventosMenuItem = new javax.swing.JMenuItem();
        meusEventosMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        cardMenu.setBackground(new java.awt.Color(204, 204, 204));
        cardMenu.setLayout(new java.awt.CardLayout());

        headerUnlogged.setBackground(new java.awt.Color(204, 204, 204));

        botaoCadastro.setBackground(new java.awt.Color(204, 204, 204));
        botaoCadastro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCadastro.setForeground(new java.awt.Color(51, 51, 51));
        botaoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoCadastro.setText("Cadastro");
        botaoCadastro.setBorder(null);
        botaoCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCadastro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoCadastro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoCadastro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N
        botaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroActionPerformed(evt);
            }
        });

        botaoHome.setBackground(new java.awt.Color(204, 204, 204));
        botaoHome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoHome.setForeground(new java.awt.Color(51, 51, 51));
        botaoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoHome.setText("Home");
        botaoHome.setBorder(null);
        botaoHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoHome.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoHome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoHome.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N
        botaoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHomeActionPerformed(evt);
            }
        });

        botaoLogin.setBackground(new java.awt.Color(204, 204, 204));
        botaoLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoLogin.setForeground(new java.awt.Color(51, 51, 51));
        botaoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoLogin.setText("Login");
        botaoLogin.setBorder(null);
        botaoLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoLogin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoLogin.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N
        botaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLoginActionPerformed(evt);
            }
        });

        pesquisaTextField.setText("Pesquisar...");

        javax.swing.GroupLayout headerUnloggedLayout = new javax.swing.GroupLayout(headerUnlogged);
        headerUnlogged.setLayout(headerUnloggedLayout);
        headerUnloggedLayout.setHorizontalGroup(
            headerUnloggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerUnloggedLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(botaoHome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerUnloggedLayout.setVerticalGroup(
            headerUnloggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerUnloggedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerUnloggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoHome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cardMenu.add(headerUnlogged, "cardHeaderUnlogged");

        headerEspectadorLogged.setBackground(new java.awt.Color(204, 204, 204));
        headerEspectadorLogged.setPreferredSize(new java.awt.Dimension(950, 56));

        pesquisaEspecTextField.setText("Pesquisar...");

        botaoCompras.setBackground(new java.awt.Color(204, 204, 204));
        botaoCompras.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCompras.setForeground(new java.awt.Color(51, 51, 51));
        botaoCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoCompras.setText("Minhas compras");
        botaoCompras.setBorder(null);
        botaoCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCompras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoCompras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoCompras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N
        botaoCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprasActionPerformed(evt);
            }
        });

        botaoConta.setBackground(new java.awt.Color(204, 204, 204));
        botaoConta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoConta.setForeground(new java.awt.Color(51, 51, 51));
        botaoConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoConta.setText("Minha conta");
        botaoConta.setBorder(null);
        botaoConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoConta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoConta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoConta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N
        botaoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContaActionPerformed(evt);
            }
        });

        botaoSairConta.setBackground(new java.awt.Color(204, 204, 204));
        botaoSairConta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoSairConta.setForeground(new java.awt.Color(51, 51, 51));
        botaoSairConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoSairConta.setText("Sair");
        botaoSairConta.setBorder(null);
        botaoSairConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSairConta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoSairConta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoSairConta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N
        botaoSairConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerEspectadorLoggedLayout = new javax.swing.GroupLayout(headerEspectadorLogged);
        headerEspectadorLogged.setLayout(headerEspectadorLoggedLayout);
        headerEspectadorLoggedLayout.setHorizontalGroup(
            headerEspectadorLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerEspectadorLoggedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSairConta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(pesquisaEspecTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerEspectadorLoggedLayout.setVerticalGroup(
            headerEspectadorLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerEspectadorLoggedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerEspectadorLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisaEspecTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSairConta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        cardMenu.add(headerEspectadorLogged, "cardHeaderEspecLogged");

        jSplitPane1.setTopComponent(cardMenu);

        bodyPainel.setBackground(new java.awt.Color(204, 204, 204));

        listaConteudo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "evento 1", "apresentação 1", "evento 2", "apresentação 2", "evento 3", "apresentação 3", "evento 4", "apresentação 4", "evento 5", "apresentação 5", "evento 6", "apresentação 6" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaConteudo);

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Lista de eventos cadastrados");

        apresentacoesBox.setForeground(new java.awt.Color(51, 51, 51));
        apresentacoesBox.setText("Apresentações");

        eventosBox.setForeground(new java.awt.Color(51, 51, 51));
        eventosBox.setText("Eventos");

        javax.swing.GroupLayout bodyPainelLayout = new javax.swing.GroupLayout(bodyPainel);
        bodyPainel.setLayout(bodyPainelLayout);
        bodyPainelLayout.setHorizontalGroup(
            bodyPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPainelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apresentacoesBox)
                        .addGap(18, 18, 18)
                        .addComponent(eventosBox)
                        .addGap(0, 565, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        bodyPainelLayout.setVerticalGroup(
            bodyPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(apresentacoesBox)
                    .addComponent(eventosBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setBottomComponent(bodyPainel);

        menuPalestras.setText("Apresentações");

        criarApresentacaoMenuItem.setText("Criar apresentação");
        menuPalestras.add(criarApresentacaoMenuItem);

        minhasApresentacoesMenuItem.setText("Minhas apresentações");
        menuPalestras.add(minhasApresentacoesMenuItem);

        menuBar.add(menuPalestras);

        menuEventos.setText("Eventos");

        criarEventosMenuItem.setText("Criar evento");
        menuEventos.add(criarEventosMenuItem);

        meusEventosMenuItem.setText("Meus eventos");
        menuEventos.add(meusEventosMenuItem);

        menuBar.add(menuEventos);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroActionPerformed
        // TODO add your handling code here:
        new UICadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadastroActionPerformed

       
    private void setHeaderAndMenuBar(int user){
        switch (user) {
            case 0 -> {
                menu.show(cardMenu, "cardHeaderUnlogged");
                criarApresentacaoMenuItem.setEnabled(false);
                minhasApresentacoesMenuItem.setEnabled(false);
                criarEventosMenuItem.setEnabled(false);
                meusEventosMenuItem.setEnabled(false);
            }
            case 1 -> {
                menu.show(cardMenu, "cardHeaderEspecLogged");
                criarApresentacaoMenuItem.setEnabled(false);
                minhasApresentacoesMenuItem.setEnabled(false);
                criarEventosMenuItem.setEnabled(false);
                meusEventosMenuItem.setEnabled(false);
            }
            case 2 -> {
                menu.show(cardMenu, "cardHeaderEspecLogged");
                criarApresentacaoMenuItem.setEnabled(true);
                minhasApresentacoesMenuItem.setEnabled(true);
                criarEventosMenuItem.setEnabled(false);
                meusEventosMenuItem.setEnabled(false);
            }
            case 3 -> {
                menu.show(cardMenu, "cardHeaderEventoLogged");
                criarApresentacaoMenuItem.setEnabled(true);
                minhasApresentacoesMenuItem.setEnabled(true);
                criarEventosMenuItem.setEnabled(true);
                meusEventosMenuItem.setEnabled(true);
            }
            default -> {
                System.out.println("Erro: verifique o usuário.");
            }
        }
    }
    
    private void botaoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoHomeActionPerformed

    private void botaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginActionPerformed
        // TODO add your handling code here:
        new UILogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoLoginActionPerformed

    private void botaoComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoComprasActionPerformed

    private void botaoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoContaActionPerformed

    private void botaoSairContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairContaActionPerformed
        // TODO add your handling code here:
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair?", "Sair", 1);
        if (resposta == 0){ // 0 se sim
            user = resposta;
            setHeaderAndMenuBar(user);
        }
    }//GEN-LAST:event_botaoSairContaActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            FlatLightLaf.install();
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Flatlaf Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
//                    break;
//                }
//            }
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox apresentacoesBox;
    private javax.swing.JPanel bodyPainel;
    private javax.swing.JButton botaoCadastro;
    private javax.swing.JButton botaoCompras;
    private javax.swing.JButton botaoConta;
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton botaoLogin;
    private javax.swing.JButton botaoSairConta;
    private javax.swing.JPanel cardMenu;
    private javax.swing.JMenuItem criarApresentacaoMenuItem;
    private javax.swing.JMenuItem criarEventosMenuItem;
    private javax.swing.JCheckBox eventosBox;
    private javax.swing.JPanel headerEspectadorLogged;
    private javax.swing.JPanel headerUnlogged;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JList<String> listaConteudo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEventos;
    private javax.swing.JMenu menuPalestras;
    private javax.swing.JMenuItem meusEventosMenuItem;
    private javax.swing.JMenuItem minhasApresentacoesMenuItem;
    private javax.swing.JTextField pesquisaEspecTextField;
    private javax.swing.JTextField pesquisaTextField;
    // End of variables declaration//GEN-END:variables
}
