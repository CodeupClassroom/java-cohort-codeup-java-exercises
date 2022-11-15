public class Post {
//Written to show more "production" style POJO [plan old java object]
   String postTitle;
   String postCategory;
   String postBody;

   //default blank constructor
   public Post(){

   }

   //constructor with all fields
   public Post(String postTitle, String postCategory, String postBody){
      this.postBody = postBody;
      this.postCategory = postCategory;
      this.postTitle = postTitle;
   }
}
