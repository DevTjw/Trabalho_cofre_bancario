package cofrinho;

/**
 * Classe que representa a moeda Dólar.
 * 
 * Herda da classe abstrata Moeda.
 */
public class Dolar extends Moeda {

     // Construtor da moeda Dólar.
     //  valor da moeda em dólares
    public Dolar(double valor) {
        super(valor);
    }


    // Mostra no console o tipo da moeda e seu valor.
    @Override
    public void info() {
        System.out.println("Dólar - Valor: $" + valor);
    }

    // Converte o valor da moeda Dólar para reais.
    // return valor em reais
    @Override
    public double converter() {
        return valor * 3.10;
    }
}
