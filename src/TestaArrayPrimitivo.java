public class TestaArrayPrimitivo {

    public static void main(String[] args) {

        // Bem primitivo, bem baixo nivel...
        // Usaremos muito pouco array
        String[] nome = new String[4];

        int[] idades = new int[5];

        idades[0]= 29;
        idades[1] = 22;
        idades[2] = 23;
        idades[3] = 24;
        idades[4] = 45;

        System.out.println(idades[0]);
        System.out.println(idades.length);

    }

}
