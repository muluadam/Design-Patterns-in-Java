package practice.command;

public class EWSService {
    public void addMember(String email, String group){
        System.out.println("Adde "+email+" to "+group);


    }
    public void removeMember(String contact, String group){
        System.out.println("removed "+contact+" from "+group);
    }

    public void sendEmail(String listName, String content){
        System.out.println(content +" sent to "+ listName);
    }

}
