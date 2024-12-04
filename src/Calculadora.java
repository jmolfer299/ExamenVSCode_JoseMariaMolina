public class Calculadora{
    public static void main(String[] args) {
        int opcion;
        double num1, num2, resultado;

        System.out.println("Calculadora básica");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese la opción: ");
        opcion = scanner.nextInt();

        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("La suma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("La resta es: " + resultado);
                break;
            default:
                System.out.println("Opción no válida");
            scanner.close();
        }
    }
}