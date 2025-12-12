package cofrinho;

/**
 * Classe que representa a moeda Real.
 * 
 * Herda da classe abstrata Moeda.
 */

public class Real extends Moeda {

    // Construtor da moeda Real.
    // valor da moeda em reais
    public Real(double valor) {
        super(valor);
    }

    // Implementa o método abstrato info() definido em Moeda.
    // Mostra no console o tipo da moeda e seu valor.
    @Override
    public void info() {
        System.out.println("Real - Valor: R$" + valor);
    }

    // Converte o valor da moeda Real para reais.
    // Como já está em reais, retorna o próprio valor.
    // @return valor em reais
    @Override
    public double converter() {
        return valor;
    }
}

