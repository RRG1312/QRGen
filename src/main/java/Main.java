import javax.swing.*;
import java.util.Scanner;
/*
Programa para la generacion de QR y almacenado en formato png para posterior uso, en caso de necesitar de una creacion
continua de QR simplemente hayq ue modificar el codifo de la clase QRCodeGeneratorGUI al gusto, en este punto tan solo
pide una vez texto y crea una imagen, la cual se almacena de manera relativa en la ruta /resources del proyecto.

Espero que te sea util :)
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime un texto/link/lo que te de la gana para crear un qr y pulsa enter:");

        SwingUtilities.invokeLater(() -> {
            String text = keyboard.nextLine();
            QRCodeGeneratorGUI qrGenerator = new QRCodeGeneratorGUI(text);
            qrGenerator.setVisible(true);
        });
    }
}
