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
    
    }
}