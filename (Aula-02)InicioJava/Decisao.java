public class Decisao {
    public static void main(String args[]){
        if(args.length < 2){
            System.out.println("Precisa de 2 paremetros.");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        
        Operacoes opcMath = new Operacoes();

        System.out.println(args[0] + " - " + args[1]+ " = " + opcMath.subtrair(num1, num2));
    }
}
