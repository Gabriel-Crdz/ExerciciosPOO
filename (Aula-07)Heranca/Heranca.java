public class Heranca {
    public static void main(String[] args) {
        /* Formas de declaração */
        // Forma 1
        Pessoa p1 = new Pessoa();
        p1.setNome("Aizen Sousuke");
        p1.setEmail("KyokaSuigetsu@espada.huecco");
        p1.setIdade(34);
        System.out.println("Nome da pessoa 1: " + p1.getNome());

        // Forma 2 (mais enxuto mas tbm mais destrutivo se feito errado)
        Pessoa p2 = new Pessoa("Elizabeth", "RainhaIngraterra@realeza.uk", 96);
        System.out.println("Nome da pessoa 2: " + p2.getNome());

        /* Exemplo de Herança */
        Aluno a1 = new Aluno();
        a1.setNome("Vinicius Rambo");
        a1.setNota1(7);
        System.out.println("Aluno 1: " + a1.getNome() + " - Nota 1: " + a1.getNota1());

        Aluno a2 = new Aluno(8.1f, 7.5f, 9f, 8.9f, "Breno Justus", "JustusBreno@gmail.com", 20);
        System.out.println("Aluno 2: " + a2.getNome() + " - Nota 1: " + a2.getNota1());
    }
}
