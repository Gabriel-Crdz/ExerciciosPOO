
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDate{
    public static void main(String[] args) {
        Date agora = new Date(); // Declaração da data atual
        System.out.println("Data agora: " + agora);

        /* Formatação da Data */
        // Simbolo Signif.
        //    y     Ano
        //    M     Mes
        //    d     Dia
        //    H     Hora
        //    m     Minuto
        //    s     Segundo
        //    E     Dia da Semana

        /* SimpleDateFormat */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(agora);
        System.out.println("Data Formatada: " + dataFormatada);

        /* DateFormat */
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Data Curta: " + df.format(agora));

        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data Media: " + df.format(agora));

        df = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Data Longa: " + df.format(agora));

        df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data Completa: " + df.format(agora));

    }
}
