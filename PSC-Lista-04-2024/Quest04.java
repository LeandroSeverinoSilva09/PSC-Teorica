public class Quest04 {
    public static void main(String[] args) {

        double popA = 80000;
        double taxaA = 0.03;
        double popB = 200000;
        double taxaB  = 0.015;

        int anos = 0;

        while (popA < popB) {
            popA = popA + (popA * taxaA);
            popB = popB + (popB * taxaB);
            anos ++;
        }

        System.out.println("O número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B é de:" + anos);

    }

}
