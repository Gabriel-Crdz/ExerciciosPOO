public class EncomendaExp extends Encomenda {
    /* Atributos */
    int prazoEntrega;
    String fone;

    /* Metodos */

    public double calcularFrete(float preco){
        double frete = 0;
        if(prazoEntrega >= 3){
            frete = preco * this.getPeso();
        }
        else{
            frete = (preco * this.getPeso()) * 1.25;
        }
        return frete;
    }

    /* Getter, Setter: prazoEntrega */
    public int getPrazoEntrega() {
        return prazoEntrega;
    }
    public void setPrazoEntrega(int prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    /* Getter, Setter: fone */
    public String getFone() {
        return fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }
    
}
