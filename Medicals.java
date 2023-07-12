class Medicals{
static String medicines[] = {null,null,null,null,null,null,null,null,null};
static int i;

public static boolean medicine(String medicine){
	boolean isMedicine = false;
	if(medicine!=null){
		medicines[i]=medicine;
		i++;
		isMedicine= true;
	}else{
		System.out.println("can not add as it has null value");
	}
	return isMedicine;
}
public static void getMedicine(){
	for(int m=0;m<medicines.length;m++){
		String medi = medicines[m];
		System.out.println(medi);
	}
}
public static boolean updatemedicineName(String existingMed,String newMed){
	boolean isUpdated = false;
	for(int medIndex=0; medIndex<medicines.length;medIndex++){
		if(medicines[medIndex].equals(existingMed)){
			medicines[medIndex] = newMed;
			isUpdated = true;
			System.out.println("is Medicine Name updated "+isUpdated);
		}
	}
	return isUpdated;
}
public static int deleteMedicine(String medicine){
	boolean isDeleted = false;
	int deleteIndex;
	int noOfElements = medicines.length;
	
	for(deleteIndex=0;deleteIndex<medicines.length;deleteIndex++){
		if(medicines[deleteIndex].equals(medicine)){
			break;
		}
		
	}
	if(deleteIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=deleteIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          medicines[newindex] =medicines[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllmedicinesPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(medicines[itemIndex]);
	}
	
}
public static String searchMedicineByName(String medicineName){
	System.out.println("Invoking searchMedicineByName");
	String sName = null;
	for(String name : medicines){
		if(name.equals(medicineName)){
			sName = name;
			System.out.println("Medicine name found "+medicineName);
		}
		
	}
	return sName;
}
}