package main.java.com.lahuta.executor;

import main.java.com.lahuta.numbers.RandomNumbers;

import static main.java.com.lahuta.user.MyUsers.*;

public class Executor {
    public static void StartApp() {
        createUsers();
        showUsersAfterForty(createUsers(), 40);
        showUsersUnderFiftyFromDnipro(createUsers(), 50, "Dnipro");
        showAvarageAgeFromLviv(createUsers(), "Lviv");
        showUsersNotFromKyiv(createUsers(), "Kyiv");
        showFirstThreeUsersByAge(createUsers(), 3);
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.showRandomValues();
        randomNumbers.ShowMinValues();
        randomNumbers.ShowMaxValue();
        randomNumbers.showMultipelsValues(2);
        randomNumbers.showIncreaseValue(10);
    }
}