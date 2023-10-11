package br.com.designpatterns_adapter_trabalho;

public class DesignPatterns_Adapter_Ex {

    public static void main(String[] args) {
        EmailProvider gmailAdapter = new GmailAdapter();
        EmailCliente emailCliente = new EmailCliente(gmailAdapter);
        emailCliente.checkEmails();
    }
}
