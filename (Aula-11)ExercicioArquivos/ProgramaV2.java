import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ProgramaV2 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Declarando o reader com atributo para todos os metodos consegurem usar
    public static void main(String[] args) throws Exception{
        int opc;
        
        System.out.println("=====TABELAS DE PREÇOS=====");
        String nomeEntrada = inserirEntrada(); // Começa ja pedindo o nome do arquivo de entrada 
        do{
            System.out.println(""); // Print apenas para espaçamento
            System.out.println("=============MENU=============");
            System.out.println("[1] Alterar arquivo entrada");
            System.out.println("[2] Visualizar arquivo entrada");
            System.out.println("[3] Gerar preços de venda");
            System.out.println("[4] Gerar lista de compra");
            System.out.println("[0] Sair");
            System.out.println("..............................");
            System.out.print("|= Escolha uma opção: ");
            opc = Integer.parseInt(reader.readLine());

            new ProcessBuilder("clear").inheritIO().start().waitFor(); // Limpa o terminal

            switch (opc) {
                case 1: nomeEntrada = inserirEntrada(); // Metodo para alterar o arquivo de entrada
                    break;
                case 2: visualizarTabela(nomeEntrada); // Metodo para mostrar os dados da entrada
                    break;
                case 3: gerarVenda(nomeEntrada); // Metodo para gerar e mostrar os dados sa saida
                    break;
                case 4: gerarCompra(nomeEntrada); // Metodo para gerar e mostrar os produtos com menos de 10 no estoque
                    break;
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

    /* Opção 1 */
    public static String inserirEntrada() throws Exception{
        System.out.print("|= Informe o nome do arquivo de entrada: ");
        String nomeEntrada = reader.readLine(); // Lendo o nome de entrada

        if(nomeEntrada.equals("")) nomeEntrada = "preco_custo.csv"; // Caso o nome nao seja infomado define um nome padrão
        return nomeEntrada; // Retorna o nome do arquivo entrada, para uso futuro
    }

    /* Opção 2 */
    public static void visualizarTabela(String nomeArq) throws Exception{
        BufferedReader arq = new BufferedReader(new FileReader(nomeArq)); // Declara um Buffer de leitura para o arquivo informado
        
        new ProcessBuilder("clear").inheritIO().start().waitFor(); // Limpa o terminal
        
        String linha; // Apenas a declaração da linha (assim o cabeçalho aparece no laço)
        while ((linha = arq.readLine()) != null){
            String[] campos = linha.split(";"); // Separa cada cedula em um vetor de strings
            
            if(campos.length == 5){
                /* Usando printf por causa da formatação de espaços(mais alinhado e bonito) */    
                System.out.printf("%10s | %10s | %-30s | %12s | %-20s%n",
                campos[0], campos[1], campos[2], campos[3], campos[4]);
            }
            else{
                System.out.printf("%10s | %-30s | %12s\n",
                campos[0], campos[1], campos[2]);
            }
        }
        arq.close(); // Fechamento do arquivo
    }

    /* Opcção 3 */
    public static void gerarVenda(String nomeEntrada) throws Exception{
        BufferedReader entrada = new BufferedReader(new FileReader(nomeEntrada)); // Declara um Buffer de leitura com o nome da entrada

        System.out.println("+=====PREÇO DE VENDAS=====");

        System.out.print("|= Informe o nome do arquivo de saida: ");
        String nomeArq = reader.readLine(); // Lendo o nome do arquivo saida
        if(nomeArq.equals("")) nomeArq = "preco_vendas.csv"; // Caso não seja informado define um nome padrão
        BufferedWriter saida = new BufferedWriter(new FileWriter(nomeArq)); // Declara um Buffer de escrita
        
        System.out.print("|= Informe a margem de lucro(%): ");
        float margem = Float.valueOf(reader.readLine()); // Lendo o valor da margem

        String escrita = "codigo;produto;preco_venda"; // Cabeçalho
        saida.write(escrita);
        saida.newLine();

        String leitura = entrada.readLine();
        while ((leitura = entrada.readLine()) != null){
            String[] campos = leitura.split(";");

            /* Calculo do preco de venda do produto */
            float precoCusto = Float.valueOf(campos[3].replace(",", "."));
            float valorVenda = precoCusto * (1 + margem / 100);
            String precoVenda = String.format("%.2f", valorVenda);
            
            /* Gravando dados */
            escrita = campos[0] + ";" + campos[2] + ";" + precoVenda;
            saida.write(escrita);
            saida.newLine();
        }
        entrada.close(); // Fechamento dos arquivos
        saida.close();

        System.out.println("\n************************");
        System.out.println("SUCESSO: arquivo criado!");
        System.out.println("************************\n");

        System.out.print("Deseja visualizar a tabela?(S/N): "); 
        String ver = reader.readLine(); // Lendo se o usuario deseja ver a tabela criada
        if(ver.toUpperCase().equals("S")) visualizarTabela(nomeArq); // Se sim, chama o metodo visualizarTabela
    }

    public static void gerarCompra(String nomeEntrada) throws Exception{
        BufferedReader entrada = new BufferedReader(new FileReader(nomeEntrada)); // Declara um Buffer de leitura com o nome da entrada
        BufferedWriter compra = new BufferedWriter(new FileWriter("comprar.csv")); // Declara um buffer de escrita

        String escrita = "codigo;estoque;produto;preco_custo;categoria"; // Cabeçalho
        compra.write(escrita);
        compra.newLine();
        
        String leitura = entrada.readLine();
        while((leitura = entrada.readLine()) != null){
            String[] campos = leitura.split(";");
            
            int estoque = Integer.parseInt(campos[1]);

            if(estoque < 10){
                escrita = campos[0] + ";" + campos[1] + ";" + campos[2] + ";" + campos[3] + ";" + campos[4];
                compra.write(escrita);
                compra.newLine();
            }
            
        }
        entrada.close(); // Fechamento dos arquivos
        compra.close();

        System.out.println("\n************************");
        System.out.println("SUCESSO: arquivo criado!");
        System.out.println("************************\n");

        System.out.print("Deseja visualizar a tabela?(S/N): "); 
        String ver = reader.readLine(); // Lendo se o usuario deseja ver a tabela criada
        if(ver.toUpperCase().equals("S")) visualizarTabela("comprar.csv"); // Se sim, chama o metodo visualizarTabela
    }
}