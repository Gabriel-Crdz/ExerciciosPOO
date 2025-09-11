public class Voo {
    private int numVoo;
    private String destino;
    private String origem;
    private String dataEmbarque;
    private int qtdPassageiros;
    private Passageiro[] vetorPassageiros;

    public Voo(){
        this.vetorPassageiros = new Passageiro[50];
    }

    /* Getter, Setter numVoo */
    public int getNumVoo() {
        return numVoo;
    }
    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }

    /* Getter, Setter dataEmbarque */
    public String getDataEmbarque() {
        return dataEmbarque;
    }
    public void setDataEmbarque(String dataEmbarque) {
        this.dataEmbarque = dataEmbarque;
    }

    /* Getter, Setter paisDestino */
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /* Getter, Setter paisOrigem */
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    /* Getter, Setter numPassageiros */
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }
    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    /* Getter, Setter Vetor Passageiros */
    public Passageiro getPassageiro(int pos) {
        return vetorPassageiros[pos]; // Retorna o passageiro na posição do vetor indicada
    }
    public void setPassageiro(Passageiro pax) {
        this.vetorPassageiros[qtdPassageiros] = pax; // Salva passageiro no final(indicado pela variavel qtdAlunos) do vetor
    }
    
    public int getAssentosLivres(){ 
        return 50 - qtdPassageiros;
    }

    
}
