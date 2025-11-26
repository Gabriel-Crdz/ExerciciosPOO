public class Banco {
    public static void main(String[] args) {
        System.out.println("| Conta Corrente |");
        ContaCorrente cc1 = new ContaCorrente();

        cc1.depositarSaldo(200);
        System.out.println("|= Saldo atual: " + cc1.getSaldo());

        boolean sacou = cc1.sacarSaldo(10);
        /* Validação do saque */
        if(sacou) System.out.println("|= Saldo pos saque: " + cc1.getSaldo());
        else System.out.println("|= Não foi possivel sacar!");


        System.out.println("------------------");
        System.out.println("| Conta Especial 1|");
        ContaEspecial ce1 = new ContaEspecial();

        ce1.depositarSaldo(200);
        System.out.println("|= Saldo atual: " + ce1.getSaldo());

        sacou = ce1.sacarSaldo(10);
        /* Validação do saque */
        if(sacou) System.out.println("|= Saldo pos saque: " + ce1.getSaldo());
        else System.out.println("|= Não foi possivel sacar!");

        System.out.println("------------------");
        System.out.println("| Conta Especial 2|");
        ContaEspecial ce2 = new ContaEspecial();

        ce2.depositarSaldo(200);
        System.out.println("|= Saldo atual: " + ce2.getSaldo());

        sacou = ce2.sacarSaldo(10, 0.0001d);
        /* Validação do saque */
        if(sacou) System.out.println("|= Saldo pos saque: " + ce2.getSaldo());
        else System.out.println("|= Não foi possivel sacar!");

        
    }
}
