package Model;

public class MessageService {
    public static Message send(User sender, User recipient, String message) {
        Message result = new Message(sender, recipient, message, "2024-12-07 10:25");
        return result;
    }
    public static Message[] createMessages(User[] users){
        Message[] messages = new Message[3];
        messages[0] = send(users[0], users[1], "First message");
        messages[1] = send(users[1], users[2], "Second message");
        messages[2] = send(users[2], users[0], "Third message");
        return messages;
    }
}
