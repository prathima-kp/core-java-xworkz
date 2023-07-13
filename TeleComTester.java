class TeleComTester{

public static void main(String telecom[]){
  TeleCom.telecom("Airtel");
  TeleCom.telecom("BSNL");
  TeleCom.telecom("Jio");
  TeleCom.telecom("Vodafone Idea");
  TeleCom.telecom("Aircel");
TeleCom.getTelecom();

TeleCom.updateSimName("Vodafone Idea","Idea");
TeleCom.getTelecom();
int newLength =TeleCom.deleteSim("Aircel");
System.out.println("calling all Sim");
TeleCom.getAllSimPostDeletion(newLength);
}
}