public class Treehouse extends House{

    public boolean hasSlide;

    public Treehouse(int rooms){
        super(rooms);
    }

    public static void main(String[] args) {
        Treehouse laurasAwesomeTreehouse = new Treehouse(7);

        laurasAwesomeTreehouse.shelter();

        laurasAwesomeTreehouse.hasSlide = true;
        laurasAwesomeTreehouse.windows = 25;

        System.out.println(laurasAwesomeTreehouse.hasSlide);

    }


}
