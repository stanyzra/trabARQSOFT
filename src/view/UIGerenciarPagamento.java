package view;

import java.awt.CardLayout;
import javax.swing.JButton;

/**
 *
 * @author aleix
 */
public class UIGerenciarPagamento extends javax.swing.JFrame {
    final CardLayout menu;
    public static int indexList;
    public static String nomeConteudo;
    private String tipoCard;

    public UIGerenciarPagamento() {
        initComponents();
        menu = (CardLayout) (cardMenu.getLayout());
        setTipoCard(indexList);
    }
    
    private void setTipoCard(int index){
        if(index % 2 == 0){
            tipoCard = "cardMenuInformacoesEvento";
            menu.show(cardMenu, tipoCard);
        }
        else{
            tipoCard = "cardMenuInformacoesApresentacao";
            menu.show(cardMenu, tipoCard);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuCompra = new javax.swing.JPanel();
        botaoInformacoes = new javax.swing.JButton();
        botaoComprarIngresso = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        cardMenu = new javax.swing.JPanel();
        menuInformacoesApresentacao = new javax.swing.JPanel();
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
        painelNomeEventoVincApresentacao = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        nomeEventVincFieldApresentacao = new javax.swing.JTextField();
        painelNumeroVagasApresentacao = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        numeroVagasFieldApresentacao = new javax.swing.JTextField();
        painelPrecoIngressoApresentacao = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        precoIngressoFieldApresentacao = new javax.swing.JTextField();
        painelDataApresentacao = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        dataApresentacaoField = new javax.swing.JTextField();
        painelHorarioApresentacao = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        horarioApresentacaoField = new javax.swing.JTextField();
        menuComprarIngresso = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        painelNomeItemCompra = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        nomeItemCompraField = new javax.swing.JTextField();
        painelSubDescCompra = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        subtotalField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        descontoField = new javax.swing.JTextField();
        painelPrecoTotalCompra = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        precoTotalField = new javax.swing.JTextField();
        painelFormaPagamento = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        formaPagamentoComboBox = new javax.swing.JComboBox<>();
        botaoFinalizarCompra = new javax.swing.JButton();
        menuInformacoesEvento = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        painelNomeEvento = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        nomeEventoField = new javax.swing.JTextField();
        painelNomeEmpresaEvento = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        nomeEmpresaFieldEvento = new javax.swing.JTextField();
        painelNomeApresentacaoVincEvento = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        nomeApresentacaoVincEventoField = new javax.swing.JTextField();
        painelNumVagasApresentacoesEvento = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        numVagasApresentacoesEventoField = new javax.swing.JTextField();
        painelPrecoIngressoEvento = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        precoIngressoEventoField = new javax.swing.JTextField();
        painelNumVagasPessoasEvento = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        numVagasPessoasEventoField = new javax.swing.JTextField();
        painelDataEvento = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        dataEventoField = new javax.swing.JTextField();
        painelHorarioEvento = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        horarioEventoField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        menuCompra.setBackground(new java.awt.Color(204, 204, 204));

        botaoInformacoes.setBackground(new java.awt.Color(204, 204, 204));
        botaoInformacoes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoInformacoes.setForeground(new java.awt.Color(51, 51, 51));
        botaoInformacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoInformacoes.setText("Informações");
        botaoInformacoes.setBorder(null);
        botaoInformacoes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoInformacoes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoInformacoes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoInformacoes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N
        botaoInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInformacoesActionPerformed(evt);
            }
        });

        botaoComprarIngresso.setBackground(new java.awt.Color(204, 204, 204));
        botaoComprarIngresso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoComprarIngresso.setForeground(new java.awt.Color(51, 51, 51));
        botaoComprarIngresso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoComprarIngresso.setText("Comprar ingresso");
        botaoComprarIngresso.setBorder(null);
        botaoComprarIngresso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoComprarIngresso.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoComprarIngresso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoComprarIngresso.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N
        botaoComprarIngresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprarIngressoActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout menuCompraLayout = new javax.swing.GroupLayout(menuCompra);
        menuCompra.setLayout(menuCompraLayout);
        menuCompraLayout.setHorizontalGroup(
            menuCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botaoComprarIngresso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuCompraLayout.setVerticalGroup(
            menuCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCompraLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(botaoInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(botaoComprarIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardMenu.setBackground(new java.awt.Color(102, 102, 102));
        cardMenu.setLayout(new java.awt.CardLayout());

        menuInformacoesApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Informações da apresentação");

        painelNomeApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nome da apresentação");

        nomeFieldApresentacao.setEditable(false);
        nomeFieldApresentacao.setBackground(new java.awt.Color(153, 153, 153));
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

        nomePalestFieldApresentacao.setEditable(false);
        nomePalestFieldApresentacao.setBackground(new java.awt.Color(153, 153, 153));
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
                        .addGap(0, 0, Short.MAX_VALUE))
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
                        .addGap(0, 223, Short.MAX_VALUE))
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

        painelNomeEventoVincApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Nome do evento vinculado");

        nomeEventVincFieldApresentacao.setEditable(false);
        nomeEventVincFieldApresentacao.setBackground(new java.awt.Color(153, 153, 153));
        nomeEventVincFieldApresentacao.setForeground(new java.awt.Color(51, 51, 51));
        nomeEventVincFieldApresentacao.setToolTipText("Insira seu email");
        nomeEventVincFieldApresentacao.setBorder(null);
        nomeEventVincFieldApresentacao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNomeEventoVincApresentacaoLayout = new javax.swing.GroupLayout(painelNomeEventoVincApresentacao);
        painelNomeEventoVincApresentacao.setLayout(painelNomeEventoVincApresentacaoLayout);
        painelNomeEventoVincApresentacaoLayout.setHorizontalGroup(
            painelNomeEventoVincApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeEventoVincApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNomeEventoVincApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeEventVincFieldApresentacao)
                    .addGroup(painelNomeEventoVincApresentacaoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelNomeEventoVincApresentacaoLayout.setVerticalGroup(
            painelNomeEventoVincApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeEventoVincApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeEventVincFieldApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelNumeroVagasApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Número de vagas disponíveis");

        numeroVagasFieldApresentacao.setEditable(false);
        numeroVagasFieldApresentacao.setBackground(new java.awt.Color(153, 153, 153));
        numeroVagasFieldApresentacao.setForeground(new java.awt.Color(51, 51, 51));
        numeroVagasFieldApresentacao.setToolTipText("Insira seu email");
        numeroVagasFieldApresentacao.setBorder(null);
        numeroVagasFieldApresentacao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNumeroVagasApresentacaoLayout = new javax.swing.GroupLayout(painelNumeroVagasApresentacao);
        painelNumeroVagasApresentacao.setLayout(painelNumeroVagasApresentacaoLayout);
        painelNumeroVagasApresentacaoLayout.setHorizontalGroup(
            painelNumeroVagasApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNumeroVagasApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numeroVagasFieldApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelNumeroVagasApresentacaoLayout.setVerticalGroup(
            painelNumeroVagasApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNumeroVagasApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNumeroVagasApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(numeroVagasFieldApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPrecoIngressoApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Preço do ingresso");

        precoIngressoFieldApresentacao.setEditable(false);
        precoIngressoFieldApresentacao.setBackground(new java.awt.Color(153, 153, 153));
        precoIngressoFieldApresentacao.setForeground(new java.awt.Color(51, 51, 51));
        precoIngressoFieldApresentacao.setToolTipText("Insira seu email");
        precoIngressoFieldApresentacao.setBorder(null);
        precoIngressoFieldApresentacao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelPrecoIngressoApresentacaoLayout = new javax.swing.GroupLayout(painelPrecoIngressoApresentacao);
        painelPrecoIngressoApresentacao.setLayout(painelPrecoIngressoApresentacaoLayout);
        painelPrecoIngressoApresentacaoLayout.setHorizontalGroup(
            painelPrecoIngressoApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrecoIngressoApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(precoIngressoFieldApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelPrecoIngressoApresentacaoLayout.setVerticalGroup(
            painelPrecoIngressoApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrecoIngressoApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrecoIngressoApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(precoIngressoFieldApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelDataApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Data da apresentação");

        dataApresentacaoField.setEditable(false);
        dataApresentacaoField.setBackground(new java.awt.Color(153, 153, 153));
        dataApresentacaoField.setForeground(new java.awt.Color(51, 51, 51));
        dataApresentacaoField.setToolTipText("Insira seu email");
        dataApresentacaoField.setBorder(null);
        dataApresentacaoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelDataApresentacaoLayout = new javax.swing.GroupLayout(painelDataApresentacao);
        painelDataApresentacao.setLayout(painelDataApresentacaoLayout);
        painelDataApresentacaoLayout.setHorizontalGroup(
            painelDataApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDataApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDataApresentacaoLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dataApresentacaoField))
                .addContainerGap())
        );
        painelDataApresentacaoLayout.setVerticalGroup(
            painelDataApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataApresentacaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelHorarioApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Horario da apresentação");

        horarioApresentacaoField.setEditable(false);
        horarioApresentacaoField.setBackground(new java.awt.Color(153, 153, 153));
        horarioApresentacaoField.setForeground(new java.awt.Color(51, 51, 51));
        horarioApresentacaoField.setToolTipText("Insira seu email");
        horarioApresentacaoField.setBorder(null);
        horarioApresentacaoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        horarioApresentacaoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioApresentacaoFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelHorarioApresentacaoLayout = new javax.swing.GroupLayout(painelHorarioApresentacao);
        painelHorarioApresentacao.setLayout(painelHorarioApresentacaoLayout);
        painelHorarioApresentacaoLayout.setHorizontalGroup(
            painelHorarioApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHorarioApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelHorarioApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horarioApresentacaoField, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addGroup(painelHorarioApresentacaoLayout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelHorarioApresentacaoLayout.setVerticalGroup(
            painelHorarioApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHorarioApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horarioApresentacaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout menuInformacoesApresentacaoLayout = new javax.swing.GroupLayout(menuInformacoesApresentacao);
        menuInformacoesApresentacao.setLayout(menuInformacoesApresentacaoLayout);
        menuInformacoesApresentacaoLayout.setHorizontalGroup(
            menuInformacoesApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInformacoesApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuInformacoesApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(painelDataApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNomeEmpresaApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNomePalestApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNomeApresentacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuInformacoesApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelPrecoIngressoApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNomeEventoVincApresentacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNumeroVagasApresentacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelHorarioApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        menuInformacoesApresentacaoLayout.setVerticalGroup(
            menuInformacoesApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInformacoesApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(81, 81, 81)
                .addGroup(menuInformacoesApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(menuInformacoesApresentacaoLayout.createSequentialGroup()
                        .addComponent(painelNomeEventoVincApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(painelNumeroVagasApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuInformacoesApresentacaoLayout.createSequentialGroup()
                        .addComponent(painelNomeApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelNomePalestApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuInformacoesApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelNomeEmpresaApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelPrecoIngressoApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(menuInformacoesApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDataApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelHorarioApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        cardMenu.add(menuInformacoesApresentacao, "cardMenuInformacoesApresentacao");

        menuComprarIngresso.setBackground(new java.awt.Color(102, 102, 102));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setText("Compra de ingresso");

        painelNomeItemCompra.setBackground(new java.awt.Color(102, 102, 102));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Nome do item");

        nomeItemCompraField.setEditable(false);
        nomeItemCompraField.setBackground(new java.awt.Color(153, 153, 153));
        nomeItemCompraField.setForeground(new java.awt.Color(51, 51, 51));
        nomeItemCompraField.setToolTipText("Insira seu email");
        nomeItemCompraField.setBorder(null);
        nomeItemCompraField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNomeItemCompraLayout = new javax.swing.GroupLayout(painelNomeItemCompra);
        painelNomeItemCompra.setLayout(painelNomeItemCompraLayout);
        painelNomeItemCompraLayout.setHorizontalGroup(
            painelNomeItemCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeItemCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNomeItemCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeItemCompraField)
                    .addGroup(painelNomeItemCompraLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelNomeItemCompraLayout.setVerticalGroup(
            painelNomeItemCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeItemCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeItemCompraField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelSubDescCompra.setBackground(new java.awt.Color(102, 102, 102));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Subtotal");

        subtotalField.setEditable(false);
        subtotalField.setBackground(new java.awt.Color(102, 102, 102));
        subtotalField.setForeground(new java.awt.Color(51, 51, 51));
        subtotalField.setText("  R$ 00,00");
        subtotalField.setToolTipText("Insira seu email");
        subtotalField.setBorder(null);
        subtotalField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        subtotalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalFieldActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Desconto");

        descontoField.setEditable(false);
        descontoField.setBackground(new java.awt.Color(102, 102, 102));
        descontoField.setForeground(new java.awt.Color(0, 255, 0));
        descontoField.setText("-R$ 00,00");
        descontoField.setToolTipText("Insira seu email");
        descontoField.setBorder(null);
        descontoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelSubDescCompraLayout = new javax.swing.GroupLayout(painelSubDescCompra);
        painelSubDescCompra.setLayout(painelSubDescCompraLayout);
        painelSubDescCompraLayout.setHorizontalGroup(
            painelSubDescCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSubDescCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSubDescCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelSubDescCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(descontoField)
                    .addComponent(subtotalField))
                .addContainerGap())
        );
        painelSubDescCompraLayout.setVerticalGroup(
            painelSubDescCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSubDescCompraLayout.createSequentialGroup()
                .addGroup(painelSubDescCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSubDescCompraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19))
                    .addComponent(subtotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSubDescCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(descontoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelPrecoTotalCompra.setBackground(new java.awt.Color(102, 102, 102));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setText("Total");

        precoTotalField.setEditable(false);
        precoTotalField.setBackground(new java.awt.Color(102, 102, 102));
        precoTotalField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precoTotalField.setForeground(new java.awt.Color(51, 51, 51));
        precoTotalField.setText("R$ 00,00");
        precoTotalField.setToolTipText("Insira seu email");
        precoTotalField.setBorder(null);
        precoTotalField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelPrecoTotalCompraLayout = new javax.swing.GroupLayout(painelPrecoTotalCompra);
        painelPrecoTotalCompra.setLayout(painelPrecoTotalCompraLayout);
        painelPrecoTotalCompraLayout.setHorizontalGroup(
            painelPrecoTotalCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrecoTotalCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(precoTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelPrecoTotalCompraLayout.setVerticalGroup(
            painelPrecoTotalCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrecoTotalCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel20)
                .addComponent(precoTotalField))
        );

        painelFormaPagamento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Escolher forma de pagamento");

        formaPagamentoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão de credito", "Pix", "Boleto", "Transferencia eletrônica" }));

        javax.swing.GroupLayout painelFormaPagamentoLayout = new javax.swing.GroupLayout(painelFormaPagamento);
        painelFormaPagamento.setLayout(painelFormaPagamentoLayout);
        painelFormaPagamentoLayout.setHorizontalGroup(
            painelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormaPagamentoLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 170, Short.MAX_VALUE))
                    .addComponent(formaPagamentoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelFormaPagamentoLayout.setVerticalGroup(
            painelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formaPagamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        botaoFinalizarCompra.setBackground(new java.awt.Color(204, 204, 204));
        botaoFinalizarCompra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoFinalizarCompra.setForeground(new java.awt.Color(51, 51, 51));
        botaoFinalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/default.png"))); // NOI18N
        botaoFinalizarCompra.setText("Finalizar compra");
        botaoFinalizarCompra.setBorder(null);
        botaoFinalizarCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoFinalizarCompra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pressed.png"))); // NOI18N
        botaoFinalizarCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/hover.png"))); // NOI18N
        botaoFinalizarCompra.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/selected.png"))); // NOI18N

        javax.swing.GroupLayout menuComprarIngressoLayout = new javax.swing.GroupLayout(menuComprarIngresso);
        menuComprarIngresso.setLayout(menuComprarIngressoLayout);
        menuComprarIngressoLayout.setHorizontalGroup(
            menuComprarIngressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuComprarIngressoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuComprarIngressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(painelSubDescCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNomeItemCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addComponent(painelPrecoTotalCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuComprarIngressoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuComprarIngressoLayout.setVerticalGroup(
            menuComprarIngressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuComprarIngressoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(81, 81, 81)
                .addGroup(menuComprarIngressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuComprarIngressoLayout.createSequentialGroup()
                        .addComponent(painelNomeItemCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelSubDescCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(painelPrecoTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(botaoFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardMenu.add(menuComprarIngresso, "cardMenuComprarIngresso");

        menuInformacoesEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Informações do evento");

        painelNomeEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Nome do evento");

        nomeEventoField.setBackground(new java.awt.Color(153, 153, 153));
        nomeEventoField.setForeground(new java.awt.Color(51, 51, 51));
        nomeEventoField.setToolTipText("Insira seu email");
        nomeEventoField.setBorder(null);
        nomeEventoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNomeEventoLayout = new javax.swing.GroupLayout(painelNomeEvento);
        painelNomeEvento.setLayout(painelNomeEventoLayout);
        painelNomeEventoLayout.setHorizontalGroup(
            painelNomeEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNomeEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeEventoField)
                    .addGroup(painelNomeEventoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelNomeEventoLayout.setVerticalGroup(
            painelNomeEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelNomeEmpresaEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Nome da empresa");

        nomeEmpresaFieldEvento.setEditable(false);
        nomeEmpresaFieldEvento.setBackground(new java.awt.Color(153, 153, 153));
        nomeEmpresaFieldEvento.setForeground(new java.awt.Color(51, 51, 51));
        nomeEmpresaFieldEvento.setToolTipText("Insira seu email");
        nomeEmpresaFieldEvento.setBorder(null);
        nomeEmpresaFieldEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNomeEmpresaEventoLayout = new javax.swing.GroupLayout(painelNomeEmpresaEvento);
        painelNomeEmpresaEvento.setLayout(painelNomeEmpresaEventoLayout);
        painelNomeEmpresaEventoLayout.setHorizontalGroup(
            painelNomeEmpresaEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeEmpresaEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNomeEmpresaEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelNomeEmpresaEventoLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nomeEmpresaFieldEvento))
                .addContainerGap())
        );
        painelNomeEmpresaEventoLayout.setVerticalGroup(
            painelNomeEmpresaEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeEmpresaEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeEmpresaFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelNomeApresentacaoVincEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Número de apresentações");

        nomeApresentacaoVincEventoField.setBackground(new java.awt.Color(153, 153, 153));
        nomeApresentacaoVincEventoField.setForeground(new java.awt.Color(51, 51, 51));
        nomeApresentacaoVincEventoField.setToolTipText("Insira seu email");
        nomeApresentacaoVincEventoField.setBorder(null);
        nomeApresentacaoVincEventoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNomeApresentacaoVincEventoLayout = new javax.swing.GroupLayout(painelNomeApresentacaoVincEvento);
        painelNomeApresentacaoVincEvento.setLayout(painelNomeApresentacaoVincEventoLayout);
        painelNomeApresentacaoVincEventoLayout.setHorizontalGroup(
            painelNomeApresentacaoVincEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeApresentacaoVincEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNomeApresentacaoVincEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeApresentacaoVincEventoField)
                    .addGroup(painelNomeApresentacaoVincEventoLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 175, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelNomeApresentacaoVincEventoLayout.setVerticalGroup(
            painelNomeApresentacaoVincEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeApresentacaoVincEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeApresentacaoVincEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelNumVagasApresentacoesEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Número de vagas disponíveis (apresentações)");

        numVagasApresentacoesEventoField.setBackground(new java.awt.Color(153, 153, 153));
        numVagasApresentacoesEventoField.setForeground(new java.awt.Color(51, 51, 51));
        numVagasApresentacoesEventoField.setToolTipText("Insira seu email");
        numVagasApresentacoesEventoField.setBorder(null);
        numVagasApresentacoesEventoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNumVagasApresentacoesEventoLayout = new javax.swing.GroupLayout(painelNumVagasApresentacoesEvento);
        painelNumVagasApresentacoesEvento.setLayout(painelNumVagasApresentacoesEventoLayout);
        painelNumVagasApresentacoesEventoLayout.setHorizontalGroup(
            painelNumVagasApresentacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNumVagasApresentacoesEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNumVagasApresentacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numVagasApresentacoesEventoField, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelNumVagasApresentacoesEventoLayout.setVerticalGroup(
            painelNumVagasApresentacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNumVagasApresentacoesEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numVagasApresentacoesEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelPrecoIngressoEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Preço do ingresso");

        precoIngressoEventoField.setBackground(new java.awt.Color(153, 153, 153));
        precoIngressoEventoField.setForeground(new java.awt.Color(51, 51, 51));
        precoIngressoEventoField.setToolTipText("Insira seu email");
        precoIngressoEventoField.setBorder(null);
        precoIngressoEventoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelPrecoIngressoEventoLayout = new javax.swing.GroupLayout(painelPrecoIngressoEvento);
        painelPrecoIngressoEvento.setLayout(painelPrecoIngressoEventoLayout);
        painelPrecoIngressoEventoLayout.setHorizontalGroup(
            painelPrecoIngressoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrecoIngressoEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(precoIngressoEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelPrecoIngressoEventoLayout.setVerticalGroup(
            painelPrecoIngressoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrecoIngressoEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrecoIngressoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(precoIngressoEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelNumVagasPessoasEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Número de vagas disponíveis (pessoas)");

        numVagasPessoasEventoField.setBackground(new java.awt.Color(153, 153, 153));
        numVagasPessoasEventoField.setForeground(new java.awt.Color(51, 51, 51));
        numVagasPessoasEventoField.setToolTipText("Insira seu email");
        numVagasPessoasEventoField.setBorder(null);
        numVagasPessoasEventoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNumVagasPessoasEventoLayout = new javax.swing.GroupLayout(painelNumVagasPessoasEvento);
        painelNumVagasPessoasEvento.setLayout(painelNumVagasPessoasEventoLayout);
        painelNumVagasPessoasEventoLayout.setHorizontalGroup(
            painelNumVagasPessoasEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNumVagasPessoasEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNumVagasPessoasEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numVagasPessoasEventoField, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelNumVagasPessoasEventoLayout.setVerticalGroup(
            painelNumVagasPessoasEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNumVagasPessoasEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numVagasPessoasEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelDataEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Data do evento");

        dataEventoField.setEditable(false);
        dataEventoField.setBackground(new java.awt.Color(153, 153, 153));
        dataEventoField.setForeground(new java.awt.Color(51, 51, 51));
        dataEventoField.setToolTipText("Insira seu email");
        dataEventoField.setBorder(null);
        dataEventoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelDataEventoLayout = new javax.swing.GroupLayout(painelDataEvento);
        painelDataEvento.setLayout(painelDataEventoLayout);
        painelDataEventoLayout.setHorizontalGroup(
            painelDataEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDataEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDataEventoLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dataEventoField))
                .addContainerGap())
        );
        painelDataEventoLayout.setVerticalGroup(
            painelDataEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelHorarioEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Horario do evento");

        horarioEventoField.setEditable(false);
        horarioEventoField.setBackground(new java.awt.Color(153, 153, 153));
        horarioEventoField.setForeground(new java.awt.Color(51, 51, 51));
        horarioEventoField.setToolTipText("Insira seu email");
        horarioEventoField.setBorder(null);
        horarioEventoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        horarioEventoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioEventoFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelHorarioEventoLayout = new javax.swing.GroupLayout(painelHorarioEvento);
        painelHorarioEvento.setLayout(painelHorarioEventoLayout);
        painelHorarioEventoLayout.setHorizontalGroup(
            painelHorarioEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHorarioEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelHorarioEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horarioEventoField)
                    .addGroup(painelHorarioEventoLayout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelHorarioEventoLayout.setVerticalGroup(
            painelHorarioEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHorarioEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horarioEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout menuInformacoesEventoLayout = new javax.swing.GroupLayout(menuInformacoesEvento);
        menuInformacoesEvento.setLayout(menuInformacoesEventoLayout);
        menuInformacoesEventoLayout.setHorizontalGroup(
            menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInformacoesEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuInformacoesEventoLayout.createSequentialGroup()
                        .addGroup(menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(painelNomeEmpresaEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(painelNomeEvento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelNumVagasApresentacoesEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelNomeApresentacaoVincEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuInformacoesEventoLayout.createSequentialGroup()
                        .addGroup(menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelPrecoIngressoEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelDataEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelNumVagasPessoasEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelHorarioEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        menuInformacoesEventoLayout.setVerticalGroup(
            menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInformacoesEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(81, 81, 81)
                .addGroup(menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelNomeApresentacaoVincEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelNumVagasApresentacoesEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelNomeEmpresaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelNumVagasPessoasEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelPrecoIngressoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDataEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelHorarioEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        cardMenu.add(menuInformacoesEvento, "cardMenuInformacoesEvento");
        menuInformacoesEvento.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cardMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInformacoesActionPerformed
        menu.show(cardMenu, tipoCard);
    }//GEN-LAST:event_botaoInformacoesActionPerformed

    private void botaoComprarIngressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprarIngressoActionPerformed
        menu.show(cardMenu, "cardMenuComprarIngresso");
    }//GEN-LAST:event_botaoComprarIngressoActionPerformed

    private void subtotalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotalFieldActionPerformed

    private void horarioApresentacaoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioApresentacaoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horarioApresentacaoFieldActionPerformed

    private void horarioEventoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioEventoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horarioEventoFieldActionPerformed

    public JButton getBotaoVoltar() {
        return botaoVoltar;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoComprarIngresso;
    private javax.swing.JButton botaoFinalizarCompra;
    private javax.swing.JButton botaoInformacoes;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JPanel cardMenu;
    private javax.swing.JTextField dataApresentacaoField;
    private javax.swing.JTextField dataEventoField;
    private javax.swing.JTextField descontoField;
    private javax.swing.JComboBox<String> formaPagamentoComboBox;
    private javax.swing.JTextField horarioApresentacaoField;
    private javax.swing.JTextField horarioEventoField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menuCompra;
    private javax.swing.JPanel menuComprarIngresso;
    private javax.swing.JPanel menuInformacoesApresentacao;
    private javax.swing.JPanel menuInformacoesEvento;
    private javax.swing.JTextField nomeApresentacaoVincEventoField;
    private javax.swing.JTextField nomeEmpresaFieldApresentacao;
    private javax.swing.JTextField nomeEmpresaFieldEvento;
    private javax.swing.JTextField nomeEventVincFieldApresentacao;
    private javax.swing.JTextField nomeEventoField;
    private javax.swing.JTextField nomeFieldApresentacao;
    private javax.swing.JTextField nomeItemCompraField;
    private javax.swing.JTextField nomePalestFieldApresentacao;
    private javax.swing.JTextField numVagasApresentacoesEventoField;
    private javax.swing.JTextField numVagasPessoasEventoField;
    private javax.swing.JTextField numeroVagasFieldApresentacao;
    private javax.swing.JPanel painelDataApresentacao;
    private javax.swing.JPanel painelDataEvento;
    private javax.swing.JPanel painelFormaPagamento;
    private javax.swing.JPanel painelHorarioApresentacao;
    private javax.swing.JPanel painelHorarioEvento;
    private javax.swing.JPanel painelNomeApresentacao;
    private javax.swing.JPanel painelNomeApresentacaoVincEvento;
    private javax.swing.JPanel painelNomeEmpresaApresentacao;
    private javax.swing.JPanel painelNomeEmpresaEvento;
    private javax.swing.JPanel painelNomeEvento;
    private javax.swing.JPanel painelNomeEventoVincApresentacao;
    private javax.swing.JPanel painelNomeItemCompra;
    private javax.swing.JPanel painelNomePalestApresentacao;
    private javax.swing.JPanel painelNumVagasApresentacoesEvento;
    private javax.swing.JPanel painelNumVagasPessoasEvento;
    private javax.swing.JPanel painelNumeroVagasApresentacao;
    private javax.swing.JPanel painelPrecoIngressoApresentacao;
    private javax.swing.JPanel painelPrecoIngressoEvento;
    private javax.swing.JPanel painelPrecoTotalCompra;
    private javax.swing.JPanel painelSubDescCompra;
    private javax.swing.JTextField precoIngressoEventoField;
    private javax.swing.JTextField precoIngressoFieldApresentacao;
    private javax.swing.JTextField precoTotalField;
    private javax.swing.JTextField subtotalField;
    // End of variables declaration//GEN-END:variables
}
