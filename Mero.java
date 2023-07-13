class Mero{
static String stations[] = {null,null,null,null,null,null,null};
  static int i;
  
  public static boolean station(String station){
	  boolean isMetro = false;
	  if(station!=null){
		  stations[i]=station;
		  i++;
		  isMetro = true;
	  }else{
		  System.out.println("cannot add as it is null value");
	  }
	  return isMetro;
  }
  public static void getStations(){
	  for(int s=0;s<stations.length;s++){
	  String stat = stations[s];
	  System.out.println(stat);
	  }
  }
  public static boolean updatemetroName(String existingStation,String newStation){
	boolean isUpdated = false;
	for(int stationIndex=0; stationIndex<stations.length;stationIndex++){
		if(stations[stationIndex].equals(existingStation)){
			stations[stationIndex] = newStation;
			isUpdated = true;
			System.out.println("is Station Name updated "+isUpdated);
		}
	}
	return isUpdated;
}
public static int deleteStation(String station){
	boolean isDeleted = false;
	int deleteIndex;
	int noOfElements = stations.length;
	
	for(deleteIndex=0;deleteIndex<stations.length;deleteIndex++){
		if(stations[deleteIndex].equals(station)){
			break;
		}
		
	}
	if(deleteIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=deleteIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          stations[newindex] =stations[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllstationsPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(stations[itemIndex]);
	}
	
}
 
}