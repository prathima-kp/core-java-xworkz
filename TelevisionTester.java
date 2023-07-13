class TelevisionTester{

public static void main(String test[]){
	System.out.println("Main started");
  boolean connected = Television.onOroff();
  System.out.println("is Television connected "+connected);
  Television.increaseVolume();
  Television.increaseVolume();
  Television.increaseVolume();
  Television.increaseVolume();
  boolean connected1 = Television.onOroff();
  System.out.println("is Television connected "+connected1);
   Television.increaseVolume();
  Television.increaseVolume();
  Television.increaseVolume();
  Television.increaseVolume();
  boolean connected3 = Television.onOroff();
  System.out.println("is Television connected "+connected3);
  Television.decreaseVolume();
  Television.decreaseVolume();
  Television.decreaseVolume();
  Television.decreaseVolume();
    boolean connected2 = Television.onOroff();
 System.out.println("is Television connected "+connected2);
  Television.decreaseVolume();
  Television.decreaseVolume();
  Television.decreaseVolume();
  Television.decreaseVolume(); 
  
  System.out.println("Main Ended");
}
}