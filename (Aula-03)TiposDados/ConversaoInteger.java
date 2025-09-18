public class ConversaoInteger{
        public static void main(String[] args) {
        String s1 = "15";
        System.out.println("str1: " + s1);

        /* Coverter de String para int */
        int i1 = java.lang.Integer.parseInt(s1);
        System.out.println("int1: " + i1);

        /* Converter de Integer para String */
        Integer i2 = 7;
        // s1 = i2.toString();
        s1 = Integer.toString(i2);
        // s1 = i1.toString(); // Não é possivel pois i1 é tipo primitivo 

        /* Converter de Integer para float */
        float f1 = i2.floatValue() / 3;
        System.err.println("float1: " + f1);
        System.err.println("float1.1: " + String.format("%.02f", f1));
        
        // Comparando objeto
        Integer i3 = 10;
        int i4 = 10;
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4)); 
    }
}

