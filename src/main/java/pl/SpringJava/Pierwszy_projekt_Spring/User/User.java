package pl.SpringJava.Pierwszy_projekt_Spring.User;



import pl.SpringJava.Pierwszy_projekt_Spring.Console.MainFrame;

import java.time.LocalDateTime;

public class User {


    LocalDateTime UserTimestamp;
    private int[] UserConsoleTime= new int[5];

    public void setUserConsoleTime(int[] userConsoleTime) {
        UserConsoleTime = userConsoleTime;
    }

    public LocalDateTime getUserTimestamp() {
        return UserTimestamp;
    }

    public void setUserTimestamp(LocalDateTime userTimestamp) {
        UserTimestamp = userTimestamp;
    }

    public int[] getUserConsoleTime() {
        return UserConsoleTime;
    }
}
