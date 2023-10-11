package br.com.designpatterns_adapter_trabalho;

import br.com.designpatterns_adapter_trabalho.emailCliente.Gmail;

public class GmailAdapter implements EmailProvider {
    private Gmail gmailCliente;

    public GmailAdapter() {
        this.gmailCliente = new Gmail();
    }

    @Override
    public void connect() {
        gmailCliente.login();
    }

    @Override
    public void fetchEmails() {
        gmailCliente.getEmails();
    }
}