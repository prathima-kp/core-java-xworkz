class BodyLotion1{
	//static, instance - default values will be assigned by compiler
	// compiler driven values are called default values
static String name = "Himalaya";
static String specialIngredients = "Neem";
 static String materialType = "cream";
 static String skinType = "Oil";
 static String countryOfOrigin = "China"; 
 static char value ;
 static int price = 345;
 
 
 public static void main(String lotion[]){
   System.out.println("Name is "+name);
   System.out.println("Special ingredients is "+specialIngredients);
   System.out.println("material is "+materialType);
   System.out.println(value+"message");
   System.out.println("skin type is "+skinType);
   System.out.println("Country is "+countryOfOrigin);
   System.out.println("price is "+price);
	   
	   //edit or modification using variables
	  
  name = "vasline";
  specialIngredients = "alovera";
  materialType  = "free";
  skinType = "dry";
  countryOfOrigin = "India";
  price = 244;
  
   System.out.println("Name is "+name);
   System.out.println("Special ingredients is "+specialIngredients);
   System.out.println("material is "+materialType);
   System.out.println("skin type is "+skinType);
   System.out.println("Country is "+countryOfOrigin);
   System.out.println("price is "+price);
 
 
 
 }
}