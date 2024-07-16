import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        DecimalFormat df = new DecimalFormat("#.##");

        String base_code = "", target_code = "";
        double cantidad = 0.0;

        while(true){
            int opcion = 0;
            System.out.println("""
                Pulse la opción que desea realizar:      \s
                1. De Dolares a Euros.               2. De Euros a Dolares.
                3. De Dolares a Pesos Mexicanos.     4. De Pesos Mexicanos a Dolares.
                5. De Dolares a Real Brasileño.      6. De Real Brasileño a Dolares.
                7. De Dolares a Pesos Argentinos.    8. De Pesos Argentinos a Dolares.
                9. Salir.             \s
               \s""");
            try {
                opcion = Integer.parseInt(consola.nextLine());
                if (opcion >= 1 && opcion <= 9){
                    switch (opcion) {
                        case 1:
                            base_code = "USD";
                            target_code = "EUR";
                            break;
                        case 2:
                            base_code = "EUR";
                            target_code = "USD";
                            break;
                        case 3:
                            base_code = "USD";
                            target_code = "MXN";
                            break;
                        case 4:
                            base_code = "MXN";
                            target_code = "USD";
                            break;
                        case 5:
                            base_code = "USD";
                            target_code = "BRL";
                            break;
                        case 6:
                            base_code = "BRL";
                            target_code = "USD";
                            break;
                        case 7:
                            base_code = "USD";
                            target_code = "ARS";
                            break;
                        case 8:
                            base_code = "ARS";
                            target_code = "USD";
                            break;
                        case 9:
                            System.out.println("Programa finalizado.");
                            return;
                    }
                    System.out.println("Introduzca el monto que desea convertir:");
                    cantidad = Double.valueOf(consola.nextLine());

                    Moneda moneda = consulta.convertir(base_code, target_code, cantidad);
                    System.out.println("El monto " + cantidad + "[" + base_code + "] convertido es " +
                            df.format(moneda.conversion_result()) + "[" + target_code + "]." );
                }else {
                    System.out.println("Esta opción no es válida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Opción no correcta, introduzca un número tipo entero.");
                System.out.println(e.getMessage());
            }
        }

    }
}
