


public class Conta implements OperacaoBancaria {
    private Double saldo;



    public Conta(Double saldo) {
        setSaldo(saldo);

    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }


    @Override
    public void sacar(Double a) {
        if (saldo >= a) {
            saldo -= a;
            if (saldo>0){
                saldo -= gerarTaxa();
            }
            System.out.println("Sacado: " + a);
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }

    @Override
    public void depositarDinheiro(Integer a) {
        if (a > 0){
            saldo += a;
            System.out.println("Depositado: " + a);
            System.out.println("Novo saldo: " + saldo + "\n");
        }
    }

    @Override
    public void depositarCheque(Double a) {
        if (a>0){
            saldo += a;
            System.out.println("Depositado: " + a);
            System.out.println("Novo saldo: " + saldo + "\n");
        }
        else {
            System.out.println("deposite um valor valido!");
        }
    }


    public Double gerarTaxa() {
        return 0.0;
    }
}



