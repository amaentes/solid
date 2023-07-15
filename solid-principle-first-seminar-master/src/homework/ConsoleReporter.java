package homework;

public class ConsoleReporter implements Reporter{
    private final User user;

    public ConsoleReporter(User user){
        this.user = user;
    }

    @Override
    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}