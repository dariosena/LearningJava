public class Conta {
    int numero;
    double saldo;
    double limite;
    String titular;

    public boolean saca(double valor) {
        this.saldo = this.saldo - valor;
        return true;
    }

    void deposita(double valor) {
        this.saldo += valor;
    }
}