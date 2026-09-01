package exheranca;

public class Projeto{

    private String nome, descricao;
    private Desenvolvedor desenvolvedorResponsavel;

    Projeto(String nome, String descricao, Desenvolvedor desenvolvedorResponsavel){
        this.nome = nome;
        this.descricao = descricao;
        this.desenvolvedorResponsavel = desenvolvedorResponsavel;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nom){
        nome = nom;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String des){
        descricao = des;

    }

    public Desenvolvedor getDesenvolvedorResponsavel(){
        return desenvolvedorResponsavel;
    }

    public void setDesevolvedorResponsavel(Desenvolvedor des){
        desenvolvedorResponsavel = des;

    }
    
}
