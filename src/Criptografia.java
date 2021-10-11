public class Criptografia {
    private String textoCifrado;

    public Criptografia(){
        this.textoCifrado = "";
    }

    public String encriptar(String frase, int id){
        for(int i = 0; i < frase.length(); i++){
            this.textoCifrado += encrypt(frase.charAt(i), id);
        }
        return this.textoCifrado;
    }

    public char encrypt(char charOriginal, int id){
        char charCifrado;

        if(charOriginal >= 97 && charOriginal <= 122) {
            charCifrado = (char) ((charOriginal - 97 + id) % 26 + 97);
        } else if (charOriginal >= 65 && charOriginal <= 90) {
            charCifrado = (char) ((charOriginal - 65 + id) % 26 + 65);
        } else {
            charCifrado = charOriginal;
        }
        return charCifrado;
    }
}
