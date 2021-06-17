package nivell2;

public class Fase1 {
    public static void main(String[] args) {
        int alturaTriangle = 5;
        for (int i = 1; i <= alturaTriangle; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
