public class Voo {
    private String paisDestino;
    private String paisOrigem;
    private String dataSaida;
    private String dataChegada;
    private int qtdPassageiros;
    private Passageiro[] vetorPassageiros;

    public Voo(){
        this.vetorPassageiros = new Passageiro[50];
    }

    /* Getter, Setter paisDestino */
    public String getPaisDestino() {
        return paisDestino;
    }
    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    /* Getter, Setter paisOrigem */
    public String getPaisOrigem() {
        return paisOrigem;
    }
    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    /* Getter, Setter dataSaida */
    public String getDataSaida() {
        return dataSaida;
    }
    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    /* Getter, Setter dataChegada */
    public String getDataChegada() {
        return dataChegada;
    }
    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    /* Getter, Setter numPassageiros */
    public int getNumPassageiros() {
        return qtdPassageiros;
    }
    public void setNumPassageiros(int qtdPassageiros) {
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
