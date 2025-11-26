public class Vendedor {

    /* Calcular a comissão do vendedor com percentual padrao de %5 */
    public float calcularComissao(float venda){
        float comissao = (venda * 0.05f) + 20f;
        return comissao;
    }

    /* Calcular a comissao do vendedor mas com percentual variavel */
    public float calcularComissao(float venda, float perc){
        float comissao = venda * perc;
        return comissao;
    }
}
