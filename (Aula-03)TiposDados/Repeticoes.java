public class Repeticoes {
    /* Laços de Repetições(o professor esqueceu de passar na ultima aula) */
    public static void main(String[] args) {
        int qtd = 20;
        //FOR
        System.out.println("Repetição for: ");
        for(int i = 0; i < qtd; i++){
            System.out.println(i);
        }

        //WHILE
        System.out.println("Repetição while: ");
        int cont = 0;
        while(cont <= qtd){
            System.out.println(cont);
            cont++;
        }

        //DO-WHILE
        System.out.println("Repetição do-while");
        cont = 0;
        do { 
            System.out.println(cont);
            cont++;
        } while (cont <= qtd);

    }
}
