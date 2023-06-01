package Mail;

public class MailMessage implements CommonMessage{
    private String messageFrom;
    private String messageTo;
    private String messageContent;


    public MailMessage(String messageFrom, String messageTo, String messageContent) {
        this.messageFrom = messageFrom;
        this.messageTo = messageTo;
        this.messageContent = messageContent;
    }

    public String getFrom() {
        return messageFrom;
    }

    public String getTo() {
        return messageTo;
    }

    public String getContent() {
        return messageContent;
    }
}
