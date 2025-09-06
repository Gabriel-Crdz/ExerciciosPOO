public class Turma {
    private int numTurma;
    private String nomeCurso;
    private int anoIngresso;
    private int qtdAlunos;
    private Aluno[] vetorAlunos;

    public Turma(){
        this.vetorAlunos = new Aluno[40];
    }
    
    // Metodos Getter, Setter
    /* numTurma */
    public int getNumTurma() {
        return numTurma;
    }
    public void setNumTurma(int numTurma) {
        this.numTurma = numTurma;
    }

    /* NomeCurso */
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    /* AnoIngresso */
    public int getAnoIngresso() {
        return anoIngresso;
    }
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    /* qtdAlunos */
    public int getQtdAlunos() {
        return qtdAlunos;
    }
    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    /* Alunos */
    public Aluno getAluno(int pos) {
        return vetorAlunos[pos]; // Retorna o aluno na posição do vetor indicada
    }
    public void setAluno(Aluno a) {
        if(this.qtdAlunos < 40){
            this.vetorAlunos[qtdAlunos] = a; // Salva aluno no final(indicado pela variavel qtdAlunos)
            qtdAlunos++;
        }
    } 

    
}
