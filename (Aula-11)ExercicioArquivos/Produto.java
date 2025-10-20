public class Produto {
    /* Atributos */
    private String codigo;
    private int estoque;
    private String nome;
    private float precoCusto;
    private String categoria;
    private float precoVenda;

    /* Metodos */
    /*Getter, Setter Codigo */
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /* Getter, Setter estoque */
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    /*Getter, Setter Nome */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    /*Getter, Setter PrecoCusto */
    public float getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    /*Getter, Setter Categoria */
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /*Getter, Setter PrecoVenda */
    public float getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(float margem) {
        this.precoVenda = this.precoCusto * (1 + margem / 100);
    }    
}
