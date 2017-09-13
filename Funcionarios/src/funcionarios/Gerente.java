/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

/**
 *
 * @author lab7aluno
 */
public class Gerente extends Funcionario {
    private int numeroSubordinados;
    private int tempoDeGerencia;

    public int getNumeroSubordinados() {
        return numeroSubordinados;
    }

    public void setNumeroSubordinados(int numeroSubordinados) {
        this.numeroSubordinados = numeroSubordinados;
    }

    public int getTempoDeGerencia() {
        return tempoDeGerencia;
    }

    public void setTempoDeGerencia(int tempoDeGerencia) {
        this.tempoDeGerencia = tempoDeGerencia;
    }

    public Gerente(int numeroSubordinados, int tempoDeGerencia, int matricula, String nome, double salario, Departamento depto) {
        super(matricula, nome, salario, depto);
        this.numeroSubordinados = numeroSubordinados;
        this.tempoDeGerencia = tempoDeGerencia;
    }
}
