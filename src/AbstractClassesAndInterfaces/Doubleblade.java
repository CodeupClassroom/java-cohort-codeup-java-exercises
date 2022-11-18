package AbstractClassesAndInterfaces;

public class Doubleblade extends Lightsaber {
    public String absorb(){
        return "absorbing energy with 2 blades";
    }

    public static void main(String[] args) {
        Doubleblade dbl = new Doubleblade();
        dbl.color = "blue";

        System.out.println(dbl.absorb());
        System.out.println(dbl.color);
    }
}
