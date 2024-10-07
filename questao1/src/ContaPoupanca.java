class ContaPoupanca extends Conta {
    public ContaPoupanca() {
        super();
    }

    public void calcularRendimento(double selic) {
        double rendimento;
        if (selic > 8.5) {
            rendimento = saldo * 0.005;  // 0,5% ao mês
        } else {
            rendimento = saldo * (0.7 * (selic / 100));  // 70% da Selic
        }
        saldo += rendimento;
        System.out.println("Rendimento de R$ " + rendimento + " aplicado.");
    }
}
