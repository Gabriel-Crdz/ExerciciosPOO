import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Sistema {
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        Transportadora t = new Transportadora();
        
        System.out.println("+=====TRANSPORTADORA=====");
        System.out.print("|= Informe o arquivo de configuração: ");
        String arqConfig = input.readLine();
        t.carregarConfiguracoes(arqConfig); // Le e carrega os dados de config
        
        int opc = -1;
        do{ // Entra no laço para mostrar o menu
            opc = menu(); // Chama o metodo com opçoes
            switch (opc){
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
                    // listarEncomExp();
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
        for(int i = 0; i < t.getQtdEncomendas(); i++){
            Encomenda encom = t.getEncomenda(i);
            double frete = encom.calcularFrete(t.getPrecoKg());
            System.out.printf("%5d | %5.2f | %5.2f\n", encom.getNumPedido(), encom.getPeso(), frete);
        }
    }
}
