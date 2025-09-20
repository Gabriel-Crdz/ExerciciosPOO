public class Pessoa{
    private String nome;
    private String email;
    private int idade;

    public Pessoa(){} // Metodo Construtor sem parametros

    public Pessoa(String n, String e, int i){ // Metodo Construtor com parametro
        this.nome = n;
        this.email = e;
        this.idade = i;
    }

    /* Getter, Setter Nome */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    /* Getter, Setter Email */
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    /* Getter, Setter Idade */
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

} 