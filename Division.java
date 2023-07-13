class Division{
  //method
public static void main(String division[]){
	
	//invoke logic, at the time of invokation we pass arguements
  div(12, 3);
  div(56, 9);
  div(3456, 678);
  div(45, 8);
  div(23456, 67);
  div(67, 1);
  div(81, 9);
  div(234, 98);
  div(654, 87);
  div(767, 9);
  System.out.println("-----------------------");
  div(228,12, 3);
  div(56,4, 9);
  div(43456,13, 678);
  div(45, 8,2);
  div(23456,23, 67);
  div(67,12, 1);
  div(81,3, 9);
  div(4134,25, 98);
  div(3654,24, 87);
  div(767, 9,1);
  
}

public static void div(int a, int b){
 System.out.println(a/b);
}

public static void div(int x,int y,int z){
	System.out.println(x/y/z);
}

}