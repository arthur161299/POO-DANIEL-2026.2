
public class Main{

    public static void main(String[] args) {
        
        Filme f = new Filme("interestelar", "Ficcao cientifica", 2014);
        Filme f2 = new Filme("Toy Story", "animação", 1995);

        System.out.println(f.titulo);
        System.out.println(f.genero);
        System.out.println(f.anoLancamento);
        System.out.println(f2.titulo);
        System.out.println(f2.genero);
        System.out.println(f2.titulo);

        Autor a = new Autor("Geroge Orwell", "Britânico");
        Livro liv = new Livro("1984", 1945, a);

        Autor a2 = new Autor("Machado de Assis","Brasileira");
        Livro liv2 = new Livro("Dom Casmurro",1984,a2);

        System.out.println(liv);
        System.out.println(liv2);
                         
    }
}