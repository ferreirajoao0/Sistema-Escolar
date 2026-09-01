package sistema.escola;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {
    private List<Aluno> alunos = new ArrayList<>();
    public void salvar(Aluno aluno) {
        alunos.add(aluno);
    }
    public List<Aluno> listarTodos() {
        return alunos;
    }
    public Aluno buscarCpf(String cpf) {
        for(Aluno aluno : alunos) {
            if(aluno.getCpf().equals(cpf)) {
                return aluno;
            }
        }
        return null;
    }
}