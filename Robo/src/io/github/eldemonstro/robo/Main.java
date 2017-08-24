/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.eldemonstro.robo;

import java.util.*;

/**
 *
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = "Robo\n1-Criar\n2-Soma\n3-Subtracao\n4-Multiplicacao"
                + "\n5-Divisao\n6-Bateria\n7-Demo\n8-Sair";
        boolean sair = false;
        
        while (!sair) {
            System.out.println(menu);
            while (!sc.hasNextInt()) sc.next();
            int num1 = sc.nextInt();
            System.out.println(num1);
            sair = true;
        }

        Robo robo = new Robo("Mineirinho", "12/03/06", 255);
        System.out.println("Criado robo: " + robo.getNome() + " em " + robo.getDtFabr()
                + " contendo: " + robo.getBateria() + " de bateria");

        robo.setNome("Capixaba da industria");
        robo.setDtFabr("22/06/2011");
        robo.setBateria(20);
        System.out.println("Modificado robo para: " + robo.getNome() + " em " + robo.getDtFabr()
                + " contendo: " + robo.getBateria() + " de bateria");

        Random gerador = new Random();

        while (robo.getBateria() != 0) {
            if (robo.getBateria() % 4 == 0) {
                System.out.println("Somando: " + robo.soma(robo.getBateria(), gerador.nextInt(robo.getBateria() + 1)) + " | Bateria restante: " + robo.getBateria());
            } else if (robo.getBateria() % 3 == 0) {
                System.out.println("Subtraindo: " + robo.subtracao(robo.getBateria() * 3, gerador.nextInt(robo.getBateria() + 1)) + " | Bateria restante: " + robo.getBateria());
            } else if (robo.getBateria() % 2 == 0) {
                System.out.println("Multiplicando: " + robo.multiplicacao(robo.getBateria(), gerador.nextInt(robo.getBateria() + 1)) + " | Bateria restante: " + robo.getBateria());
            } else {
                System.out.println("Dividindo: " + robo.divisao(robo.getBateria() * 2, gerador.nextInt(robo.getBateria() + 1)) + " | Bateria restante: " + robo.getBateria());
            }
        }
    }
}
