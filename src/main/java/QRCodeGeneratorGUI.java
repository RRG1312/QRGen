import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class QRCodeGeneratorGUI extends JFrame {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 300;

    public QRCodeGeneratorGUI(String text) {
        setTitle("Generador de Código QR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);

        try {
            // Crear una matriz de bits para el código QR
            BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, WIDTH, HEIGHT);

            // Convertir la matriz de bits en una imagen
            BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix);

            // Mostrar la imagen en un JLabel
            ImageIcon icon = new ImageIcon(qrImage);
            JLabel label = new JLabel(icon);
            add(label);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
