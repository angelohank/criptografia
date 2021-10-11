import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite a frase que deseja criptografar");

        Criptografia criptografia = new Criptografia();

        String fraseEncriptada = criptografia.encriptar(frase, 4);
        JOptionPane.showMessageDialog(null, fraseEncriptada);

        String fraseDesencriptada = criptografia.desencriptar(fraseEncriptada, 4);
        System.out.println(fraseDesencriptada);
    }
}
