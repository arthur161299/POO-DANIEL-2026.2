import java.util.ArrayList;

public class Animal{
    private long id;
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<String> habilidades;
    


Animal(long id, String nome, int idade, double peso){
    this.id = id;
    this.nome = nome;
    this. idade = idade;
    this.peso = peso;
    this.habilidades = new ArrayList<>();
}
public long getId(){
    return id;

}
public void setId(long id){
    this.id = id;
}

public String getNome(){
    return nome;
}

public void setNome(String n){
    this.nome = n;
}

public int getIdade(){
    return idade;
}

public void setIdade(int i){
    this.idade = i;
}

public double getPeso(){
    return peso;
}

public void setPeso(double p){
    this.peso = p;
}

public ArrayList<String>getHabilidades(){
    return habilidades;
}

public void setHabilidades(ArrayList<String>habilidades){
    this.habilidades = habilidades;
}

public String emitirSom(){
    return "som desconhecido";
}



}