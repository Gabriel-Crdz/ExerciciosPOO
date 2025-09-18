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

        System.out.print("|= Contato(tel): ");
        se.c1.setTel(se.reader.readLine());

        se.menu(); // Chama o metodo da interface do menu
    }

    private void menu() throws Exception{
        String opc = "";
        while(!opc.equals("4")){
            System.out.println(""); // Print apenas para espaçamento
            System.out.println("==========MENU==========");
            System.out.println("[1] Cadastrar vôo");
            System.out.println("[2] Listar vôo");
            System.out.println("[3] Consultar vôo");
            System.out.println("[4] Sair");
            System.out.println("========================");
            
            System.out.print("Escolha uma opção: ");
            opc = this.reader.readLine();
            System.out.println(""); // Print apenas para espaçamento
            switch (opc) {
                case "1":
                    // Chamar o metodo para cadastrar um novo voo
                    cadastrarVoo();
                    break;

                case "2":
                    // Chamando o metodo para listar todos os vôos
                    listarVoos();
                break;
                
                case "3":
                   // Chamar o metodo para listar todos os passageiros de um determinado vôo(dados do vôo e dos passageiros)
                    consultarVoo();
                    break; 

                case "4":
                    // Sai do programa
                    System.err.println("SAINDO...");
                    break;

                default:
                    System.out.println("Entrada Invalida!!");
                    break;
            }
        }
    }
    private void cadastrarVoo() throws Exception{
        Voo voo = new Voo(); // Gera um novo vôo
        System.out.println("+=CADASTRO DO VÔO=");
        
        /* Dados do Vôo */
        System.out.print("|= Informe o numero do vôo: ");
        voo.setNumVoo(Integer.parseInt(reader.readLine())); // Leitura do numero do vôo

        System.out.print("|= Informe o local de embarque do vôo: ");
        voo.setOrigem(reader.readLine()); // Leitura da origem do vôo

        System.out.print("|= Informe o destino final do vôo: ");
        voo.setDestino(reader.readLine()); // Leitura do destino do vôo

        System.out.print("|= Informe a data de Embarque para o vôo: ");
        voo.setDataEmbarque(reader.readLine()); // Leitura do data-horario de embarque do vôo
        
        System.out.print("|= Informe o numero de cadastros a serem realizados: ");
        int numCadastros = (Integer.parseInt(reader.readLine())); // Leitura da quantidade de cadastros

        /* Dados dos Passageiros */
        if(numCadastros < 50){ // o numero de cadastros deve ser menor que o total de vagas
            System.out.println("+==CADASTROS DO VÔO=");
            for(int i = 0; i < numCadastros; i++){
                Passageiro pax = new Passageiro(); // Gera um novo registro do passageiro
                System.out.println(""); // Print apenas para espaçamento

                System.out.println(i+1 + "º Passageiro:");
                System.out.print("|= Nome: ");
                pax.setNome(reader.readLine()); // Leitura do nome

                System.out.print("|= Passaporte: ");
                pax.setPassaporte(reader.readLine()); // Leitura do passaporte

                System.out.print("|= Peso da Bagagem: ");
                pax.setPesoMala(reader.readLine()); // Leitura do peso da bagagem

                System.out.print("|= Endereço: ");
                pax.setEndereco(reader.readLine()); // Leitura do endereço

                System.out.print("|= Telefone: ");
                pax.setTel(reader.readLine()); // Leitura do telefone

                System.out.println("+===================");

                voo.setPassageiro(pax); // Registra os dados do passageiro
            }
            c1.setVoos(voo); // Registra todos os dados do voo
        }
        else{
            System.out.println("--------------------------------------");
            System.out.println("ERRO: O vôo só comporta 50 passageiros");
            System.out.println("--------------------------------------");
        }

    }

    private void listarVoos(){
        if(c1.getQtdVoos() != 0){ // Validação para saber se existem vôos cadastrados
            System.out.println("=LISTA DE VÔOS=");
            for(int i = 0; i < c1.getQtdVoos(); i++){ // Percorre o vetor dos vôos
                Voo voo = c1.getVoo(i);
                System.out.println("Numero: " + voo.getNumVoo() + " - Origem: " + voo.getOrigem() + " - Destino: " + voo.getDestino() + " - Embarque: " + voo.getDataEmbarque() + " - Qtde de passageiros: " + voo.getQtdPassageiros() + " - Assentos livres: " + voo.getAssentosLivres());
            }
            System.out.println("===============");
        }
        else{ // Mensagem para caso não haja vôos cadastrados
            System.out.println("----------------------------");
            System.out.println("ERRO: Nenhum vôo cadastrado!");
            System.out.println("----------------------------");
        }
    }

    private void consultarVoo() throws Exception{
        if(c1.getQtdVoos() != 0){
            System.out.println("+=CONSULTA DE VÔO=");
            System.out.print("|= Informe o numero do vôo: ");
            int numVoo = Integer.parseInt(reader.readLine());
            boolean achou = false;

            for(int i = 0; i < c1.getQtdVoos(); i++){
                Voo voo = c1.getVoo(i);
                if(voo.getNumVoo() == numVoo){
                    System.out.println("+=DADOS DO VÔO=");
                    System.out.println("|= Numero: " + voo.getNumVoo());
                    System.out.println("|= Embargue: " + voo.getOrigem());
                    System.out.println("|= Destino: " + voo.getDestino());
                    System.out.println("|= Data Embarque: " + voo.getDataEmbarque());
                    System.out.println("|= Assentos Livres: " + voo.getAssentosLivres());
                    System.out.println("=-=-=-=-=-=-=-=");


                    System.out.println("+=PASSAGEIROS DO VÔO=");
                    for(int j = 0; j < voo.getQtdPassageiros(); j++){
                        Passageiro pax = voo.getPassageiro(j);
                        System.out.println("|=" + (j+1) + "º Passageiro");
                        System.out.println("|= Nome: " + pax.getNome());
                        System.out.println("|= Passaporte: " + pax.getPassaporte());
                        System.out.println("|= Peso da Bagagem: " + pax.getPesoMala());
                        System.out.println("|= Endereço: " + pax.getEndereco());
                        System.out.println("|= Telefone: " + pax.getTel());
                        System.out.println("|= Assento: " + (j+1));
                        System.out.println("--------------------");
                    }
                    System.out.println("=====================");
                    achou = true;
                    break;
                }
            }
            if(!achou){ 
            System.out.println("---------------------");
            System.out.println("ERRO: Vôo localizado!");
            System.out.println("---------------------");}
        }
        else{
            System.out.println("----------------------------");
            System.out.println("ERRO: Nenhum vôo cadastrado!");
            System.out.println("----------------------------");
        }
    }
}




