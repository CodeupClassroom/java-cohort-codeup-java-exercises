public class StringLecture {


    public static void main(String[] args) {
        String myName = "Kenneth";
        String myName2 = "kenneth";

        System.out.println("myName = myName2 = " + (myName == myName2));
        System.out.println(myName.equals(myName2));
    //String comparison methods
        System.out.println("myName.startsWith(\"Kenny\") = " + myName.startsWith("Kenny"));

        System.out.println("myName.endsWith(\"net\") = " + myName.endsWith("net"));

        System.out.println("myName.equalsIgnoreCase(\"KENNETH\") = " + myName.equalsIgnoreCase("KENNETH"));
        System.out.println();
    //String manipulation methods
        String myState = "Texas";

        System.out.println("myState.charAt(2) = " + myState.charAt(2));

        System.out.println("myState.indexOf(\"Tex\") = " + myState.indexOf("Tex"));

        System.out.println("myState.indexOf(\"ex\") = " + myState.indexOf("ex"));

        System.out.println("myState.indexOf(\"s\") = " + myState.indexOf("s"));
        System.out.println();
        String panamaCanal = "A man, a plan, a canal, Panama";

        System.out.println("panamaCanal.indexOf(\"a canal\") = " + panamaCanal.indexOf("a canal"));

        System.out.println("panamaCanal.indexOf(\"Suez\") = " + panamaCanal.indexOf("Suez"));

        System.out.println("panamaCanal.lastIndexOf(\"man\") = " + panamaCanal.lastIndexOf("man"));

        System.out.println("~~~~~~~~~~~~~");
        System.out.println(panamaCanal);
        System.out.println("panamaCanal.indexOf(\"a\") = " + panamaCanal.indexOf("a"));

        System.out.println("panamaCanal.lastIndexOf(\"a\") = " + panamaCanal.lastIndexOf("a"));

        String goSpurs = "Go, Spurs, Go!";
        System.out.println(goSpurs);
        System.out.println("goSpurs.lastIndexOf(\"Go\") = " + goSpurs.lastIndexOf("Go"));

        System.out.println("goSpurs.indexOf(\"Go\") = " + goSpurs.indexOf("Go"));

        System.out.println("goSpurs.length() = " + goSpurs.length());

        System.out.println("panamaCanal.length() = " + panamaCanal.length());

        System.out.println("------");

        String goLakers = goSpurs.replace("Spurs", "Lakers");

        System.out.println("goLakers = " + goLakers);

        System.out.println("------");
        System.out.println(panamaCanal);

        String plansCanalsOnly = panamaCanal.substring(panamaCanal.indexOf("a plan"), panamaCanal.lastIndexOf("l") + 1);

        System.out.println(plansCanalsOnly);

        String citiesInTexas = "Amarillo, San Antonio, Brownsville, Del Rio";

//        System.out.println("citiesInTexas.length() = " + citiesInTexas.length());

        String citiesIveBeenTo = citiesInTexas.substring(9, 34);


        System.out.println(citiesIveBeenTo);

        System.out.println("-----------");

        System.out.println(panamaCanal.toUpperCase());

        System.out.println(citiesInTexas.toLowerCase());

        System.out.println("--------");

        String userInput = "        ken2cool       ";

        System.out.println("userInput.length() [BEFORE TRIM] = " + userInput.length());

        System.out.println("userInput.trim().length() [AFTER TRIM] = " + userInput.trim().length());
    }

}
