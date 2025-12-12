package cofrinho;

/**
 * Classe que representa a moeda Euro.
 * 
 * Herda da classe abstrata Moeda.
 */
public class Euro extends Moeda {

     // Construtor da moeda Euro.
     // @param valor valor da moeda em euros
    public Euro(double valor) {
        super(valor);
    }

    // Implementa o método abstrato info() definido em Moeda.
    // Mostra no console o tipo da moeda e seu valor.
    @Override
    public void info() {
        System.out.println("Euro - Valor: €" + valor);
    }

    // Converte o valor da moeda Euro para reais.
    @Override
    public double converter() {
        return valor * 4.60;
    }
}