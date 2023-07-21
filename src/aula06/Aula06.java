package aula06;

import static java.time.temporal.TemporalQueries.zone;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Aula06 {

    public static void main(String[] args) {

        //Double[][] matriz = new Double[5][2];
        //desordemERegresso(matriz);
        String dataNascBruta = JOptionPane.showInputDialog("Digite sua data de nascimento seprado por '/'");
        String[] dataNasc = dataNascBruta.split("/");
        Calendar data = new Calendar(Timezone.getDefault(), Locale.ROOT);
//Date data = new Date(Integer.parseInt(dataNasc[2]), Integer.parseInt(dataNasc[1]), Integer.parseInt(dataNasc[0]));
        JOptionPane.showMessageDialog(null, data);

        //toCamelCase("O mundo da voltas");
    }

    public static void toCamelCase(String frase) {
        String[] split = frase.split(" ");

        String resp = "";
        boolean ehPrimeiro = true;
        for (String n : split) {
            n = n.toLowerCase();
            if (ehPrimeiro) {
                ehPrimeiro = false;
            } else {
                char[] aux = n.toCharArray();
                aux[0] = Character.toUpperCase(aux[0]);
                n = String.valueOf(aux);
            }
            resp += n;
        }
        JOptionPane.showMessageDialog(null, resp);
    }

    static void desordemERegresso(Double[][] matriz) {

        for (int i = 0; i < 5; i++) {

            int j = 0;

            Double idade = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua idade"));
            Double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "altura"));
            matriz[i][0] = idade;
            matriz[i][1] = altura;
        }
        int c = 4;
        int d = 4;
        int e = 0;
        JOptionPane.showMessageDialog(null, matriz);
        for (int a = 0; a < matriz.length; a++) {
            //for (int c = 5; a < matriz.length; c--) {

            if (a < 5) {
                if (a == c) {
                    //int b = 0;
                    Double aux;
                    aux = matriz[c][0];
                    matriz[c][0] = matriz[a][0];
                    matriz[a][0] = aux;
                    c--;
                }
            } else {

                if (a == c) {
                    Double aux;
                    aux = matriz[d][1];
                    matriz[d][1] = matriz[e][1];
                    matriz[e][1] = aux;
                    d--;
                    e--;
                }
            }
            //}
        }

        JOptionPane.showMessageDialog(null, matriz);

    }
}
