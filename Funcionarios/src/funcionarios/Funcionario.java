package funcionarios;

public abstract class Funcionario {
    private int matricula;
    private String nome;
    private double salario;
    private Departamento depto;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepto() {
        return depto;
    }

    public void setDepto(Departamento depto) {
        this.depto = depto;
    }

    public Funcionario(int matricula, String nome, double salario, Departamento depto) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.depto = depto;
    }
}
