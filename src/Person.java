public class Person {
    //Filled out a character sheet before?
    //DND, otherwise? What were some common things?
    //Name
    //Hair color
    //Age

    //So far our blueprint doesn't have an area our users can use to CREATE a Person with a NAME, CLASS, or AGE

    //Let's change that:
    //Set up our first variable fields:
    public String name;
    String hairColor;
    protected int age;


    private int socialNum;

    //Got a private field? Provide access TODAY with a PUBLIC method! :D

    public int getSocialNum() {
        return this.socialNum;
    }


    //Okay: Let's set up a method as a field as well
    public void sayHi() {
//        System.out.printf("Hey it's %s! They're %d years old", name, age);

        System.out.println("Hey it's " + this.name + "! ! They're " + this.age + " years old! !");
    }

    //To 'make' an instance of a person object, we need a CONSTRUCTOR [method]
//    public Person(){
//
//    };

    //Our constructor was cool and all - but what if we can configure it in some way for our purposes?

    public Person() {

    }

    public Person(String name) {
//        this.name = parameterName; //THIS instance of a PERSON'S NAME is set to the incoming parameter labeled name

        this(name, 0);

        System.out.println("Congratulations - a new person was born! Their name is " + this.name);
    }

    //Scenario: We need to CREATE A PERSON OBJECT, but WE DO NOT KNOW THE AGE yet - how can this(constructor) [calling a constructor with this] help us?

    public Person(String name, int age) {
        //Default age to give would be 0 for our application [0 meaning unknown]

        this.name = name;
        this.age = age;

        System.out.println("This one is firing off - constructor with 'age' parameter");
    }

    public Person(String name, int age, int socialNum) {
        //Default age to give would be 0 for our application [0 meaning unknown]

        this.name = name;
        this.age = age;
        this.socialNum = socialNum;

        System.out.println("This one is firing off - constructor with 'age' parameter");
    }

    //Let's try out this calling a constructor inside of itself


    //Static vs instance
    //Instance. . variables / methods . . have unique and individual data that comprise the object's result
    //PersonX.name = "Jimmy John";
    //PersonY.name = "Ronald McDonald";
    //PersonZ.name = "Wendy Wenderson";

    //Static - BELONG TO THE CLASS, vs AN INSTANCE OF THE CLASS

    //Let's say that we set up a field to represent the "world population" of PERSONS
    //Answer this question: Would that field be INSTANCED [owned by 'a' person'] or is not unique and owned by a person [non-instanced]

    static long worldPopulation = 7_999_512_370L;


    public static void main(String[] args) {
        //Okay - I have FIELDS [NAME, HAIRCOLOR, AGE]

        //I have a "default constructor" [blank constructor]

        //Now what?

        //You've seen a bit of this:
        //Scanner mcScannerFace = new Scanner(etc.)

        //Instantiated a NEW PERSON OBJECT [with a variable name of kenneth]
        Person kenneth = new Person();

        //Assigned the fields with dot-notation:
        kenneth.name = "Kenneth Howell";
        kenneth.hairColor = "brown-ish";
        kenneth.age = 34;

        System.out.println("kenneth.name = " + kenneth.name);

        System.out.println("kenneth.hairColor = " + kenneth.hairColor);

        System.out.println("kenneth.age = " + kenneth.age);

        kenneth.sayHi();

        Person kevin = new Person();

        kevin.name = "Kevin Powell";
        kevin.hairColor = "black-ish";
        kevin.age = 43;

        System.out.println("~ ~ ~ This is Kevin below ~ ~ ~");

        System.out.println("kevin.name = " + kevin.name);

        System.out.println("kevin.hairColor = " + kevin.hairColor);

        kevin.sayHi();

        //This won't work -  Person.name

        //This will work: BUT CAUTION; NOT UTILIZING STATIC CORRECTLY System.out.println(kenneth.worldPopulation);

        System.out.println("Person.worldPopulation = " + Person.worldPopulation);

        //Real world example:
        System.out.println("Math.PI = " + Math.PI);

        //When we first accessed the math class, we DID NOT do Math kensMath = new Math(); [I do NOT own my own INSTANCE of math - it is a universal language]

        //Instead, we accessed some of the STATIC fields from math

        System.out.println("Math.round(44.44) = " + Math.round(44.44));

        System.out.println("Math.PI + Math.PI = " + Math.PI + Math.PI);

        System.out.println("Math.max(24L, 500L) = " + Math.max(24L, 500L));

        //Let's run through a use of static and instanced fields: a PERSON is BORN [new Person created], and we need to ADD ONE to our static field
        System.out.println("Before the return of Ross = " + Person.worldPopulation);

        Person favoritePainter = new Person();

        favoritePainter.name = "Bob Ross";

        Person.worldPopulation++;

        System.out.println("After the return of Bob Ross = " + Person.worldPopulation);

//Constructor talk - we added a SOUT message into our constructor, let's see what happens:
        System.out.printf("%n%n%n%n%n");

        Person danny = new Person("Danny");
        Person riley = new Person("Riley", 26);
        Person matthew = new Person("Matthew");

        System.out.printf("Hey y'all I made three people: %s, %s, %s! That was cool eh?%n", danny.name, riley.name, matthew.name);

        System.out.printf("%n%n%n%n");

        System.out.println(danny.age + "? Do I know how old riley is? + " + riley.age);

        Person kennyKen = new Person("Mid-thirties Ken", 34);

        System.out.println(kennyKen.age + " is how old kennyKen is. We expect this to be 34 from using our constructor");


        Person ronaldMcDonald = new Person("Ronnie D", 66, 123987456);

        //IN CLASS - private is accessible
        System.out.println("ronaldMcDonald.socialNum = " + ronaldMcDonald.socialNum);

    }


//Next time on OOP-Z ;
    //THE PILLARS:
    //HOW DO I REMEMBER THEM?
    //"What do I want to have for lunch?"
    //"APIE!"
    //Abstract
    //Polymorphism
    //Inheritance
    //Encapsulation

}


