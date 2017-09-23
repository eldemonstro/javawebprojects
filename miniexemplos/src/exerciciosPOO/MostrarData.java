package exerciciosPOO;

import java.util.Calendar;

/**
 * @author Fabricio Bezerra
 */
public class MostrarData {
    public static void main(String[] args) {
        Calendar diaHoje = Calendar.getInstance();
        int dia = diaHoje.get(Calendar.DAY_OF_MONTH);
        int mes = diaHoje.get(Calendar.MONTH) + 1;
        int ano = diaHoje.get(Calendar.YEAR);
        System.out.println("Hoje é dia: " + dia + "/" + mes + "/" + ano);
    }
}
