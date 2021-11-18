package practice.command;

public class AddMemberCommand implements Command{

    private String emailAddress;
    private String listName;
    private  EWSService reciever;
    public AddMemberCommand(String emailAddress, String listName, EWSService service){
        this.emailAddress=emailAddress;
        this.listName=listName;
        this.reciever=service;
    }
    @Override
    public void execute() {
reciever.addMember(emailAddress,listName);
    }
}
