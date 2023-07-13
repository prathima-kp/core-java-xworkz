class TeleCom{
 static String sim[] = {null,null,null,null,null};
 static int i;
 
 public static boolean telecom(String Sim){
	 boolean isSim = false;
	 if(Sim!=null){
		 sim[i]=Sim;
		 i++;
		 isSim = true;
	 }else{
		 System.out.println("cannot add as it is null");
	 }
	 return isSim;
	 
 }
 public static void getTelecom(){
	 for(int sims=0;sims<sim.length;sims++){
		 String reference =  sim[sims];
		 System.out.println(reference);
		 
	 }
	 
	 
 }
 public static boolean updateSimName(String existingSim,String newSim){
	boolean isUpdated = false;
	for(int simIndex=0; simIndex<sim.length;simIndex++){
		if(sim[simIndex].equals(existingSim)){
			sim[simIndex] = newSim;
			isUpdated = true;
			System.out.println("is Sim Name updated "+isUpdated);
		}
	}
	return isUpdated;
}
public static int deleteSim(String sims){
	boolean isDeleted = false;
	int deleteIndex;
	int noOfElements = sim.length;
	
	for(deleteIndex=0;deleteIndex<sim.length;deleteIndex++){
		if(sim[deleteIndex].equals(sims)){
			break;
		}
		
	}
	if(deleteIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=deleteIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          sim[newindex] =sim[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllSimPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(sim[itemIndex]);
	}
	
}
}