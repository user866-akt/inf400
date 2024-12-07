package Model;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println(Arrays.toString(UserService.getUsers()));

        User[] users = UserService.getListUser();

        Message[] messages = MessageService.createMessages(users);

        for (int i = 0; i < messages.length; i++) {
            System.out.println("Отправитель: " + messages[i].getSender().getName() + "\nПолучатель: " + messages[i].getRecipient().getName() + "\nСообщение: " + messages[i].getText() + "\nДата и время: " + messages[i].getDateTime() + "\n");
        }
    }
}
