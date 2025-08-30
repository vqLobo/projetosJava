public class Autor {
    private String nomeAutor;
    private String emailAutor;
    private String CPFAutor;

    void mostrarDetalhesAutor(){
        System.out.println("Detalhes do autor");
        System.out.println("Nome: " + nomeAutor);
        System.out.println("Email: " + emailAutor);
        System.out.println("CPF: " + CPFAutor);
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getEmailAutor() {
        return emailAutor;
    }

    public void setEmailAutor(String emailAutor) {
        this.emailAutor = emailAutor;
    }

    public String getCPFAutor() {
        return CPFAutor;
    }

    public void setCPFAutor(String CPFAutor) {
        this.CPFAutor = CPFAutor;
    }
}
