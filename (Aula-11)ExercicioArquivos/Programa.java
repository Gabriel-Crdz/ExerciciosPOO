import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Programa {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("+=+=APLICANDO MARGEM DE LUCRO=+=+");
        
        System.err.print("|= Informe a margem de lucro: ");
        float margem = Float.valueOf(reader.readLine());

        System.out.print("|= Informe o nome do arquivo de entrada: ");
        String nomeLeitura = reader.readLine();
        if(nomeLeitura.equals("")) nomeLeitura = "preco_custo.csv";
        BufferedReader arqLeitura = new BufferedReader(new FileReader(nomeLeitura));

        System.out.print("|= Informe o nome do arquivo de saida: ");
        String nomeEscrita = reader.readLine();
        if(nomeEscrita.equals("")) nomeEscrita = "preco_venda.csv";
        BufferedWriter arqEscrita = new BufferedWriter(new FileWriter(nomeEscrita));
        BufferedWriter arqCompra = new BufferedWriter(new FileWriter("comprar.csv"));

        String linhaLeitura = arqLeitura.readLine();
        String linhaEscrita = "codigo;produto;preco_venda"; // Cabeçalho

        arqEscrita.write(linhaEscrita);
        arqEscrita.newLine();

        while ((linhaLeitura = arqLeitura.readLine()) != null){
            String[] campos = linhaLeitura.split(";");

            String codigo = campos[0];
            int estoque = Integer.parseInt(campos[1]);
            String nome = campos[2];
            String categoria = campos[4];

            /* Calculo do preco de venda do produto */
            float precoCusto = Float.valueOf(campos[3].replace(",", "."));
            float valorVenda = precoCusto * (1 + margem / 100);
            String precoVenda = String.format("%.2f", valorVenda);
            
            /* Arquivo preço vendas */
            linhaEscrita = codigo + ";" + nome + ";" + precoVenda;
            arqEscrita.write(linhaEscrita);
            arqEscrita.newLine();

            /* Arquivo comprar */
            if(estoque < 10){
                String preco = String.format("%.2f", precoCusto);
                String linhaCompra = codigo + ";" + estoque + ";" + nome + ";" + preco + ";" + categoria;
                arqCompra.write(linhaCompra);
                arqCompra.newLine();
            }
        }
        arqLeitura.close(); // Fecha arquivo
        arqEscrita.close();
        arqCompra.close();
    }
}
