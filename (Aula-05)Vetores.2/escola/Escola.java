public class Escola {
    private String nome;
    private String tel;
    private int qtdTurmas;
    private Turma[] vetorTurmas;

    public Escola(){
        this.vetorTurmas = new Turma[20];
    }

    // Metodos Getter, Setter
    /* Nome */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    /* Telefone */
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    /* qtdTurmas */
    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    /* Turmas */
    public Turma getTurma(int pos) {
        return vetorTurmas[pos];
    }

    public void setTurma(Turma t) {
        if(this.qtdTurmas < 20){    
            this.vetorTurmas[qtdTurmas] = t;
            qtdTurmas++;
        }
    }


}
