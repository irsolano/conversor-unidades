import java.util.Locale;
import java.util.Scanner;

public class ConversorUnidadesCli {

    private final ConversorUnidades conversor = new ConversorUnidades();
    private final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void iniciar() {
        System.out.println("=== Conversor de Unidades ===");
        System.out.println();
        System.out.println("1. Kilómetros a millas");
        System.out.println("2. Celsius a Fahrenheit");
        System.out.println("3. Kilogramos a libras");
        System.out.println("4. Centímetros a pulgadas");
        System.out.println("5. Salir");
        System.out.println();
        System.out.print("Seleccione una opción: ");

        int opcion = (int) leerNumero();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la cantidad de kilómetros: ");
                double km = leerNumero();
                System.out.printf(Locale.US, "%.2f kilómetros equivalen a %.2f millas%n",
                        km, conversor.convertirKilometrosAMillas(km));
                break;
            case 2:
                System.out.print("Ingrese la temperatura en grados Celsius: ");
                double c = leerNumero();
                System.out.printf(Locale.US, "%.2f grados Celsius equivalen a %.2f grados Fahrenheit%n",
                        c, conversor.convertirCelsiusAFahrenheit(c));
                break;
            case 3:
                System.out.print("Ingrese el peso en kilogramos: ");
                double kg = leerNumero();
                System.out.printf(Locale.US, "%.2f kilogramos equivalen a %.2f libras%n",
                        kg, conversor.convertirKilogramosALibras(kg));
                break;
            case 4:
                System.out.print("Ingrese la longitud en centímetros: ");
                double cm = leerNumero();
                System.out.printf(Locale.US, "%.2f centímetros equivalen a %.2f pulgadas%n",
                        cm, conversor.convertirCentimetrosAPulgadas(cm));
                break;
            case 5:
                System.out.println("Hasta pronto.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private double leerNumero() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor no válido, intente de nuevo: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}

