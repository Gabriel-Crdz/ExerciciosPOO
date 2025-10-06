public class Gerente extends Funcionario {
    private String area;
    private int nvlAcesso;

    public Gerente(){} // Metodo Construtor

    /* Getter, Setter Area */
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    /* Getter, Setter Nivel Acesso */
    public int getNvlAcesso() {
        return nvlAcesso;
    }
    public void setNvlAcesso(int nvlAcesso) {
        this.nvlAcesso = nvlAcesso;
    }

    
}
