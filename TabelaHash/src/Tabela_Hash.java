import java.util.Arrays;

// Após analisar a implementação inicial em Java disponível abaixo, e considerando a forma como Tabelas Hash devem funcionar, Você pode ou começar do zero em outra linguagem de programação de sua escolha, ou continuar a implementação em Java, de forma que os seguintes métodos estejam implementados:

// void clear() - Remove todos os pares chave-valor
// String remove(String chave) - Remove (Apaga) o mapeamento especificado pela chave e o retorna
// void put(Stirng chave, int valor) - Realiza o mapeamento especificado pelo par chave-valor
// int size() - Retorna o número de mapeamentos neste mapa
// boolean isEmpty() - Informa se está vazio

public class Tabela_Hash {

    public static class TabelaEntrada {
        String chave;
        int valor;

        public TabelaEntrada(String chave, int valor) {
            this.chave = chave;
            this.valor = valor;
        }
    }
    

    private int tamanho;
    private int qtd;
    private int[] tabela;

    public Tabela_Hash(int tamanho) {
        this.tamanho = tamanho;
        this.qtd = 0;
        this.tabela = new int[tamanho];
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int[] getTabela() {
        return tabela;
    }

    public void setTabela(int[] tabela) {
        this.tabela = tabela;
    }

    public int hash(int chave) {
        return chave % tamanho;
    }

    public void put(int chave, int valor) {
        int posicao = hash(chave);
        tabela[posicao] = valor;
    }

    public int get(int chave) {
        int posicao = hash(chave);
        return tabela[posicao];
    }

    public void remove(int chave) {
        int posicao = hash(chave);
        tabela[posicao] = 0;
    }

    public void clear() {
        for (int i = 0; i < tamanho; i++) {
            tabela[i] = 0;
        }
    }

    public int size() {
        int qtd = 0;
        for (int i = 0; i < tamanho; i++) {
            if (tabela[i] != 0) {
                qtd++;
            }
        }
        return qtd;
    }

    public boolean isEmpty() {
        for (int i = 0; i < tamanho; i++) {
            if (tabela[i] != 0) {
                return false;
            }
        }
        return true;
    }

   
public static void main(String[] args) {
        Tabela_Hash tabela = new Tabela_Hash(10);
        tabela.put(1, 10);
        tabela.put(2, 20);
        tabela.put(3, 30);
        tabela.put(4, 40);
        tabela.put(5, 50);
        tabela.put(6, 60);
        tabela.put(7, 70);
        tabela.put(8, 80);
        tabela.put(9, 90);
        tabela.put(10, 100);
        tabela.put(11, 110);
        tabela.put(12, 120);
        tabela.put(13, 130);
        tabela.put(14, 140);
        tabela.put(15, 150);
       

        System.out.println("Tamanho: " + tabela.getTamanho());
        System.out.println("Quantidade: " + tabela.getQtd());
        System.out.println("Tabela: " + Arrays.toString(tabela.getTabela()));
        System.out.println("Hash: " + tabela.hash(1));
        System.out.println("Valor: " + tabela.get(1));
        tabela.remove(1);

        
        System.out.println("Tamanho: " + tabela.getTamanho());
        System.out.println("Quantidade: " + tabela.getQtd());
        System.out.println("Tabela: " + Arrays.toString(tabela.getTabela()));
        System.out.println("Hash: " + tabela.hash(1));
        System.out.println("Valor: " + tabela.get(1));
        tabela.clear();
        
        System.out.println("Tamanho: " + tabela.getTamanho());
        System.out.println("Quantidade: " + tabela.getQtd());
        System.out.println("Tabela: " + Arrays.toString(tabela.getTabela()));
        System.out.println("Hash: " + tabela.hash(1));
        System.out.println("Valor: " + tabela.get(1));
        System.out.println("Tamanho: " + tabela.size());
        System.out.println("Vazio: " + tabela.isEmpty());
    
}
}
