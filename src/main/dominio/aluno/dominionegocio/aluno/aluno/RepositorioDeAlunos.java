package main.dominio.aluno.dominionegocio.aluno.aluno;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(Aluno aluno);

    Aluno buscarPorCPF(Cpf cpf);

    List<Aluno> listarTodosAlunosMatriculados();

    //...
}
