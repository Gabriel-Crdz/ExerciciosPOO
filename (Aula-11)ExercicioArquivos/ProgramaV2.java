import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ProgramaV2 {
    // private Produto produtos[];
     public static void main(String[] args) throws Exception{
        String nomeArqLeitura = "preco_custo.csv";
        String nomeArqEscrita = "preco_venda.csv";
        BufferedReader arqLeitura = new BufferedReader(new FileReader(nomeArqLeitura));
        BufferedWriter arqEscrita = new BufferedWriter(new FileWriter(nomeArqEscrita));

        String linha = arqLeitura.readLine();
        
        while ((linha = arqLeitura.readLine()) != null){
            String[] coluna = linha.split(";");
            Produto produto = new Produto();
            produto.setCodigo(coluna[0]);
            produto.setEstoque(Integer.parseInt(coluna[1]));
            produto.setNome(coluna[2]);
            produto.setPrecoCusto(Float.valueOf(coluna[3]));
            produto.setCategoria(coluna[4]);
        }
        arqLeitura.close(); // Fecha arquivo
        
    }   
}
