public class House {

    // properties
    public int rooms;
    public boolean hasGarage;
    protected int windows;
    public String color;
    public boolean hasRoof;
    public int bathrooms;


    //constructors
    public House(){
        System.out.println("empty house created");
    }

    public House(int rooms){
        this.rooms = rooms;
        System.out.println("house created");
    }

    public House(int numBathrooms, boolean doesItHaveARoof, String colorOfHouse){
        this.bathrooms = numBathrooms;
        this.hasRoof = doesItHaveARoof;
        this.color = colorOfHouse;
        System.out.println("new house created with: " + numBathrooms + " num of bathrooms ...");
    }


// getters and setters - methods specific to GETTING (and returning) a value and SETTING a value
    private int getWindows(){
        return this.windows;
    }

    private void setWindows(int numWindows){
        this.windows = numWindows;
    }


    // actions // methods
    public static void protectHumans(){

    }

    public static void shelter(){
        System.out.println("sheltering");
    }


    // GO in the class, it's the starting point
    public static void main(String[] args) {
        House laurasDreamHouse = new House(8);

        House dustinsDreamHouse = new House(3, true, "light blue");

        dustinsDreamHouse.windows = 9;
        // dustinsDreamHouse.hasSlide = false; // not available because hasSlide is only available in the child class

        System.out.println(laurasDreamHouse.rooms);
        System.out.println(dustinsDreamHouse.rooms);
    }
}



//let myObj = {
//        color: ,
//        numRooms: ,
//        shelter: function(){
//
//        }
//}
//
//newMyObj = {
//        color: "blue",
//        numRooms: 2,
//        shelter: function(){
//
//        }
//        }
