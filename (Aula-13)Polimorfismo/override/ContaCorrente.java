public class ContaCorrente {
    private int numConta;
    private String nome;
    private double saldo;

    /* Metodos */
    public void depositarSaldo(double deposito){
        this.saldo += deposito;
    }

    public boolean sacarSaldo(double valor){
        double taxa = 0.005d;
        if(this.saldo >= (valor + (valor * taxa))){
            this.saldo = this.saldo - (valor * taxa);
            return true;
        }
        return false;
    }

    /* GETTER's, SETTER's */

    /* Numero da conta */
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    /* Nome */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    /* Saldo */
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
