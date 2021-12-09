package controller;

import java.awt.event.ActionEvent;
import view.UIHome;
import view.UICadastro;

/**
 *
 * @author Gabriel
 */
public class CadastroController {
    private UICadastro view;

    public CadastroController(UICadastro view) {
        this.view = view;
        this.view.setVisible(true);
    }
    
    public void controla() {
        this.view.getBotaoVoltar().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new HomeController(new UIHome()).controla();
        });
        this.view.getBotaoRegistrarConta().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new HomeController(new UIHome()).controla();
        });
    } 
}
