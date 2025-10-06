public class Cliente extends Pessoa {
    private String produto;
    private String dataVenda;
    private int precoProduto;
    private boolean club;
    
    public Cliente(){ // Metodo Construtor 
    }

    /* Getter, Setter Produto */
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }

    /* Getter, Setter DataVenda */
    public String getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    /* Getter, Setter PreçoProduto */
    public int getPrecoProduto() {
        return precoProduto;
    }
    public void setPrecoProduto(int precoProduto) {
        this.precoProduto = precoProduto;
    }

    /* Getter, Setter Club */
    public boolean isClub() {
        return club;
    }
    public void setClub(boolean club) {
        this.club = club;
    }

    
}
