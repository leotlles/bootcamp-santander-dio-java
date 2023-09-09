public class ContaTerminal {
    //atributos
    private String nomeCliente;
    private String agencia;
    private int numero;
    private double saldo;

    //metodos
    public ContaTerminal(String nomeCliente, String agencia, int numero, double saldo){
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
        
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }


    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }


    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // depósito
    public void depositar(double valor) {
        saldo += valor;
    }
}



