public class Utilizador {
    public static void main(String[] args) throws Exception {

        System.out.println("==Relogio de Pulso==");
        RelogioDePulso rp = new RelogioDePulso();
        System.out.println(rp.getHoras());
        System.out.println(rp.iniciarCronometro());

        System.out.println(""); // Espaçamento

        /* 
        * Por padrão não se pode instanciar nenhuma interface
        * a menos que se faça na hora uma implementação dos metodos
        * Recurso de uso mais restrito 
        */
        // Relogio r = new Relogio() {
        //     public String getHoras(){
        //         return "horas!!"
        //     }
        // };
    
        System.out.println(""); // Espaçamento

        System.out.println("==Radio Relogio==");
        RadioRelogio rr = new RadioRelogio();
        System.out.println(rr.ligar());
        System.out.println(rr.getHoras());
        System.out.println(rr.trocarEstacao(101.8f));
        System.out.println(rr.desligar());
        
    }
}
