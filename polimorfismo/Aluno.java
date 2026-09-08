public class Aluno extends Pessoa {
    private double media;

    Aluno(String nome, int idade, double media){
        super(nome, idade);
        this.media = media;        
    }

    public double getMedia(){
        return media;
    }
    public void setMedia(double med){
        media = med;
    }

    public boolean foiAprovado(){
        return media >= 7;
    }
    
}
