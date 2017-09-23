package io.github.eldemontro.estacionamento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static long CALCDATE (String entrada, String saida) throws ParseException{
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
        
        return difMinutos > 0 ? difHoras + 1 : difHoras; 
    }
    
    public static Date STRINGTODATE(String data) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formato.parse(data);
    }
}
