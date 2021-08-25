package escola;


import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private Cpf cpf;
    private String nome;
    private Email email;

    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(Cpf cpf, String nome, Email email){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero){
        this.telefones.add(new Telefone());
    }

    public Cpf getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public Email getEmail(){
        return email;
    }





}
