package controller;

import java.awt.event.ActionEvent;
import view.UIConta;
import view.UIHome;

/**
 *
 * @author Gabriel
 */
public class ContaController {
    private UIConta view;
    public static int user;
    
    public ContaController(UIConta view) {
        this.view = view;
        this.view.setVisible(true);
        setCardTipoConta(user);
    }
    
    private void setCardTipoConta(int user){
        switch (user) {
            case 1 -> {
                view.showMenu("painelAlterarDadosSpec");

            }
            case 2 -> {
                view.showMenu("painelAlterarDadosPalest");

            }
            case 3 -> {
                view.showMenu("painelAlterarDadosEvento");
            }
            default -> {
                System.out.println(user);
                System.out.println("Erro: verifique o usuário.");
            }
        }
    }
    
    public void controla() {
        this.view.getBotaoVoltar().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new HomeController(new UIHome()).controla();
        });
        
    }
}
