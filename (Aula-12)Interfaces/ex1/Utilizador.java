
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utilizador {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("+=AREA DO QUADRADO==");
        Quadrado q = new Quadrado();
        System.out.print("|= Informe o lado: ");
        float lado = Float.valueOf(reader.readLine());
        System.out.println("A area do quadrado é: " + q.calcularArea(lado, lado));

        System.out.println(""); // Espaçamento
        System.out.println("+=AREA DO RETANGULO==");
        Retangulo r = new Retangulo();
        System.out.print("|= Informe a altura: ");
        float altura = Float.valueOf(reader.readLine());
        System.out.print("|= Informe a base: ");
        float base = Float.valueOf(reader.readLine());
        System.out.println("A area do retangulo é: " + r.calcularArea(base, altura));

        System.out.println(""); // Espaçamento
        System.out.println("+=AREA DO CIRCULO==");
        Circulo c = new Circulo();
        System.out.print("|= Informe o raio: ");
        float raio = Float.valueOf(reader.readLine());
        System.out.println("A area do circulo é: " + c.calcularArea(raio, raio));
    }
}
