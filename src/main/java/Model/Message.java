package Model;

public class Message {

    private String sender;
    private String recipient;
    private String text;
    private String dateTime;

    public Message(String sender, String recipient,String text, String dateTime) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.dateTime = dateTime;
    }


}
