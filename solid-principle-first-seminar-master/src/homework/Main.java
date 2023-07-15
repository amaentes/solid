package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        
        Persister persister = new DatabasePersister(user);
        persister.save();
        
        Reporter reporter = new ConsoleReporter(user);
        reporter.report();
    }
}