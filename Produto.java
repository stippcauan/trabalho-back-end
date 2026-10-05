// Produto.java
public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco >= 0 ? preco : 0;
        this.quantidadeEstoque = quantidadeEstoque >= 0 ? quantidadeEstoque : 0;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Erro: O preço não pode ser negativo.");
        } else {
            this.preco = preco;
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Erro: Estoque insuficiente.");
        }
    }
}