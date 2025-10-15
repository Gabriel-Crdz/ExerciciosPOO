
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDateTime {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now(); // Declaração da data(yyyy/mm/dd)
        System.err.println("Data: " + data);

        LocalTime hora = LocalTime.now(); // Declaração da hora(hh:mm:ss)
        System.err.println("Hora: " + hora);

        LocalDateTime dataHora = LocalDateTime.now(); // Declaração data + hora
        System.err.println("Data e Hora: " + dataHora);

        /* Formatação  para Data */
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        System.err.println("Data Formatada: " + data.format(formatoData));

        LocalDate hoje = LocalDate.now();
        System.err.println("Hoje: " + hoje.format(formatoData));

        LocalDate amanha = hoje.plusDays(1); // Soma 1 ao dia
        System.err.println("Amanha: " + amanha.format(formatoData));

        /* Formatação para hora */
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora atual: " + horaAtual.format(formatoHora));

        LocalTime menosUm = horaAtual.minusHours(1); // Subtrai 1 hora
        System.out.println("1 Hora atras: " + menosUm.format(formatoHora));

        /*  Formatação Data + Hora */
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Agora: " + agora);

        LocalDateTime futuro = agora.plusDays(5).minusHours(12).plusMinutes(5); // Soma 5 dias, subtrai 12 horas, soma 5 minutos
        System.out.println("Futuro: " + futuro.format(formatoDataHora));

        /* Criando data especifica */
        LocalDate minhaData = LocalDate.parse("06/03/2020", formatoData);
        System.out.println("Minha Data: " + minhaData);
        System.out.println("Minha Data Formatada: " + minhaData.format(formatoData));
    }
}