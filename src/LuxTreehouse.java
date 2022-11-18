

public class LuxTreehouse extends Treehouse{

    public LuxTreehouse(int rooms){
        super(rooms);
        System.out.println("lux treehouse created");
    }

    public static void main(String[] args) {
        LuxTreehouse jordansLuxTreehouse = new LuxTreehouse(25);

//        jordansLuxTreehouse.windows = 50;
    }
}
