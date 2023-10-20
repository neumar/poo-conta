public class Conta {
    
    private double saldo;
    private double limite;

    public Conta () {
        this(0, -500);
    }

    public Conta (double s) {
        this(s, -500);
    }

    public Conta (double s, double l) {
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
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
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
