package view;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JList;

public class UIHome extends javax.swing.JFrame {
    private CardLayout menu;
    //final CardLayout opcoesSec;

    public UIHome() {
        initComponents();
        menu = (CardLayout) (cardMenu.getLayout());
    }

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

        javax.swing.GroupLayout headerEspectadorLoggedLayout = new javax.swing.GroupLayout(headerEspectadorLogged);
        headerEspectadorLogged.setLayout(headerEspectadorLoggedLayout);
        headerEspectadorLoggedLayout.setHorizontalGroup(
            headerEspectadorLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerEspectadorLoggedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSairConta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
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
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBotaoLogin() {
        return botaoLogin;
    }
    
    public JButton getBotaoCadastro() {
        return botaoCadastro;
    }

    public JButton getBotaoCompras() {
        return botaoCompras;
    }

    public JButton getBotaoConta() {
        return botaoConta;
    }

    public JButton getBotaoHome() {
        return botaoHome;
    }

    public JButton getBotaoSairConta() {
        return botaoSairConta;
    }
    
    public JList<String> getListaConteudo() {
        return listaConteudo;
    }

    public void showMenu(String user) {
        menu.show(cardMenu, user);
    }
                
    public void setEnabledCriarApresentacaoMenuItem(boolean e) {
        criarApresentacaoMenuItem.setEnabled(e);
    }
    
    public void setEnabledMinhasApresentacoesMenuItem(boolean e) {
        minhasApresentacoesMenuItem.setEnabled(e);
    }
    
    public void setEnabledCriarEventosMenuItem(boolean e) {
        criarEventosMenuItem.setEnabled(e);
    }
    
    public void setEnabledMeusEventosMenuItem(boolean e) {
        meusEventosMenuItem.setEnabled(e);
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
