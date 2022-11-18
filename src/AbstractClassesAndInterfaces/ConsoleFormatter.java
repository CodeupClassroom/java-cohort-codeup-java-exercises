package AbstractClassesAndInterfaces;

public class ConsoleFormatter implements Formatter{
    public String display(User user){
        return "--------------------" +
                "\n  name:  " + user.getName() +
                "\n  email: " + user.getEmail();
    }


    public static void main(String[] args) {
        Formatter fmt = new ConsoleFormatter();

        User matt = new User("Matt", "email@email.com");
//        matt.name = "Matt";
//        matt.email = "mattemail@email.com";

//        matt.setName("Matt");

//        System.out.println(matt.name);
//// ...
        System.out.println(fmt.display(matt));
//// ...
//        for (User user : searchResults) {
//            fmt.display(user);
//        }
    }
}
