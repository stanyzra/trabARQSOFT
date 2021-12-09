package view;

/**
 *
 * @author aleix
 */
public class UIApresentacao extends javax.swing.JFrame {

    public UIApresentacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuApresentacao = new javax.swing.JPanel();
        botaoVoltar = new javax.swing.JButton();
        bodyApresentacao = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        painelNomeApresentacao = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nomeFieldApresentacao = new javax.swing.JTextField();
        painelNomePalestApresentacao = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        nomePalestFieldApresentacao = new javax.swing.JTextField();
        painelNomeEmpresaApresentacao = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nomeEmpresaFieldApresentacao = new javax.swing.JTextField();
        painelSelecEvento = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        vincularEventoComboBox = new javax.swing.JComboBox<>();
        painelSetNumVagas = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        setNumVagasSpinner = new javax.swing.JSpinner();
        painelSetPrecoIngressoApresentacao = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        setPrecoIngressoApresentacaoField = new javax.swing.JTextField();
        painelDataApresentacao = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        dataApresentacaoChooser = new com.toedter.calendar.JDateChooser();
        painelHorarioApresentacao = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        horarioApresentacaoField = new javax.swing.JTextField();
        botaoCriarApresentacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuApresentacao.setBackground(new java.awt.Color(204, 204, 204));

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

