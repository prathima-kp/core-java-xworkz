class Television{
static String name = "MI";
static int minVol;
static int currentVol;
static int maxVol = 100;
static boolean isConnected ;
 //method
 public static boolean onOroff(){
 
   
   if(isConnected == false){
	  isConnected = true;
	   System.out.println("TV is on");
	}
   else if(isConnected == true){
	   isConnected = false;
	   System.out.println("TV is off");
   }
   return isConnected;
 
 }
 // increase volume
 public static void increaseVolume(){
	
	 if(isConnected == true){
	 if(currentVol<maxVol){
		currentVol = currentVol+1;
		System.out.println("The current volume is"+currentVol);
	 }else{
		 System.out.println("Max volume reached");
	 }
	 
 }else{
	  System.out.println("idiot connect first");
 }

 }
 
 // decrease Volume
 public static void decreaseVolume(){
	
	  
	 if(isConnected == true){
		 if(currentVol>minVol){
			 currentVol = currentVol - 1;
			System.out.println("The current volume is"+currentVol); 
		 }else{
			 System.out.println("Minimum volume reached");
		 }
	 }else{
		  System.out.println("TV is off...can't decrease volume");
	 }
	 
	 
  }
}