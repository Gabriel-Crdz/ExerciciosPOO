
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Escrita {
    public static void main(String[] args) throws Exception {
        String nomeArq = "saida.csv";
        BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(nomeArq)); // Usando o Buffer para escrever no arquivo
        
        String linha = "Produto;Preço;Estoque";
        arqGravacao.write(linha); // Salva no arquivo a variavel
        arqGravacao.newLine(); // Pula para proxima lina

        String nomeProduto = "Mouse Dell";
        String precoProduto = "112.50";
        String estoque = "24";
        linha = nomeProduto + ";" + precoProduto + ";" + estoque + ";"; // Concatena os valores a serem registrados
        arqGravacao.write(linha);
        arqGravacao.newLine();

        nomeProduto = "Notebook Acer";
        precoProduto = "2512.50";
        estoque = "4";
        linha = nomeProduto + ";" + precoProduto + ";" + estoque + ";"; // Concatena os valores a serem registrados
        arqGravacao.write(linha);
        arqGravacao.newLine();
        
        nomeProduto = "Cabo HDMI";
        precoProduto = "115.00";
        estoque = "18";
        linha = nomeProduto + ";" + precoProduto + ";" + estoque + ";"; // Concatena os valores a serem registrados
        arqGravacao.write(linha);
        arqGravacao.newLine();

        arqGravacao.close();

    }
}
