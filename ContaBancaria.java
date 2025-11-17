public class ContaBancaria {

    private String numeroConta;
    private String titular;
    private double saldo; // somente leitura via getter

    // GETTERS
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setNumeroConta(String numeroConta) {
        if (numeroConta == null || numeroConta.trim().isEmpty()) {
            System.out.println("Número da conta inválido!");
        } else {
            this.numeroConta = numeroConta;
        }
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            System.out.println("Titular inválido!");
        } else {
            this.titular = titular;
        }
    }

  
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: valor do depósito deve ser positivo!");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor do saque deve ser positivo!");
        } else if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        }
    }
}
