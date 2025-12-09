import java.io.BufferedReader;
import java.io.FileReader;

public class Transportadora implements ImportacaoArquivos {
    private static int tamanho = 1000; // Constante para definir o tamanho
    
    /* Atributos */
    private Encomenda[] vetorEncomendas;
    private EncomendaExp[] vetorEncomendasExp;
    private int qtdEncomendas;
    private int qtdEncomendasExp;
    private float precoKg;
    private float precoKgExp;

    /* Metodos */
    public Transportadora(){ // Metodo Construtor
        this.vetorEncomendas = new Encomenda[tamanho];
        this.vetorEncomendasExp = new EncomendaExp[tamanho];
        this.qtdEncomendas = 0;
        this.qtdEncomendasExp = 0;
    }

    /* Metodos da Interface */
    public Boolean carregarConfiguracoes(String arqConfig){
        try{
            BufferedReader config = new BufferedReader(new FileReader("arquivos/" + arqConfig + ".csv"));
            String linha = config.readLine();

            while((linha = config.readLine()) != null){
                String[] campos = linha.split(";");
                String siglaEncom = campos[1];

                if(siglaEncom.equals("EN")){
                    this.setPrecoKg(Float.valueOf(campos[2]));
                }
                else if(siglaEncom.equals("EE")){
                    this.setPrecoKgExp(Float.valueOf(campos[2]));
                }
            }
            config.close();
            System.out.println("**********************************");
            System.out.println("SUCESSO: configurações carregadas!");
            System.err.println("**********************************");
            return true;
        }
        catch(Exception e){ // Se não conseguir mostra o erro
            System.err.println("****************************");
            System.out.println("ERRO: " + e.getMessage());
            System.err.println("****************************");
            return false;
        }
    }

    public void importarDados(String arqDadosEntrada){
        try{ // Tenta ler o arquivo
            BufferedReader entrada = new BufferedReader(new FileReader("arquivos/" + arqDadosEntrada + ".csv")); // Buffer de leitura
            String linha = entrada.readLine();

            while((linha = entrada.readLine()) != null){ // Laço para percorre toda a tabela de dados
                String[] campos = linha.split(";");
                String siglaEncom = campos[2]; // Pega o tipo de encomenda pela sigla

                if(siglaEncom.equals("EN") && getQtdEncomendas() < tamanho){ // Se a sigla for "EN" e uma encomenda normal
                    /* Registra os dados da encomenda Normal */
                    Encomenda encom = new Encomenda();
                    encom.setNumPedido(Integer.parseInt(campos[0]));
                    encom.setDataPostagem(campos[1]);
                    encom.setPeso(Float.valueOf(campos[4]));
                    /* TO DO: validar as encomendas para so inserir quando a espaço no vetor */
                    this.setEncomenda(encom); // Salva a encomenda normal
                }
                else if(siglaEncom.equals("EE") && getQtdEncomendasExp() < tamanho){ // Se entao for "EE" é uma encomenda expressa
                    /* Registra os dados da encomenda Expressa */
                    EncomendaExp encomExp = new EncomendaExp();
                    encomExp.setNumPedido(Integer.parseInt(campos[0]));
                    encomExp.setDataPostagem(campos[1]);
                    encomExp.setPrazoEntrega(Integer.parseInt(campos[3]));
                    encomExp.setPeso(Float.valueOf(campos[4]));
                    encomExp.setFone(campos[5]);
                    /* TO DO: validar as encomendas para so inserir quando a espaço no vetor */
                    this.setEncomendaExp(encomExp); // Salva a encomenda expressa
                }
                else{
                    System.out.println("ERRO: pedido numero " + campos[0] + " não foi registrado!");
                }
            }
            entrada.close(); // Fechamento do arquivo
        }
        catch(Exception e){ // Se não conseguir mostra o erro
            System.err.println("****************************");
            System.out.println("ERRO: " + e.getMessage());
            System.err.println("****************************");
        }
    }

    /* Getter, Setter: encomenda */
    public Encomenda getEncomenda(int pos) {
        return vetorEncomendas[pos];
    }
    public void setEncomenda(Encomenda encom) {
        if(qtdEncomendas < tamanho){
            this.vetorEncomendas[qtdEncomendas] = encom;
            this.qtdEncomendas++;
        }
        else{
            System.out.println("batata");
        }
    }
    
    /* Getter, Setter: encomendaExp */
    public EncomendaExp getEncomendaExp(int pos) {
        return vetorEncomendasExp[pos];
    }
    public void setEncomendaExp(EncomendaExp encomExp) {
        if(qtdEncomendasExp < tamanho){
            this.vetorEncomendasExp[qtdEncomendasExp] = encomExp;
            this.qtdEncomendasExp++;
        }
    }

    /* Getter, Setter: qtdEncomendas */
    public int getQtdEncomendas() {
        return qtdEncomendas;
    }
    public void setQtdEncomendas(int qtdEncomendas) {
        this.qtdEncomendas = qtdEncomendas;
    }

    /* Getter, Setter: qtdEncomendasExp */
    public int getQtdEncomendasExp() {
        return qtdEncomendasExp;
    }
    public void setQtdEncomendasExp(int qtdEncomendasExp) {
        this.qtdEncomendasExp = qtdEncomendasExp;
    }
    
    /* Getter, Setter: precoKg */
    public float getPrecoKg() {
        return precoKg;
    }
    public void setPrecoKg(float precoKg) {
        this.precoKg = precoKg;
    }

    /* Getter, Setter: precoKgExp */
    public float getPrecoKgExp() {
        return precoKgExp;
    }
    public void setPrecoKgExp(float precoKgExp) {
        this.precoKgExp = precoKgExp;
    }
}
