import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.calcularTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) throws Exception {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Vingadores - Guerra Infinita");
        meuFilme.setAnoLancamento(2018);
        meuFilme.setDuracaoEmMinutos(160);
        meuFilme.setIncluidoNoPlano(true);
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
        loki.setTemporadas(3);
        loki.setEpisodiosPorTemporada(10);
        loki.setDuracaoEmMinutos(45);
        loki.setAtiva(true);

        System.out.println("Nome da série: " + loki.getNome());
        System.out.println("Está incluído no plano? " + loki.isAtiva());
        System.out.println("Total de minutos para assistir: " + loki.getTemporadas() * loki.getEpisodiosPorTemporada() * loki.getMinutosPorEpisodio());
        System.out.println("Loki foi lançado em: " + loki.getAnoLancamento());
        System.out.println("Total de temporadas: " + loki.getTemporadas());

        System.out.println("-----------------------");

         Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        calcularTempo calculo = new calcularTempo();
        calculo.incluiNoTempo(meuFilme);
        calculo.incluiNoTempo(outroFilme);
        calculo.incluiNoTempo(loki);
        System.out.println("Tempo total de filmes assistidos: " + calculo.getTempoTotal() + " minutos");


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(outroFilme);

        Episodios episodio = new Episodios();
        episodio.setNome("Episódio 1 - O Começo");
        episodio.setNumero(1);
        episodio.setTotalVisualizacoes(150);
        filtro.filtra(episodio);
        
    }
}
