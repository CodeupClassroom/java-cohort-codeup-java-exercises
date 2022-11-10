import static java.lang.Integer.parseInt;

public class MethodsLecture {

     public static void singASong(String what, String where){
         System.out.printf("The %s at night are big and bright deep in the heart of %s%n", what, where);
     }

     public static int addNums(int x, int y, int z){
         return x + y + z;
     }

     public static double addNums(double x, double y, double z){
         return x + y + z;
     }

     public static int addNums(String x, String y, String z){
         return parseInt(x) + parseInt(y) + parseInt(z);
     }

     public static void addNums(){
         System.out.println("Woops - no nums given!");
     }

    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
    }

    public static void main(String[] args) {
        singASong("bars", "New Orleans");
        singASong("casinos", "New Vegas");

        String starsStringVar = "stars";
        String texasNameVar = "Texas";

        singASong(starsStringVar, texasNameVar);
//
        System.out.println("addNums(2, 4, 6) = " + addNums(2, 4, 6));

        System.out.println("addNums(2.2, 4.2, 6.2) = " + addNums(2.2, 4.2, 6.2));

        System.out.println("addNums(\"4\", \"10\", \"100\") = " + addNums("4", "10", "100"));

        addNums();

//        public static void changeString(String s) {
//            s = "Wub a lub a dub dub";
//        }

        String rickOrMorty = "burpppppppp";

        changeString(rickOrMorty);

        System.out.println("rickOrMorty = " + rickOrMorty);

    }

}
