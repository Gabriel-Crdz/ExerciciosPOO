public class Transportadora implements ImportacaoArquivos {
    /* Atributos */
    private Encomenda[] vetorEncomendas;
    private EncomendaExp[] vetorEncomendasExp;
    private int qtdEncomendas;
    private int qtdEncomendasExp;

    /* Metodos */
    public Transportadora(){ // Metodo Construtor
        this.vetorEncomendas = new Encomenda[10];
        this.vetorEncomendasExp = new EncomendaExp[10];
        this.qtdEncomendas = 0;
        this.qtdEncomendasExp = 0;
    }

    /* Getter, Setter: encomenda */
    public Encomenda getEncomenda(int pos) {
        return vetorEncomendas[pos];
    }
    public void setEncomenda(Encomenda encom) {
        if(qtdEncomendas < 10){
            this.vetorEncomendas[qtdEncomendas] = encom;
            this.qtdEncomendas++;
        }
    }
    
    /* Getter, Setter: encomendaExp */
    public EncomendaExp getEncomendaExp(int pos) {
        return vetorEncomendasExp[pos];
    }
    public void setEncomendaExp(EncomendaExp encomExp) {
        if(qtdEncomendasExp < 10){
            this.vetorEncomendasExp[qtdEncomendas] = encomExp;
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
    
}
