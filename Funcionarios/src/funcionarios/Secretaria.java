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
public class Secretaria extends Funcionario {
    private boolean falaIngles;
    private int periodoDeTrabalho;

    public boolean isFalaIngles() {
        return falaIngles;
    }

    public void setFalaIngles(boolean falaIngles) {
        this.falaIngles = falaIngles;
    }

    public int getPeriodoDeTrabalho() {
        return periodoDeTrabalho;
    }

    public void setPeriodoDeTrabalho(int periodoDeTrabalho) {
        this.periodoDeTrabalho = periodoDeTrabalho;
    }
    
    

    public Secretaria(boolean falaIngles, int periodoDeTrabalho, int matricula, String nome, double salario, Departamento depto) {
        super(matricula, nome, salario, depto);
        this.falaIngles = falaIngles;
        this.periodoDeTrabalho = periodoDeTrabalho;
    }
}
