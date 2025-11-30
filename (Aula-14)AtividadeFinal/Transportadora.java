import java.io.BufferedReader;
import java.io.FileReader;

public class Transportadora implements ImportacaoArquivos {
    
    private static final int tamanho = 10; // Constante para definir o tamanho
    
    /* Atributos */
    private Encomenda[] vetorEncomendas;
    private EncomendaExp[] vetorEncomendasExp;
    private int qtdEncomendas;
    private int qtdEncomendasExp;

    /* Metodos */
    public Transportadora(){ // Metodo Construtor
        this.vetorEncomendas = new Encomenda[tamanho];
        this.vetorEncomendasExp = new EncomendaExp[tamanho];
        this.qtdEncomendas = 0;
        this.qtdEncomendasExp = 0;
    }

    /* Metodos da Interface */

    public String carregarConfiguracoes(String arqConfig){

    }
    
    public String importarDados(String arqDadosEntrada){
        try{ // Tenta ler o arquivo
            BufferedReader entrada = new BufferedReader(new FileReader(arqDadosEntrada)); // Buffer de leitura
            String linha = entrada.readLine();

            while((linha = entrada.readLine()) != null){ // Laço para percorre toda a tabela de dados
                String[] campos = linha.split(";");
                String siglaEncom = campos[2]; // Pega o tipo de encomenda pela sigla

                if(siglaEncom.equals("EN")){ // Se a sigla for "EN" e uma encomenda normal
                    /* Registra os dados da encomenda Normal */
                    Encomenda encom = new Encomenda();
                    encom.setNumPedido(Integer.parseInt(campos[0]));
                    encom.setDataPostagem(campos[1]);
                    encom.setPeso(Float.valueOf(campos[4]));
                    this.setEncomenda(encom); // Salva a encomenda normal
                }
                else if(siglaEncom.equals("EE")){ // Se entao for "EE" é uma encomenda expressa
                    /* Registra os dados da encomenda Expressa */
                    EncomendaExp encomExp = new EncomendaExp();
                    encomExp.setNumPedido(Integer.parseInt(campos[0]));
                    encomExp.setDataPostagem(campos[1]);
                    encomExp.setPrazoEntrega(Integer.parseInt(campos[3]));
                    encomExp.setPeso(Float.valueOf(campos[4]));
                    encomExp.setFone(campos[5]);
                    this.setEncomendaExp(encomExp); // Salva a encomenda expressa
                }
            }
            entrada.close();
            return "Sucesso ao importar todos os dados!"; // Retorna uma msg de sucesso se todo ocorrre bem
        }
        catch(Exception e){ // Se não conseguir mostra o erro
            return "Erro ao ler arquivo, motivo: " + e.getMessage();
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
    
    public int getEstoqueLivreEncom(){
        return tamanho - qtdEncomendas;
    }

    public int getEstoqueLivreEncomExp(){
        return tamanho - qtdEncomendasExp;
    }
}
