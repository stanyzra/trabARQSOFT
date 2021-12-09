package view;

import java.awt.CardLayout;
import javax.swing.JButton;

/**
 *
 * @author aleix
 */
public class UIConta extends javax.swing.JFrame {
    private CardLayout menu;
    public UIConta() {
        initComponents();
        menu = (CardLayout) (cardMenu.getLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuConta = new javax.swing.JPanel();
        botaoAlterarDados = new javax.swing.JButton();
        botaoTrocarTipoConta = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        botaoExcluirConta = new javax.swing.JButton();
        cardMenu = new javax.swing.JPanel();
        painelAlterarDadosSpec = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        painelNomeSpec = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        nomeFieldSpec = new javax.swing.JTextField();
        painelSobrenomeSpec = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        sobrenomeFieldSpec = new javax.swing.JTextField();
        painelCPFSpec = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        CPFFieldSpec = new javax.swing.JTextField();
        painelRGSpec = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        RGFieldSpec = new javax.swing.JTextField();
        painelDataNascSpec = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        datanascDateChooserSpec = new com.toedter.calendar.JDateChooser();
        painelEmailSpec = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        emailFieldSpec = new javax.swing.JTextField();
        painelCEPSpec = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        CEPFieldSpec = new javax.swing.JTextField();
        painelCidadeSpec = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        cidadeFieldSpec = new javax.swing.JTextField();
        painelEndereçoSpec = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        enderecoFieldSpec = new javax.swing.JTextField();
        painelBairroSpec = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        bairroFieldSpec = new javax.swing.JTextField();
        painelSenhaSpec = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        senhaFieldSpec = new javax.swing.JPasswordField();
        painelConfirmarSenhaSpec = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        confirmarSenhaFieldSpec = new javax.swing.JPasswordField();
        painelAlterarDadosPalest = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        painelNomePalest = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        nomeFieldPalest = new javax.swing.JTextField();
        painelCPFPalest = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        CPFFieldPalest = new javax.swing.JTextField();
        painelRGPalest = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        RGFieldPalest = new javax.swing.JTextField();
        painelCNPJPalest = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        CNPJFieldPalest = new javax.swing.JTextField();
        painelDataNascPalest = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        datanascDateChooserPalest = new com.toedter.calendar.JDateChooser();
        painelEmailPalest = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        emailFieldPalest = new javax.swing.JTextField();
        painelCEPPalest = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        CEPFieldPalest = new javax.swing.JTextField();
        painelCidadePalest = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        cidadeFieldPalest = new javax.swing.JTextField();
        painelEndereçoPalest = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        enderecoFieldPalest = new javax.swing.JTextField();
        painelBairroPalest = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        bairroFieldPalest = new javax.swing.JTextField();
        painelSenhaPalest = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        senhaFieldPalest = new javax.swing.JPasswordField();
        painelConfirmarSenhaPalest = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        confirmarSenhaFieldPalest = new javax.swing.JPasswordField();
        painelAlterarDadosEvento = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        painelNomeEvento = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        nomeFieldEvento = new javax.swing.JTextField();
        painelCPFEvento = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        CPFFieldEvento = new javax.swing.JTextField();
        painelRGEvento = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        RGFieldEvento = new javax.swing.JTextField();
        painelCNPJEvento = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        CNPJFieldEvento = new javax.swing.JTextField();
        painelDataNascEvento = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        datanascDateChooserEvento = new com.toedter.calendar.JDateChooser();
        painelEmailEvento = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        emailFieldEvento = new javax.swing.JTextField();
        painelCEPEvento = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        CEPFieldEvento = new javax.swing.JTextField();
        painelCidadeEvento = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        cidadeFieldEvento = new javax.swing.JTextField();
        painelEndereçoEvento = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        enderecoFieldEvento = new javax.swing.JTextField();
        painelBairroEvento = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        bairroFieldEvento = new javax.swing.JTextField();
        painelSenhaEvento = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        senhaFieldEvento = new javax.swing.JPasswordField();
        painelConfirmarSenhaEvento = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        confirmarSenhaFieldEvento = new javax.swing.JPasswordField();
        painelRealizarCadastro = new javax.swing.JPanel();
        botaoRegistrarConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuConta.setBackground(new java.awt.Color(204, 204, 204));

        botaoAlterarDados.setBackground(new java.awt.Color(204, 204, 204));
        botaoAlterarDados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoAlterarDados.setForeground(new java.awt.Color(51, 51, 51));
        botaoAlterarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoAlterarDados.setText("Alterar dados");
        botaoAlterarDados.setBorder(null);
        botaoAlterarDados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAlterarDados.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoAlterarDados.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoAlterarDados.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N

        botaoTrocarTipoConta.setBackground(new java.awt.Color(204, 204, 204));
        botaoTrocarTipoConta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoTrocarTipoConta.setForeground(new java.awt.Color(51, 51, 51));
        botaoTrocarTipoConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoTrocarTipoConta.setText("Trocar tipo de conta");
        botaoTrocarTipoConta.setBorder(null);
        botaoTrocarTipoConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoTrocarTipoConta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoTrocarTipoConta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoTrocarTipoConta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N

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

        botaoExcluirConta.setBackground(new java.awt.Color(204, 204, 204));
        botaoExcluirConta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoExcluirConta.setForeground(new java.awt.Color(204, 0, 51));
        botaoExcluirConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoExcluirConta.setText("Excluir conta");
        botaoExcluirConta.setBorder(null);
        botaoExcluirConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoExcluirConta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoExcluirConta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoExcluirConta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N

        javax.swing.GroupLayout menuContaLayout = new javax.swing.GroupLayout(menuConta);
        menuConta.setLayout(menuContaLayout);
        menuContaLayout.setHorizontalGroup(
            menuContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuContaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botaoTrocarTipoConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botaoExcluirConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuContaLayout.setVerticalGroup(
            menuContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuContaLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(botaoAlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(botaoTrocarTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(botaoExcluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardMenu.setLayout(new java.awt.CardLayout());

        painelAlterarDadosSpec.setBackground(new java.awt.Color(102, 102, 102));
        painelAlterarDadosSpec.setPreferredSize(new java.awt.Dimension(670, 541));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Alterar dados - Espectador");

        painelNomeSpec.setBackground(new java.awt.Color(102, 102, 102));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setText("Nome");

        nomeFieldSpec.setBackground(new java.awt.Color(204, 204, 204));
        nomeFieldSpec.setForeground(new java.awt.Color(51, 51, 51));
        nomeFieldSpec.setToolTipText("Insira seu email");
        nomeFieldSpec.setBorder(null);
        nomeFieldSpec.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNomeSpecLayout = new javax.swing.GroupLayout(painelNomeSpec);
        painelNomeSpec.setLayout(painelNomeSpecLayout);
        painelNomeSpecLayout.setHorizontalGroup(
            painelNomeSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNomeSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelNomeSpecLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nomeFieldSpec))
                .addContainerGap())
        );
        painelNomeSpecLayout.setVerticalGroup(
            painelNomeSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeFieldSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelSobrenomeSpec.setBackground(new java.awt.Color(102, 102, 102));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setText("Sobrenome");

        sobrenomeFieldSpec.setBackground(new java.awt.Color(204, 204, 204));
        sobrenomeFieldSpec.setForeground(new java.awt.Color(51, 51, 51));
        sobrenomeFieldSpec.setToolTipText("Insira seu email");
        sobrenomeFieldSpec.setBorder(null);
        sobrenomeFieldSpec.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelSobrenomeSpecLayout = new javax.swing.GroupLayout(painelSobrenomeSpec);
        painelSobrenomeSpec.setLayout(painelSobrenomeSpecLayout);
        painelSobrenomeSpecLayout.setHorizontalGroup(
            painelSobrenomeSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSobrenomeSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSobrenomeSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSobrenomeSpecLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(0, 241, Short.MAX_VALUE))
                    .addComponent(sobrenomeFieldSpec))
                .addContainerGap())
        );
        painelSobrenomeSpecLayout.setVerticalGroup(
            painelSobrenomeSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSobrenomeSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sobrenomeFieldSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelCPFSpec.setBackground(new java.awt.Color(102, 102, 102));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setText("CPF");

        CPFFieldSpec.setBackground(new java.awt.Color(204, 204, 204));
        CPFFieldSpec.setForeground(new java.awt.Color(51, 51, 51));
        CPFFieldSpec.setToolTipText("Insira seu email");
        CPFFieldSpec.setBorder(null);
        CPFFieldSpec.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelCPFSpecLayout = new javax.swing.GroupLayout(painelCPFSpec);
        painelCPFSpec.setLayout(painelCPFSpecLayout);
        painelCPFSpecLayout.setHorizontalGroup(
            painelCPFSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCPFSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCPFSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCPFSpecLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CPFFieldSpec, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelCPFSpecLayout.setVerticalGroup(
            painelCPFSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCPFSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPFFieldSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelRGSpec.setBackground(new java.awt.Color(102, 102, 102));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setText("RG");

        RGFieldSpec.setBackground(new java.awt.Color(204, 204, 204));
        RGFieldSpec.setForeground(new java.awt.Color(51, 51, 51));
        RGFieldSpec.setToolTipText("Insira seu email");
        RGFieldSpec.setBorder(null);
        RGFieldSpec.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelRGSpecLayout = new javax.swing.GroupLayout(painelRGSpec);
        painelRGSpec.setLayout(painelRGSpecLayout);
        painelRGSpecLayout.setHorizontalGroup(
            painelRGSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRGSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelRGSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelRGSpecLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(RGFieldSpec, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelRGSpecLayout.setVerticalGroup(
            painelRGSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRGSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RGFieldSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelDataNascSpec.setBackground(new java.awt.Color(102, 102, 102));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Data de nascimento");

        javax.swing.GroupLayout painelDataNascSpecLayout = new javax.swing.GroupLayout(painelDataNascSpec);
        painelDataNascSpec.setLayout(painelDataNascSpecLayout);
        painelDataNascSpecLayout.setHorizontalGroup(
            painelDataNascSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataNascSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDataNascSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDataNascSpecLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(datanascDateChooserSpec, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelDataNascSpecLayout.setVerticalGroup(
            painelDataNascSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataNascSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datanascDateChooserSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelEmailSpec.setBackground(new java.awt.Color(102, 102, 102));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Email");

        emailFieldSpec.setBackground(new java.awt.Color(204, 204, 204));
        emailFieldSpec.setForeground(new java.awt.Color(51, 51, 51));
        emailFieldSpec.setToolTipText("Insira seu email");
        emailFieldSpec.setBorder(null);
        emailFieldSpec.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelEmailSpecLayout = new javax.swing.GroupLayout(painelEmailSpec);
        painelEmailSpec.setLayout(painelEmailSpecLayout);
        painelEmailSpecLayout.setHorizontalGroup(
            painelEmailSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmailSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEmailSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEmailSpecLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(emailFieldSpec, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelEmailSpecLayout.setVerticalGroup(
            painelEmailSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmailSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailFieldSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelCEPSpec.setBackground(new java.awt.Color(102, 102, 102));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("CEP");

        CEPFieldSpec.setBackground(new java.awt.Color(204, 204, 204));
        CEPFieldSpec.setForeground(new java.awt.Color(51, 51, 51));
        CEPFieldSpec.setToolTipText("Insira seu email");
        CEPFieldSpec.setBorder(null);
        CEPFieldSpec.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelCEPSpecLayout = new javax.swing.GroupLayout(painelCEPSpec);
        painelCEPSpec.setLayout(painelCEPSpecLayout);
        painelCEPSpecLayout.setHorizontalGroup(
            painelCEPSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCEPSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCEPSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCEPSpecLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CEPFieldSpec))
                .addContainerGap())
        );
        painelCEPSpecLayout.setVerticalGroup(
            painelCEPSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCEPSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CEPFieldSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelCidadeSpec.setBackground(new java.awt.Color(102, 102, 102));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Cidade");

        cidadeFieldSpec.setBackground(new java.awt.Color(204, 204, 204));
        cidadeFieldSpec.setForeground(new java.awt.Color(51, 51, 51));
        cidadeFieldSpec.setToolTipText("Insira seu email");
        cidadeFieldSpec.setBorder(null);
        cidadeFieldSpec.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelCidadeSpecLayout = new javax.swing.GroupLayout(painelCidadeSpec);
        painelCidadeSpec.setLayout(painelCidadeSpecLayout);
        painelCidadeSpecLayout.setHorizontalGroup(
            painelCidadeSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCidadeSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCidadeSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCidadeSpecLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cidadeFieldSpec))
                .addContainerGap())
        );
        painelCidadeSpecLayout.setVerticalGroup(
            painelCidadeSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCidadeSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cidadeFieldSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelEndereçoSpec.setBackground(new java.awt.Color(102, 102, 102));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Endereço");

        enderecoFieldSpec.setBackground(new java.awt.Color(204, 204, 204));
        enderecoFieldSpec.setForeground(new java.awt.Color(51, 51, 51));
        enderecoFieldSpec.setToolTipText("Insira seu email");
        enderecoFieldSpec.setBorder(null);
        enderecoFieldSpec.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelEndereçoSpecLayout = new javax.swing.GroupLayout(painelEndereçoSpec);
        painelEndereçoSpec.setLayout(painelEndereçoSpecLayout);
        painelEndereçoSpecLayout.setHorizontalGroup(
            painelEndereçoSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereçoSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEndereçoSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEndereçoSpecLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(enderecoFieldSpec, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelEndereçoSpecLayout.setVerticalGroup(
            painelEndereçoSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereçoSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enderecoFieldSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelBairroSpec.setBackground(new java.awt.Color(102, 102, 102));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Bairro");

        bairroFieldSpec.setBackground(new java.awt.Color(204, 204, 204));
        bairroFieldSpec.setForeground(new java.awt.Color(51, 51, 51));
        bairroFieldSpec.setToolTipText("Insira seu email");
        bairroFieldSpec.setBorder(null);
        bairroFieldSpec.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelBairroSpecLayout = new javax.swing.GroupLayout(painelBairroSpec);
        painelBairroSpec.setLayout(painelBairroSpecLayout);
        painelBairroSpecLayout.setHorizontalGroup(
            painelBairroSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBairroSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBairroSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBairroSpecLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bairroFieldSpec, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelBairroSpecLayout.setVerticalGroup(
            painelBairroSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBairroSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bairroFieldSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelSenhaSpec.setBackground(new java.awt.Color(102, 102, 102));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Senha");

        senhaFieldSpec.setBackground(new java.awt.Color(204, 204, 204));
        senhaFieldSpec.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout painelSenhaSpecLayout = new javax.swing.GroupLayout(painelSenhaSpec);
        painelSenhaSpec.setLayout(painelSenhaSpecLayout);
        painelSenhaSpecLayout.setHorizontalGroup(
            painelSenhaSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSenhaSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSenhaSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSenhaSpecLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(senhaFieldSpec, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelSenhaSpecLayout.setVerticalGroup(
            painelSenhaSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSenhaSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaFieldSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelConfirmarSenhaSpec.setBackground(new java.awt.Color(102, 102, 102));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setText("Confirme sua senha");

        confirmarSenhaFieldSpec.setBackground(new java.awt.Color(204, 204, 204));
        confirmarSenhaFieldSpec.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout painelConfirmarSenhaSpecLayout = new javax.swing.GroupLayout(painelConfirmarSenhaSpec);
        painelConfirmarSenhaSpec.setLayout(painelConfirmarSenhaSpecLayout);
        painelConfirmarSenhaSpecLayout.setHorizontalGroup(
            painelConfirmarSenhaSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfirmarSenhaSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConfirmarSenhaSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConfirmarSenhaSpecLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(0, 190, Short.MAX_VALUE))
                    .addComponent(confirmarSenhaFieldSpec, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelConfirmarSenhaSpecLayout.setVerticalGroup(
            painelConfirmarSenhaSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfirmarSenhaSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmarSenhaFieldSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelAlterarDadosSpecLayout = new javax.swing.GroupLayout(painelAlterarDadosSpec);
        painelAlterarDadosSpec.setLayout(painelAlterarDadosSpecLayout);
        painelAlterarDadosSpecLayout.setHorizontalGroup(
            painelAlterarDadosSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlterarDadosSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAlterarDadosSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAlterarDadosSpecLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(painelAlterarDadosSpecLayout.createSequentialGroup()
                        .addGroup(painelAlterarDadosSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAlterarDadosSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(painelSobrenomeSpec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(painelNomeSpec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(painelCPFSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelRGSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelDataNascSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelEmailSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelAlterarDadosSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelEndereçoSpec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelBairroSpec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelSenhaSpec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelConfirmarSenhaSpec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelCEPSpec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelCidadeSpec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelAlterarDadosSpecLayout.setVerticalGroup(
            painelAlterarDadosSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlterarDadosSpecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAlterarDadosSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAlterarDadosSpecLayout.createSequentialGroup()
                        .addComponent(painelNomeSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelSobrenomeSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCPFSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelRGSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelDataNascSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelEmailSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelAlterarDadosSpecLayout.createSequentialGroup()
                        .addComponent(painelCEPSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCidadeSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelEndereçoSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelBairroSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelSenhaSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelConfirmarSenhaSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        cardMenu.add(painelAlterarDadosSpec, "painelAlterarDadosSpec");

        painelAlterarDadosPalest.setBackground(new java.awt.Color(102, 102, 102));
        painelAlterarDadosPalest.setPreferredSize(new java.awt.Dimension(670, 541));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Alterar dados - Apresentador");

        painelNomePalest.setBackground(new java.awt.Color(102, 102, 102));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setText("Nome completo");

        nomeFieldPalest.setBackground(new java.awt.Color(204, 204, 204));
        nomeFieldPalest.setForeground(new java.awt.Color(51, 51, 51));
        nomeFieldPalest.setToolTipText("Insira seu email");
        nomeFieldPalest.setBorder(null);
        nomeFieldPalest.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNomePalestLayout = new javax.swing.GroupLayout(painelNomePalest);
        painelNomePalest.setLayout(painelNomePalestLayout);
        painelNomePalestLayout.setHorizontalGroup(
            painelNomePalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomePalestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNomePalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeFieldPalest)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelNomePalestLayout.setVerticalGroup(
            painelNomePalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomePalestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeFieldPalest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelCPFPalest.setBackground(new java.awt.Color(102, 102, 102));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setText("CPF");

        CPFFieldPalest.setBackground(new java.awt.Color(204, 204, 204));
        CPFFieldPalest.setForeground(new java.awt.Color(51, 51, 51));
        CPFFieldPalest.setToolTipText("Insira seu email");
        CPFFieldPalest.setBorder(null);
        CPFFieldPalest.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelCPFPalestLayout = new javax.swing.GroupLayout(painelCPFPalest);
        painelCPFPalest.setLayout(painelCPFPalestLayout);
        painelCPFPalestLayout.setHorizontalGroup(
            painelCPFPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCPFPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCPFPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCPFPalestLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CPFFieldPalest))
                .addContainerGap())
        );
        painelCPFPalestLayout.setVerticalGroup(
            painelCPFPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCPFPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPFFieldPalest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelRGPalest.setBackground(new java.awt.Color(102, 102, 102));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setText("RG");

        RGFieldPalest.setBackground(new java.awt.Color(204, 204, 204));
        RGFieldPalest.setForeground(new java.awt.Color(51, 51, 51));
        RGFieldPalest.setToolTipText("Insira seu email");
        RGFieldPalest.setBorder(null);
        RGFieldPalest.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelRGPalestLayout = new javax.swing.GroupLayout(painelRGPalest);
        painelRGPalest.setLayout(painelRGPalestLayout);
        painelRGPalestLayout.setHorizontalGroup(
            painelRGPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRGPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelRGPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelRGPalestLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(RGFieldPalest, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelRGPalestLayout.setVerticalGroup(
            painelRGPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRGPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RGFieldPalest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelCNPJPalest.setBackground(new java.awt.Color(102, 102, 102));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("CNPJ");

        CNPJFieldPalest.setBackground(new java.awt.Color(204, 204, 204));
        CNPJFieldPalest.setForeground(new java.awt.Color(51, 51, 51));
        CNPJFieldPalest.setToolTipText("Insira seu email");
        CNPJFieldPalest.setBorder(null);
        CNPJFieldPalest.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelCNPJPalestLayout = new javax.swing.GroupLayout(painelCNPJPalest);
        painelCNPJPalest.setLayout(painelCNPJPalestLayout);
        painelCNPJPalestLayout.setHorizontalGroup(
            painelCNPJPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCNPJPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCNPJPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCNPJPalestLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CNPJFieldPalest, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelCNPJPalestLayout.setVerticalGroup(
            painelCNPJPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCNPJPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CNPJFieldPalest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelDataNascPalest.setBackground(new java.awt.Color(102, 102, 102));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Data de nascimento");

        javax.swing.GroupLayout painelDataNascPalestLayout = new javax.swing.GroupLayout(painelDataNascPalest);
        painelDataNascPalest.setLayout(painelDataNascPalestLayout);
        painelDataNascPalestLayout.setHorizontalGroup(
            painelDataNascPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataNascPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDataNascPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDataNascPalestLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(datanascDateChooserPalest, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelDataNascPalestLayout.setVerticalGroup(
            painelDataNascPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataNascPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datanascDateChooserPalest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelEmailPalest.setBackground(new java.awt.Color(102, 102, 102));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("Email");

        emailFieldPalest.setBackground(new java.awt.Color(204, 204, 204));
        emailFieldPalest.setForeground(new java.awt.Color(51, 51, 51));
        emailFieldPalest.setToolTipText("Insira seu email");
        emailFieldPalest.setBorder(null);
        emailFieldPalest.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelEmailPalestLayout = new javax.swing.GroupLayout(painelEmailPalest);
        painelEmailPalest.setLayout(painelEmailPalestLayout);
        painelEmailPalestLayout.setHorizontalGroup(
            painelEmailPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmailPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEmailPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEmailPalestLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(emailFieldPalest, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelEmailPalestLayout.setVerticalGroup(
            painelEmailPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmailPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailFieldPalest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelCEPPalest.setBackground(new java.awt.Color(102, 102, 102));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("CEP");

        CEPFieldPalest.setBackground(new java.awt.Color(204, 204, 204));
        CEPFieldPalest.setForeground(new java.awt.Color(51, 51, 51));
        CEPFieldPalest.setToolTipText("Insira seu email");
        CEPFieldPalest.setBorder(null);
        CEPFieldPalest.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelCEPPalestLayout = new javax.swing.GroupLayout(painelCEPPalest);
        painelCEPPalest.setLayout(painelCEPPalestLayout);
        painelCEPPalestLayout.setHorizontalGroup(
            painelCEPPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCEPPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCEPPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCEPPalestLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CEPFieldPalest))
                .addContainerGap())
        );
        painelCEPPalestLayout.setVerticalGroup(
            painelCEPPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCEPPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CEPFieldPalest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelCidadePalest.setBackground(new java.awt.Color(102, 102, 102));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setText("Cidade");

        cidadeFieldPalest.setBackground(new java.awt.Color(204, 204, 204));
        cidadeFieldPalest.setForeground(new java.awt.Color(51, 51, 51));
        cidadeFieldPalest.setToolTipText("Insira seu email");
        cidadeFieldPalest.setBorder(null);
        cidadeFieldPalest.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelCidadePalestLayout = new javax.swing.GroupLayout(painelCidadePalest);
        painelCidadePalest.setLayout(painelCidadePalestLayout);
        painelCidadePalestLayout.setHorizontalGroup(
            painelCidadePalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCidadePalestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCidadePalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCidadePalestLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cidadeFieldPalest))
                .addContainerGap())
        );
        painelCidadePalestLayout.setVerticalGroup(
            painelCidadePalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCidadePalestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cidadeFieldPalest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelEndereçoPalest.setBackground(new java.awt.Color(102, 102, 102));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setText("Endereço");

        enderecoFieldPalest.setBackground(new java.awt.Color(204, 204, 204));
        enderecoFieldPalest.setForeground(new java.awt.Color(51, 51, 51));
        enderecoFieldPalest.setToolTipText("Insira seu email");
        enderecoFieldPalest.setBorder(null);
        enderecoFieldPalest.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelEndereçoPalestLayout = new javax.swing.GroupLayout(painelEndereçoPalest);
        painelEndereçoPalest.setLayout(painelEndereçoPalestLayout);
        painelEndereçoPalestLayout.setHorizontalGroup(
            painelEndereçoPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereçoPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEndereçoPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEndereçoPalestLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(enderecoFieldPalest, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelEndereçoPalestLayout.setVerticalGroup(
            painelEndereçoPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereçoPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enderecoFieldPalest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelBairroPalest.setBackground(new java.awt.Color(102, 102, 102));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setText("Bairro");

        bairroFieldPalest.setBackground(new java.awt.Color(204, 204, 204));
        bairroFieldPalest.setForeground(new java.awt.Color(51, 51, 51));
        bairroFieldPalest.setToolTipText("Insira seu email");
        bairroFieldPalest.setBorder(null);
        bairroFieldPalest.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelBairroPalestLayout = new javax.swing.GroupLayout(painelBairroPalest);
        painelBairroPalest.setLayout(painelBairroPalestLayout);
        painelBairroPalestLayout.setHorizontalGroup(
            painelBairroPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBairroPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBairroPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBairroPalestLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bairroFieldPalest, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelBairroPalestLayout.setVerticalGroup(
            painelBairroPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBairroPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bairroFieldPalest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelSenhaPalest.setBackground(new java.awt.Color(102, 102, 102));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel42.setText("Senha");

        senhaFieldPalest.setBackground(new java.awt.Color(204, 204, 204));
        senhaFieldPalest.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout painelSenhaPalestLayout = new javax.swing.GroupLayout(painelSenhaPalest);
        painelSenhaPalest.setLayout(painelSenhaPalestLayout);
        painelSenhaPalestLayout.setHorizontalGroup(
            painelSenhaPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSenhaPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSenhaPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSenhaPalestLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(senhaFieldPalest, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelSenhaPalestLayout.setVerticalGroup(
            painelSenhaPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSenhaPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaFieldPalest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelConfirmarSenhaPalest.setBackground(new java.awt.Color(102, 102, 102));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setText("Confirme sua senha");

        confirmarSenhaFieldPalest.setBackground(new java.awt.Color(204, 204, 204));
        confirmarSenhaFieldPalest.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout painelConfirmarSenhaPalestLayout = new javax.swing.GroupLayout(painelConfirmarSenhaPalest);
        painelConfirmarSenhaPalest.setLayout(painelConfirmarSenhaPalestLayout);
        painelConfirmarSenhaPalestLayout.setHorizontalGroup(
            painelConfirmarSenhaPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfirmarSenhaPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConfirmarSenhaPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConfirmarSenhaPalestLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(0, 190, Short.MAX_VALUE))
                    .addComponent(confirmarSenhaFieldPalest, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelConfirmarSenhaPalestLayout.setVerticalGroup(
            painelConfirmarSenhaPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfirmarSenhaPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmarSenhaFieldPalest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelAlterarDadosPalestLayout = new javax.swing.GroupLayout(painelAlterarDadosPalest);
        painelAlterarDadosPalest.setLayout(painelAlterarDadosPalestLayout);
        painelAlterarDadosPalestLayout.setHorizontalGroup(
            painelAlterarDadosPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlterarDadosPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAlterarDadosPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelAlterarDadosPalestLayout.createSequentialGroup()
                        .addGroup(painelAlterarDadosPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelRGPalest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelCNPJPalest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelDataNascPalest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelEmailPalest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelNomePalest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelCPFPalest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(painelAlterarDadosPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelEndereçoPalest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelBairroPalest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelSenhaPalest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelConfirmarSenhaPalest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelCEPPalest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelCidadePalest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelAlterarDadosPalestLayout.setVerticalGroup(
            painelAlterarDadosPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlterarDadosPalestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAlterarDadosPalestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAlterarDadosPalestLayout.createSequentialGroup()
                        .addComponent(painelNomePalest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCPFPalest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelRGPalest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCNPJPalest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelDataNascPalest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelEmailPalest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelAlterarDadosPalestLayout.createSequentialGroup()
                        .addComponent(painelCEPPalest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCidadePalest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelEndereçoPalest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelBairroPalest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelSenhaPalest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelConfirmarSenhaPalest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        cardMenu.add(painelAlterarDadosPalest, "painelAlterarDadosPalest");

        painelAlterarDadosEvento.setBackground(new java.awt.Color(102, 102, 102));
        painelAlterarDadosEvento.setPreferredSize(new java.awt.Dimension(670, 541));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Alterar dados - Criador de eventos");

        painelNomeEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Nome completo");

        nomeFieldEvento.setBackground(new java.awt.Color(204, 204, 204));
        nomeFieldEvento.setForeground(new java.awt.Color(51, 51, 51));
        nomeFieldEvento.setToolTipText("Insira seu email");
        nomeFieldEvento.setBorder(null);
        nomeFieldEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNomeEventoLayout = new javax.swing.GroupLayout(painelNomeEvento);
        painelNomeEvento.setLayout(painelNomeEventoLayout);
        painelNomeEventoLayout.setHorizontalGroup(
            painelNomeEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNomeEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeFieldEvento)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelNomeEventoLayout.setVerticalGroup(
            painelNomeEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelCPFEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("CPF");

        CPFFieldEvento.setBackground(new java.awt.Color(204, 204, 204));
        CPFFieldEvento.setForeground(new java.awt.Color(51, 51, 51));
        CPFFieldEvento.setToolTipText("Insira seu email");
        CPFFieldEvento.setBorder(null);
        CPFFieldEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelCPFEventoLayout = new javax.swing.GroupLayout(painelCPFEvento);
        painelCPFEvento.setLayout(painelCPFEventoLayout);
        painelCPFEventoLayout.setHorizontalGroup(
            painelCPFEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCPFEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCPFEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCPFEventoLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CPFFieldEvento))
                .addContainerGap())
        );
        painelCPFEventoLayout.setVerticalGroup(
            painelCPFEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCPFEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPFFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelRGEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("RG");

        RGFieldEvento.setBackground(new java.awt.Color(204, 204, 204));
        RGFieldEvento.setForeground(new java.awt.Color(51, 51, 51));
        RGFieldEvento.setToolTipText("Insira seu email");
        RGFieldEvento.setBorder(null);
        RGFieldEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelRGEventoLayout = new javax.swing.GroupLayout(painelRGEvento);
        painelRGEvento.setLayout(painelRGEventoLayout);
        painelRGEventoLayout.setHorizontalGroup(
            painelRGEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRGEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelRGEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelRGEventoLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(RGFieldEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelRGEventoLayout.setVerticalGroup(
            painelRGEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRGEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RGFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelCNPJEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("CNPJ");

        CNPJFieldEvento.setBackground(new java.awt.Color(204, 204, 204));
        CNPJFieldEvento.setForeground(new java.awt.Color(51, 51, 51));
        CNPJFieldEvento.setToolTipText("Insira seu email");
        CNPJFieldEvento.setBorder(null);
        CNPJFieldEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelCNPJEventoLayout = new javax.swing.GroupLayout(painelCNPJEvento);
        painelCNPJEvento.setLayout(painelCNPJEventoLayout);
        painelCNPJEventoLayout.setHorizontalGroup(
            painelCNPJEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCNPJEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCNPJEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCNPJEventoLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CNPJFieldEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelCNPJEventoLayout.setVerticalGroup(
            painelCNPJEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCNPJEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CNPJFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelDataNascEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Data de nascimento");

        javax.swing.GroupLayout painelDataNascEventoLayout = new javax.swing.GroupLayout(painelDataNascEvento);
        painelDataNascEvento.setLayout(painelDataNascEventoLayout);
        painelDataNascEventoLayout.setHorizontalGroup(
            painelDataNascEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataNascEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDataNascEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDataNascEventoLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(datanascDateChooserEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelDataNascEventoLayout.setVerticalGroup(
            painelDataNascEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataNascEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datanascDateChooserEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelEmailEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel44.setText("Email");

        emailFieldEvento.setBackground(new java.awt.Color(204, 204, 204));
        emailFieldEvento.setForeground(new java.awt.Color(51, 51, 51));
        emailFieldEvento.setToolTipText("Insira seu email");
        emailFieldEvento.setBorder(null);
        emailFieldEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelEmailEventoLayout = new javax.swing.GroupLayout(painelEmailEvento);
        painelEmailEvento.setLayout(painelEmailEventoLayout);
        painelEmailEventoLayout.setHorizontalGroup(
            painelEmailEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmailEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEmailEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEmailEventoLayout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(emailFieldEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelEmailEventoLayout.setVerticalGroup(
            painelEmailEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmailEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelCEPEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setText("CEP");

        CEPFieldEvento.setBackground(new java.awt.Color(204, 204, 204));
        CEPFieldEvento.setForeground(new java.awt.Color(51, 51, 51));
        CEPFieldEvento.setToolTipText("Insira seu email");
        CEPFieldEvento.setBorder(null);
        CEPFieldEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelCEPEventoLayout = new javax.swing.GroupLayout(painelCEPEvento);
        painelCEPEvento.setLayout(painelCEPEventoLayout);
        painelCEPEventoLayout.setHorizontalGroup(
            painelCEPEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCEPEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCEPEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCEPEventoLayout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CEPFieldEvento))
                .addContainerGap())
        );
        painelCEPEventoLayout.setVerticalGroup(
            painelCEPEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCEPEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CEPFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelCidadeEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel46.setText("Cidade");

        cidadeFieldEvento.setBackground(new java.awt.Color(204, 204, 204));
        cidadeFieldEvento.setForeground(new java.awt.Color(51, 51, 51));
        cidadeFieldEvento.setToolTipText("Insira seu email");
        cidadeFieldEvento.setBorder(null);
        cidadeFieldEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelCidadeEventoLayout = new javax.swing.GroupLayout(painelCidadeEvento);
        painelCidadeEvento.setLayout(painelCidadeEventoLayout);
        painelCidadeEventoLayout.setHorizontalGroup(
            painelCidadeEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCidadeEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCidadeEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCidadeEventoLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cidadeFieldEvento))
                .addContainerGap())
        );
        painelCidadeEventoLayout.setVerticalGroup(
            painelCidadeEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCidadeEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cidadeFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelEndereçoEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setText("Endereço");

        enderecoFieldEvento.setBackground(new java.awt.Color(204, 204, 204));
        enderecoFieldEvento.setForeground(new java.awt.Color(51, 51, 51));
        enderecoFieldEvento.setToolTipText("Insira seu email");
        enderecoFieldEvento.setBorder(null);
        enderecoFieldEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelEndereçoEventoLayout = new javax.swing.GroupLayout(painelEndereçoEvento);
        painelEndereçoEvento.setLayout(painelEndereçoEventoLayout);
        painelEndereçoEventoLayout.setHorizontalGroup(
            painelEndereçoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereçoEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEndereçoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEndereçoEventoLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(enderecoFieldEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelEndereçoEventoLayout.setVerticalGroup(
            painelEndereçoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereçoEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enderecoFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelBairroEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel48.setText("Bairro");

        bairroFieldEvento.setBackground(new java.awt.Color(204, 204, 204));
        bairroFieldEvento.setForeground(new java.awt.Color(51, 51, 51));
        bairroFieldEvento.setToolTipText("Insira seu email");
        bairroFieldEvento.setBorder(null);
        bairroFieldEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelBairroEventoLayout = new javax.swing.GroupLayout(painelBairroEvento);
        painelBairroEvento.setLayout(painelBairroEventoLayout);
        painelBairroEventoLayout.setHorizontalGroup(
            painelBairroEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBairroEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBairroEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBairroEventoLayout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bairroFieldEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelBairroEventoLayout.setVerticalGroup(
            painelBairroEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBairroEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bairroFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelSenhaEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel49.setText("Senha");

        senhaFieldEvento.setBackground(new java.awt.Color(204, 204, 204));
        senhaFieldEvento.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout painelSenhaEventoLayout = new javax.swing.GroupLayout(painelSenhaEvento);
        painelSenhaEvento.setLayout(painelSenhaEventoLayout);
        painelSenhaEventoLayout.setHorizontalGroup(
            painelSenhaEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSenhaEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSenhaEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSenhaEventoLayout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(senhaFieldEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelSenhaEventoLayout.setVerticalGroup(
            painelSenhaEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSenhaEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelConfirmarSenhaEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel50.setText("Confirme sua senha");

        confirmarSenhaFieldEvento.setBackground(new java.awt.Color(204, 204, 204));
        confirmarSenhaFieldEvento.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout painelConfirmarSenhaEventoLayout = new javax.swing.GroupLayout(painelConfirmarSenhaEvento);
        painelConfirmarSenhaEvento.setLayout(painelConfirmarSenhaEventoLayout);
        painelConfirmarSenhaEventoLayout.setHorizontalGroup(
            painelConfirmarSenhaEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfirmarSenhaEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConfirmarSenhaEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConfirmarSenhaEventoLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(0, 190, Short.MAX_VALUE))
                    .addComponent(confirmarSenhaFieldEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelConfirmarSenhaEventoLayout.setVerticalGroup(
            painelConfirmarSenhaEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfirmarSenhaEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmarSenhaFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelAlterarDadosEventoLayout = new javax.swing.GroupLayout(painelAlterarDadosEvento);
        painelAlterarDadosEvento.setLayout(painelAlterarDadosEventoLayout);
        painelAlterarDadosEventoLayout.setHorizontalGroup(
            painelAlterarDadosEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlterarDadosEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAlterarDadosEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelAlterarDadosEventoLayout.createSequentialGroup()
                        .addGroup(painelAlterarDadosEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelRGEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelCNPJEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelDataNascEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelEmailEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelNomeEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelCPFEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(painelAlterarDadosEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelEndereçoEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelBairroEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelSenhaEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelConfirmarSenhaEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelCEPEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelCidadeEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelAlterarDadosEventoLayout.setVerticalGroup(
            painelAlterarDadosEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlterarDadosEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAlterarDadosEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAlterarDadosEventoLayout.createSequentialGroup()
                        .addComponent(painelNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCPFEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelRGEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCNPJEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelDataNascEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelEmailEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelAlterarDadosEventoLayout.createSequentialGroup()
                        .addComponent(painelCEPEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCidadeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelEndereçoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelBairroEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelSenhaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelConfirmarSenhaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        cardMenu.add(painelAlterarDadosEvento, "painelAlterarDadosEvento");

        painelRealizarCadastro.setBackground(new java.awt.Color(102, 102, 102));

        botaoRegistrarConta.setBackground(new java.awt.Color(204, 204, 204));
        botaoRegistrarConta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoRegistrarConta.setForeground(new java.awt.Color(51, 51, 51));
        botaoRegistrarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoRegistrarConta.setText("Alterar dados");
        botaoRegistrarConta.setBorder(null);
        botaoRegistrarConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoRegistrarConta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoRegistrarConta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoRegistrarConta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N

        javax.swing.GroupLayout painelRealizarCadastroLayout = new javax.swing.GroupLayout(painelRealizarCadastro);
        painelRealizarCadastro.setLayout(painelRealizarCadastroLayout);
        painelRealizarCadastroLayout.setHorizontalGroup(
            painelRealizarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRealizarCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoRegistrarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelRealizarCadastroLayout.setVerticalGroup(
            painelRealizarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRealizarCadastroLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(botaoRegistrarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelRealizarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cardMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelRealizarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(menuConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBotaoAlterarDados() {
        return botaoAlterarDados;
    }

    public JButton getBotaoExcluirConta() {
        return botaoExcluirConta;
    }

    public JButton getBotaoRegistrarConta() {
        return botaoRegistrarConta;
    }

    public JButton getBotaoTrocarTipoConta() {
        return botaoTrocarTipoConta;
    }

    public JButton getBotaoVoltar() {
        return botaoVoltar;
    }
    
    public void showMenu(String user) {
        menu.show(cardMenu, user);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CEPFieldEvento;
    private javax.swing.JTextField CEPFieldPalest;
    private javax.swing.JTextField CEPFieldSpec;
    private javax.swing.JTextField CNPJFieldEvento;
    private javax.swing.JTextField CNPJFieldPalest;
    private javax.swing.JTextField CPFFieldEvento;
    private javax.swing.JTextField CPFFieldPalest;
    private javax.swing.JTextField CPFFieldSpec;
    private javax.swing.JTextField RGFieldEvento;
    private javax.swing.JTextField RGFieldPalest;
    private javax.swing.JTextField RGFieldSpec;
    private javax.swing.JTextField bairroFieldEvento;
    private javax.swing.JTextField bairroFieldPalest;
    private javax.swing.JTextField bairroFieldSpec;
    private javax.swing.JButton botaoAlterarDados;
    private javax.swing.JButton botaoExcluirConta;
    private javax.swing.JButton botaoRegistrarConta;
    private javax.swing.JButton botaoTrocarTipoConta;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JPanel cardMenu;
    private javax.swing.JTextField cidadeFieldEvento;
    private javax.swing.JTextField cidadeFieldPalest;
    private javax.swing.JTextField cidadeFieldSpec;
    private javax.swing.JPasswordField confirmarSenhaFieldEvento;
    private javax.swing.JPasswordField confirmarSenhaFieldPalest;
    private javax.swing.JPasswordField confirmarSenhaFieldSpec;
    private com.toedter.calendar.JDateChooser datanascDateChooserEvento;
    private com.toedter.calendar.JDateChooser datanascDateChooserPalest;
    private com.toedter.calendar.JDateChooser datanascDateChooserSpec;
    private javax.swing.JTextField emailFieldEvento;
    private javax.swing.JTextField emailFieldPalest;
    private javax.swing.JTextField emailFieldSpec;
    private javax.swing.JTextField enderecoFieldEvento;
    private javax.swing.JTextField enderecoFieldPalest;
    private javax.swing.JTextField enderecoFieldSpec;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JPanel menuConta;
    private javax.swing.JTextField nomeFieldEvento;
    private javax.swing.JTextField nomeFieldPalest;
    private javax.swing.JTextField nomeFieldSpec;
    private javax.swing.JPanel painelAlterarDadosEvento;
    private javax.swing.JPanel painelAlterarDadosPalest;
    private javax.swing.JPanel painelAlterarDadosSpec;
    private javax.swing.JPanel painelBairroEvento;
    private javax.swing.JPanel painelBairroPalest;
    private javax.swing.JPanel painelBairroSpec;
    private javax.swing.JPanel painelCEPEvento;
    private javax.swing.JPanel painelCEPPalest;
    private javax.swing.JPanel painelCEPSpec;
    private javax.swing.JPanel painelCNPJEvento;
    private javax.swing.JPanel painelCNPJPalest;
    private javax.swing.JPanel painelCPFEvento;
    private javax.swing.JPanel painelCPFPalest;
    private javax.swing.JPanel painelCPFSpec;
    private javax.swing.JPanel painelCidadeEvento;
    private javax.swing.JPanel painelCidadePalest;
    private javax.swing.JPanel painelCidadeSpec;
    private javax.swing.JPanel painelConfirmarSenhaEvento;
    private javax.swing.JPanel painelConfirmarSenhaPalest;
    private javax.swing.JPanel painelConfirmarSenhaSpec;
    private javax.swing.JPanel painelDataNascEvento;
    private javax.swing.JPanel painelDataNascPalest;
    private javax.swing.JPanel painelDataNascSpec;
    private javax.swing.JPanel painelEmailEvento;
    private javax.swing.JPanel painelEmailPalest;
    private javax.swing.JPanel painelEmailSpec;
    private javax.swing.JPanel painelEndereçoEvento;
    private javax.swing.JPanel painelEndereçoPalest;
    private javax.swing.JPanel painelEndereçoSpec;
    private javax.swing.JPanel painelNomeEvento;
    private javax.swing.JPanel painelNomePalest;
    private javax.swing.JPanel painelNomeSpec;
    private javax.swing.JPanel painelRGEvento;
    private javax.swing.JPanel painelRGPalest;
    private javax.swing.JPanel painelRGSpec;
    private javax.swing.JPanel painelRealizarCadastro;
    private javax.swing.JPanel painelSenhaEvento;
    private javax.swing.JPanel painelSenhaPalest;
    private javax.swing.JPanel painelSenhaSpec;
    private javax.swing.JPanel painelSobrenomeSpec;
    private javax.swing.JPasswordField senhaFieldEvento;
    private javax.swing.JPasswordField senhaFieldPalest;
    private javax.swing.JPasswordField senhaFieldSpec;
    private javax.swing.JTextField sobrenomeFieldSpec;
    // End of variables declaration//GEN-END:variables
}
