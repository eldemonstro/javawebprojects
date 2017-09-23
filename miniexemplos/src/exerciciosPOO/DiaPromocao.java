package exerciciosPOO;

import java.util.Calendar;

/**
 * @author Fabricio Bezerra
 */
public class DiaPromocao {
    public static void main(String[] args) {
        System.out.println("Pegue a promoção de hoje! ");
        Calendar diaHoje = Calendar.getInstance();
        int dia = diaHoje.get(Calendar.DAY_OF_WEEK);
        String mensagemPromo = "";
        switch (dia) {
            case 1:
                mensagemPromo = "Domingo é dia de pipoca em dobro";
                break;
            case 2:
                mensagemPromo = "Segunda é dia de café pela metade do preço";
                break;
            case 3:
                mensagemPromo = "Terça é dia de pão de queijo de brinde";
                break;
            case 4:
                mensagemPromo = "Quarta é dia de pastel especial pelo preço" 
                        + "de pastel normal";
                break;
            case 5:
                mensagemPromo = "Quinta é dia de almoço barato";
                break;
            case 6:
                mensagemPromo = "Sexta é dia de litrão com preço de 600";
                break;
            case 7:
                mensagemPromo = "Sábado é dia de comer petiscos bonus";
                break;
        }
        System.out.println(mensagemPromo);
    }
}
