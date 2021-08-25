package main.com.aluno.dominio.aluno.aluno;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(){
        if (ddd == null || numero ==null ){
            throw new IllegalArgumentException("DDD e Numero obrigatorios!");
        }

        if(!ddd.matches("\\d{2}")){
            throw new IllegalArgumentException("DDD invalido");
        }

        if(!numero.matches("\\d{8}\\d{9}")){
            throw new IllegalArgumentException("Numero invalido");
        }
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd(){
        return ddd;
    }

    public String getNumero(){
        return numero;
    }

}
