package sistema.escola;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoRepository repository = new AlunoRepository();
        AlunoService service = new AlunoService();

        int opcao = -1;

        while(opcao != 0) {
            System.out.println("\n--- SISTEMA ESCOLAR ---");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Buscar CPF");
            System.out.println("4 - Calcular Status / Média");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nomeAluno = sc.nextLine();

                    System.out.print("Digite o CPF do aluno: ");
                    String cpf = sc.nextLine();

                    System.out.print("Digite a data de nascimento do aluno: ");
                    String dataNasc = sc.nextLine();

                    System.out.print("Digite o número de telefone do aluno: ");
                    String numeroTelAluno = sc.nextLine();

                    System.out.print("Digite o E-mail do aluno: ");
                    String email = sc.nextLine();

                    System.out.print("Digite o nome da mãe do aluno: ");
                    String nomeMae = sc.nextLine();

                    System.out.print("Digite o nome do pai do aluno: ");
                    String nomePai = sc.nextLine();

                    System.out.print("Digite o número de telefone da mãe do aluno: ");
                    String numeroTelMae = sc.nextLine();

                    System.out.print("Digite o número de telefone do pai do aluno: ");
                    String numeroTelPai = sc.nextLine();

                    Aluno aluno = new Aluno(nomeAluno, cpf, dataNasc, numeroTelAluno, numeroTelMae,
                            numeroTelPai, email, nomeMae, nomePai);
                    repository.salvar(aluno);

                    System.out.println("\nAluno cadastrado com sucesso!");
                    break;

                case 2:
                    List<Aluno> lista = repository.listarTodos();

                    if(lista.isEmpty()) {
                        System.out.println("\nNenhum aluno cadastrado no sistema.");
                    } else {
                        System.out.println("\n--- LISTA DE ALUNOS ---");
                        for(Aluno a : lista) {
                            System.out.println("Nome: " + a.getNomeAluno() + " | CPF: " + a.getCpf());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o CPF do aluno: ");
                    String cpfInformado = sc.nextLine();
                    Aluno alunoEncontrado = repository.buscarCpf(cpfInformado);

                    if(alunoEncontrado != null) {
                        System.out.println("Aluno encontrado: " + alunoEncontrado.getNomeAluno());
                    } else {
                        System.out.println("Aluno com CPF: " + cpfInformado + " não foi encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Digite a nota do Primeiro Trismestre do aluno: ");
                    double nota1 = sc.nextDouble();

                    System.out.println("Digite a nota do Segundo Trimestre do aluno: ");
                    double nota2 = sc.nextDouble();

                    System.out.println("Digite a nota do Terceiro Trimestre do aluno: ");
                    double nota3 = sc.nextDouble();

                    System.out.println("Digite o número de Faltas do aluno: ");
                    int faltas = sc.nextInt();

                    sc.nextLine();

                    double media = service.calcularMedia(nota1, nota2, nota3);
                    String status = service.verificarStatus(media, faltas);

                    System.out.printf("\nMédia: %.2f%n" , media);
                    System.out.println("Status: " + status);

                    if(status.equals("RECUPERAÇÂO !")) {
                        System.out.println("Digite a nota do Exame de Recuperação do aluno: ");
                        double notaRec = sc.nextDouble();
                        sc.nextLine();

                        String statusFinal = service.verificarStatusRecuperacao(notaRec);
                        System.out.println("Resultado Final: " + statusFinal);
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
