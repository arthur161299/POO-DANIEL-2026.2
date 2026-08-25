package aula04;

public class Funcionario {
    private String nome;
    private int matricula;
    private Departamento dept;

    // Construtor
    public Funcionario(String nome, int matricula, Departamento dept) {
        setNome(nome);
        setMatricula(matricula);
        setDept(dept);
    }

    // --- Matrícula ---
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int m) {
        if (m > 0) {
            matricula = m;
        } else {
            System.out.println("Matricula não pode ser negativa ou zero");
        }
    }

    // --- Nome ---
    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        if (n != null && !n.trim().isEmpty()) {
            this.nome = n;
        } else {
            System.out.println("O nome não pode ser nulo ou vazio");
        }
    }

    // --- Departamento ---
    public Departamento getDept() {
        return dept;
    }

    public void setDept(Departamento d) {
        if (d != null) {
            this.dept = d;
        } else {
            System.out.println("Departamento não pode ser nulo");
        }
    }

    // --- toString ---
    @Override
    public String toString() {
        return "Funcionário: " + getNome() + 
               " | Matrícula: " + getMatricula() + 
               " | Departamento: " + getDept().getNome();
    }
}