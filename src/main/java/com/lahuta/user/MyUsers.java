package main.java.com.lahuta.user;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyUsers {
    public static Collection<User> createUsers() {
        Collection<User> collection = Arrays.asList(
                new User("Vasya", 16, "Dnipro"),
                new User("Petya", 23, "Dnipro"),
                new User("Helen", 42, "Lutsk"),
                new User("Helen", 92, "Chernigiv"),
                new User("Sergiy", 5, "Kyiv"),
                new User("Maryna", 32, "Kyiv"),
                new User("Ivan Ivanovych", 69, "Lviv"));

        List<User> list1 = collection.stream().filter((user) -> user.getAge() > 40).collect(Collectors.toList());
        System.out.println("Task 1" + "\n---------------------------------");
        System.out.println("1.1. Users oldest 40 ");
        System.out.println(list1 + "\n---------------------------------");

        List<User> list2 = collection.stream().filter((user) -> user.getAge() < 50 &&
                user.getCity().equals("Dnipro")).collect(Collectors.toList());
        System.out.println("1.2. Users jungest 50 from Dnipro ");
        System.out.println(list2 + "\n---------------------------------");

        Double list3 = collection.stream().filter(user -> user.getCity().
                equals("Lviv")).collect(Collectors.averagingInt(User::getAge));
        System.out.println("1.3. The average age of users from Lviv: " + list3
                + "\n---------------------------------");

        long list4 = collection.stream().filter(user -> !user.getCity().
                equals("Kyiv")).count();
        System.out.println("1.4. Not from Kyiv users: " + list4 + "\n---------------------------------");

        List<User> list5 = collection.stream().sorted(Comparator.comparingInt(User::getAge)).limit(3).
                collect(Collectors.toList());
        System.out.println("1.5. Sort by age; first three users ");
        System.out.println(list5 + "\n---------------------------------");

        return collection;
    }
}