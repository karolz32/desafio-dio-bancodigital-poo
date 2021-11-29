package banco;

public class Main {
    public static void main(String[] args) {

        Cliente venilson = new Cliente();
        venilson.setNome("Venilson");
        Conta cc = new ContaCorrente(venilson);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(venilson);
        cc.transferir(100, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        Cartao debito = new Cartao(venilson);
        debito.imprimirDadosCartao();

        Cliente karoline = new Cliente();
        karoline.setNome("Karoline");
        Conta corrente = new ContaCorrente(karoline);
        Cartao credito = new Cartao(karoline);
        credito.imprimirDadosCartao();
        corrente.depositar(500);
        corrente.transferir(20, cc);


        cc.imprimirExtrato();
        corrente.imprimirExtrato();

    }
}
