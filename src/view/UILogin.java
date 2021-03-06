package view;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author aleix
 */
public class UILogin extends javax.swing.JFrame {
    int user;

    public UILogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPainel = new javax.swing.JPanel();
        loginPainel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelEmail = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        painelSenha = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        senhaField = new javax.swing.JPasswordField();
        botaoLogin = new javax.swing.JButton();
        botaoRecuperarSenha = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        bodyPainel.setBackground(new java.awt.Color(255, 255, 255));

        loginPainel.setBackground(new java.awt.Color(255, 255, 255));
        loginPainel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Login");

        painelEmail.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Email");

        emailField.setBackground(new java.awt.Color(204, 204, 204));
        emailField.setForeground(new java.awt.Color(51, 51, 51));
        emailField.setToolTipText("Insira seu email");
        emailField.setBorder(null);

        javax.swing.GroupLayout painelEmailLayout = new javax.swing.GroupLayout(painelEmail);
        painelEmail.setLayout(painelEmailLayout);
        painelEmailLayout.setHorizontalGroup(
            painelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailField)
                    .addGroup(painelEmailLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelEmailLayout.setVerticalGroup(
            painelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelSenha.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Senha");

        senhaField.setBackground(new java.awt.Color(204, 204, 204));
        senhaField.setForeground(new java.awt.Color(51, 51, 51));
        senhaField.setToolTipText("Insira sua senha");
        senhaField.setBorder(null);

        javax.swing.GroupLayout painelSenhaLayout = new javax.swing.GroupLayout(painelSenha);
        painelSenha.setLayout(painelSenhaLayout);
        painelSenhaLayout.setHorizontalGroup(
            painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSenhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSenhaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(senhaField))
                .addContainerGap())
        );
        painelSenhaLayout.setVerticalGroup(
            painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSenhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        botaoRecuperarSenha.setBackground(new java.awt.Color(255, 255, 255));
        botaoRecuperarSenha.setForeground(new java.awt.Color(153, 153, 153));
        botaoRecuperarSenha.setText("Esqueceu a senha?");
        botaoRecuperarSenha.setBorderPainted(false);

        javax.swing.GroupLayout loginPainelLayout = new javax.swing.GroupLayout(loginPainel);
        loginPainel.setLayout(loginPainelLayout);
        loginPainelLayout.setHorizontalGroup(
            loginPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPainelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(loginPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPainelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(painelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPainelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoRecuperarSenha)))
                .addContainerGap())
        );
        loginPainelLayout.setVerticalGroup(
            loginPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(painelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(botaoRecuperarSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        botaoCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        botaoCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(51, 51, 51));
        botaoCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setBorder(null);
        botaoCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCadastrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoCadastrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoCadastrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N

        botaoVoltar.setBackground(new java.awt.Color(204, 204, 204));
        botaoVoltar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(51, 51, 51));
        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.setBorder(null);
        botaoVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoVoltar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoVoltar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoVoltar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N

        javax.swing.GroupLayout bodyPainelLayout = new javax.swing.GroupLayout(bodyPainel);
        bodyPainel.setLayout(bodyPainelLayout);
        bodyPainelLayout.setHorizontalGroup(
            bodyPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPainelLayout.createSequentialGroup()
                .addGroup(bodyPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPainelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(loginPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(bodyPainelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bodyPainelLayout.setVerticalGroup(
            bodyPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPainelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(loginPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(bodyPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bodyPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bodyPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public JButton getBotaoVoltar() {
        return botaoVoltar;
    }

    public JButton getBotaoCadastrar() {
        return botaoCadastrar;
    }

    public JButton getBotaoLogin() {
        return botaoLogin;
    }

    public JButton getBotaoRecuperarSenha() {
        return botaoRecuperarSenha;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JPasswordField getSenhaField() {
        return senhaField;
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPainel;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoLogin;
    private javax.swing.JButton botaoRecuperarSenha;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel loginPainel;
    private javax.swing.JPanel painelEmail;
    private javax.swing.JPanel painelSenha;
    private javax.swing.JPasswordField senhaField;
    // End of variables declaration//GEN-END:variables
}
