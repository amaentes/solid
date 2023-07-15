package homework;

public class DatabasePersister implements Persister{
    private final User user;

    public DatabasePersister(User user){
        this.user = user;
    }

    @Override
    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
