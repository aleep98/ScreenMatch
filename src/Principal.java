import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) throws Exception {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Vingadores - Guerra Infinita");
        meuFilme.setAnoLancamento(2018);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(6);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println("Média calculada: " + meuFilme.getMedia());
        System.out.println("Está incluído no plano? " + meuFilme.isIncluidoNoPlano());

        System.out.println("-----------------------");

        Serie loki = new Serie();
        loki.setNome("Loki");
        loki.setAnoLancamento(2021);
        loki.getAnoLancamento();
        loki.setTemporadas(10);
        loki.setEpisodiosPorTemporada(10);
        loki.setMinutosPorEpisodio(45);
        loki.setAtiva(true);

        System.out.println("Nome da série: " + loki.getNome());
        System.out.println("Está incluído no plano? " + loki.isAtiva());
        System.out.println("Total de minutos para assistir: " + loki.getTemporadas() * loki.getEpisodiosPorTemporada() * loki.getMinutosPorEpisodio());
        System.out.println("Loki foi lançado em: " + loki.getAnoLancamento());
        System.out.println("Total de temporadas: " + loki.getTemporadas());

    }
}
