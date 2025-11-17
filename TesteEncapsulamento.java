public class TesteEncapsulamento {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

    
        conta.setNumeroConta("12345-9");
        conta.setTitular("Matheus Marinho");

    
        conta.depositar(500);   
        conta.depositar(-50);   

        conta.sacar(200);       
        conta.sacar(5000);      
        conta.sacar(-10);       

        
        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}
