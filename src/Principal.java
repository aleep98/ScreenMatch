public class Principal {
    public static void main(String[] args) throws Exception {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Vingadores - Guerra Infinita");
        meuFilme.setAnoLancamento(2018);

        meuFilme.fixaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(6);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println("Média calculada: " + meuFilme.pegaMedia());
        System.out.println("-----------------------");
        System.out.println("Está incluído no plano? " + meuFilme.isIncluidoNoPlano());
    }
}
