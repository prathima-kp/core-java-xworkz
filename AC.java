class AC{
static String name = "Haier";
static int mintemp;
static int currenttemp;
static int maxtemp = 30;
static boolean isConnected ;
 //method
 public static boolean onOroff(){
 
  
   System.out.println("Parameter" +0);
   if(isConnected == false){
	  isConnected = true;
	   System.out.println("AC is on");
	}
   else if(isConnected == true){
	   isConnected = false;
	   System.out.println("AC is off");
   }
   return isConnected;
 
 }
 // increase volume
 public static void increaseTemp(){
	
	 if(isConnected == true){
	 if(currenttemp<maxtemp){
		currenttemp = currenttemp+1;
		System.out.println("The current temperature is"+currenttemp);
	 }else{
		 System.out.println("Max temperature reached");
	 }
	 
 }else{
	  System.out.println("Connect first");
 }
 System.out.println("End of increase temperature");
 }
 
 // decrease temperature
 public static void decreaseTemp(){
	 
   System.out.println("Parameter" +0);
	  
	 if(isConnected == true){
		 if(currenttemp>mintemp){
			 currenttemp = currenttemp - 1;
			System.out.println("The current temperature is"+currenttemp); 
		 }else{
			 System.out.println("Minimum temperature reached");
		 }
	 }else{
		  System.out.println("AC is off...can't decrease temperature");
	 }
	 
	 System.out.println("End of decrease temperature");
  }
}