import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vetor2 {
    public static void main(String[] args) throws  Exception /* throws Exception lança exceção para o usuario */{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        // InputStreamReader: captura um fluxo de entrada de dados 
        // System.in: entrada pradrão(teclado)
        //BufferedREader: buffer de leitura

        int num = -1;
        Meses meses = new Meses(); // chamando o construtor
        do{
            System.out.println("Informe o numero do mês ou 0 para sair:");
            num = Integer.parseInt(reader.readLine()); // Entrada de dados pelo usuario
            String mes = meses.pegarMes(num);
            
            if(!mes.equals("")){
                System.out.println("O mês é: " + mes);
            }

            else if(num != 0){
                System.out.println("Entrada Invalida!");
            }

            else{
                System.out.println("Saindo...");
            }

        }while(num != 0);
        
    }
}
