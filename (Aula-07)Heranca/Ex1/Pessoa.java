public class Pessoa {
    private String nome;
    private String email;
    private String cpf;
    private String tel;
    private String endereco;
    private int idade;

    public Pessoa(){ // Metodo Construtor 
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

    /* Getter, Setter cpf */
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /* Getter, Setter Telefone */
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    /* Getter, Setter Endereço */
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /* Getter, Setter Idade */
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


}
