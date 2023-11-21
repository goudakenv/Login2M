package domain;

public class Message {
    private String username;
    private String name;
    private String messageText;

    public Message(String username, String name,String messageText) {
        this.username = username;
        this.name = name;
        this.messageText = messageText;
    }

    public String getUsername() {
        return username;
    }
    
    public String getName() {
        return name;
    }

    public String getMessageText() {
        return messageText;
    }
}
