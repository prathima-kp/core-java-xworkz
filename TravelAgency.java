class TravelAgency{
static String tourist_places[]={null,null,null,null,null,null,null,null};
static int i;

public static boolean places(String place){
	boolean isPlace = false;
	if(place!=null){
		tourist_places[i] = place;
		i++;
		isPlace = true;
	}else{
		System.out.println("can not add as it is null");
	}
	return isPlace;
}
public static void getPlace(){
	for(int p=0;p<tourist_places.length;p++){
		String places = tourist_places[p];
		System.out.println(places);
	}
}
 public static boolean updatePlaceName(String existingPlace,String newPlace){
	boolean isUpdated = false;
	for(int placeIndex=0; placeIndex<tourist_places.length;placeIndex++){
		if(tourist_places[placeIndex].equals(existingPlace)){
			tourist_places[placeIndex] = newPlace;
			isUpdated = true;
			System.out.println("is Place Name updated "+isUpdated);
		}
	}
	return isUpdated;
}
public static int deletePlace(String place){
	boolean isDeleted = false;
	int deleteIndex;
	int noOfElements = tourist_places.length;
	
	for(deleteIndex=0;deleteIndex<tourist_places.length;deleteIndex++){
		if(tourist_places[deleteIndex].equals(place)){
			break;
		}
		
	}
	if(deleteIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=deleteIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          tourist_places[newindex] =tourist_places[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllPlacesPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(tourist_places[itemIndex]);
	}
	
}
}