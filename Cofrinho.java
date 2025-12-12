package cofrinho;

import java.util.ArrayList;

/**
 * Classe que representa um cofrinho de moedas.
 * 
 * Armazenar objetos do tipo Moeda (Real, Dolar, Euro)
 * utilizando uma lista (ArrayList).
 */
public class Cofrinho {

    // Lista que guarda todas as moedas adicionadas ao cofrinho
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

     // Adiciona uma moeda ao cofrinho.
     // O valor da moeda é convertido para inteiro antes de ser armazenado.
     // @param m moeda a ser adicionada     
    public void adicionar(Moeda m) {
        // Garante que o valor da moeda será armazenado como número inteiro
        m.valor = Math.round(m.valor);
        listaMoedas.add(m);
    }

    
     // Remove uma moeda do cofrinho.
     // @param m moeda a ser removida     
    public void remover(Moeda m) {
        listaMoedas.remove(m); // remover moedas
    }

    // Lista todas as moedas armazenadas no cofrinho.
    // Se o cofrinho estiver vazio, exibe uma mensagem.
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("Cofrinho vazio!");
            return;
        }
        
        System.out.println("Moedas no cofrinho:");
        for (Moeda m : listaMoedas) {
            m.info(); 
        }
    }

     // Calcula o valor total de todas as moedas convertidas para reais.
     // @return total em reais
    public double totalConvertido() {
        double total = 0;
        for (Moeda m : listaMoedas) {
            total += m.converter(); // Converte cada moeda para reais e soma
        }
        return total;
    }
}
