import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

// ‼️ note the imports

public class Collections {

    public static void main(String[] args) {

        // ARRAY LISTS

        // Array Lists Rules:
        // 1️⃣ can change size
        // 2️⃣ all elements must be objects
        // 3️⃣ all elements must be of the same data type

        // Array List Syntax:
//         ArrayList<data type here> nameOfArrayList = new ArrayList<>();
//        ArrayList<String> favoriteThanksgivingFoods = new ArrayList<>();
//        System.out.println(favoriteThanksgivingFoods);
//
//
//        // How to add elements to an ArrayList using the .add() methodliget
//        // syntax: nameOfArrayList.add(element we're adding)
//        favoriteThanksgivingFoods.add("bread rolls");
//        System.out.println(favoriteThanksgivingFoods);
//        favoriteThanksgivingFoods.add(0, "turkey");
//        System.out.println(favoriteThanksgivingFoods);
//        favoriteThanksgivingFoods.add("cranberry sauce");
//        System.out.println(favoriteThanksgivingFoods);

        // ❓❓ what would happen if we try to make an ArrayList off ints?

////        ArrayList<int> ints = new ArrayList<int>();
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(8);
//        numbers.add(10);
//        numbers.add(12);
//        numbers.add(14);
//        System.out.println(numbers);
//
//
//        // How to check the size of an ArrayList
////        System.out.println(numbers.size());
//
//        // How to return a  specific element
//        System.out.println(numbers.get(2));
//
//
//        // How to find the index of an element
//        System.out.println(numbers.indexOf(14));


        // HASH MAPS
        // ▶️ key:value pairs
        // ▶️ keys must be same data type
        // ▶️ values must be same data type
        // ▶️ keys and values don't have to be same type

        // HashMap Syntax:
        // HashMap<typeOfKey, typeOfValue> nameOfHashmap = new Hashmap<>();
        HashMap<String, String> fifaThings = new HashMap<>();
        System.out.println(fifaThings);
//
//        // How to add values to a hash map:
        fifaThings.put("GroupA", "Ecuador");
        fifaThings.put("GroupB", "England");
        fifaThings.put("GroupC", "tbd");
        System.out.println(fifaThings);
//
//        // get values from hashmap
//        System.out.println(fifaThings.get("GroupB"));
//
//
//        // check to see if key and/or value exists, returns boolean
//        System.out.println(fifaThings.containsKey("GroupD"));
//        System.out.println(fifaThings.containsValue("USA"));
//
//        fifaThings.remove("GroupC");
//        System.out.println(fifaThings);

        System.out.println(fifaThings.putIfAbsent("GroupC", "tbd"));
        System.out.println(fifaThings);

        fifaThings.putIfAbsent("GroupB", "");
        fifaThings.replace("GroupD", "Argentina");
        System.out.println(fifaThings);


    }
}
