import java.util.Arrays;

public class ArrayLecture {

    public static void main(String[] args) {
        final int four = 4;
        int two = 2;
       //split the declaration and init
        int[] myArr;

       myArr = new int[four];

       //combine it into one line
       int[] myArr2 = new int[two];

        System.out.println("myArr[1] = " + myArr[1]);

        //Default values [int arr] are 0
        System.out.println(myArr2[0]);
        System.out.println(myArr2[1]);
        //Out of bounds: :(
//        System.out.println(myArr2[2]);

        myArr2[0] = 13;
        myArr2[1] = 21;

        System.out.println(myArr2[0]);
        System.out.println(myArr2[1]);

        //What happens with Strings? What the default be?
        //Well, WHAT ARE STRINGS in java? :thinking emoji:

        String[] myStringArray = new String[1];

        System.out.println(myStringArray[0]);

        //Can you have strings and numbers? [no, but will demo]

        String[] myStringArray2 = new String[2];

        myStringArray[0] = "A nice string :)";
//        myStringArray[1] = 12;

        //Creating an array: easier [initializer]

        String[] mexicanPlates = {"enchiladas verdes", "caldo con pollo", "arroz con pollo", "crispy tacos"};

        System.out.println("mexicanPlates[1] = " + mexicanPlates[1]);

        //Nice - initializer can save some time
        //I want to talk about ALL MY MEXICAN PLATES [not one by one YUCK >:(]

        //good ol' for loop
        for(int i = 0; i < mexicanPlates.length; i++){
            System.out.println("Hi, this is for loop:" + mexicanPlates[i]);
        }

        //enhanced for
        for (String element : mexicanPlates) {
            System.out.printf("Here's a cool plate of food I enjoy: %s%n", element);
        }

        //Working with Arrays:
        //Java will often have different classes that can asisst us with our applications and our work
        //For example: We need to do MATH stuff, we can work with Math.PI, Math.method, and others from Math
        //Similarly here: Array[s] (plural) that contains many methods to use
        //Arrays helper class - static is all over this buddy!

        //Arrays.fill [take an array and fill with value that is second argument]

        int[] myFavoriteNumber100Times = new int[100];

        Arrays.fill(myFavoriteNumber100Times, 7);

        for (int myFavoriteNumber100Time : myFavoriteNumber100Times) {
            System.out.println(myFavoriteNumber100Time);
        }
        System.out.println(" array divider ");
        //Arrays.copyOf [make me a copy of Xnum length]
        int[] myFavoriteNumber100TimesAgain = Arrays.copyOf(myFavoriteNumber100Times, 1);

        for (int i : myFavoriteNumber100TimesAgain) {
            System.out.println(i);
        }
        //Arrays.equals [can you tell me if these two arrays are the same?]
        System.out.println("Arrays.equals(myFavoriteNumber100Times, myFavoriteNumber100TimesAgain) = " + Arrays.equals(myFavoriteNumber100Times, myFavoriteNumber100TimesAgain));


        //Arrays.toString [string-ify our array please - I do not want the memref :(]

        System.out.println(Arrays.toString(mexicanPlates));

        //Arrays.sort [sort elements in ascending order]

        Arrays.sort(mexicanPlates);

        System.out.println(Arrays.toString(mexicanPlates));

        //Arrays in arrays || matrix/matrices // 2d arrays [tic-tac-toe, battleship, spreadsheet << something like that metaphorically]

        int[][] myMatrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.toString(myMatrix));

        for (int[] matrix : myMatrix) {
            System.out.println(Arrays.toString(matrix));
        }

        System.out.println(myMatrix[1][2]);
    }


}
