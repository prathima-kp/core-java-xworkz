class Speaker2{
static String name = "JBI";
static int minVol;
static int currentVol;
static int maxVol = 30;
static boolean isConnected ;
 //method
 public static boolean onOroff(){
 
   System.out.println("Invoking on or off()");
   System.out.println("Parameter" +0);
   if(isConnected == false){
	  isConnected = true;
	   System.out.println("Speaker is on");
	}
   else if(isConnected == true){
	   isConnected = false;
	   System.out.println("Speaker is off");
   }
   return isConnected;
 
 }
 // increase volume
 public static void increaseVolume(){
	 System.out.println("Start of increase volume");
	 if(isConnected == true){
	 if(currentVol<maxVol){
		currentVol = currentVol+1;
		System.out.println("The current volume is"+currentVol);
	 }else{
		 System.out.println("Max volume reached");
	 }
	 
 }else{
	  System.out.println("idiot connect the speaker first");
 }
 System.out.println("End of increase volume");
 }
 
 // decrease Volume
 public static void decreaseVolume(){
	 System.out.println("Invoking decreaseVolume()");
   System.out.println("Parameter" +0);
	  
	 if(isConnected == true){
		 if(currentVol>minVol){
			 currentVol = currentVol - 1;
			System.out.println("The current volume is"+currentVol); 
		 }else{
			 System.out.println("Minimum volume reached");
		 }
	 }else{
		  System.out.println("Speaker is off...can't decrease volume");
	 }
	 
	 System.out.println("End of decrease volume");
  }
}