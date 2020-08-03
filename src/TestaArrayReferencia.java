public class TestaArrayReferencia {

    public static void main(String[] args) {

        // Criando array do tipo ContaCorrente de 5 posicoes
        ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente CC1 = new ContaCorrente(22, 11);

        contas[0] = CC1;

        ContaCorrente cc2 = new ContaCorrente(22, 22);

        contas[1] = cc2;

        System.out.println(contas[0].getNumero());
        System.out.println(contas[1].getNumero());
        System.out.println(contas[2].getNumero()); //NullPointerException

        ContaCorrente ref = contas[1];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());

    }
}
