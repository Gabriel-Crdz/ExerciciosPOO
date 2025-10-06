public class itensBiblioteca {
    private int codItem;
    private boolean emprestimo;
    private int qtde;
    private String autor;
    private String editora;

    public itensBiblioteca(){} // Metodo Construtor

    /* Getter, Setter Codigo Item */
    public int getCodItem() {
        return codItem;
    }
    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    /* Getter, Setter Emprestimo */
    public boolean isEmprestimo() {
        return emprestimo;
    }
    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    /* Getter, Setter qtde Disponivel */
    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    /* Getter, Setter Autor */
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /* Getter, Setter Editora */
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

}