        javax.swing.GroupLayout menuApresentacaoLayout = new javax.swing.GroupLayout(menuApresentacao);
        menuApresentacao.setLayout(menuApresentacaoLayout);
        menuApresentacaoLayout.setHorizontalGroup(
            menuApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuApresentacaoLayout.setVerticalGroup(
            menuApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuApresentacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bodyApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Criar apresentação");

        painelNomeApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nome da apresentação");

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

        painelNomePalestApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nome do(a) apresentador(a)");

        nomePalestFieldApresentacao.setBackground(new java.awt.Color(204, 204, 204));
        nomePalestFieldApresentacao.setForeground(new java.awt.Color(51, 51, 51));
        nomePalestFieldApresentacao.setToolTipText("Insira seu email");
        nomePalestFieldApresentacao.setBorder(null);
        nomePalestFieldApresentacao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNomePalestApresentacaoLayout = new javax.swing.GroupLayout(painelNomePalestApresentacao);
        painelNomePalestApresentacao.setLayout(painelNomePalestApresentacaoLayout);
        painelNomePalestApresentacaoLayout.setHorizontalGroup(
            painelNomePalestApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomePalestApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNomePalestApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelNomePalestApresentacaoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 163, Short.MAX_VALUE))
                    .addComponent(nomePalestFieldApresentacao))
                .addContainerGap())
        );
        painelNomePalestApresentacaoLayout.setVerticalGroup(
            painelNomePalestApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomePalestApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomePalestFieldApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelNomeEmpresaApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nome da empresa");

        nomeEmpresaFieldApresentacao.setEditable(false);
        nomeEmpresaFieldApresentacao.setBackground(new java.awt.Color(153, 153, 153));
        nomeEmpresaFieldApresentacao.setForeground(new java.awt.Color(51, 51, 51));
        nomeEmpresaFieldApresentacao.setToolTipText("Insira seu email");
        nomeEmpresaFieldApresentacao.setBorder(null);
        nomeEmpresaFieldApresentacao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

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
                    .addComponent(nomeEmpresaFieldApresentacao))
                .addContainerGap())
        );
        painelNomeEmpresaApresentacaoLayout.setVerticalGroup(
            painelNomeEmpresaApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeEmpresaApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeEmpresaFieldApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelSelecEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Evento vinculado");

        vincularEventoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "evento 1", "evento 2", "evento 3", "evento 4", "evento 5", "evento 6" }));

        javax.swing.GroupLayout painelSelecEventoLayout = new javax.swing.GroupLayout(painelSelecEvento);
        painelSelecEvento.setLayout(painelSelecEventoLayout);
        painelSelecEventoLayout.setHorizontalGroup(
            painelSelecEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSelecEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSelecEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSelecEventoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(vincularEventoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelSelecEventoLayout.setVerticalGroup(
            painelSelecEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSelecEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vincularEventoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelSetNumVagas.setBackground(new java.awt.Color(102, 102, 102));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Definir número de vagas");

        javax.swing.GroupLayout painelSetNumVagasLayout = new javax.swing.GroupLayout(painelSetNumVagas);
        painelSetNumVagas.setLayout(painelSetNumVagasLayout);
        painelSetNumVagasLayout.setHorizontalGroup(
            painelSetNumVagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSetNumVagasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(setNumVagasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelSetNumVagasLayout.setVerticalGroup(
            painelSetNumVagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSetNumVagasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelSetNumVagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(setNumVagasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        painelDataApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Data da apresentação");

        javax.swing.GroupLayout painelDataApresentacaoLayout = new javax.swing.GroupLayout(painelDataApresentacao);
        painelDataApresentacao.setLayout(painelDataApresentacaoLayout);
        painelDataApresentacaoLayout.setHorizontalGroup(
            painelDataApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDataApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDataApresentacaoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dataApresentacaoChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelDataApresentacaoLayout.setVerticalGroup(
            painelDataApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataApresentacaoChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelHorarioApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Horário da apresentação");

        horarioApresentacaoField.setBackground(new java.awt.Color(204, 204, 204));
        horarioApresentacaoField.setForeground(new java.awt.Color(51, 51, 51));
        horarioApresentacaoField.setToolTipText("Insira seu email");
        horarioApresentacaoField.setBorder(null);
        horarioApresentacaoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelHorarioApresentacaoLayout = new javax.swing.GroupLayout(painelHorarioApresentacao);
        painelHorarioApresentacao.setLayout(painelHorarioApresentacaoLayout);
        painelHorarioApresentacaoLayout.setHorizontalGroup(
            painelHorarioApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHorarioApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelHorarioApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horarioApresentacaoField)
                    .addGroup(painelHorarioApresentacaoLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 185, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelHorarioApresentacaoLayout.setVerticalGroup(
            painelHorarioApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHorarioApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horarioApresentacaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        botaoCriarApresentacao.setBackground(new java.awt.Color(204, 204, 204));
        botaoCriarApresentacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCriarApresentacao.setForeground(new java.awt.Color(51, 51, 51));
        botaoCriarApresentacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoCriarApresentacao.setText("Criar apresentação");
        botaoCriarApresentacao.setBorder(null);
        botaoCriarApresentacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCriarApresentacao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoCriarApresentacao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoCriarApresentacao.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N

        javax.swing.GroupLayout bodyApresentacaoLayout = new javax.swing.GroupLayout(bodyApresentacao);
        bodyApresentacao.setLayout(bodyApresentacaoLayout);
        bodyApresentacaoLayout.setHorizontalGroup(
            bodyApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyApresentacaoLayout.createSequentialGroup()
                        .addGroup(bodyApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(painelNomeEmpresaApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelNomePalestApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelNomeApresentacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bodyApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelDataApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelSelecEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelSetNumVagas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(bodyApresentacaoLayout.createSequentialGroup()
                        .addComponent(painelSetPrecoIngressoApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelHorarioApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyApresentacaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoCriarApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bodyApresentacaoLayout.setVerticalGroup(
            bodyApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(81, 81, 81)
                .addGroup(bodyApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(bodyApresentacaoLayout.createSequentialGroup()
                        .addComponent(painelSelecEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(painelSetNumVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyApresentacaoLayout.createSequentialGroup()
                        .addComponent(painelNomeApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelNomePalestApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelNomeEmpresaApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelDataApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelHorarioApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelSetPrecoIngressoApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(botaoCriarApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bodyApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyApresentacao;
    private javax.swing.JButton botaoCriarApresentacao;
    private javax.swing.JButton botaoVoltar;
    private com.toedter.calendar.JDateChooser dataApresentacaoChooser;
    private javax.swing.JTextField horarioApresentacaoField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menuApresentacao;
    private javax.swing.JTextField nomeEmpresaFieldApresentacao;
    private javax.swing.JTextField nomeFieldApresentacao;
    private javax.swing.JTextField nomeFieldApresentacao1;
    private javax.swing.JTextField nomeFieldApresentacao2;
    private javax.swing.JTextField nomeFieldApresentacao3;
    private javax.swing.JTextField nomePalestFieldApresentacao;
    private javax.swing.JPanel painelDataApresentacao;
    private javax.swing.JPanel painelHorarioApresentacao;
    private javax.swing.JPanel painelNomeApresentacao;
    private javax.swing.JPanel painelNomeApresentacao1;
    private javax.swing.JPanel painelNomeApresentacao2;
    private javax.swing.JPanel painelNomeApresentacao3;
    private javax.swing.JPanel painelNomeEmpresaApresentacao;
    private javax.swing.JPanel painelNomePalestApresentacao;
    private javax.swing.JPanel painelSelecEvento;
    private javax.swing.JPanel painelSetNumVagas;
    private javax.swing.JPanel painelSetPrecoIngressoApresentacao;
    private javax.swing.JSpinner setNumVagasSpinner;
    private javax.swing.JTextField setPrecoIngressoApresentacaoField;
    private javax.swing.JComboBox<String> vincularEventoComboBox;
    // End of variables declaration//GEN-END:variables
}
