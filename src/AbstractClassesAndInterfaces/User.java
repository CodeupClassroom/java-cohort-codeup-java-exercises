package AbstractClassesAndInterfaces;

public class User {

    //properties
    private String name;
    private String email;

// CONSTRUCTOR
    public  User(String name, String email){
        this.name = name;
        this.email = email;
    }


    // GETTERS
    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }


    // SETTERS
    public void setName(String userName){
        this.name = userName;
    }

    public void setEmail(String userEmail){
        this.name = userEmail;
    }


}
