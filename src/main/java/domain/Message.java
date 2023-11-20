package domain;

public class Message {
    private String username;
    private String messageText;

    public Message(String username, String messageText) {
        this.username = username;
        this.messageText = messageText;
    }

    public String getUsername() {
        return username;
    }

    public String getMessageText() {
        return messageText;
    }
}
