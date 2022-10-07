


public class Poupanca extends Conta implements DadosDaConta {


    public Poupanca(Double saldo) {
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

    public Double rentabilidadePorJuros() {
        return getSaldo() * 0.01;
    }


    @Override
    public void consultarSaldo() {
        System.out.println("saldo Atual: " + getSaldo());
    }


    @Override
    public void depositarDinheiro(Integer a) {
        super.depositarDinheiro(a);
        System.out.println("rentabilidade mensal: " + rentabilidadePorJuros() + " ao mes");


    }

    @Override
    public void depositarCheque(Double a) {

        if (a>0){
            super.depositarCheque(a);
            System.out.println("rentabilidade mensal: " + rentabilidadePorJuros() + " ao mes");
        }


    }

    @Override
    public void sacar(Double a) {
        if (a>0){
            super.sacar(a);
            System.out.println("taxa de operação: " + gerarTaxa());
        }
    }

    @Override
    public Double gerarTaxa() {
        return 0.0;
    }

    @Override
    public void dadosConta() {
        consultarSaldo();
    }
}
