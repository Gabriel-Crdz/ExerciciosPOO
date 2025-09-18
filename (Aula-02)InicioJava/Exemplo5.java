public class Exemplo5 {
    public static void main(String[] args){
        Operacoes opcMath = new Operacoes();

        System.out.println("5 - 6 = " + opcMath.subtrair(5, 6));
        System.out.println("3 + 7 = " + opcMath.somar(3, 7));
        System.out.println("7 * 4 = " + opcMath.multiplicar(7, 4));
        System.out.println("5 / 0 = " + opcMath.dividir(5, 0));
    }
}
