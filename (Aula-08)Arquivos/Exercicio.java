import java.io.BufferedWriter;
import java.io.FileWriter;

public class Exercicio {
    public static void main(String[] args)  throws Exception{
        String nomeArq = "tabela.html";
        BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(nomeArq)); // Usando o Buffer para escrever no arquivo
        
        String linha = "<html> <table width=\"400\" align=\"center\" border=\"1\">";
        arqGravacao.write(linha);

        linha = "<tr><th>COR</th><th>HEXADECIMAL</th></tr>";
        arqGravacao.write(linha);

        for(int i = 0; i < 16; i++){
            int red = i;
            String hexRed = Integer.toHexString(red);

            for(int j = 0; j < 16; j++){
                int green = j;
                String hexGreen = Integer.toHexString(green);

                for(int k = 0; k < 16; k++){
                    int blue = k;
                    String hexBlue = Integer.toHexString(blue);

                    String cor = hexRed + "0" + hexGreen + "0" + hexBlue + "0";

                    linha = "<tr>";
                    arqGravacao.write(linha); 
                    arqGravacao.newLine();

                    linha = "<td bgcolor='#" + cor  + "'></td>" + "<td>" + cor + "</td>";
                    arqGravacao.write(linha); 
                    arqGravacao.newLine();

                    linha = "<tr>";
                    arqGravacao.write(linha); 
                    arqGravacao.newLine();
                }
            }
        }


        linha = "</table><html>";
        arqGravacao.write(linha); 
        arqGravacao.newLine();
        arqGravacao.close();

    }
}
