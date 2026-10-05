
public class Main3 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana Silva", 5000.0, "Tecnologia");

        gerente.gerenciar();
        
        gerente.aumentarSalario(10.0);
        System.out.println("Novo salário: R$ " + gerente.getSalario());
    }
}