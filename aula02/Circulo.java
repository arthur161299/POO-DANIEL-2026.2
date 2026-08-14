public class Circulo{
    double raio;

    Circulo(double r){
        raio = r;

    }

     void area(){
        System.out.println("Area: " + (3.14 *(raio*raio)));
        
    }

    void comprimento(){
        System.out.println("Comprimento: " + ( 2*3.14*raio));
    }

    
}