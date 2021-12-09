package controller;

import java.awt.event.ActionEvent;
import view.UIGerenciarPagamento;
import view.UIHome;

/**
 *
 * @author Gabriel
 */
public class GerenciarPagamentoController {
    private UIGerenciarPagamento view;

    public GerenciarPagamentoController(UIGerenciarPagamento view) {
        this.view = view;
        this.view.setVisible(true);
    }
    
    public void controla() {
        this.view.getBotaoVoltar().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new HomeController(new UIHome()).controla();
        });
    }
}
