package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class calcularTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void incluiNoTempo(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

   
}
