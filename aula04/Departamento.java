package aula04;

public class Departamento {
    private int codigo;
    private String nome;

    Departamento(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    public int getCodigo(){
        return codigo;   
    }
    public void setcCodigo(int c) {
        if (c > 0) {
            codigo = c;
        }   else {
            System.out.println("Digite o Código correto");
        }
    }

    public String getNome(){
        return nome;
    }

    public void getNome(String n){
        if(n != null && !n.trim().isEmpty()){
            this.nome = n;
        } else{
            System.out.println("o nome não pode ser nulo ou vazio");
        }

    }

    public String toString(){
        return getNome() + "\n codigo do departamento: " + getCodigo();
    }


}
