public class Encomenda {
    /* Atributos */
    private int numPedido;
    private String DataPostagem;
    private float peso;

    /* Metodos */

    public double calcularFrete(float preco){
        double frete = peso * preco;
        return frete;
    }

    /* Getter, Setter: numPedido */
    public int getNumPedido() {
        return numPedido;
    }
    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    /* Getter, Setter: dataPostagem */
    public String getDataPostagem() {
        return DataPostagem;
    }
    public void setDataPostagem(String dataPostagem) {
        DataPostagem = dataPostagem;
    }

    /* Getter, Setter: peso */
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
