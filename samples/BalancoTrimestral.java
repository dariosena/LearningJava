class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosDeJaneiro = 15000;
        int gastosDeFevereiro = 23000;
        int gastosDeMarco = 17000;

        int gastosTrimestre = gastosDeJaneiro + gastosDeFevereiro + gastosDeMarco;

        System.out.println(gastosTrimestre);

        double mediaMensal = gastosTrimestre / 3.0;

        System.out.println("Valor da média mensal = " + mediaMensal);
    }
}