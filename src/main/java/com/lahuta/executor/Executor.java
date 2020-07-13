package main.java.com.lahuta.executor;

import main.java.com.lahuta.numbers.RandomNumbers;
import main.java.com.lahuta.user.MyUsers;

public class Executor {
    public static void StartApp() {
        MyUsers.createUsers();
        RandomNumbers.createRandomNambers();
    }
}