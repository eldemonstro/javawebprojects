package exerciciosPOO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class TesteData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a data que você nasceu (dd/mm/aaaa)");
        String dataConverter = scan.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formato.parse(dataConverter);
            Calendar dataMostrar = Calendar.getInstance();
            dataMostrar.setTime(date);
            int dia = dataMostrar.get(Calendar.DAY_OF_MONTH);
            int mes = dataMostrar.get(Calendar.MONTH) + 1;
            int ano = dataMostrar.get(Calendar.YEAR);
            System.out.println("Hoje é dia: " + dia + "/" + mes + "/" + ano);
        } catch (ParseException e) {
            System.out.println("Data invalida!");
        }
    }
}
