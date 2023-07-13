class Hotel{
 static String foods[] = { "idli-sambar","idli-vada","idli-fry","idli-masala","batata-vada","upma","sada-dosa","mysore-dosa","schezwan-dosa","ghee/butter-dosa","palak-dosa","cheese-dosa","paneer-dosa","rawa-dosa","onion-dosa","set-dosa","paper-dosa","masala-dosa","uttappam","onion-uttappam","cheese-uttappam","tomato-uttappam","omlet","veg.samosa","veg.cutlet","chole-bature","pav-bhaji","veg.pizza","mexican-pizza","veg.burger","mushroom-pizza","dahi-vada","onion-pakoda","gulab-jamun","srikhand","capsicum-pakoda","sweet-kachori","sabudana-khichdi","sabudana-vada","paneer-pizza","potato-toast","veg.sandwich","cheese-pakoda","paneer-pakoda","mix_veg.pakoda","potato-pakoda","poori-saagu","garlic-pizza","cheese-pizza","mushroom-manchurian"};
public static void main(String hotel[]){
	
 System.out.println("list of foods");
 System.out.println("------------------------------------------------------");
 fetchFood();
// System.out.println(food[0]+" "+food[1] +food[2]+" "+food[3]+" "+food[4]+" "+food[5]+" "+food[6]+" "+food[7]+" "+food[8]+" "+food[9]+" "+food[10]+" "+food[11]+" "+food[12]+" "+food[13]+" "+food[14]+" "+food[15]+" "+food[16]+" "+food[17]+" "+food[18]+" "+food[19]+" "+food[20]+" "+food[21]+" "+food[22]+" "+food[23]+" "+food[24]+" "+food[25]+" "+food[26]+" "+food[27]+" "+food[28]+" "+food[29]+" "+food[30]+" "+food[31]+" "+food[32]+" "+food[33]+" "+food[34]+" "+food[35]+" "+food[36]+" "+food[37]+" "+food[38]+" "+food[39]+" "+food[40]+" "+food[41]+" "+food[42]+" "+food[43]+" "+food[44]+" "+food[45]+" "+food[46]+" "+food[47]+" "+food[48]+" "+food[49] );
//System.out.println(food.length);


}
public static void fetchFood(){
for(String food :foods){
	System.out.println(food);
}
}




}