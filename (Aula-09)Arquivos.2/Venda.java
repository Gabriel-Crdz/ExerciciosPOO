import java.io.BufferedReader;
import java.io.FileReader;

public class Venda {
    public static void main(String[] args)  throws Exception{
        String nomeArq = "vendas.csv";
        BufferedReader arqLeitura = new BufferedReader(new FileReader(nomeArq)); // Usando o Buffer para ler o arquivo
        
        /* Varieaveis */
        float venda;
        int qtdVenda = 0;
        float totalVendas = 0;
        float totalPrazo = 0;
        float totalVista = 0;
        String linha = arqLeitura.readLine();

        while((linha = arqLeitura.readLine()) != null){
            String[] coluna = linha.split(";"); // Split cria um vetor separando por ";"
            venda = Float.valueOf(coluna[2].replace(",", "."));
            qtdVenda++; 

            totalVendas += venda;
            totalVendas += venda;

            if(coluna[3].equals("V")){
                totalVista += venda;
            }
            else{
                totalPrazo += venda;
            }
        }

        /* Resultados */
        System.out.println("Quantidade de vendas realizadas: " + qtdVenda);
        System.out.println("Valor total das vendas: " + totalVendas);
        System.out.println("Valor Total das Vendas à vista: " + totalVista);
        System.out.println("Valor Total das Vendas à prazo: " + totalPrazo);
        arqLeitura.close(); // Fecha arquivo
    }
}