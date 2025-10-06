import java.io.BufferedReader;
import java.io.FileReader;

public class Leitura {
    public static void main(String[] args) throws Exception {
        String nomeArq = "entrada.csv";
        BufferedReader arqLeitura = new BufferedReader(new FileReader(nomeArq)); // Usando o Buffer para ler o arquivo
        
        /* Mostrando todas as linhas */
        String linha; // Armazena o valor lido em uma variavel
        while((linha = arqLeitura.readLine()) != null){
            System.out.println(linha);
        }
        arqLeitura.close(); // Fecha arquivo
        
        /* Mostrando apenas uma coluna */
        arqLeitura = new BufferedReader(new FileReader(nomeArq)); 
        linha = arqLeitura.readLine(); // Lê apenas a primeira linha, assim o laço começa apartir da 2 linha
        while((linha = arqLeitura.readLine()) != null){
            String[] coluna = linha.split(";"); // Split cria um vetor separando por ';'
            System.out.println(coluna[0]);
        }
        arqLeitura.close(); // Fecha arquivo
    
    }
}
