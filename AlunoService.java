package sistema.escola;

public class AlunoService {

    public double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String verificarStatus(double media, int faltas) {
        if (faltas >= 91) {
            return "REPROVADO POR FALTAS !";
        } else if (media >= 6) {
            return "APROVADO !";
        } else if (media >= 5) {
            return "RECUPERAÇÃO !";
        } else {
            return "REPROVADO !";
        }
    }

    public String verificarStatusRecuperacao(double notaRecuperacao) {
        if (notaRecuperacao >= 6.0) {
            return "APROVADO NA RECUPERACAO";
        } else {
            return "REPROVADO NA RECUPERACAO";
        }
    }
}