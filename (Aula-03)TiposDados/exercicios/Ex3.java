public class Ex3 {
    public static void main(String[] args) {
        String str1 = "IFPR - Campus Foz do Iguaçu - Avenida Araucaria, 780, Bairro Vila A - CEP: 85860-000 - Foz do Iguaçu - Parana - (45)3422-5348";
        
        /* Imprimir o CEP */
        String cep = str1.substring(str1.indexOf("CEP"), str1.indexOf("CEP") + 15 );
        System.out.println(cep);
        
        /* Imprimir Telefone */
        String tel = str1.substring(str1.indexOf("(45)"));
        System.out.println("Tel: " + tel);

        /* Converter os 4 ultimos digitos do telefone e diidir por 2 */
        String numFinalTelefone = tel.substring(tel.length() - 4);
        int num = java.lang.Integer.parseInt(numFinalTelefone);
        num /= 2;
        System.out.println(num);
    }
}
