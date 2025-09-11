public class Companhia {
    private String nome;
    private String tel;
    private int numVoos;
    private Voo vetorVoos[];

    public Companhia(){
        this.vetorVoos = new Voo[10];
    }

    /* Getter, Setter Nome */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    /* Getter, Setter tel */
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    /* Getter, Setter NumVoos */
    public int getNumVoos() {
        return numVoos;
    }
    public void setNumVoos(int numVoos) {
        this.numVoos = numVoos;
    }

    public Voo getVoo(int pos) {
        return vetorVoos[pos];
    }

    public void setVoos(Voo v) {
        this.vetorVoos[numVoos] = v;
    }
    
}
