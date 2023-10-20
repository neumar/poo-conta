public class Conta {
    
    private double saldo;
    private double limite;
    private Cliente titular;

    public Conta (Cliente c) {
        this(0, -500, c);
    }

    public Conta (double s, Cliente c) {
        this(s, -500, c);
    }

    public Conta (double s, double l, Cliente c) {
        if(s >= 0) {
            this.saldo = s;
        } else {
            this.saldo = 0;
        }
        if (l < 0) {
            this.limite = l;
        } else {
            this.limite = -500;
        }
        this.titular = c;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public String getNomeTitular () {
        return this.titular.getNome();
    }

    public void setLimite(double l) {
        this.limite = l;
    }

    public boolean depositar(double v) {
        if (v >= 0){
            this.saldo += v;
            return true;
        }
        return false;
    }

    public boolean sacar(double v) {
        if (v >= 0){
            if ((this.saldo - v) >= this.limite) {
                this.saldo -= v;
                return true;
            }
        }
        return false;
    }
}
