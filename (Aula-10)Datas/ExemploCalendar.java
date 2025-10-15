
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploCalendar {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance(); // Declaração do Calendario
        System.out.println("Calendario" + agora); // Mostra dos os valores retornados do calendario

        Calendar vencimento = agora;
        vencimento.add(Calendar.DATE, 7); // Adicionando 7 dias a data
        System.out.println("Vencimento: " + vencimento);
        
        vencimento.add(Calendar.MONTH, -1); // Voltando 1 mes na data
        System.out.println("Novo Vencimento: " + vencimento);

        /* Formatação do Calendario */
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println("Ano: " + gc.get(Calendar.YEAR));
        System.out.println("Mes: " + gc.get(Calendar.MONTH));
        System.out.println("Semana do mes: " + gc.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Dia do ano: " + gc.get(Calendar.DAY_OF_YEAR));
        System.out.println("Dia do mes: " + gc.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia da semana do mes: " + gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Dia da semana: " + gc.get(Calendar.DAY_OF_WEEK));
        System.out.println("Hora: " + gc.get(Calendar.HOUR));
        System.out.println("AM/PM: " + gc.get(Calendar.AM_PM));
        System.out.println("Hora do Dia: " + gc.get(Calendar.HOUR_OF_DAY));
        System.out.println("Hora do Dia: " + gc.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minuto: " + gc.get(Calendar.MINUTE));
        System.out.println("Segundo: " + gc.get(Calendar.SECOND));

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data abreviada: " + df.format(gc.getTime()));
        System.out.println("Vencimento: " + vencimento.getTime());
        System.out.println("Vencimento formatado: " + df.format(vencimento.getTime()));

        /* Criando uma data especifica */
        GregorianCalendar dtNasc = new GregorianCalendar();
        dtNasc.set(1977, Calendar.OCTOBER, 20);
        System.out.println("Nascimento: " + df.format(dtNasc.getTime()));

        /* Convertendo String para Date [string => vetor => date] */
        String dataString = "15/01/2007";
        String[] vetData = dataString.split("/");
        dtNasc.set(Calendar.YEAR, Integer.parseInt(vetData[2])); 
        dtNasc.set(Calendar.MONTH, Integer.parseInt(vetData[1]) - 1); // mes começa em 0, precisa do -1
        dtNasc.set(Calendar.DAY_OF_MONTH, Integer.parseInt(vetData[0])); 
        System.out.println("Nova data: " + df.format(dtNasc.getTime()));

        // ou
        dtNasc.set(Integer.parseInt(vetData[2]), Integer.parseInt(vetData[1]) - 1, Integer.parseInt(vetData[0]));
        System.out.println("Nova data: " + df.format(dtNasc.getTime()));
    }
}
