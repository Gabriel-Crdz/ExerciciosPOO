public class Vendedor extends Funcionario {
    private float valorComissao;
    private float valorVendas;
    
    public Vendedor(){} // Metodo Construtor

    /* Getter, Setter Comissao */
    public float getValorComissao() {
        return valorComissao;
    }
    public void setComissao(float valorComissao) {
        this.valorComissao = valorComissao;
    }

    /* Getter, Setter Valor Vendas */
    public float getValorVendas() {
        return valorVendas;
    }
    public void setValorVendas(float valorVendas) {
        this.valorVendas = valorVendas;
    }
}
