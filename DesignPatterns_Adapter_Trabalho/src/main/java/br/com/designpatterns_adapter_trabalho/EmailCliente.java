package br.com.designpatterns_adapter_trabalho;

public class EmailCliente {
    private EmailProvider provider;

    public EmailCliente(EmailProvider provider) {
        this.provider = provider;
    }
    public void checkEmails() {
        provider.connect();
        provider.fetchEmails();
    }
}
