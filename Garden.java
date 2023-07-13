class Garden{
static String  flowers[] = {null,null,null,null,null};
static int p;

public static boolean garden(String flower){
	boolean isFlower = false;
	if(flower!=null){
		flowers[p]=flower;
		p++;
		isFlower=true;
		
	}else{
		System.out.println("can not add as it is null value");
	}
	return isFlower;
	
}
public static void getFlower(){
	for(int flower=0;flower<flowers.length;flower++){
		String garden =  flowers[flower];
		System.out.println(garden);
	}
}
public static boolean updateGardenName(String existingGarden,String newGarden){
	boolean isUpdated = false;
	for(int gardenIndex=0; gardenIndex<flowers.length;gardenIndex++){
		if(flowers[gardenIndex].equals(existingGarden)){
			flowers[gardenIndex] = newGarden;
			isUpdated = true;
			System.out.println("is Garden Name updated "+isUpdated);
		}
	}
	return isUpdated;
}
public static int deleteFlower(String flower){
	boolean isDeleted = false;
	int deleteIndex;
	int noOfElements = flowers.length;
	
	for(deleteIndex=0;deleteIndex<flowers.length;deleteIndex++){
		if(flowers[deleteIndex].equals(flower)){
			break;
		}
		
	}
	if(deleteIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=deleteIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          flowers[newindex] =flowers[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllflowersPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(flowers[itemIndex]);
	}
	
}

}