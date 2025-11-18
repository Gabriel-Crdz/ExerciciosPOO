
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RelogioDePulso implements Relogio{
    /* A classe herda os metodos da interface */
    
    public String getHoras(){
        // LocalTime horaAtual = LocalTime.now();
        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        // return horaAtual.format(dtf);
        // ou:
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")); // Tudo em apenas uma linha
    }

    public String iniciarCronometro(){
        return "Iniciando cronometro....";
    }
}
 