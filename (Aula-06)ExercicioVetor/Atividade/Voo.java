public class Voo {
    private int numVoo;
    private String destino;
    private String origem;
    private String dataEmbarque;
    private int qtdPassageiros;
    private Passageiro[] vetorPassageiros;

    public Voo(){
        this.vetorPassageiros = new Passageiro[50];
        this.qtdPassageiros = 0;
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
        if(qtdPassageiros < 50){ // Limita o numero de cadastros
            this.vetorPassageiros[qtdPassageiros] = pax; // Salva passageiro no final do vetor
            this.qtdPassageiros++; // Incrementa na qtd total(variavel de controle do vetor)
        }
        else{
            System.out.println("--------------------------------------");
            System.out.println("ERRO: Limite maximo atingido!");
            System.out.println("ERRO: O vôo só comporta 50 passageiros");
            System.out.println("--------------------------------------");
        }
    }
    
    public int getAssentosLivres(){ 
        return 50 - qtdPassageiros;
    }

    
}
