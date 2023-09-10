import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime un texto/link/lo que te de la gana para crear un qr y pulsa enter:");
        SwingUtilities.invokeLater(() -> {
            String text = keyboard.nextLine(); // Reemplaza esto con el texto que desees codificar
            QRCodeGeneratorGUI qrGenerator = new QRCodeGeneratorGUI(text);
            qrGenerator.setVisible(true);
        });
    }
}
