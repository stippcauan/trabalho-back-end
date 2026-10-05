
public class Main1 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Carlos", 1000.0);

        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.sacar(2000.0); // Exibe erro

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}