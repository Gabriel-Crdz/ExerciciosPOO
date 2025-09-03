public class Meses {
    // Declarar um vetor de String
    String meses[] = new String[12]; // vetor com 12 posições 

    /* Metodo construtor */
    // Executado automaticamente sempre que se cria objeto da classe com o mesmo nome
    public Meses(){
        atribuirvalores();
    }

    /* Metodo para atribuir os valores ao vetor meses */
    // Metodo (private) so pode ser chamado na propria classe
    private void atribuirvalores(){
        meses[0] = "Janeiro";
        meses[1] = "Fevereiro";
        meses[2] = "Março";
        meses[3] = "Abril";
        meses[4] = "Maio";
        meses[5] = "Junhoo";
        meses[6] = "Julho";
        meses[7] = "Agosto";
        meses[8] = "Setembro";
        meses[9] = "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";
    }

    /* Metodo para pegar o nome do mes */
    // Metodo (public) pode ser chamado externamente
    public String pegarMes(int num){
        if(num > 0 && num <= 12){
               return meses[num - 1];
            }
        else{
            return "";
        }
    }
}
