package io.github.eldemontro.robov2;

import javax.swing.JOptionPane;

/**
 *
 * @author Fabricio Bezerra (eldemonstro.github.io)
 */
public class TestaRobo {

    public static Robo criarRobo() {
        String nome = JOptionPane.showInputDialog("Digite o nome:");
        String dataDeFabricacao = JOptionPane.showInputDialog("Digite o nome:");
        Robo robo = null;
        if (JOptionPane.showConfirmDialog(null, "Deseja carregar importar a bateria de um arquivo externo?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            robo = new Robo(nome, dataDeFabricacao);
        } else {
            try {
                int bateriaInt = Integer.parseInt(JOptionPane.showInputDialog("Digite a bateria"));
                robo = new Robo(nome, dataDeFabricacao, bateriaInt);
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "Numero invalido");
            }
        }
        return robo;
    }

    public static double aritmetica(double n1, double n2, int op, Robo robo) {
        switch (op) {
            case 2:
                return robo.soma(n1, n2);
            case 3:
                return robo.subtracao(n1, n2);
            case 4:
                return robo.multiplicacao(n1, n2);
            case 5:
                return robo.divisao(n1, n2);
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Robo robo = null;
        String menu = "Robo:\n1 - Criar\n2-Soma\n3-Subtracao\n4-Multiplicacao"
                + "\n5-Divisao\n6-Bateria\n7-Sair\n";
        String[] operacao = {"", "soma", "subtracao", "multiplicacao", "divisao"};
        int op = 0;
        String escolha;
        while (op != 7) {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "Numero invalido");
                continue;
            }
            switch (op) {
                case 1:
                    if (robo != null) {
                        JOptionPane.showMessageDialog(null, "Robo já criado");
                        break;
                    }
                    robo = criarRobo();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (robo == null) {
                        JOptionPane.showMessageDialog(null, "Crie um robo primeiro");
                        break;
                    }
                    if (op == 6) {
                        JOptionPane.showMessageDialog(null, "A bateria é: " + robo.getBateria());
                    }
                    try {
                        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 1"));
                        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 2"));
                        aritmetica(n1, n2, op, robo);
                        robo.log(operacao[op]);
                        robo.setBateria(robo.getBateria() - 1);
                    } catch (NumberFormatException exception) {
                        JOptionPane.showMessageDialog(null, "Numero invalido");
                        break;
                    }
                    break;
                case 7:
                    robo.gravarBateria();
                    break;
                default:
                    break;
            }
        }
    }
}
