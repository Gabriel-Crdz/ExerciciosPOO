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
        System.out.print("|= Nome da companhia: ");
        se.c1.setNome(se.reader.readLine());

        System.out.print("|= Telefone: ");
        se.c1.setTel(se.reader.readLine());

        se.menu(); // Chama o metodo da interface do menu
    }

    private void menu() throws Exception{
        String opc = "";
        while(!opc.equals("4")){
            System.out.println("-----------------------------");
            System.out.println("[1] Cadastrar vôo");
            System.out.println("[2] Listar vôo");
            System.out.println("[3] Consultar um vôo");
            System.out.println("[4] Sair");
            
            System.out.print("Escolha uma opção: ");
            opc = this.reader.readLine();
            switch (opc) {
                case "1":
                    // Chamar o metodo para cadastrar um 
                    // numero(informado pelo usuario mas não excedendo o numero de assentos livres)
                    //  determinado de passageiros
                    cadastrarVoo();
                    break;

                case "2":
                    // Chamar o metodo para listar todos os vôos
                    break;

                case "3":
                    // Chamar o metodo para listar todos os passageiros de um determinado vôo(dados do vôo e dos passageiros)
                    break;
                
                case "4":
                    System.err.println("SAINDO...");
                    break;
                default:
                    System.out.println("Entrada Invalida!!");
                    break;
            }
        }
    }
    private void cadastrarVoo() throws Exception{
        Voo voo = new Voo();
        System.out.println("--CADASTRO DE PASSAGEIROS DO VÔO--");

        System.out.print("|= Informe o numero de cadastros a ser realizados: ");
        int numCadastros = (Integer.parseInt(reader.readLine()));
        Passageiro pax = new Passageiro();
        if(numCadastros < voo.getAssentosLivres()){
            for(int i = 0; i < numCadastros; i++){
                System.out.println(i+1 + "º Passageiro:");
                System.out.print("|= Nome: ");
                pax.setNome(reader.readLine());

                System.out.print("|= Passaporte: ");
                pax.setPassaporte(reader.readLine());

                System.out.print("|= Peso da Bagagem: ");
                pax.setPesoMala(reader.readLine());

                System.out.print("|= Endereço");
                pax.setEndereco(reader.readLine());

                System.out.print("|= Telefone: ");
                pax.setTel(reader.readLine());

                voo.setNumPassageiros(numCadastros);
                voo.setPassageiro(pax);
            }
            c1.setVoos(voo);

        }

    }



}




