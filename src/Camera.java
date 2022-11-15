public class Camera {


    // Camera class fields
    public int price;
    public boolean hasFlipScreen;
    public int megaPixels;
    public String brand;

    // Camera Class constructor:
    public Camera(){
        System.out.println("A Camera class has been created");
    }

    // Camera Class methods:
    public void setPrice(int priceValue){
        price = priceValue;
    }

    public void setHasFlipScreen(boolean flipScreenIncluded){
        hasFlipScreen = flipScreenIncluded;
    }

    public void setMegaPixels(int mP){
        megaPixels = mP;
    }

    public void setBrand(String brandName){
        brand = brandName;
    }

}
