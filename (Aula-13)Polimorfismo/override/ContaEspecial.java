public class ContaEspecial extends ContaCorrente{
    
    /* Polimorfismo de sobreposição */
    @Override // Força o polimorfismo de sobreposiçao
    public boolean sacarSaldo(double valor){
        double taxa = 0.003d;
        if(this.getSaldo() >= (valor + (valor * taxa))){
            this.setSaldo(this.getSaldo() - valor - (valor * taxa));
            return true;
        }
        return false;
    }

    /* Polimorfismo de sobrecarga */
    public boolean sacarSaldo(double valor, double taxa){
        if(this.getSaldo() >= (valor + (valor * taxa))){
            this.setSaldo(this.getSaldo() - valor - (valor * taxa));
            return true;
        }
        return false;
    }

}
