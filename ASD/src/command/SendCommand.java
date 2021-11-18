package practice.command;

public class SendCommand implements Command{
private String listname;
private String content;
private EWSService reciver;
public SendCommand(String listname, String content, EWSService service){
    this.content=content;
    this.listname=listname;
    this.reciver=service;
}
    @Override
    public void execute() {
reciver.sendEmail(listname,content);
    }
}
