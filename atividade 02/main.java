import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoologico zoologico = new Zoologico();
        int opcao = 0;
        
        while (opcao != 6 ) {
            System.out.println("=== Zoologico===");
            System.out.println("1: Adicionar animal");
            System.out.println("2: Listar todos animais");
            System.out.println("3: Remover animal");
            System.out.println("4: Emitir som de um animal");
            System.out.println("5: Testar habilidade de um animal");
            System.out.println("=== Escolha uma opção");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1: adicionarAnimal();
                    
                    break;
                case 2: listarAnimais();

                    break;

                case 3: removerAnimais();

                    break;
                
                case 4: emitirSom();
                
                    break;
                
                case 5: getHabilidades();

                    break;
            
                default:
                    break;
            }
        }
        
    }
}