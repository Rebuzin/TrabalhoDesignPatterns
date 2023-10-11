package br.com.designpatterns_singleton_trabalho;

public class DesignPatterns_Singleton_Trabalho {

    public static void main(String[] args) {
        
        ConfigManager manager = ConfigManager.getInstance();
        manager.setLoggedInUser("Usuário Logado no Sistema!!!");

        ConfigManager otherManager = ConfigManager.getInstance();
        System.out.println(otherManager.getLoggedInUser());
        
    }
}
