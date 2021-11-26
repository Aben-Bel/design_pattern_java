public class ChatClient {
    public void send(String message, Encryption e){
        System.out.println(message + " >> "+ e.encrypt(message));
    }
}
