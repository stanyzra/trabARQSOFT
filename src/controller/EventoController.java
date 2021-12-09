package controller;

import java.awt.event.ActionEvent;
import view.UIEvento;
import view.UIHome;

/**
 *
 * @author Gabriel
 */
public class EventoController {
    private UIEvento view;

    public EventoController(UIEvento view) {
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
