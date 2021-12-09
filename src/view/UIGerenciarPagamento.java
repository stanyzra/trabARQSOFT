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
        menuComprarIngresso = new javax.swing.JPanel();
        menuInformacoesEvento = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        painelNomeEvento = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        nomeEventoField = new javax.swing.JTextField();
        painelNomePalestEvento = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        nomePalestEventoField = new javax.swing.JTextField();
        painelNomeEmpresaEvento = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        nomeEmpresaFieldEvento = new javax.swing.JTextField();
        painelNomeApresentacaoVincEvento = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        nomeApresentacaoVincEventoField = new javax.swing.JTextField();
        painelNumeroVagasEvento = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        numeroVagasEventoField = new javax.swing.JTextField();
        painelPrecoIngressoEvento = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        precoIngressoEventoField = new javax.swing.JTextField();

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

        nomeEmpresaFieldApresentacao.setBackground(new java.awt.Color(204, 204, 204));
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

        painelNomeEventoVincApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Nome do evento vinculado");

        nomeEventVincFieldApresentacao.setBackground(new java.awt.Color(204, 204, 204));
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

        numeroVagasFieldApresentacao.setBackground(new java.awt.Color(204, 204, 204));
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
                .addGroup(painelNumeroVagasApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelNumeroVagasApresentacaoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(numeroVagasFieldApresentacao))
                .addContainerGap())
        );
        painelNumeroVagasApresentacaoLayout.setVerticalGroup(
            painelNumeroVagasApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNumeroVagasApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroVagasFieldApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelPrecoIngressoApresentacao.setBackground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Preço do ingresso");

        precoIngressoFieldApresentacao.setBackground(new java.awt.Color(204, 204, 204));
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
                .addGroup(painelPrecoIngressoApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrecoIngressoApresentacaoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(precoIngressoFieldApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelPrecoIngressoApresentacaoLayout.setVerticalGroup(
            painelPrecoIngressoApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrecoIngressoApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precoIngressoFieldApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout menuInformacoesApresentacaoLayout = new javax.swing.GroupLayout(menuInformacoesApresentacao);
        menuInformacoesApresentacao.setLayout(menuInformacoesApresentacaoLayout);
        menuInformacoesApresentacaoLayout.setHorizontalGroup(
            menuInformacoesApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInformacoesApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuInformacoesApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(painelNomeEmpresaApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNomePalestApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNomeApresentacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuInformacoesApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelPrecoIngressoApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNomeEventoVincApresentacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNumeroVagasApresentacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuInformacoesApresentacaoLayout.setVerticalGroup(
            menuInformacoesApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInformacoesApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(81, 81, 81)
                .addGroup(menuInformacoesApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuInformacoesApresentacaoLayout.createSequentialGroup()
                        .addComponent(painelNomeEventoVincApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelNumeroVagasApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelPrecoIngressoApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuInformacoesApresentacaoLayout.createSequentialGroup()
                        .addComponent(painelNomeApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelNomePalestApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelNomeEmpresaApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        cardMenu.add(menuInformacoesApresentacao, "cardMenuInformacoesApresentacao");

        menuComprarIngresso.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout menuComprarIngressoLayout = new javax.swing.GroupLayout(menuComprarIngresso);
        menuComprarIngresso.setLayout(menuComprarIngressoLayout);
        menuComprarIngressoLayout.setHorizontalGroup(
            menuComprarIngressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );
        menuComprarIngressoLayout.setVerticalGroup(
            menuComprarIngressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        cardMenu.add(menuComprarIngresso, "cardMenuComprarIngresso");

        menuInformacoesEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Informações do evento");

        painelNomeEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Nome do evento");

        nomeEventoField.setBackground(new java.awt.Color(204, 204, 204));
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

        painelNomePalestEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Nome do(a) apresentador(a)");

        nomePalestEventoField.setBackground(new java.awt.Color(204, 204, 204));
        nomePalestEventoField.setForeground(new java.awt.Color(51, 51, 51));
        nomePalestEventoField.setToolTipText("Insira seu email");
        nomePalestEventoField.setBorder(null);
        nomePalestEventoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNomePalestEventoLayout = new javax.swing.GroupLayout(painelNomePalestEvento);
        painelNomePalestEvento.setLayout(painelNomePalestEventoLayout);
        painelNomePalestEventoLayout.setHorizontalGroup(
            painelNomePalestEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomePalestEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNomePalestEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelNomePalestEventoLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nomePalestEventoField))
                .addContainerGap())
        );
        painelNomePalestEventoLayout.setVerticalGroup(
            painelNomePalestEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomePalestEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomePalestEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelNomeEmpresaEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Nome da empresa");

        nomeEmpresaFieldEvento.setBackground(new java.awt.Color(204, 204, 204));
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

        nomeApresentacaoVincEventoField.setBackground(new java.awt.Color(204, 204, 204));
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
                        .addGap(0, 0, Short.MAX_VALUE)))
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

        painelNumeroVagasEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Número de vagas disponíveis");

        numeroVagasEventoField.setBackground(new java.awt.Color(204, 204, 204));
        numeroVagasEventoField.setForeground(new java.awt.Color(51, 51, 51));
        numeroVagasEventoField.setToolTipText("Insira seu email");
        numeroVagasEventoField.setBorder(null);
        numeroVagasEventoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout painelNumeroVagasEventoLayout = new javax.swing.GroupLayout(painelNumeroVagasEvento);
        painelNumeroVagasEvento.setLayout(painelNumeroVagasEventoLayout);
        painelNumeroVagasEventoLayout.setHorizontalGroup(
            painelNumeroVagasEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNumeroVagasEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNumeroVagasEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelNumeroVagasEventoLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(numeroVagasEventoField))
                .addContainerGap())
        );
        painelNumeroVagasEventoLayout.setVerticalGroup(
            painelNumeroVagasEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNumeroVagasEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroVagasEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelPrecoIngressoEvento.setBackground(new java.awt.Color(102, 102, 102));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Preço do ingresso");

        precoIngressoEventoField.setBackground(new java.awt.Color(204, 204, 204));
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
                .addGroup(painelPrecoIngressoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrecoIngressoEventoLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(precoIngressoEventoField, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelPrecoIngressoEventoLayout.setVerticalGroup(
            painelPrecoIngressoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrecoIngressoEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precoIngressoEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout menuInformacoesEventoLayout = new javax.swing.GroupLayout(menuInformacoesEvento);
        menuInformacoesEvento.setLayout(menuInformacoesEventoLayout);
        menuInformacoesEventoLayout.setHorizontalGroup(
            menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInformacoesEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(painelNomeEmpresaEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNomePalestEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNomeEvento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelPrecoIngressoEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNomeApresentacaoVincEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNumeroVagasEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuInformacoesEventoLayout.setVerticalGroup(
            menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInformacoesEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(81, 81, 81)
                .addGroup(menuInformacoesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuInformacoesEventoLayout.createSequentialGroup()
                        .addComponent(painelNomeApresentacaoVincEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelNumeroVagasEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelPrecoIngressoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuInformacoesEventoLayout.createSequentialGroup()
                        .addComponent(painelNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelNomePalestEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelNomeEmpresaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
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

    public JButton getBotaoVoltar() {
        return botaoVoltar;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoComprarIngresso;
    private javax.swing.JButton botaoInformacoes;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JPanel cardMenu;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JTextField nomePalestEventoField;
    private javax.swing.JTextField nomePalestFieldApresentacao;
    private javax.swing.JTextField numeroVagasEventoField;
    private javax.swing.JTextField numeroVagasFieldApresentacao;
    private javax.swing.JPanel painelNomeApresentacao;
    private javax.swing.JPanel painelNomeApresentacaoVincEvento;
    private javax.swing.JPanel painelNomeEmpresaApresentacao;
    private javax.swing.JPanel painelNomeEmpresaEvento;
    private javax.swing.JPanel painelNomeEvento;
    private javax.swing.JPanel painelNomeEventoVincApresentacao;
    private javax.swing.JPanel painelNomePalestApresentacao;
    private javax.swing.JPanel painelNomePalestEvento;
    private javax.swing.JPanel painelNumeroVagasApresentacao;
    private javax.swing.JPanel painelNumeroVagasEvento;
    private javax.swing.JPanel painelPrecoIngressoApresentacao;
    private javax.swing.JPanel painelPrecoIngressoEvento;
    private javax.swing.JTextField precoIngressoEventoField;
    private javax.swing.JTextField precoIngressoFieldApresentacao;
    // End of variables declaration//GEN-END:variables
}
