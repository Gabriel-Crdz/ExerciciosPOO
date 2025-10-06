public class Caixa extends Funcionario{
    private String numCaixa;
    private String loginPdv;
    private String senhaPdv;

    public Caixa(){} // Metodo Construtor

    /* Getter, Setter Num Caixa */
    public String getNumCaixa() {
        return numCaixa;
    }
    public void setNumCaixa(String numCaixa) {
        this.numCaixa = numCaixa;
    }

    /* Getter, Setter Login Pdv */
    public String getLoginPdv() {
        return loginPdv;
    }
    public void setLoginPdv(String loginPdv) {
        this.loginPdv = loginPdv;
    }

    /* Getter, Setter senha Pdv */
    public String getSenhaPdv() {
        return senhaPdv;
    }
    public void setSenhaPdv(String senhaPdv) {
        this.senhaPdv = senhaPdv;
    }

    
}
