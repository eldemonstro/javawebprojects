package exerciciosPOO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Fabricio Bezerra
 */
public class DiasVivos {

    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a data que você nasceu (dd/mm/aaaa)");
        String diaNasc = scan.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = formato.parse(diaNasc);
        Date date2 = new Date();
        long diferenca = date2.getTime() - date1.getTime();

        long difDias = diferenca / (24 * 60 * 60 * 1000);
        System.out.println("Você tem: " + difDias + " dias de idade");
    }
}
