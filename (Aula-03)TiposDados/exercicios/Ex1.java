public class Ex1 {
    public static void main(String args[]){
        String str1 = "A linguagem Java é poderosa e ";
        String str2 = "plataforma";
        String str3 = args[0];

        System.out.println(str1);
        str1 = str1.replace("linguagem", str2);
        System.out.println(str1 + str3);
    }
}