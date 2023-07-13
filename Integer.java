class Integer{
static int price[] = {567,78,12,90,1};

public static int largest(){
	int lar = price[0];
	for(int i=0;i<price.length;i++){
		if(price[i]>lar)
			lar = price[i];
	}
	System.out.println("Largest element is "+lar);
	return lar;
}

public static int ascending(){
	int temp = 0;
	for(int i=0;i<price.length;i++){
		for(int j=i+1;j<price.length;j++){
			if(price[i]>price[j]){
				temp = price[i];
				price[i]=price[j];
				price[j]=temp;
			}
		}
	}
	System.out.println("Sorted in Ascending order: ");
	for(int i=0;i<price.length;i++){
		System.out.println(price[i] + " ");
	}
	return 0;
}

public static int descending(){
	
	int temp = 0;
	for(int i=0;i<price.length;i++){
		for(int j=i+1;j<price.length;j++){
			if(price[i]<price[j]){
				temp = price[i];
				price[i]=price[j];
				price[j]=temp;
			}
		}
	}
	System.out.println("Sorted in Descending order: ");
	for(int i=0;i<price.length;i++){
		System.out.println(price[i] + " ");
	}
	return 0;
}
	
}
