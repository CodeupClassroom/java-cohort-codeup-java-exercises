package InhertanceAndPolymorphism;

public class SuperHero extends Person{

    private String alterEgo;

    public SuperHero(String superHeroName, String alterEgo){
        super(superHeroName);
        this.alterEgo = alterEgo;
    }

//    public SuperHero(String superHeroName, String favoriteFood, String alterEgoName){
//        super(superHeroName, favoriteFood);
//        this.alterEgo = alterEgoName;
//    }

//    public SuperHero(int superHeroAge){
//        super(superHeroAge);
//    }



    public String getName(){
        return alterEgo;
    }

    public String getSecretIdentity(){
        return super.getName();
    }

    public static void main(String[] args) {

        SuperHero k = new SuperHero("clark kent", "superman");

//        SuperHero h = new SuperHero("hal Gordon", "green lantern");






//        System.out.println("[SuperHero Class] superhero K's name is:" + k.name + " alterego is: " + k.alterEgo);
//        k.sayHello();

        System.out.println("[SuperHero Class] getName-> " + k.getSecretIdentity());
    }
}
