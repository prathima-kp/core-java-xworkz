class Girias1{
 
  
  public static void main(String arg[]){
  System.out.println("Main started");
  String electronicDevices[] = {"refrigerator", "washing_machine","Television", "LED", "Grinder", "AC", "IronBox","Microwave"};
  
  double priceOfElectronicDevices[] = {50000.00, 40000.00,28000.00,76000.00,18000.50,30000.00,1000.50,5000.50};
  
  System.out.println("List of components");
 
  for(int i=0;i<electronicDevices.length;){
  System.out.println(electronicDevices[i]+" "+"Price is "+priceOfElectronicDevices[i]);
  i++;
   }
   System.out.println("Main ended");
  }
 }