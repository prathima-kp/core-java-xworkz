class PrimeVideo{

static String kannadaMovies[] = {"Dare-devil-mustapha","Ninna-sanihake","vasanta_kokila","yuvaratna","pailwaan","Avane_srimannarayana","odeya","Humble_politician_noograj","Aayushmanbhava","Rustum","99","Gubbi_mele_brahmastra","ondu_motteya_kathe","Ikkat","Takkar","Geetha","Kavaludaari","OldMonk","Garuda","Katheyondu_shuruvaagide","Ratnan_prapancha","Love_Mocktail","Orange","KGF","Gandadagudi"};
static String englishMovies[] = {"My_fault","Creed","Spider_man","TopGun","Smile","F9","BlackAdam","TheBossBaby","Creed_II","Fall","Fight_club","WrongTurn","The_Dictator","Jumanji","Escape_room","The_family_man","Exorcist","Reacher","Mr.Robot","Dr.House","Hunters","CarnivalRow","Fleabag","upload","undone"};
static String hindiMovies[] = {"yehDiwaniHaiDeevani","aedil_hai_mushkil","chakde","sultan","3idiots","tumbbad","dada","dhoom2","OKjaanu","jab_we_met","padmaavat","dahaad","happyFamily","farzi","Chapaak","DDLJ","PK","Mausam","Fanaa","Sultan","MainHoonNa","Bazigar","Dilwale","Saatiya","Aashiqui"};
static String malyalamMovies[] = {"Hridayam","BangloreDays","Premam","Trance","Romancham","MadhuraManoharaMoham","Amala","Flush","O.Baby","Adi","Kaipola","PachuvumAthbuthaVilakkum","OmShantiOshana","Uru","OhMyDarling","PalliMan","Boomerang","Christy","DearVaapi","Rekha","Thankam","Alone","Poovan","Ayisha","Iru"};

public static void main(String prime[]){
System.out.println("List of kannada Movies");
fetchKannada();
//System.out.println(kannadaMovies[0]+" "+kannadaMovies[1]+" "+kannadaMovies[2]+" "+kannadaMovies[3]+" "+kannadaMovies[4]+" "+kannadaMovies[5]+" "+kannadaMovies[6]+" "+kannadaMovies[7]+" "+kannadaMovies[8]+" "+kannadaMovies[9]+" "+kannadaMovies[10]+" "+kannadaMovies[11]+" "+kannadaMovies[12]+" "+kannadaMovies[13]+" "+kannadaMovies[14]+" "+kannadaMovies[15]+" "+kannadaMovies[16]+" "+kannadaMovies[17]+" "+kannadaMovies[18]+" "+kannadaMovies[19]+" "+kannadaMovies[20]+" "+kannadaMovies[21]+" "+kannadaMovies[22]+" "+kannadaMovies[23]+" "+kannadaMovies[24]);

System.out.println("-----------------------------------------------------------------------------------");
System.out.println("English movies");
getEnglish();
//System.out.println(englishMovies[0]+" "+englishMovies[1]+" "+englishMovies[2]+" "+englishMovies[3]+" "+englishMovies[4]+" "+englishMovies[5]+" "+englishMovies[6]+" "+englishMovies[7]+" "+englishMovies[8]+" "+englishMovies[9]+" "+englishMovies[10]+" "+englishMovies[11]+" "+englishMovies[12]+" "+englishMovies[13]+" "+englishMovies[14]+" "+englishMovies[15]+" "+englishMovies[16]+" "+englishMovies[17]+" "+englishMovies[18]+" "+englishMovies[19]+" "+englishMovies[20]+" "+englishMovies[21]+" "+englishMovies[22]+" "+englishMovies[23]+" "+englishMovies[24]);

System.out.println("-----------------------------------------------------------------------------------");
System.out.println("Hindi movies");
getHindi();
//System.out.println(hindiMovies[0]+" "+hindiMovies[1]+" "+hindiMovies[2]+" "+hindiMovies[3]+" "+hindiMovies[4]+" "+hindiMovies[5]+" "+hindiMovies[6]+" "+hindiMovies[7]+" "+hindiMovies[8]+" "+hindiMovies[9]+" "+hindiMovies[10]+" "+hindiMovies[11]+" "+hindiMovies[12]+""+hindiMovies[13]+" "+hindiMovies[14]+" "+hindiMovies[15]+" "+hindiMovies[16]+" "+hindiMovies[17]+" "+hindiMovies[18]+" "+hindiMovies[19]+" "+hindiMovies[20]+" "+hindiMovies[21]+" "+hindiMovies[22]+" "+hindiMovies[23]+" "+hindiMovies[24]);

System.out.println("-----------------------------------------------------------------------------------");
System.out.println("Malyalam movies");
fetchmalyalam();
//System.out.println(malyalamMovies[0]+" "+malyalamMovies[1]+" "+malyalamMovies[2]+" "+malyalamMovies[3]+" "+malyalamMovies[4]+" "+malyalamMovies[5]+" "+malyalamMovies[6]+" "+malyalamMovies[7]+" "+malyalamMovies[8]+" "+malyalamMovies[9]+" "+malyalamMovies[10]+" "+malyalamMovies[11]+" "+malyalamMovies[12]+" "+malyalamMovies[13]+" "+malyalamMovies[14]+" "+malyalamMovies[15]+" "+malyalamMovies[16]+" "+malyalamMovies[17]+" "+malyalamMovies[18]+" "+malyalamMovies[19]+" "+malyalamMovies[20]+" "+malyalamMovies[21]+" "+malyalamMovies[22]+" "+malyalamMovies[23]+" "+malyalamMovies[24]);
System.out.println("-----------------------------------------------------------------------------------");
}


public static void fetchKannada(){
for(String kannadaMovie:kannadaMovies){
	System.out.println(kannadaMovie);
}	
}
public static void getEnglish(){
for(String englishMovie:englishMovies){
	System.out.println(englishMovie);
}	
}
public static void getHindi(){
for(String hindimovie:hindiMovies){
	System.out.println(hindimovie);
}	
}
public static void fetchmalyalam(){
for(String malyalamMovie:malyalamMovies ){
	System.out.println(malyalamMovie);
	
}
}


}