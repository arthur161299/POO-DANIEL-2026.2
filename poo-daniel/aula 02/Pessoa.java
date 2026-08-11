public class Pessoa{
  int idade;
  String cpf; 
  String nome;
  int distancia;

  void andar(){
    System.out.println("andou" + distancia+2);
  }
  void dormir(){
    System.out.println("dormiu");
  }

  void aniversario(){
    idade = idade +1;
  }
  
 
}