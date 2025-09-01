public class Ex2 {
    public static void main(String[] args) {
        String nomeCompleto = "Ana Carolina Souza";
        String[] arrayNome = nomeCompleto.split(" "); // Separando nome

        /* Imprimir as Iniciais */
        String iniciais = "";
        for(int i = 0; i < arrayNome.length; i++) {
            String str = arrayNome[i];
            str = str.substring(0, 1);
            iniciais += str; // Concatenação
        }
        System.out.println(iniciais);

        /* Imprimir o numero de palavras em nomeCompleto */
        int numPalavras = arrayNome.length;
        System.out.println("Nome tem: " + numPalavras + " palavras!");

    }
}
