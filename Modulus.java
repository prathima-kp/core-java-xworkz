class Modulus{

 public static void main(String modulud[]){
     mod(456,87);
	 mod(987,12);
	 mod(4567,98);
	 mod(2345,934);
	 mod(8765,123);
	 mod(63,12);
	 mod(85,13);
	 mod(6789,234);
	 mod(96325,145);
	 mod(12345,8765);
	 System.out.println("-------------------------");
	   mod(456,87,12);
	 mod(987,12,2);
	 mod(4567,98,28);
	 mod(2345,934,21);
	 mod(8765,123,36);
	 mod(63,12,6);
	 mod(85,13);
	 mod(6789,456,234);
	 mod(235642,96325,145);
	 mod(12345,8765,125);
}
 public static void mod(int a, int b){
 System.out.println(a%b);
 
 }
 public static void mod(int x, int y, int z){
 System.out.println(x%y%z);
 

}
}