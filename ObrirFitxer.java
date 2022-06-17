import java.io.File;
import java.util.Scanner;
class ObrirFitxer {
    public static void main(String[] args) {
        ObrirFitxer programa = new ObrirFitxer();
        programa.inici();
    }
    public void inici() {

        int max = 10;
        double numeroMesGran = Integer.MIN_VALUE;
        double[] nombres = new double[max];
        System.out.println(System.getProperty("user.dir"));
        try {
            File f = new File("reals.txt");
            Scanner input = new Scanner(f);
            System.out.println("Fitxer obert correctament.");

            for (int i = 0; i < max; i++) {
                nombres[i] = input.nextDouble();
            }
            input.close();

            for (int i = 0; i < max; i++) {
                System.out.println("Posicio: " + i + " = " + nombres[i]);
                if (nombres[i] > numeroMesGran) {
                    numeroMesGran = nombres[i];
                }
            }
            System.out.println("El nombre mes gran es: " + numeroMesGran);

        } catch (Exception e) {
            System.out.println("S'ha prdouit un error " + e);
        }

    }
}
