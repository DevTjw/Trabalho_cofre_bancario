package cofrinho;

/**
 * Classe abstrata que vai representar uma moeda genérica.
 * Serve como modelo para as classes específicas de moedas
 * (Real, Dolar e Euro).
 */
public abstract class Moeda {
    
    /**
    // Valor da moeda*
     */
    protected double valor;

    /**
    / Construtor que recebe o valor da moeda.
    // @param valor valor da moeda
     */
    public Moeda(double valor) {
        this.valor = valor;
    }

    /**
    // Exibe informações sobre a moeda.
    */
    public abstract void info();

    /**
    // Converte o valor da moeda para reais.
    // @return valor convertido em reais
    */
    public abstract double converter();
    
    /**
    // método equals()  para comparar moedas pelo tipo e valor.
	// Se for o mesmo objeto, retorna true.
	// Se o outro objeto for null ou de outro tipo (Dolar, Euro), retorna false.
	// Caso contrário, compara o valor numérico (valor) das duas moedas.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Moeda outra = (Moeda) obj;
        return Double.compare(outra.valor, valor) == 0;
    }

    /**
     // método  hashCode()  para comparar moedas pelo tipo e valor.
     // Ele gera um número inteiro baseado no valor da moeda — as moedas com o mesmo valor terão o mesmo código hash.
     */
    @Override
    public int hashCode() {
        return Double.hashCode(valor);
    }

    
}
