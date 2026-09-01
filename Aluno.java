package sistema.escola;

public class Aluno {
    private String nomeAluno;
    private final String cpf;
    private final String dataNasc;
    private String numeroTelAluno;
    private String email;
    private String nomeMae;
    private String nomePai;
    private String numeroTelMae;
    private String numeroTelPai;

    public Aluno(String nomeAluno,String cpf, String dataNasc, String numeroTelAluno, String email,
                 String nomeMae, String nomePai, String numeroTelMae, String numeroTelPai) {
        this.nomeAluno = nomeAluno;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.numeroTelAluno = numeroTelAluno;
        this.email = email;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.numeroTelMae = numeroTelMae;
        this.numeroTelPai = numeroTelPai;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Erro: E-mail fornecido é inválido.");
        }
    }

    public String getNumeroTelAluno() {
        return numeroTelAluno;
    }

    public void setNumeroTelAluno(String numeroTelAluno) {
        this.numeroTelAluno = numeroTelAluno;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNumeroTelMae() {
        return numeroTelMae;
    }

    public void setNumeroTelMae(String numeroTelMae) {
        this.numeroTelMae = numeroTelMae;
    }

    public String getNumeroTelPai() {
        return numeroTelPai;
    }

    public void setNumeroTelPai(String numeroTelPai) {
        this.numeroTelPai = numeroTelPai;
    }
}
