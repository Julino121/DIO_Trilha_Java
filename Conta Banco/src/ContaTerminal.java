import java.util.Scanner;

public class ContaTerminal {
    private Integer numeroConta;
    private String agencia;
    private String nomeCliente;
    private Float saldo;
    private Scanner scanner;

    public ContaTerminal() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.inserirDados();
        conta.imprimirMensagem();
        conta.fecharScanner();
    }

    public void inserirDados() {
        System.out.println("Digite o número da Conta: ");
        setNumeroConta(Integer.parseInt(scanner.nextLine()));

        System.out.println("Digite o número da Agência: ");
        setAgencia(scanner.nextLine());

        System.out.println("Digite o nome do cliente: ");
        setNomeCliente(scanner.nextLine());

        System.out.println("Digite o saldo da conta: ");
        setSaldo(Float.parseFloat(scanner.nextLine()));
    }

    public void imprimirMensagem() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                           "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " +
                           saldo + " e já está disponível para saque.");
    }

    public void fecharScanner() {
        scanner.close();
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }
}
