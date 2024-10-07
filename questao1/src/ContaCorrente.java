class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente() {
        super();
        this.chequeEspecial = 1000.00;  // Limite do cheque especial
    }

    public void usarChequeEspecial() {
        if (chequeEspecial > 0) {
            saldo += chequeEspecial;
            System.out.println("Cheque especial de R$ " + chequeEspecial + " utilizado.");
            chequeEspecial = 0;  // Cheque especial usado
        } else {
            System.out.println("Você já utilizou o cheque especial.");
        }
    }
}

