public class Exemplo4 {
    public static void main(String args[]){
        String cliente = "Gabriel";
        Pet pet1 = new Pet(); // Instancia um objeto da classe Pet
        pet1.nome = "Batata";
        pet1.especie = "Gato";
        pet1.idade = 2;

        Pet pet2 = new Pet();
        pet2.especie = "Ornitorrinco";
        pet2.nome = "Perry";
        pet2.idade = 10;
        
        System.out.println("O cliente se chama: " + cliente + " possui um pet chamado " + pet1.nome + " que é um " + pet1.especie + " e tem " +pet1.idade + " anos!");
        
    }
}
