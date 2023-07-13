class TravelTester{
public static void main(String place[]){
TravelAgency.places("Mysuru");
TravelAgency.places("Bandipur");
TravelAgency.places("Udupi");
TravelAgency.places("Dandeli");
TravelAgency.places("Goa");
TravelAgency.places("Jog falls");
TravelAgency.places("Belur");
TravelAgency.places("Honnavara");
TravelAgency. getPlace();

TravelAgency.updatePlaceName("Dandeli","Ajantha");
TravelAgency. getPlace();
int newLength =TravelAgency.deletePlace("Goa");
System.out.println("calling all Places");

TravelAgency.getAllPlacesPostDeletion(newLength);
}

}