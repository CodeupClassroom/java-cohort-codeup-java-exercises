import java.util.ArrayList;
import java.util.List;

//// @Entity -> makes JPA aware of this POJO (plain old java object) --> more on this later
//// just an example of an annotation on a class
//// https://www.baeldung.com/jpa-entities
//@Entity("vehicles")
public class Product {
//
//    @Persistent // annotating a property used with hibernate -> more on this later
//    protected String name = null;
//
//    @Getter  // helps us create getters (lombok -> helps with boilerplate code)
//    public String getName(){
//        return name;
//    }
//
//    public void setName(@Optional name){ // used for a testing lib that we haven't & won't use in this curriculum
//        this.name = name;
//    }
//
//    public List addToCart(List cart){
//
//        @Optional
//            List localCart = cart == null ? new ArrayList<>(): cart;
//            localCart.add(getName());
//            return localCart;
//    }

    // DEPRECATED

    // OVERRIDE
    // SUPPRESS WARNINGS
    @SuppressWarnings("unchecked")
    public List<String> languages() {
        return new ArrayList();
    }

}


// what would happen if we don't add the optional argument line 18