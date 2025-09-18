import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LerDados {
    public static void main(String[] args) throws  Exception /* throws Exception lança exceção para o usuario */{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        // InputStreamReader: captura um fluxo de entrada de dados 
        // System.in: entrada pradrão(teclado)
        //BufferedREader: buffer de leitura

    
        String linha = "";
        System.out.println("Digite alguma coisa ou S para sair:");
        while(!linha.toUpperCase().equals("S")){
            linha = reader.readLine(); // Entrada de dados pelo usuario
            System.out.println("Digitou " + linha);
        }
        
    }
}
