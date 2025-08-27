public class ExemploString {
    public static void main(String[] args) {
        String str1, str2, str3;
        str1 = " Um texto qualquer...      ";
        System.out.println("Antes do trim: [" + str1 + "]");
        System.out.println("Tamanho do str1: " + str1.length());

        str1 = str1.trim(); // Remove os espaços
        System.out.println("Apos o trim: [" + str1 + "]");
        System.out.println("Tamanho do str1: " + str1.length());

        /* Substituir uma substring(pedaço) dentro da String */
        str2 = str1.replace("texto", "teste");
        System.out.println("Substituindo texto: [" + str2 + "]");

        str2 = str2.replace("t", "AAA");
        System.out.println("Substituindo texto: [" + str2 + "]");

        /* Extrair um substring */
        str2 = str1.substring(6, 10); // 6 incluvise, 10 exclusive
        System.out.println("Extraindo texto: [" + str2 + "]");

        /* Procurar substring */
        str3 = "Humberto.beneduzzi@ifpr.edu.br";
        int posicao = str3.indexOf("@");
        System.out.println("@ esta na posição: " + posicao);
        System.out.println("Usuario: " + str3.substring(0, str3.indexOf("@")));
        
        String dominio = str3.substring(str3.indexOf("@") + 1, str3.length());
        System.out.println("Dominio: " + dominio.toUpperCase() /* transformar para maiusculas */);


        /* Converter para String */
        int valor = 50;
        str3 = String.valueOf(valor); // metodo universal
        System.out.println("Valor: " + str3);

        /* Quebrar um String em vetor */
        String valores = "15/01/2007";
        String[] arrayValores = valores.split("/");
        System.out.println("Array Valores [2]: " + arrayValores[2]);

        // Percorra o vetor arrayValores mostrado os valores
        for(int i = 0; i < arrayValores.length; i++){
            System.out.println("Valor " + i + ": " + arrayValores[i]);
        }
    }
}
