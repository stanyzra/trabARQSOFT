package controller;

import java.awt.event.ActionEvent;
import view.UIApresentacao;
import view.UIHome;

/**
 *
 * @author Gabriel
 */
public class ApresentacaoController {
    private UIApresentacao view;

    public ApresentacaoController(UIApresentacao view) {
        this.view = view;
        this.view.setVisible(true);
    }
    
    public void controla() {
        /*
        this.view.getBotaoVoltar().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new HomeController(new UIHome()).controla();
        });
        */
    }
}
