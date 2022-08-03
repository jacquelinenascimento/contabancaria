/**
 * Conta
 */
public class Conta {

    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;

    //métodos especiais
    public Conta(int n, String t, String d, float s, boolean st) {
        this.setSaldo(0);
        this.setStatus(false);


    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //métodos personalizados

    public void abrirConta() {
        this.setStatus(true);
        if (this.setTipoConta() == "CC") {
            this.setSaldo(50);
        } else if (this.setTipoConta() == "CP"){
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
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Conta inativa, impossível realizar o depósito.");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
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
        System.out.println("Tipo da conta:" + this.getTipoConta());
        System.out.println("Número da conta:" + this.getNumConta());
        System.out.println("Titular da conta:" + this.getDono());
        System.out.println("Saldo da conta:" + this.getSaldo());
        System.out.println("Status da conta:" + this.getStatus());
    }
    
}
