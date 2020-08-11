public class TesteArrayReferencia2 {

    public static void main(String[] args) {

        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(11, 22);
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22,22);
        contas[1] = cc2;

        System.out.println(contas[1].getNumero());

        ContaPoupanca ref = (ContaPoupanca) contas[1];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());

    }
}
