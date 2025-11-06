/* TO DO:
 * fazer o metodo para pedir a saida e a margem(calcular o preço de lucro),
 * gerar o CSV e depois perguntar ao usuario se deseja visualizar a tabela gerada.
 * 
 * fazer o metodo para gerar o CSV com os produtos com menos de 10 no estoque
 * e tambem perguntar ao usuario se deseja visualizar a tabela.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ProgramaV2 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int opc;
        String entrada = inserirEntrada(); // Começa ja pedindo o nome do arquivo de entrada 

        System.out.println();
        do{
            System.out.println(""); // Print apenas para espaçamento
            System.out.println("=============MENU=============");
            System.out.println("[1] Alterar arquivo entrada");
            System.out.println("[2] Visualizar arquivo entrada");
            System.out.println("[3] Gerar preços de venda");
            System.out.println("[4] Gerar lista de compra");
            System.out.println("[0] Sair");
            System.out.println("==============================");
            System.out.print("|= Escolha uma opção: ");
            opc = Integer.parseInt(reader.readLine());

            new ProcessBuilder("clear").inheritIO().start().waitFor(); // Limpa o terminal

            switch (opc) {
                case 1: entrada = inserirEntrada(); // Metodo para alterar o arquivo de entrada
                    break;
                case 2: visualizarTabela(entrada); // Metodo para mostrar os dados da entrada
                    break;
                // case 3: gerarVenda(); // Metodo para gerar e mostrar os dados sa saida
                //     break;
                // case 4: GerarCompra(); // Metodo para gerar e mostrar os produtos com menos de 10 no estoque
                    // break;
                case 0: System.err.println("SAINDO...");
                    break;
                default:
                    System.out.println("************************");
                    System.out.println("ERRO: Entrada Invalida!!");
                    System.out.println("************************");
                break;
            }
        }while(opc != 0);
    }

    public static String inserirEntrada() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("|= Informe o nome do arquivo de entrada: ");
        String nomeArq = reader.readLine();

        if(nomeArq.equals("")) nomeArq = "preco_custo.csv"; // Caso o nome nao seja infomado define um nome padrão
        return nomeArq; // Retorna o nome do arquivo entrada
    }

    public static void visualizarTabela(String nomeArq) throws Exception{
        BufferedReader arq = new BufferedReader(new FileReader(nomeArq));
        String linha; // Apenas a declaração da linha (assim o cabeçalho aparece no laço)
        while ((linha = arq.readLine()) != null){
            String[] campos = linha.split(";"); // Separa cada cedula em um vetor de strings
            
            /* Usando printf por causa da formatação de espaços(mais alinhado e bonito) */    
            System.out.printf("%10s | %10s | %-30s | %12s | %-20s%n",
            campos[0], campos[1], campos[2], campos[3], campos[4]);
        }
    }
}
