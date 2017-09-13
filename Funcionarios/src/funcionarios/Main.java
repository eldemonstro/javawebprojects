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
public class Main {
    public static void main(String[] args) {
        Departamento pombo = new Departamento("Pombo");
        Secretaria secretaria = new Secretaria(true, 200, 12, "Christian", 3500.99, pombo);
        Gerente gerente = new Gerente(8000, 2, 12, "Fernando", 48000.99, pombo);
        System.out.println("Secretaria: ");
        System.out.println("Nome: " + secretaria.getNome());
        System.out.println("Gerente: ");
        System.out.println("Nome: " + gerente.getNome());
    }
}
