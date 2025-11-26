public class Loja {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor();
        float comissao1 = v1.calcularComissao(200);
        System.out.println("Comissao de venda 1: " + comissao1);

        float comissao2 = v1.calcularComissao(500.0f, 0.15f);
        System.out.println("Comissao de venda 2: " + comissao2);
    }
}
