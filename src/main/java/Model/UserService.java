package Model;

public class UserService {
    private static User user1 = new User("Amir", "Amir Khubeev", "878787878", "42r2gfg24");
    private static User user2 = new User("Vladislav", "Vladislav Stashkov", "234794894", "3r21gg9");
    private static User user3 = new User("Arina", "Arina Amirova", "3716418547", "ctg43f323f");

    public static String[] getUsers() {
        String[] users = {user1.getName(), user2.getName(), user3.getName()};
        return users;
    }
}
