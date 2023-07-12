class MedicineTester{
public static void main(String arg[]){
Medicals. medicine("Dolo650");
Medicals. medicine("Azithromycin");
Medicals. medicine("Naproxen");
Medicals. medicine("Metronidazole");
Medicals. medicine("Ibuprofen");
Medicals. medicine("Dart");
Medicals. medicine("Rantac");
Medicals. medicine("Diazepam");
Medicals. medicine("Cephalexin");
Medicals.getMedicine();
Medicals.updatemedicineName("Dolo650","Dolo");
Medicals.getMedicine();

int newLength =Medicals.deleteMedicine("Dolo");
System.out.println("calling all medicines");

Medicals. getAllmedicinesPostDeletion(newLength);

String medicineName = Medicals.searchMedicineByName("Diazepam");
Medicals.searchMedicineByName(medicineName);

}

}