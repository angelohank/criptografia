public class Criptografia {
    private String textoCifrado;
    private String textoDecifrado;

    public Criptografia(){
        this.textoCifrado = "";
        this.textoDecifrado = "";
    }

    public String encriptar(String frase, int chave){
        for(int i = 0; i < frase.length(); i++){
            this.textoCifrado += encrypt(frase.charAt(i), chave);
        }
        return this.textoCifrado;
    }

    public char encrypt(char charOriginal, int chave){
        char charCifrado;

        if(charOriginal >= 97 && charOriginal <= 122) {
            charCifrado = (char) ((charOriginal - 97 + chave) % 26 + 97);
        } else if (charOriginal >= 65 && charOriginal <= 90) {
            charCifrado = (char) ((charOriginal - 65 + chave) % 26 + 65);
        } else {
            charCifrado = charOriginal;
        }
        return charCifrado;
    }

    public String desencriptar(String frase, int chave) {
        for(int i = 0; i < frase.length(); i++){
            this.textoDecifrado += decrypt(frase.charAt(i), chave);
        }
        return this.textoDecifrado;
    }

    public char decrypt(char charEncriptado, int chave) {
        char charDecifrado;

        if(charEncriptado >= 97 && charEncriptado <= 122) {
            charDecifrado = (char) ((charEncriptado - 97 - chave) % 26 + 97);
        } else if (charEncriptado >= 65 && charEncriptado <= 90) {
            charDecifrado = (char) ((charEncriptado - 65 - chave) % 26 + 65);
        } else {
            charDecifrado = charEncriptado;
        }
        return charDecifrado;
    }
}
