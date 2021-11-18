package practice.command;

public class RemoveMemberCommand implements Command{
private String email;
private String listname;
private EWSService reciver;
public RemoveMemberCommand(String email,String listname,EWSService service){
    this.email=email;
    this.listname=listname;
    this.reciver=service;
}
    @Override
    public void execute() {
reciver.removeMember(email,listname);
    }
}
