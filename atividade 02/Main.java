import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Zoologico zoologico = new Zoologico();

        int opcao = 0;

        while (opcao != 6) {

            System.out.println();
            System.out.println("=== ZOOLÓGICO ===");
            System.out.println("1 - Adicionar animal");
            System.out.println("2 - Listar todos os animais");
            System.out.println("3 - Remover animal");
            System.out.println("4 - Emitir som de um animal");
            System.out.println("5 - Testar habilidade de um animal");
            System.out.println("6 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    adicionarAnimal(scanner, zoologico);
                    break;

                case 2:
                    listarAnimais(zoologico);
                    break;

                case 3:
                    removerAnimal(scanner, zoologico);
                    break;

                case 4:
                    emitirSom(scanner, zoologico);
                    break;

                case 5:
                    testarHabilidade(scanner, zoologico);
                    break;

                case 6:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }


    public static void adicionarAnimal(
            Scanner scanner,
            Zoologico zoologico) {

        System.out.println();
        System.out.println("=== ADICIONAR ANIMAL ===");

        System.out.println("1 - Gato");
        System.out.println("2 - Cachorro");
        System.out.println("3 - Passaro");

        System.out.print("Escolha o tipo: ");
        int tipo = scanner.nextInt();

        System.out.print("ID: ");
        long id = scanner.nextLong();

        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Peso: ");
        double peso = scanner.nextDouble();

        Animal animal;

        switch (tipo) {

            case 1:
                animal = new Gato(id, nome, idade, peso);
                break;

            case 2:
                animal = new Cachorro(id, nome, idade, peso);
                break;

            case 3:
                animal = new Passaro(id, nome, idade, peso);
                break;

            default:
                System.out.println("Tipo de animal inválido.");
                return;
        }

        boolean resultado = zoologico.adicionarAnimal(animal);

        if (resultado) {
            System.out.println("Animal adicionado com sucesso.");
        } else {
            System.out.println("Já existe um animal com esse ID.");
        }
    }


    public static void listarAnimais(Zoologico zoologico) {

        System.out.println();
        System.out.println("=== ANIMAIS CADASTRADOS ===");

        if (zoologico.listarAnimais().isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }

        for (Animal animal : zoologico.listarAnimais()) {

            System.out.println("-------------------------");
            System.out.println("ID: " + animal.getId());
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            System.out.println("Peso: " + animal.getPeso());
            System.out.println(
                    "Habilidades: " +
                    animal.getHabilidades()
            );
        }

        System.out.println("-------------------------");
    }


    public static void removerAnimal(
            Scanner scanner,
            Zoologico zoologico) {

        System.out.println();
        System.out.println("=== REMOVER ANIMAL ===");

        System.out.print("Digite o ID do animal: ");
        long id = scanner.nextLong();

        boolean resultado = zoologico.removerAnimal(id);

        System.out.println("Animal removido: " + resultado);
    }


    public static void emitirSom(
            Scanner scanner,
            Zoologico zoologico) {

        System.out.println();
        System.out.println("=== EMITIR SOM ===");

        System.out.print("Digite o ID do animal: ");
        long id = scanner.nextLong();

        Animal animal = zoologico.buscarAnimal(id);

        if (animal != null) {

            System.out.println(
                    animal.getNome() +
                    " diz " +
                    animal.emitirSom()
            );

        } else {

            System.out.println("Animal não encontrado.");
        }
    }


    public static void testarHabilidade(
            Scanner scanner,
            Zoologico zoologico) {

        System.out.println();
        System.out.println("=== TESTAR HABILIDADE ===");

        System.out.print("Digite o ID do animal: ");
        long id = scanner.nextLong();

        scanner.nextLine();

        System.out.print("Digite a habilidade: ");
        String habilidade = scanner.nextLine();

        Animal animal = zoologico.buscarAnimal(id);

        if (animal != null) {

            System.out.println(
                    animal.realizarHabilidade(habilidade)
            );

        } else {

            System.out.println("Animal não encontrado.");
        }
    }
}