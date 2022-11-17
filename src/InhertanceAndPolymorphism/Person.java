package InhertanceAndPolymorphism; // package it's living inside of

public class Person {
    protected String name;
    public int age;

    public String favoriteFood;

    public String color;

    public String logo;

//    public Person(){
//
//    }

    public Person(String name){
        this.name = name;
    }

//    public Person(String name, String favoriteFood){
//        this.name = name;
//        this.favoriteFood = favoriteFood;
//    }
//
//    public Person(String color, String logo ){
//        this.color = color;
//        this.logo = logo;
//    }



//    public Person(int age){
//        this.age = age;
//    }

    public void sayHello(){
        System.out.println("[Person Class] Hello from " + name + "!");
    };

    // returns name
    public String getName(){
        return name;
    }


    public static void main(String[] args) {
        Person a = new Person("Mario");
        a.sayHello();

        System.out.println("[Person Class] person a's name is: " + a.name);

//        Person abc = new Person("flash", "betty");


    }


}


// questions
//- could we use both Person classes
// - would I need to import the package of a class I'm tryint to access
