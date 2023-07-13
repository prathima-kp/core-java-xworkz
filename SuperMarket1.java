class SuperMarket1{
  // show 5 vegetables
  
  static String vegetables[] = {"potato ", "carrot ", "beans ", "brinjal ", "onion "};
  
  // biscuits 10
  static String biscuits[] = {"Goodday", "Oreo", "DarkFantasy", "Nutrichoice", "Marie", "Krackjack", "50-50","Horlicks","Parle-G",  "mom'smagic"};
  
		   //perfumes 10
		    static String perfumes[] = {"fogg", "myop", "Secret", "poison", "wattagirl", "Engage","Mysoresandle", "wildstone","eva", "Dazzler"};
			
			
			//Groceries 10
			static String groceries[] = {"rice",  "mungdal", "sugar", "salt", "coffee", "tea", "Toordal", "musturd", "oil", "Ragi"};
			
			//Cosmetics 25
			static String cosmetics[] = {"moistoriser", "faceCream", "faceSerum", "HairSerum", "Primer", "Toner", "Foundation", "Highlighter", "conceler", "kajal","EyeLiner","masccara","LipStick","Lipgloss","LipBalm","EyebrowPencil","eyeshadow","Powder","Compact","faceMask","Rosewater","HairMask","sunscreen","scrub","BodyLotion"};
			
			
			public static void main(String market[]){
			System.out.println("----------------------");
			System.out.println("List of vegetables");
			
			//System.out.println(vegetables[0]+" "+vegetables[1]+" "+vegetables[2]+" "+vegetables[3]+" "+vegetables[4]);
			
			System.out.println("----------------------");
			getVegetables();
			
			System.out.println("----------------------");
			System.out.println("List of biscuits");
			//System.out.println(biscuits[0]+" "+biscuits[1]+" "+biscuits[2]+" "+biscuits[3]+" "+biscuits[4]+" "+biscuits[5]+" "+biscuits[6]+" "+biscuits[7]+" "+biscuits[8]+" "+biscuits[9]);
			
			System.out.println("----------------------");
			getBiscuits();
			System.out.println("----------------------");
			System.out.println("List of perfumes");
			//System.out.println(perfumes[0]+" "+perfumes[1]+" "+perfumes[2]+" "+perfumes[3]+" "+perfumes[4]+" "+perfumes[5]+" "+perfumes[6]+" "+perfumes[7]+" "+perfumes[8]+" "+perfumes[9]);
			
			System.out.println("----------------------");
			getPerfumes();
			
			
			System.out.println("----------------------");
			System.out.println("List of groceries");
			//System.out.println(groceries[0]+" "+groceries[1]+" "+groceries[2]+" "+groceries[3]+" "+groceries[4]+" "+groceries[5]+" "+groceries[6]+" "+groceries[7]+" "+groceries[8]+" "+groceries[9]);
			
			System.out.println("----------------------");
			getGroceries();
			System.out.println("----------------------");
			System.out.println("List of cosmetics");
			//System.out.println(cosmetics[0]+" "+cosmetics[1]+" "+cosmetics[2]+" "+cosmetics[3]+" "+cosmetics[4]+" "+cosmetics[5]+" "+cosmetics[6]+" "+cosmetics[7]+" "+cosmetics[8]+" "+cosmetics[9]+" "+cosmetics[10]+" "+cosmetics[11]+" "+cosmetics[12]+" "+cosmetics[13]+" "+cosmetics[14]+" "+cosmetics[15]+" "+cosmetics[16]+" "+cosmetics[17]+" "+cosmetics[18]+" "+cosmetics[19]+" "+cosmetics[20]+" "+cosmetics[21]+" "+cosmetics[22]+" "+cosmetics[23]+" "+cosmetics[24]);
			
			System.out.println("----------------------");
			getCosmetics();
			
  }
  //can give read,fetch,get for method name
  public static void getVegetables(){
	  System.out.println("Inside getVegetables");
	  for(String vegetable : vegetables){
				System.out.println(vegetable);
			}
	  }
  public static void getPerfumes(){
	  for(String perfume : perfumes){
				System.out.println(perfume);
			}
	   }
  public static void getBiscuits(){
	for(String biscuit : biscuits){
				System.out.println(biscuit);
			}
	   }
  public static void getGroceries(){
	for(String grocery : groceries){
				System.out.println(grocery);
			}  
       }
   public static void getCosmetics(){
	for(String cosmetic: cosmetics){
				System.out.println(cosmetic);
			}   
       }
}
  //syntax for array
  //Datatype variableName[] = {data1, data2, data3,..........};
  
  
  //index=length-1
  //variableName[0]//for(datatype variable : arrayvariable )
  
  
  
  
  
  
  
  