public class CodeRunner {

    public static void main(String[] args) {


        Person ronaldMcDonald = new Person("Ronnie D", 66, 123987456);


        ronaldMcDonald.sayHi();
        System.out.println("ronaldMcDonald.name = " + ronaldMcDonald.name);

        System.out.println("ronaldMcDonald.age = " + ronaldMcDonald.age);

        System.out.println(ronaldMcDonald.getSocialNum());


//        System.out.println("ronaldMcDonald.socialNum = " + ronaldMcDonald.socialNum);

        System.out.println("ronaldMcDonald.name = " + ronaldMcDonald.name);
    }
}
