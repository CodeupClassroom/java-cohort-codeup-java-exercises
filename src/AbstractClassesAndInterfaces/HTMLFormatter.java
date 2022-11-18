package AbstractClassesAndInterfaces;

public class HTMLFormatter implements Formatter{
 public String display(User user){
     return String.format(
             "<div class=\"user\"><h2>%s(%s)</h2></div>",
             user.getName(), user.getEmail()
     );
 }

    public static void main(String[] args) {
        HTMLFormatter htmlFmt = new HTMLFormatter();

        User jeff = new User("Jeff", "jeff@email.com");

        System.out.println(htmlFmt.display(jeff));

    }
}
