public class Funcionario extends Pessoa {
    private String registro;
    private String setor;
    private String filial;
    private float salario;

    public Funcionario(){ // Metodo Construtor
    }

    /* Getter, Setter Registro */
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }

    /* Getter, Setter Setor */
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    /* Getter, Setter Filial */
    public String getFilial() {
        return filial;
    }
    public void setFilial(String filial) {
        this.filial = filial;
    }

    /* Getter, Setter Salario */
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
   
}
