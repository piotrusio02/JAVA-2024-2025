public record BankAccount(String numer, double saldo) {
    public BankAccount(String numer) {
        this(numer, 0.0);
    }
}
