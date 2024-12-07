package Model;

public class MessageService {
    private Message[] messages;
    public Message send(User sender, User recipient, String message) {
        Message result = new Message(sender, recipient, message, "2024-12-07 10:25");
        return result;
    }
    public Message[] createMessages(User[] users){
        messages = new Message[4];
        messages[0] = send(users[0], users[1], "First message");
        messages[1] = send(users[1], users[2], "Second message");
        messages[2] = send(users[2], users[0], "Third message");
        return messages;
    }
}
