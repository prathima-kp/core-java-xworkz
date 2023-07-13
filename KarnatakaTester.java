class KarnatakaTester{

public static void main(String karnataka[]){
   Karnataka.addcity("Bangaluru");
   Karnataka.addcity("Mysoru");
   Karnataka.addcity("Tumkur");
   Karnataka.addcity("Hassan");
   Karnataka.addcity("Davangere");
   
Karnataka.getAllCities();
Karnataka.updateCityName("Bangaluru","Bendakaaluru");

Karnataka.getAllCities();
int newLength =Karnataka.deleteCity("Hassan");
System.out.println("calling all cities");
Karnataka.getAllcitiesPostDeletion(newLength);
}


}