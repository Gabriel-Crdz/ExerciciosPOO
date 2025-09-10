import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sistema {
    BufferedReader reader;
    Companhia c1;
    public static void main(String[] args) throws Exception{
        Sistema se = new Sistema(); // Cria um novo Sistema
        se.c1 = new Companhia(); // Cria uma nova companhia
        se.reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("+==CADASTRO DE COMPANHIA==+");
        /* Leitura dos dados da Companhia */
        System.out.println("|= Nome da companhia: ");
        se.c1.setNome(se.reader.readLine());

        System.out.println("|= Telefone: ");
        se.c1.setTel(se.reader.readLine());

        se.menu() // Chama o metodo da interface do menu
    }

    private void menu() throws Exception{
        String opc = "";
        while(!opc.equals("4")){
            System.out.println("-----------------------------");
            System.out.println("[1] Cadastrar vôo");
            System.out.println("[2] Listar vôo");
            System.out.println("[3] Consultar um vôo");
            System.out.println("[4] Sair");
        }
        opc = this.reader.readLine();
        switch (opc) {
            case "1":
                // Chamar o metodo para cadastrar um 
                // numero(informado pelo usuario mas não excedendo o numero de assentos livres)
                //  determinado de passageiros
                break;

            case "2":
                // Chamar o metodo para listar todos os vôos
                break;

            case "3":
                // Chamar o metodo para listar todos os passageiros de um determinado vôo(dados do vôo e dos passageiros)
                break;
            default:
                break;
        }
    }
}
