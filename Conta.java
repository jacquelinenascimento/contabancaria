
/**
 * Conta
 */
public class Conta {
    public String numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //métodos especiais
    
    public Conta(String c, String t, String d, float s, Boolean st) {
        this.setSaldo(0);
        this.setStatus(false);
    } 

    public String getNumConta() {
        return this.numConta;
    }

    public void setNumConta(String c) {
        this.numConta = c;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean st) {
        this.status = st;
    }

    //métodos personalizados

    public void abrirConta() {
        this.setStatus(true);
        if (this.setTipo() == "CC") {
            this.setSaldo(50);
        } else if (this.setTipo() == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.setSaldo() > 0) {
            System.out.println("Não é possível encerrar por que há saldo na conta");
        } else if (this.setSaldo() < 0) {
            System.out.println("O saldo está negativo, não é possível encerrar a conta.");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus(true)) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Conta inativa, impossível realizar o depósito.");
        }
    }

    public void sacar(float v) {
        if (this.getStatus(true)) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente - Não foi possível realizar o saque.");
            }
        } else {
            System.out.println("Conta inativa - Não foi possível realizar o saque.");
        }
    }

    public void print() {
        System.out.println("--------------- CONTA -------------");
        System.out.println("Tipo da conta:" + this.getTipo());
        System.out.println("Número da conta:" + this.getNumConta());
        System.out.println("Titular da conta:" + this.getDono());
        System.out.println("Saldo da conta:" + this.getSaldo());
        System.out.println("Status da conta:" + this.getStatus());
    }


}