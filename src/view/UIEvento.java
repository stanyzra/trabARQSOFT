package view;

/**
 *
 * @author aleix
 */
public class UIEvento extends javax.swing.JFrame {

    public UIEvento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuEvento = new javax.swing.JPanel();
        botaoVoltar = new javax.swing.JButton();
        bodyEvento = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        painelNomeApresentacao = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nomeFieldApresentacao = new javax.swing.JTextField();
        painelNomeEmpresaApresentacao = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        painelSetVagasPalestrasEvento = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        setVagasPalestrasEventoSpinner = new javax.swing.JSpinner();
        painelSetPrecoIngressoApresentacao = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        setPrecoIngressoApresentacaoField = new javax.swing.JTextField();
        painelSetVagasPessoasEvento = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        setVagasPessoasEventoSpinner = new javax.swing.JSpinner();
        painelDataEvento = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        dataEventoChooser = new com.toedter.calendar.JDateChooser();
        painelHorarioEvento = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        horarioEventoField = new javax.swing.JTextField();
        botaoCriarEvento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuEvento.setBackground(new java.awt.Color(204, 204, 204));

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

        javax.swing.GroupLayout menuEventoLayout = new javax.swing.GroupLayout(menuEvento);
        menuEvento.setLayout(menuEventoLayout);
        menuEventoLayout.setHorizontalGroup(
            menuEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuEventoLayout.setVerticalGroup(
            menuEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuEventoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bodyEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Criar evento");

        painelNomeApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nome do evento");

        nomeFieldApresentacao.setBackground(new java.awt.Color(204, 204, 204));
        nomeFieldApresentacao.setForeground(new java.awt.Color(51, 51, 51));
        nomeFieldApresentacao.setToolTipText("Insira seu email");
        nomeFieldApresentacao.setBorder(null);
        nomeFieldApresentacao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNomeApresentacaoLayout = new javax.swing.GroupLayout(painelNomeApresentacao);
        painelNomeApresentacao.setLayout(painelNomeApresentacaoLayout);
        painelNomeApresentacaoLayout.setHorizontalGroup(
            painelNomeApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNomeApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeFieldApresentacao)
                    .addGroup(painelNomeApresentacaoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelNomeApresentacaoLayout.setVerticalGroup(
            painelNomeApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeFieldApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelNomeEmpresaApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nome da empresa");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "empresa 1", "empresa 2", "empresa 3", "empresa 4", "empresa 5" }));

        javax.swing.GroupLayout painelNomeEmpresaApresentacaoLayout = new javax.swing.GroupLayout(painelNomeEmpresaApresentacao);
        painelNomeEmpresaApresentacao.setLayout(painelNomeEmpresaApresentacaoLayout);
        painelNomeEmpresaApresentacaoLayout.setHorizontalGroup(
            painelNomeEmpresaApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeEmpresaApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNomeEmpresaApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelNomeEmpresaApresentacaoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelNomeEmpresaApresentacaoLayout.setVerticalGroup(
            painelNomeEmpresaApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeEmpresaApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelSetVagasPalestrasEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Definir número de vagas (palestras)");

        javax.swing.GroupLayout painelSetVagasPalestrasEventoLayout = new javax.swing.GroupLayout(painelSetVagasPalestrasEvento);
        painelSetVagasPalestrasEvento.setLayout(painelSetVagasPalestrasEventoLayout);
        painelSetVagasPalestrasEventoLayout.setHorizontalGroup(
            painelSetVagasPalestrasEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSetVagasPalestrasEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(setVagasPalestrasEventoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelSetVagasPalestrasEventoLayout.setVerticalGroup(
            painelSetVagasPalestrasEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSetVagasPalestrasEventoLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(painelSetVagasPalestrasEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(setVagasPalestrasEventoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        painelSetPrecoIngressoApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Definir preço do ingresso");

        setPrecoIngressoApresentacaoField.setBackground(new java.awt.Color(204, 204, 204));
        setPrecoIngressoApresentacaoField.setForeground(new java.awt.Color(51, 51, 51));
        setPrecoIngressoApresentacaoField.setToolTipText("Insira seu email");
        setPrecoIngressoApresentacaoField.setBorder(null);
        setPrecoIngressoApresentacaoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelSetPrecoIngressoApresentacaoLayout = new javax.swing.GroupLayout(painelSetPrecoIngressoApresentacao);
        painelSetPrecoIngressoApresentacao.setLayout(painelSetPrecoIngressoApresentacaoLayout);
        painelSetPrecoIngressoApresentacaoLayout.setHorizontalGroup(
            painelSetPrecoIngressoApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSetPrecoIngressoApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(setPrecoIngressoApresentacaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelSetPrecoIngressoApresentacaoLayout.setVerticalGroup(
            painelSetPrecoIngressoApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSetPrecoIngressoApresentacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelSetPrecoIngressoApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(setPrecoIngressoApresentacaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelSetVagasPessoasEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Definir número de vagas (pessoas)");

        javax.swing.GroupLayout painelSetVagasPessoasEventoLayout = new javax.swing.GroupLayout(painelSetVagasPessoasEvento);
        painelSetVagasPessoasEvento.setLayout(painelSetVagasPessoasEventoLayout);
        painelSetVagasPessoasEventoLayout.setHorizontalGroup(
            painelSetVagasPessoasEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSetVagasPessoasEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(setVagasPessoasEventoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelSetVagasPessoasEventoLayout.setVerticalGroup(
            painelSetVagasPessoasEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSetVagasPessoasEventoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelSetVagasPessoasEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(setVagasPessoasEventoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        painelDataEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Data do evento");

        javax.swing.GroupLayout painelDataEventoLayout = new javax.swing.GroupLayout(painelDataEvento);
        painelDataEvento.setLayout(painelDataEventoLayout);
        painelDataEventoLayout.setHorizontalGroup(
            painelDataEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDataEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDataEventoLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dataEventoChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelDataEventoLayout.setVerticalGroup(
            painelDataEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataEventoChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelHorarioEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Horário do evento");

        horarioEventoField.setBackground(new java.awt.Color(204, 204, 204));
        horarioEventoField.setForeground(new java.awt.Color(51, 51, 51));
        horarioEventoField.setToolTipText("Insira seu email");
        horarioEventoField.setBorder(null);
        horarioEventoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelHorarioEventoLayout = new javax.swing.GroupLayout(painelHorarioEvento);
        painelHorarioEvento.setLayout(painelHorarioEventoLayout);
        painelHorarioEventoLayout.setHorizontalGroup(
            painelHorarioEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHorarioEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelHorarioEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horarioEventoField)
                    .addGroup(painelHorarioEventoLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 223, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelHorarioEventoLayout.setVerticalGroup(
            painelHorarioEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHorarioEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horarioEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        botaoCriarEvento.setBackground(new java.awt.Color(204, 204, 204));
        botaoCriarEvento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCriarEvento.setForeground(new java.awt.Color(51, 51, 51));
        botaoCriarEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoCriarEvento.setText("Criar evento");
        botaoCriarEvento.setBorder(null);
        botaoCriarEvento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCriarEvento.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoCriarEvento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoCriarEvento.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N

        javax.swing.GroupLayout bodyEventoLayout = new javax.swing.GroupLayout(bodyEvento);
        bodyEvento.setLayout(bodyEventoLayout);
        bodyEventoLayout.setHorizontalGroup(
            bodyEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyEventoLayout.createSequentialGroup()
                        .addGroup(bodyEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(painelNomeEmpresaApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelNomeApresentacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(painelDataEvento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelHorarioEvento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bodyEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyEventoLayout.createSequentialGroup()
                                .addComponent(painelSetVagasPalestrasEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(painelSetVagasPessoasEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyEventoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(painelSetPrecoIngressoApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyEventoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoCriarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bodyEventoLayout.setVerticalGroup(
            bodyEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyEventoLayout.createSequentialGroup()
                        .addGroup(bodyEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bodyEventoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(81, 81, 81)
                                .addGroup(bodyEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(painelSetVagasPessoasEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(painelNomeApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addComponent(painelSetVagasPalestrasEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(painelNomeEmpresaApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelDataEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelSetPrecoIngressoApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelHorarioEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(botaoCriarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bodyEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyEvento;
    private javax.swing.JButton botaoCriarEvento;
    private javax.swing.JButton botaoVoltar;
    private com.toedter.calendar.JDateChooser dataEventoChooser;
    private javax.swing.JTextField horarioEventoField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menuEvento;
    private javax.swing.JTextField nomeFieldApresentacao;
    private javax.swing.JPanel painelDataEvento;
    private javax.swing.JPanel painelHorarioEvento;
    private javax.swing.JPanel painelNomeApresentacao;
    private javax.swing.JPanel painelNomeEmpresaApresentacao;
    private javax.swing.JPanel painelSetPrecoIngressoApresentacao;
    private javax.swing.JPanel painelSetVagasPalestrasEvento;
    private javax.swing.JPanel painelSetVagasPessoasEvento;
    private javax.swing.JTextField setPrecoIngressoApresentacaoField;
    private javax.swing.JSpinner setVagasPalestrasEventoSpinner;
    private javax.swing.JSpinner setVagasPessoasEventoSpinner;
    // End of variables declaration//GEN-END:variables
}
