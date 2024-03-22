import static java.lang.Math.*;

public class Bhaskara {
    public static void main(String[] args) {
        calculateRoots(2, -7, 3);
    }

    static void calculateRoots(float a, float b, float c) {
        float delta = (b * b - 4 * a * c);
        System.out.println("delta = " + delta);

        if (delta >= 0) {
            double raiz_delta = sqrt(delta);
            int dois_vezes_a = (int) (2 * a);
            int b2 = (int) b;

            float x1 = (float) ((-b2 + raiz_delta) / dois_vezes_a);
            float x2 = (float) ((-b2 - raiz_delta) / dois_vezes_a);

            System.out.println("raiz delta = " + raiz_delta);
            System.out.println("dois vezes a = " + dois_vezes_a);
            System.out.println("bhaskara positivo = " + x1);
            System.out.println("bhaskara negativo = " + x2);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }
    }
}
