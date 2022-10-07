

public class Investimento extends Conta implements DadosDaConta {
    public Investimento(Double saldo) {
        super(saldo);
    }

    @Override
    public void setSaldo(Double saldo) {
        super.setSaldo(saldo);
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    public Double taxaSelic() {
        return getSaldo() * 0.0078;
    }


    @Override
    public void consultarSaldo() {
        System.out.println("saldo Atual: " + getSaldo());
    }


    @Override
    public void depositarDinheiro(Integer a) {
        if (a>0){
            super.depositarDinheiro(a);
            System.out.println("rentabilidade mensal: " + taxaSelic() + " ao mes");
        }



    }

    @Override
    public void depositarCheque(Double a) {
        if (a>0){
            super.depositarCheque(a);
            System.out.println("rentabilidade mensal: " + taxaSelic() + " ao mes");
        }

    }

    @Override
    public void sacar(Double a) {
        if (a>0){
            System.out.println("taxa de operação: " + gerarTaxa());
        }
    }

    @Override
    public Double gerarTaxa() {
        return 0.0038;
    }

    @Override
    public void dadosConta() {
        consultarSaldo();
    }
}
