package banco;

import java.time.LocalDate;
public class Cartao extends Cliente{

    private static int SEQUENCIAL_NUMERO = 1;
    private static int SEQUENCIAL_CD = 1;
    private int numero, codigoSeguranca;
    private LocalDate dataValidade;
    private Cliente cliente;

    LocalDate hoje = LocalDate.now();
    public Cartao(Cliente cliente) {
        this.numero = SEQUENCIAL_NUMERO++;
        this.codigoSeguranca = SEQUENCIAL_CD++;
        this.dataValidade = hoje.plusYears(5);
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }


    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void imprimirDadosCartao() {
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Número do cartão: " + this.numero);
        System.out.println("Código de segurança do cartão: " + this.codigoSeguranca);
        System.out.println("Validade do cartão: " + this.dataValidade);

    }


}
