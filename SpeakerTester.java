class SpeakerTester{

public static void main(String test[]){
	System.out.println("Main started");
  boolean connected = Speaker2.onOroff();
  System.out.println("is speaker connected "+connected);
  Speaker2.increaseVolume();
  Speaker2.increaseVolume();
  Speaker2.increaseVolume();
  Speaker2.increaseVolume();
  boolean connected1 = Speaker2.onOroff();
  System.out.println("is speaker connected "+connected1);
   Speaker2.increaseVolume();
  Speaker2.increaseVolume();
  Speaker2.increaseVolume();
  Speaker2.increaseVolume();
  boolean connected3 = Speaker2.onOroff();
  System.out.println("is speaker connected "+connected3);
  Speaker2.decreaseVolume();
  Speaker2.decreaseVolume();
  Speaker2.decreaseVolume();
  Speaker2.decreaseVolume();
    boolean connected2 = Speaker2.onOroff();
 System.out.println("is speaker connected "+connected2);
  Speaker2.decreaseVolume();
  Speaker2.decreaseVolume();
  Speaker2.decreaseVolume();
  Speaker2.decreaseVolume(); 
  
  System.out.println("Main Ended");
}
}