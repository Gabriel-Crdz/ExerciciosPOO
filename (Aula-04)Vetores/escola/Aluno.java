public class Aluno {
    private String nome;
    private String matricula;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;

    /* Metodos Nome */
    /* Metodo getter(serve para retornar o valor de um atributo) */
    public String getNome(){
        return this.nome; // (this) faz referencia a um atributo ou metodo declarado no escopo da classe
    };

    /* Metodo setter(serve para atribuir valor a um atributo) */
    public void setNome(String n){
        this.nome = n;
    };

    /* Metodos Matricula */
    public String getMatricula(){
        return this.matricula;
    };

    public void setMatricula(String m){
        this.matricula = m;
    };

    /* Metodos Nota1 */
    public float getNota1(){
        return this.nota1;
    };

    public void setNota1(float n1){
        this.nota1 = n1;
    }

    /* Metodos Nota2 */
    public float getNota2(){
        return this.nota2;
    };

    public void setNota2(float n2){
        this.nota2 = n2;
    }

    /* Metodos Nota3 */
    public float getNota3(){
        return this.nota3;
    };

    public void setNota3(float n3){
        this.nota3 = n3;
    }

    /* Metodos Nota4 */
    public float getNota4(){
        return this.nota4;
    };

    public void setNota4(float n4){
        this.nota4 = n4;
    }

    /* Media */
    public float calcularMedia(){
        return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
    };

    
}
