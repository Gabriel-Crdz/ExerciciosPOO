import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Sistema {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        Transportadora t = new Transportadora();
        
        System.out.println("+=====TRANSPORTADORA=====");
        
        Boolean carregar = false;
        while(carregar == false){   
            System.out.print("|= Informe o arquivo de configuração: ");
            String arqConfig = input.readLine();
            carregar = t.carregarConfiguracoes(arqConfig); // Le e carrega os dados de config
        }
        int opc = -1;
        do{ // Entra no laço para mostrar o menu
            opc = menu(); // Chama o metodo do menu propriamente

            new ProcessBuilder("clear").inheritIO().start().waitFor(); // Limpa o terminal

            switch(opc){
                case 1:
                    System.out.println("+=====IMPORTANDO DADOS=====");
                    System.out.print("|= Informe o nome do arquivo: ");
                    String arqEntrada = input.readLine();
                    t.importarDados(arqEntrada);
                break;
                case 2:
                    listarEncomNormais(t);
                break;
                case 3:
                    listarEncomExp(t);
                break;
                default:
                    System.out.println("SAINDO...");
                    break;
            }
        }while(opc != 0);
    }

    public static int menu() throws Exception{
        int opc = -1;
        do{ // Laço de validação da opção
            System.out.println("+-------------------MENU-------------------");
            System.out.println("| [1] Importar arquivo de encomendas");
            System.out.println("| [2] Exibir a lista de encomendas Normais");
            System.out.println("| [3] Exibir a lista de encomendas Expressas");
            System.out.println("| [0] Sair");
            System.out.println("|...........................................");
            System.out.print("Escolha uma opção: ");
            opc = Integer.parseInt(input.readLine());

            if(opc < 0 && opc > 3){
                System.out.println("***********************");
                System.out.println("ERRO: Entrada Invalida!");
                System.out.println("***********************");
            }

        }while(opc < 0 && opc > 3);
        return opc;
    }

    public static void listarEncomNormais(Transportadora t){
        if(t.getQtdEncomendas() != 0){
            System.out.printf("%10s | %5s | %5s" , "Nº Pedido" , "Peso", "Frete\n");
            for(int i = 0; i < t.getQtdEncomendas(); i++){
                Encomenda encom = t.getEncomenda(i);
                double frete = encom.calcularFrete(t.getPrecoKg());
                System.out.printf("%10d | %5.2f | %5.2f\n", encom.getNumPedido(), encom.getPeso(), frete);
            }
        }
        else{
            System.err.println("****************************");
            System.out.println("ERRO: não existe encomendas!");
            System.err.println("****************************");
        }
    }

    public static void listarEncomExp(Transportadora t){
        if(t.getQtdEncomendasExp() != 0){
            System.out.printf("%10s | %5s | %5s" , "Nº Pedido" , "Peso", "Frete\n");
            for(int i = 0; i < t.getQtdEncomendasExp(); i++){
                EncomendaExp encomExp = t.getEncomendaExp(i);
                double frete = encomExp.calcularFrete(t.getPrecoKg());
                System.out.printf("%10d | %5.2f | %5.2f\n", encomExp.getNumPedido(), encomExp.getPeso(), frete);
            }
        }
        else{
            System.err.println("****************************");
            System.out.println("ERRO: não existe encomendas!");
            System.err.println("****************************");
        }
    }
}
