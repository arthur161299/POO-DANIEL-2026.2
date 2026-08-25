package aula04;

public class Main {
    public static void main(String[] args) {
        // Correção na declaração e instanciação do Departamento e Funcionário
        Departamento d = new Departamento(111111, "Dep Computacao");
        Funcionario f = new Funcionario("Art", 111111, d);

        // Testando a exibição das informações através do toString()
        System.out.println(f);
    }
}