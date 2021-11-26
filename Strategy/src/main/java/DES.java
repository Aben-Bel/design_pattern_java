public class DES implements Encryption {
    public String encrypt(String message) {
        return "Encrypted message using DES: " + message;
    }

    public String decrypt(String message) {
        return "Decrypted message using DES: " + message;
    }
}
