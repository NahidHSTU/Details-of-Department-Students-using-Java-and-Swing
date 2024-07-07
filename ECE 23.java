import java.util.Scanner;
class ece
{
  String name, adrs, phn, id;

  public void show ()
  {
	System.out.println ("Name: " + name);
	System.out.println ("Student ID: " + id);
	System.out.println ("Phone number: " + phn);
	System.out.println ("Home Address: " + adrs);
  }
}

public class Main
{
  public static void main (String[]args)
  {
	System.out.println
	  ("Assalamualaikum.");
	  System.out.println("Department of Electronics and Communication Engineering.");
	  System.out.println("Hajee Mohammad Danesh Science and Technology University, Dinajpur-5200.");

	Scanner student = new Scanner (System.in);
	  System.out.print ("For student information, enter student ID : ");
	int id = student.nextInt ();

	ece adeb = new ece ();
	  adeb.id = "2302103";
	  adeb.name = "M Adeb Bin Nasem";
	  adeb.phn = "01305060854";
	  adeb.adrs = "Sherpur";

	ece mahin = new ece ();
	  mahin.id = "2302105";
	  mahin.name = "Akmam Khan Mahin";
	  mahin.phn = "01601328402";
	  mahin.adrs = "Moulovibajar";

	ece nahid = new ece ();
	  nahid.id = "2302106";
	  nahid.name = "Nahid Islam";
	  nahid.phn = "01521721890";
	  nahid.adrs = "Rangpur";

	ece rohan = new ece ();
	  rohan.id = "2302108";
	  rohan.name = "Roahn Piyash Prodhan";
	  rohan.phn = "01533353517";
	  rohan.adrs = "Dinajpur";

	ece ananna = new ece ();
	  ananna.id = "2302111";
	  ananna.name = "Ananna Kundu";
	  ananna.phn = "01746478047";
	  ananna.adrs = "Padna";

	ece chaon = new ece ();
	  chaon.id = "2302109";
	  chaon.name = "Chaion Das";
	  chaon.adrs = "Dinajpur";
	  chaon.phn = "01759187078";

	ece ratry = new ece ();
	  ratry.id = "2302113";
	  ratry.name = "Samia Rahman ratry";
	  ratry.adrs = "Chapainawabganj";
	  ratry.phn = "01847862120";

	ece moyna = new ece ();
	  moyna.id = "2302115";
	  moyna.name = "Moyna Roy";
	  moyna.adrs = "Dinajpur";
	  moyna.phn = "01737398730";

	ece fuad = new ece ();
	  fuad.id = "2302116" ;
	  fuad.name = "MD. Fuwad Ali";
	  fuad.adrs = "Nilphamary";
	  fuad.phn = "01303392729";

	ece shuvo = new ece ();
	  shuvo.id = "2302118";
	  shuvo.name = "Shuvo Kumar Debsharma";
	  shuvo.adrs = "Dinajpur";
	  shuvo.phn = "01773463449";

	ece sourov = new ece ();
	  sourov.id = "2302121";
	  sourov.name = "MD. Sourov Ahamed";
	  sourov.adrs = "Sirajganj";
	  sourov.phn = "01734571297";

	ece harun = new ece ();
	  harun.id = "2302123";
	  harun.name = "MD. Harun Or Rashid";
	  harun.adrs = "Naogaon";
	  harun.phn = "01745579300";

	ece rimon = new ece ();
	  rimon.id = "2302129";
	  rimon.name = "Rashedunnabi Rimon";
	  rimon.adrs = "Bogura";
	  rimon.phn = "01788025375";

	ece romjan = new ece ();
	  romjan.id = "2302131";
	  romjan.name = "MD. Romjan Ali";
	  romjan.adrs = "Rangpur";
	  romjan.phn = "01754972055";

	ece himel = new ece ();
	  himel.id = "2302132";
	  himel.name = "Himel Rahman";
	  himel.adrs = "Dinajpur";
	  himel.phn = "01624670055";

	ece sinthi = new ece ();
	  sinthi.id = "2302137";
	  sinthi.name = "Faozia Fariha Shinthi";
	  sinthi.adrs = "Bogura";
	  sinthi.phn = "01533531563";

	ece ifti = new ece ();
	  ifti.id = "2302140";
	  ifti.name = "Imtiaz Hossen Ifti";
	  ifti.adrs = "Cumilla";
	  ifti.phn = "01952465667";

	ece aziz = new ece ();
	  aziz.id = "2302141";
	  aziz.name = "Azizul Hakim";
	  aziz.adrs = "Mymenshigh";
	  aziz.phn = "01518756293";

	ece mahim = new ece ();
	  mahim.id = "2302145";
	  mahim.name = "Muhaiminul Mahmud Mahim";
	  mahim.adrs = "Dhaka";
	  mahim.phn = "01320406075";


	ece rose = new ece ();
	  rose.id = "2302146";
	  rose.name = "Rifat Islam Rose";
	  rose.adrs = "Rangpur";
	  rose.phn = "01630321327";

	ece hajda = new ece ();
	  hajda.id = "2302148";
	  hajda.name = "Suborna Hasda";
	  hajda.adrs = "Dinajpur";
	  hajda.phn = "01759964695";

	ece sojib = new ece ();
	  sojib.id = "2302150";
	  sojib.name = "MD Sojib Hossain";
	  sojib.adrs = "Dinajpur";
	  sojib.phn = "01722525194";

	ece zim = new ece ();
	  zim.id = "2302152";
	  zim.name = "Sod Mohammad Zim ";
	  zim.adrs = "Kushtia ";
	  zim.phn = "01720009152 ";

	ece parvin = new ece ();
	  parvin.id = "2302155";
	  parvin.name = "Suraiya Parvin ";
	  parvin.adrs = "Thakugaon";
	  parvin.phn = "01325032208 ";

	ece muhin = new ece ();
	  muhin.id = "2302156";
	  muhin.name = "Asif Iqbal Muhin ";
	  muhin.adrs = "Pabna ";
	  muhin.phn = "01863976349 ";

	ece sifat = new ece ();
	  sifat.id = "2302158";
	  sifat.name = "Sifat Adib ";
	  sifat.adrs = " Dhaka";
	  sifat.phn = "01612221399 ";

	ece jahin = new ece ();
	  jahin.id = "2302160";
	  jahin.name = "Jahin Maruf ";
	  jahin.adrs = "Rangpur";
	  jahin.phn = "01860715000 ";

	ece mohib = new ece ();
	  mohib.id = "2302165";
	  mohib.name = "Mohibullah Hasan ";
	  mohib.adrs = " Thakugaon";
	  mohib.phn = "Missing ";

	ece mithun = new ece ();
	  mithun.id = "2302167";
	  mithun.name = "M K R Mithun ";
	  mithun.adrs = " Dinajpur";
	  mithun.phn = "Missing ";

	ece happy = new ece ();
	  happy.id = "2302169";
	  happy.name = "Happy Akter";
	  happy.adrs = " Sirajganj";
	  happy.phn = "01755767162 ";

	ece nusrat = new ece ();
	  nusrat.id = "2302170";
	  nusrat.name = "Nusrat Jahan Mehebuba ";
	  nusrat.adrs = "Bogura ";
	  nusrat.phn = "01715308249";

	ece efaz = new ece ();
	  efaz.id = "2302171";
	  efaz.name = "Efaz Ahamed";
	  efaz.adrs = "Chittagong ";
	  efaz.phn = "01945379647";

	ece shohag = new ece ();
	  shohag.id = "2302173";
	  shohag.name = "Abdur Rauf Shohag";
	  shohag.adrs = "Thakugaon ";
	  shohag.phn = "017745744984";

	ece mimma = new ece ();
	  mimma.id = "2302174";
	  mimma.name = "Mimma Khatun";
	  mimma.adrs = "Sirajganj";
	  mimma.phn = "Missing";

	ece beman = new ece ();
	  beman.id = "2302175";
	  beman.name = "Beman Chandra Bormon ";
	  beman.adrs = "Ponchogor";
	  beman.phn = "01518717219";

	ece rasel = new ece ();
	  rasel.id = "2302176";
	  nusrat.name = "Rasel Babu";
	  nusrat.adrs = "Dinajpur";
	  nusrat.phn = "01640194742";

	ece atiq = new ece ();
	  atiq.id = "2302178";
	  atiq.name = "Mohammad Atiqur Rahman";
	  atiq.adrs = "Bogura ";
	  atiq.phn = "01516512480";

	ece sobuj = new ece ();
	  sobuj.id = "2302179";
	  sobuj.name = "MD Sobuj Rana";
	  sobuj.adrs = "Rangpur";
	  sobuj.phn = "01404798850";

	ece sonjoy = new ece ();
	  sonjoy.id = "2202148";
	  sonjoy.name = "Sonjoy Soren";
	  sonjoy.adrs = "Dinajpur";
	  sonjoy.phn = "Missing";

	ece shafiul = new ece ();
	  shafiul.id = "2202140";
	  shafiul.name = "MD Shafiul Umam";
	  shafiul.adrs = "Kurigram";
	  shafiul.phn = "01783810712";

	ece tamim = new ece ();
	  tamim.id = "2202149";
	  tamim.name = "Tamim Hasnat";
	  tamim.adrs = "Dinajpur";
	  tamim.phn = "01785825856";


	if (id == 2302103)
	  {
		adeb.show ();
	  }

	else if (id == 2202140)
	  {
		shafiul.show ();

	  }
	else if (id == 2202148)
	  {
		sonjoy.show ();

	  }
	else if (id == 2202149)
	  {
		tamim.show ();

	  }
	else if (id == 2302104)
	  {
		mahin.show ();

	  }
	else if (id == 2302106)
	  {
		nahid.show ();

	  }
	else if (id == 2302108)
	  {
		rohan.show ();

	  }
	else if (id == 2302109)
	  {
		chaon.show ();

	  }

	else if (id == 2302111)
	  {
		ananna.show ();

	  }
	else if (id == 2302113)
	  {
		ratry.show ();

	  }
	else if (id == 2302115)
	  {
		moyna.show ();

	  }
	else if (id == 2302116)
	  {
		fuad.show ();

	  }
	else if (id == 2302118)
	  {
		shuvo.show ();

	  }
	else if (id == 2302121)
	  {
		sourov.show ();

	  }
	else if (id == 2302123)
	  {
		harun.show ();

	  }
	else if (id == 2302129)
	  {
		rimon.show ();

	  }
	else if (id == 2302131)
	  {
	  romjan.show ();
	  }
	else if (id == 2302132)
	  {
		himel.show ();

	  }
	else if (id == 2302137)
	  {
		sinthi.show ();

	  }
	else if (id == 2202140)
	  {
		ifti.show ();

	  }
	else if (id == 2302141)
	  {
		aziz.show ();

	  }
	else if (id == 2302145)
	  {
		mahim.show ();

	  }
	else if (id == 2302146)
	  {
		rose.show ();

	  }
	else if (id == 2202148)
	  {
		hajda.show ();

	  }
	else if (id == 2302150)
	  {
		sojib.show ();

	  }
	else if (id == 2302152)
	  {
		zim.show ();

	  }
	else if (id == 2302155)
	  {
		parvin.show ();

	  }
	else if (id == 2302156)
	  {
		muhin.show ();

	  }
	else if (id == 2302158)
	  {
		sifat.show ();

	  }
	else if (id == 2302160)
	  {
		jahin.show ();

	  }

	else if (id == 2302165)
	  {
		mohib.show ();
	  }
	else if (id == 2302167)
	  {
		mithun.show ();
	  }
	else if (id == 2302169)
	  {
		happy.show ();
	  }
	else if (id == 2302170)
	  {
		nusrat.show ();
	  }
	else if (id == 2302171)
	  {
		efaz.show ();
	  }
	else if (id == 2302173)
	  {
		shohag.show ();
	  }
	else if (id == 2302174)
	  {
		mimma.show ();
	  }
	else if (id == 2302175)
	  {
		beman.show ();
	  }
	else if (id == 2302176)
	  {
		rasel.show ();
	  }
	else if (id == 2302178)
	  {
		atiq.show ();
	  }
	else if (id == 2302179)
	  {
		sobuj.show ();
	  }
	  else{
	      System.out.println("Wrong student ID. Please enter a valid student ID.");
	  }

  }

}
