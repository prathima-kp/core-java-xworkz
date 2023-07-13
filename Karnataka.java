class Karnataka{
	//array has limitation - size is fixed
 static String cities[] = {null,null,null,null,null};
 static int i;
 
 public static boolean addcity(String city){
	 boolean isCity = false;
	 //validate city name
	 if(cities.length>i){
		 
	 if(city!=null && city.length()>0){
		 cities[i] = city;
		 i++;
		 isCity = true;
		
	 }else{
		 System.out.println("Cannot add city as it is null value");
		 
	 }
	 }else{
		 System.out.println("Size is full,cannot add city anymore");
	 }
	 return isCity;
 }
public static void getAllCities(){
	for(int citi=0;citi<cities.length;citi++){
		String value = cities[citi];
		System.out.println(value);
	}
	
}

public static boolean updateCityName(String existingcity,String newCity){
	boolean isUpdated = false;
	for(int cityIndex=0; cityIndex<cities.length;cityIndex++){
		if(cities[cityIndex].equals(existingcity)){
			cities[cityIndex] = newCity;
			isUpdated = true;
			System.out.println("is City Name updated "+isUpdated);
		}
	}
	return isUpdated;
}
public static int deleteCity(String city){
	boolean isDeleted = false;
	int deleteIndex;
	int noOfElements =cities.length;
	
	for(deleteIndex=0;deleteIndex<cities.length;deleteIndex++){
		if(cities[deleteIndex].equals(city)){
			break;
		}
		
	}
	if(deleteIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=deleteIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          cities[newindex] =cities[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllcitiesPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(cities[itemIndex]);
	}
	
}

}