public class Aluno extends Pessoa {
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;

    public Aluno(){}
    
    public Aluno(float n1, float n2, float n3, float n4, String nome, String email, int idade){
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
        this.nota4 = n4;       // (this) apenas nessa classe (Aluno).
        super.setNome(nome);   // (super) para todas as instancias(classe-pai Pessoa) 
        super.setEmail(email); // como os atributos sao private acessa-se pelo metodo.
        super.setIdade(idade);
    }
    
    /* getter, Setter Nota 1 */
    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    /* getter, Setter Nota 2 */
    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    /* getter, Setter Nota 3 */
    public float getNota3() {
        return nota3;
    }
    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    /* getter, Setter Nota 4 */
    public float getNota4() {
        return nota4;
    }
    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    
}
