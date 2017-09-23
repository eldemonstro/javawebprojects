/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniexemplos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author demon
 */
public class Miniexemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        String entrada = "12/03/2017 16:00:00";
        String saida = "13/03/2017 13:45:22";

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date1 = formato.parse(entrada);
        Date date2 = formato.parse(saida);
        long diferenca = date2.getTime() - date1.getTime();
        
        long difSegundos = diferenca / 1000 % 60;
        long difMinutos = diferenca / (60 * 1000) % 60;
        long difHoras = diferenca / (60 * 60 * 1000) % 24;
        long difDias = diferenca / (24 * 60 * 60 * 1000);

        System.out.print(difDias + " dias, ");
        System.out.print(difHoras + " horas, ");
        System.out.print(difMinutos + " minutos, ");
        System.out.print(difSegundos + " segundos.");
    }
    
}
