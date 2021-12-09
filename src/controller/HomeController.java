package controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import view.UIHome;
import view.UICadastro;
import view.UIGerenciarPagamento;
import view.UILogin;

/**
 *
 * @author Gabriel
 */
public class HomeController {
    private UIHome view;
    public static int user;

    public HomeController(UIHome view) {
        this.view = view;
        setHeaderAndMenuBar(user);
        this.view.setVisible(true);
    }
    
    private void setHeaderAndMenuBar(int user){
        switch (user) {
            case 0 -> {
                view.showMenu("cardHeaderUnlogged");
                view.setEnabledCriarApresentacaoMenuItem(false);
                view.setEnabledMinhasApresentacoesMenuItem(false);
                view.setEnabledCriarEventosMenuItem(false);
                view.setEnabledMeusEventosMenuItem(false);
            }
            case 1 -> {
                view.showMenu("cardHeaderEspecLogged");
                view.setEnabledCriarApresentacaoMenuItem(false);
                view.setEnabledMinhasApresentacoesMenuItem(false);
                view.setEnabledCriarEventosMenuItem(false);
                view.setEnabledMeusEventosMenuItem(false);
            }
            case 2 -> {
                view.showMenu("cardHeaderEspecLogged");
                view.setEnabledCriarApresentacaoMenuItem(true);
                view.setEnabledMinhasApresentacoesMenuItem(true);
                view.setEnabledCriarEventosMenuItem(false);
                view.setEnabledMeusEventosMenuItem(false);
            }
            case 3 -> {
                view.showMenu("cardHeaderEventoLogged");
                view.setEnabledCriarApresentacaoMenuItem(true);
                view.setEnabledMinhasApresentacoesMenuItem(true);
                view.setEnabledCriarEventosMenuItem(true);
                view.setEnabledMeusEventosMenuItem(true);
            }
            default -> {
                System.out.println("Erro: verifique o usuário.");
            }
        }
    }
    
    public void controla() {
        this.view.getBotaoLogin().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new LoginController(new UILogin()).controla();
        });
        this.view.getBotaoCadastro().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new CadastroController(new UICadastro()).controla();
        });
        this.view.getBotaoSairConta().addActionListener((ActionEvent actionEvent) -> {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair?", "Sair", 1);
            if (resposta == 0){ // 0 se sim
                user = resposta;
                setHeaderAndMenuBar(user);
            }
        });
        this.view.getListaConteudo().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();
                if (evt.getClickCount() == 2) {
                    int index = list.locationToIndex(evt.getPoint()); // pega o index
                    UIGerenciarPagamento.indexList = index;
                    UIGerenciarPagamento.nomeConteudo = view.getListaConteudo().getSelectedValue();
                    //new UIGerenciarPagamento().teste(listaConteudo.getSelectedValue(), index);
                    new GerenciarPagamentoController(new UIGerenciarPagamento()).controla();
                    view.dispose();
                }
            }
        });
        
        
        
        
    }    
}
