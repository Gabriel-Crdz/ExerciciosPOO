import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vetor1 {
    public static void main(String[] args) throws  Exception /* throws Exception lança exceção para o usuario */{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        // InputStreamReader: captura um fluxo de entrada de dados 
        // System.in: entrada pradrão(teclado)
        //BufferedREader: buffer de leitura

        /* Declaração de vetores */
        // Declarar um vetor de int já atribuindo os valores 
        int[] vetValores = {2, 5, 3, 7, 4, 6, 8, 0};
        System.out.println("VetValores[0]: " + vetValores[0]);

        // Declarar um vetor de String
        String meses[] = new String[12]; // vetor com 12 posições
        meses[0] = "Janeiro";
        meses[1] = "Fevereiro";
        meses[2] = "Março";
        meses[3] = "Abril";
        meses[4] = "Maio";
        meses[5] = "Junhoo";
        meses[6] = "Julho";
        meses[7] = "Agosto";
        meses[8] = "Setembro";
        meses[9] = "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";

        int num = -1;
        do{
            System.out.println("Informe o numero do mês ou 0 para sair:");
            num = Integer.parseInt(reader.readLine()); // Entrada de dados pelo usuario
            
            if(num > 0 && num <= 12){
                System.out.println("O mês é: " + meses[num - 1]);
            }

            else if(num != 0){
                System.out.println("Entrada Invalida!!");
            }

            else{
                System.out.println("Saindo...");
            }

        }while(num != 0);
        
    }
}
