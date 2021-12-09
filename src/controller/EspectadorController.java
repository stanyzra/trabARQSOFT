package controller;

import java.awt.event.ActionEvent;
import view.UIEspectador;
import view.UIHome;

/**
 *
 * @author Gabriel
 */
public class EspectadorController {
    private UIEspectador view;

    public EspectadorController(UIEspectador view) {
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
