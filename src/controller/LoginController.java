package controller;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import view.UICadastro;
import view.UIHome;
import view.UILogin;

/**
 *
 * @author Gabriel
 */
public class LoginController {
    private UILogin view;

    public LoginController(UILogin view) {
        this.view = view;
        this.view.setVisible(true);
    }
    
    public void controla() {
        this.view.getBotaoVoltar().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new HomeController(new UIHome()).controla();
        });
        this.view.getBotaoCadastrar().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new CadastroController(new UICadastro()).controla();
        });
        this.view.getBotaoLogin().addActionListener((ActionEvent actionEvent) -> {
            if(view.getEmailField().getText().equals("spec") && new String(view.getSenhaField().getPassword()).equals("spec")) {
                HomeController.user = 1;
                view.dispose();
                new HomeController(new UIHome()).controla();
            } else if(view.getEmailField().getText().equals("palest") && new String(view.getSenhaField().getPassword()).equals("palest")) {
                HomeController.user = 2;
                view.dispose();
                new HomeController(new UIHome()).controla();
            } else if(view.getEmailField().getText().equals("evento") && new String(view.getSenhaField().getPassword()).equals("evento")) {
                HomeController.user = 3;
                view.dispose();
                new HomeController(new UIHome()).controla();
            } else {
                JOptionPane.showMessageDialog(null, "Login inválido", "Login", JOptionPane.ERROR_MESSAGE);
            }
        });        
    } 
}
