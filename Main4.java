// Main.java
public class Main4 {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebok", 2500.0, 10);

        produto.setPreco(2300.0);
        produto.setPreco(-100.0); 

        // Testando movimentação de estoque
        produto.adicionarEstoque(5);
        produto.removerEstoque(3);
        produto.removerEstoque(20); 

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Estoque atual: " + produto.getQuantidadeEstoque());
    }
}