class GardenTester{

public static void main(String garden[]){
Garden.garden("Rose");
Garden.garden("Lilly");
Garden.garden("Daisy");
Garden.garden("Jasmine");
Garden.garden("Daffodils");
Garden.getFlower();
Garden.updateGardenName("Daisy","Hibiscus");
Garden.getFlower();
int newLength =Garden.deleteFlower("Hibiscus");
System.out.println("calling all flowers");
Garden.getAllflowersPostDeletion(newLength);
}

}