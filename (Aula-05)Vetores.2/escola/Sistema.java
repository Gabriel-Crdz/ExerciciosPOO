import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sistema {
    BufferedReader reader;
    Escola e1;
    public static void main(String[] args) throws Exception {
        Sistema se = new Sistema();
        se.e1 = new Escola();
        se.reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--CADASTRO ESCOLA--");
        
        System.out.println("| Nome da escola: ");
        se.e1.setNome(se.reader.readLine());

        System.out.println("| Telefone: ");
        se.e1.setTel(se.reader.readLine());

        se.menu();
    }

    private void menu() throws Exception{
        String opcao = "";
        while(!opcao.equals("4")){ 
            System.out.println("-----------------------------");
            System.out.println("[1] Cadastrar nova turma");
            System.out.println("[2] Listar turmas existentes");
            System.out.println("[3] Consultar uma turma");
            System.out.println("[4] Sair");

            opcao = this.reader.readLine();
            switch(opcao) {
                case "1":
                    // Chamando o metodo de cadastro da turma
                    CadastrarTurma();
                    break;

                case "2":
                    // Chamando o metodo que lista as turmas
                    listarTurmas();
                    break;

                case "3":
                    // Chamando o metodo que consulta uma turma
                    consultarTurma();
                    break;

                case "4":
                    System.out.println("SAINDO...");
                    break;

                default:
                    break;
            }
        }
    }

    private void CadastrarTurma() throws Exception{
        Turma t = new Turma();
        System.out.println("--CADASTRO DE TURMAS--");
        
        System.out.println("| Numero da turma:");
        t.setNumTurma(Integer.parseInt(reader.readLine()));

        System.out.println("| Nome do Curso:");
        t.setNomeCurso(reader.readLine());

        System.out.println("| Ano de ingresso:");
        t.setAnoIngresso(Integer.parseInt(reader.readLine()));

        System.out.println("--ALUNOS--");
        for(int i = 0; i < 40; i++){
            System.out.println("| Nome do aluno:");

            String nome = reader.readLine();
            if(nome.equals("")){ break; } // Break para sair quando nao for informado nenhum nome

            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            System.out.println("| Matricula: ");
            aluno.setMatricula(reader.readLine());

            System.out.println("| Nota 1:");
            aluno.setNota1(Float.parseFloat(reader.readLine()));

            System.out.println("| Nota 2:");
            aluno.setNota2(Float.parseFloat(reader.readLine()));
            
            System.out.println("| Nota 3:");
            aluno.setNota3(Float.parseFloat(reader.readLine()));
            
            System.out.println("| Nota 4:");
            aluno.setNota4(Float.parseFloat(reader.readLine()));

            t.setAluno(aluno);
        }
        e1.setTurma(t);
    }
    private void listarTurmas(){
        System.out.println("-----------------------");
        System.out.println("Relatório de turmas");
        for(int i = 0; i < e1.getQtdTurmas(); i++){
            Turma t = e1.getTurma(i);
            System.out.println("Número: " + t.getNumTurma() + " - Curso: " + t.getNomeCurso() + " - Ano: " + t.getAnoIngresso() + " - Qtde de alunos: " + t.getQtdAlunos());
        }
    }
    private void consultarTurma() throws Exception{
        System.out.println("--------------------");
        System.out.println("Consulta de Turma");
        System.out.println("Número da Turma");
        int NumTurma = Integer.parseInt(reader.readLine());
        boolean achou = false;

        for(int i = 0; i < e1.getQtdTurmas(); i++){
            Turma t = e1.getTurma(i);
            if(t.getNumTurma() == NumTurma){
                System.out.println("[ALUNOS DA TURMA]");
                int posAluno = 0;
                while(t.getAluno(posAluno) != null){
                    String linha = "Nome: " + t.getAluno(posAluno).getNome();
                    linha += " - Matrícula: " + t.getAluno(posAluno).getMatricula();
                    linha += " - Media: " + t.getAluno(posAluno).calcularMedia();
                    System.out.println(linha);
                    posAluno++;
                }
                achou = true;
                break;
            }
        }
        if(!achou){ System.out.println("Turma não encontrada"); }
    }
}



