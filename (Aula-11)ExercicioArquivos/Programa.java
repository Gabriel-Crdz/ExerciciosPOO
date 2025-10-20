import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Programa {
    public static void main(String[] args) throws Exception{
        BufferedReader arqLeitura = new BufferedReader(new FileReader("preco_custo.csv"));
        // BufferedWriter arqEscrita = new BufferedWriter(new FileWriter("preco_venda.csv"));

        /* Variaveis */
        float precoCusto = 0;
        float margem = 30;
        float valorVenda = 0;

        String linhaLeitura = arqLeitura.readLine();
        String linhaEscrita = "codigo;produto;preco_venda"; // Cabeçalho

        // arqEscrita.write(linhaEscrita);
        // arqEscrita.newLine();

        while ((linhaLeitura = arqLeitura.readLine()) != null){
            String[] coluna = linhaLeitura.split(";");

            String codigo = coluna[0];
            String nome = coluna[2];
            
            /* Calculo do preco de venda do produto */
            precoCusto = Float.valueOf(coluna[3].replace(",", "."));
            valorVenda = precoCusto * (1 + margem / 100);
            String precoVenda = String.valueOf(valorVenda);
            
            linhaEscrita = codigo + ";" + nome + ";" + precoVenda;
            System.out.println(linhaEscrita);
        }
        arqLeitura.close(); // Fecha arquivo
    }
}
