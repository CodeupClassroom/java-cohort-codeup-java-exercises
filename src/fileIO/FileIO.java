package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIO {


    public static void printPoem(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath); //We need List as .readAllLines returns List datatype
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }

    public static void main(String[] args) throws IOException {

        Path filepath = Paths.get("./src/fileIO/wcw.txt");

//        printPoem(filepath);

        //Absolute vs Relative - what's the difference?
        //Let's ask intelliJ ->
        //Ex: absolute path
        ///Users/kennethhowell/IdeaProjects/java-cohort-codeup-java-exercises/src/fileIO/wcw.txt
        //Ex: relative path
        // ./src/fileIO/wcw.txt

        //Relative paths = good for our business, we want to start with our 'project root' vs. a specific user's file system (absolute)

        Path examplePath = Paths.get("/nota/", "realpath");

        System.out.println("examplePath = " + examplePath);

        //Boolean - is it TRUE or FALSE that something EXISTS where this Path object goes?

        //This is false: nothing on the end of this 'tunnel' (Path)
        System.out.println("Files.exists(examplePath) = " + Files.exists(examplePath));

        //This is true: We saw the poem earlier!
        System.out.println("Files.exists(filepath) = " + Files.exists(filepath));
        System.out.println("~~~~~~");
        System.out.println("examplePath = " + examplePath);
        System.out.println("filepath = " + filepath);

        //Alright - so, I know I can create a Path (an 'address' of sorts) for Java to work with - I know I can T/F is something at the end of my path, but what else can I do?

        //CRUD - Create directories/files, Reading directories/files

        //Let's make some new stuff in our project!

        //Let's create: A directory and a new file for some groceries :D

        //Alright, I need a DIRECTORY to save it and a FILENAME
        //We can combine the two ("/dir/file") or split it into two:
        String directory = "./src/data";

        String filename = "groceryList.txt";

        Path dataDirectory = Paths.get(directory);

        Path dataFile = Paths.get(directory, filename);

        System.out.println("dataDirectory = " + dataDirectory);
        System.out.println("dataFile = " + dataFile);

        //Got the whole address - now let's ask Java to do something at that Path

        //if(directoryDoesNotExist){ //  do stuff }
        if(Files.notExists(dataDirectory)){
            Files.createDirectories(dataDirectory);
        }

//        //if(fileDoesNotExist){ //do more stuff}
        if(Files.notExists(dataFile)){
            Files.createFile(dataFile);
        }

        //Alright - created directories and a file for the first time, I got a file to work with - how do I interact with this file?

        //Let's write some groceries into our groceryList.txt
        //Let's get the Path for the file first:
        Path groceryListPath = Paths.get(directory, filename);

        System.out.println("Files.exists(groceryListPath) = " + Files.exists(groceryListPath));

        //That's WHERE we want to go, let's give it WHAT to send that way
        List<String> groceryList = new ArrayList<>();

        String item1 = "loaf of bread";

        groceryList.add(item1);
        groceryList.add("breakfast cereal");
        groceryList.add("cat food");
        groceryList.add("whole chicken");
        groceryList.add("asparagus (we are fancy)");

        System.out.println("groceryList = " + groceryList);

        //My groceryList (ArrayList) is ready to roll - let's tell Java to WRITE THAT into my FILE.TXT [C]

        Files.write(groceryListPath, groceryList);

        //We saw in the files the result of the work - let's bring the Strings back OUT of the file and into java [R]
        System.out.println("- - - -");
        List<String> printListFromFile = Files.readAllLines(groceryListPath);
        System.out.println(printListFromFile);

        //We can use different operations too:
//        for(int i = 0; i < printListFromFile.size(); i++){
//            System.out.println(printListFromFile.get(i));
//        }

        //How about some update operations [U]?
        //We need to tell Java we want to USE THE SAME FILE
        //UPDATE that FILE
        //But not literally create a new file

        Files.write(groceryListPath, Arrays.asList("eggs", "cheese", "tortilla chips"), StandardOpenOption.APPEND);

        printListFromFile = Files.readAllLines(groceryListPath);

        for(int i = 0; i < printListFromFile.size(); i++){
            System.out.println(printListFromFile.get(i));
        }

        //Manipulating files - Find line and REPLACE, could be a 'delete' method if we replace with a blank (empty) string [D]

        printListFromFile = Files.readAllLines(groceryListPath);

        List<String> newList = new ArrayList<>();

        for(String line : printListFromFile){
            if(line.equalsIgnoreCase("cheese")){
                newList.add("Brie Cheese (we fancy again)");
                continue;
            }

            newList.add(line);
        }

        System.out.println(printListFromFile);
        System.out.println("~~~~~");
        System.out.println(newList);

        //Nice - we replaced that boring cheese with some nice fancy cheese; let's get it into our File

        Files.write(groceryListPath, newList);

    }


}
