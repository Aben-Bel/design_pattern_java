public class AES implements Encryption {
    public String encrypt(String message) {
        return "Encrypted message using AES: " + message;
    }

    public String decrypt(String message) {
        return "Decrypted message using AES: " + message;
    }
}
