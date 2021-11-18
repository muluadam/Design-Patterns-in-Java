package practice.command;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        /**
         *
         */

        EWSService service= new EWSService();
        Command c1= new AddMemberCommand("a@a.com","spam",service);
        Command c2= new AddMemberCommand("b@b.com","spam",service);
        Command c3= new SendCommand("CS Students","Welcome",service);
        Command c4= new RemoveMemberCommand("b@b.com","spam",service);
        MailTaskRunner.getInstance().addCommand(c1);
        MailTaskRunner.getInstance().addCommand(c2);
        MailTaskRunner.getInstance().addCommand(c3);
        MailTaskRunner.getInstance().addCommand(c4);

        Thread.sleep(3000);
        MailTaskRunner.getInstance().shutdown();


    }
}
