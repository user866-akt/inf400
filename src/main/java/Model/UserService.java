package Model;

public class UserService {
    private User user1 = new User("Amir", "Amir Khubeev", "878787878", "42r2gfg24");
    private User user2 = new User("Vladislav", "Vladislav Stashkov", "234794894", "3r21gg9");
    private User user3 = new User("Arina", "Arina Amirova", "3716418547", "ctg43f323f");

    public static User[] getUsers() {
        User[] users = {user1, user2, user3};
        return users;
    }
}
