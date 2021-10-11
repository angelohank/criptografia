import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite a frase que deseja criptografar");

        Criptografia criptografia = new Criptografia();

        //System.out.println(criptografia.encriptar(frase, 1));
        String fraseEncriptada = criptografia.encriptar(frase, 4);
        JOptionPane.showMessageDialog(null, fraseEncriptada);
    }
}
