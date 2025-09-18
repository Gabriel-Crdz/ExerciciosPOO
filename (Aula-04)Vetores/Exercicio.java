import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Atv {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        int vetA[] = new int[4];
        String vetB[] = new String[4];

        for(int i = 0; i < 4; i++){
            System.out.println("Digite o " + i + "º valor:");
            vetA[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i < 4; i++){
            System.out.println("Digite a " + i + "ª string: ");
            vetB[i] = reader.readLine();
        }

        System.out.println("Resultado:");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < vetA[i]; j++){
                System.out.println(vetB[i]);
            }
        }
    }
}
