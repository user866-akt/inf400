package Model;

public class User {

    private String nickName;
    private String name;
    private String telephone;
    private String password;

    public User() {}

    public User(String nickName, String name, String telephone, String password) {
        this.nickName = nickName;
        this.name = name;
        this.telephone = telephone;
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }
    public String getName() {
        return name;
    }
    public String getTelephone() {
        return telephone;
    }
    public String getPassword() {
        return password;
    }

    public void  setNickName(String nickname) {
        this.nickName = nickname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
