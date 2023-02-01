public class App {
    // public static final int gamma = 10;

    static double rumus(double a, double b) {
        double gamma = (a - b) / (a + b);
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * (a * b) * Math.cos(gamma));

        return c;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Sukma Hidayatullah");
        System.out.println("NIM : 0110221165");

        System.out.println("Hasil dari c = " + rumus(10, 8));
    }

}
