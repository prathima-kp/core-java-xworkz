class MetroStationTester{
public static void main(String stat[]){
Mero.station("Majestic");
Mero.station("National college");
Mero.station("Rajajinagar");
Mero.station("Sandle soap factory");
Mero.station("Attiguppe");
Mero.station("Vijayanagar");
Mero.station("Deepanjali nagar");
Mero.getStations();
Mero.updatemetroName("Deepanjali nagar","Yeshwanthpur");
Mero.getStations();

int newLength =Mero.deleteStation("Attiguppe");
System.out.println("calling all stations");

Mero. getAllstationsPostDeletion(newLength);
}

}