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
        return collection;
    }

    public static void showUsersAfterForty(Collection<User> collection, int age) {
        List<User> list1 = collection.stream().filter((user) -> user.getAge() > age).collect(Collectors.toList());
        System.out.println("Task 1" + "\n---------------------------------" + "\n1.1. Users oldest 40 ");
        System.out.println(list1 + "\n---------------------------------");
    }

    public static void showUsersUnderFiftyFromDnipro(Collection<User> collection, int age, String city) {
        List<User> list2 = collection.stream().filter((user) -> user.getAge() < age &&
                user.getCity().equals(city)).collect(Collectors.toList());
        System.out.println("1.2. Users under 50 from Dnipro ");
        System.out.println(list2 + "\n---------------------------------");
    }

    public static void showAvarageAgeFromLviv(Collection<User> collection, String city) {
        Double list3 = collection.stream().filter(user -> user.getCity().
                equals(city)).collect(Collectors.averagingInt(User::getAge));
        System.out.println("1.3. The average age of users from Lviv: " + list3
                + "\n---------------------------------");
    }

    public static void showUsersNotFromKyiv(Collection<User> collection, String city) {
        long list4 = collection.stream().filter(user -> !user.getCity().
                equals(city)).count();
        System.out.println("1.4. Not from Kyiv users: " + list4 + "\n---------------------------------");
    }

    public static void showFirstThreeUsersByAge(Collection<User> collection, int limit) {
        List<User> list5 = collection.stream().sorted(Comparator.comparingInt(User::getAge)).limit(limit).
                collect(Collectors.toList());
        System.out.println("1.5. Sort by age; first three users ");
        System.out.println(list5 + "\n---------------------------------");
    }
}