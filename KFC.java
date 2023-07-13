class KFC{
 public static double search(String foodName){
    
	if("5 leg pc" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 449.00;
	}
   if("chicken stripes" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 449.05;
	}
	if("peri peri 10 leg pc" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 948.57;
	}
	if("6 pc chicken strips" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 299.05;
	}
	if("chicken roll" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 179.19;
	}
	if("double chicken roll" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 225.71;
	}
	if("chicken roll meal for 1" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 339.00;
	}
	if("classic chicken roll" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 119.05;
	}
	if("chicken roll meal for 2" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 479.05;
	}
	if("2 classic chicken roll" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 228.57;
	}
	if("The allu arjun combo" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 448.57;
	}
	if("bucket for 2" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 599.05;
	}
	if("stay home bucket" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 788.57;
	}
	if("10 leg pc" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 924.76;
	}
	if("big 12" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 748.57;
	}
	if("ultimate saving bucket" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 699.05;
	}
	if("big 8" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 684.76;
	}
	if("5 pc smoky red pc chicken" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 528.57;
	}
	if("mingles bucket meal" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 499.00;
	}
	if("popcorn biryani" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 690.48;
	}
    return 0.0;
   
   } 

    // Method overloading
	
	public static double search(String foodName , int quantity){
    
	if("5 leg pc" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 449.00 * quantity;
	}
   if("chicken stripes" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 449.05 * quantity;
	}
	if("peri peri 10 leg pc" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 948.57 * quantity;
	}
	if("6 pc chicken strips" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 299.05 * quantity;
	}
	if("chicken roll" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 179.19 * quantity;
	}
	if("double chicken roll" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 225.71 * quantity;
	}
	if("chicken roll meal for 1" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 339.00 * quantity;
	}
	if("classic chicken roll" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 119.05 * quantity;
	}
	if("chicken roll meal for 2" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 479.05 * quantity;
	}
	if("2 classic chicken roll" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 228.57 * quantity;
	}
	if("The allu arjun combo" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 448.57 * quantity;
	}
	if("bucket for 2" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 599.05 * quantity;
	}
	if("stay home bucket" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 788.57 * quantity;
	}
	if("10 leg pc" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 924.76 * quantity;
	}
	if("big 12" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 748.57 * quantity;
	}
	if("ultimate saving bucket" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 699.05 * quantity;
	}
	if("big 8" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 684.76 * quantity;
	}
	if("5 pc smoky red pc chicken" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 528.57 * quantity;
	}
	if("mingles bucket meal" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 499.00 * quantity;
	}
	if("popcorn biryani" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 690.48 * quantity;
	}
    return 0.0;
   
   } 
}