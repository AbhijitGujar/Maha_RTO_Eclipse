package com.example.punerto.Activity;

import java.util.ArrayList;
import co.example.punerto.classes.OfficeList;
import com.androidexample.gcm.R;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class ActivityRtoOfficeList extends ActionBarActivity {

	ListView lst_officeDetails;
	OfficeList officeList;

	public static ArrayList<OfficeList> arryOfficeLists = new ArrayList<OfficeList>();

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		ActionBar actionBar = getSupportActionBar();
		actionBar.setHomeButtonEnabled(true);
		actionBar.setDisplayHomeAsUpEnabled(true);

		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#0000ff")));
		if (ActivityLanguage.lang.equals("English")) {
			setContentView(R.layout.activity_office_list);
			actionBar.setTitle("RTO Offices");

		} else {
			setContentView(R.layout.activity_office_list);
			actionBar.setTitle(R.string.rto_officess);
		}

		lst_officeDetails = (ListView) findViewById(R.id.list_oFFICE);
		arryOfficeLists.clear();

		if (ActivityLanguage.lang.equals("English")) {
			arryOfficeLists
					.add(new OfficeList(
							"MH 01",
							"RTO Mumbai Central",
							"Shri. K.T. Golani.Regional Transport Office Old bodyguard lane, Tulsiwadi, Tardeo,Mumbai - 400034.",
							"022/23534603", "022/23534600", "022/23534601",
							"022/23516602", "020/23532337",
							"MH01@mahatranscom.in", "Shri.K.T. Golani."));

			arryOfficeLists
					.add(new OfficeList(
							"MH 02",
							"RTO Mumbai (West)",
							"Shri. P.G. Bhalerao,Regional Transport Office,111-D, Ambivali village, New manish nagar, Versova road, Mumbai- 400 053.",
							"022/26366957", "022/26362252", " 022/26319821",
							"022/26323315", "022/26366957",
							"MH02@mahatranscom.in", "Shri.P.G.Bhalerao"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 03",
							"RTO Mumbai (East)",
							"Shri.B.I..Ajri (R.T.O)Regional Transport OfficeB-2, 3rd floor, Wadala truck terminals, Wadala, Mumbai - 400037.",
							"022/24036261", "022/24036221", "022/24036479", "",
							"", "MH03@mahatranscom.in", "Shri.B.I.Ajri"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 04",
							"RTO Thane",
							"Shri. M.B.Jadhav (R.T.O)Regional Transport OfficeOpp. Central Jail, Thane - 400 601.",
							"022/25365660", "022/25343580", "022/25363838",
							"022/25442555", "", "MH04@mahatranscom.in",
							"Shri.M.B.Jadhav"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 05",
							"Dy. RTO Kalyan",
							"Shri. V.R. Gujrathi (Dy.R.T.O) Dy. Regional Transport Office Sahyadri Nagar ,Chikanghar, Nr. Birla School, Kalyan(W) Dist. -Thane , Pin.421301",
							"0251/2230888", "0251/2230505", "", "", "",
							"MH05@mahatranscom.in", "Shri. V.R. Gujrathi"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 06",
							"Dy. RTO Pen - Raigad",
							"Shri. S.S.Meshram (Kamat) (Dy.R.T.O) Dy. Regional Transport Office Vikas Smruti, Pen Khopoli Road, Utkarsha Nagar,Taluka - Pen,Dist. Raigad. - 402107",
							"02143/255868", "02143/252234", "", "", "",
							"MH06@mahatranscom.in", "Shri. S.S.Meshram Kamat"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 07",
							"Dy.RTO Sindhudurg",
							"Shri. K.G.Bidkar (Dy.R.T.O) Dy. Regional Transport Office Sindhudurg Nagari, Oros, Tal.- Kudal Dist.Sindhudurg -416812",
							"0236/2229020", "02362/229050", "", "", "",
							"MH07@mahatranscom.in", "Shri. K.G.Bidkar"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 08",
							"Dy. RTO Ratnagiri",
							"Shri. D.N. Manvar (Dy.R.T.O) Dy. Regional Transport Office Survey No 56, Ganesh Nagar, Pomendi Kurd, Kuwarbav, Tal. & Dist. Ratnagiri- 415612",
							"02352/230377", "02352/229444", "", "", "",
							"MH08@mahatranscom.in", "Shri.D.N.Manvar"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 09",
							"RTO Kolhapur",
							"Shri.L.A.Darade (R.T.O) Regional Transport Office 204 E, Tarabai Park, Kolhapur - 416003",
							"0231/2661010", "0231 /2663131", "", "", "",
							"MH09@mahatranscom.in", "Shri.L.A.Darade"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 10",
							"Dy.RTO Sangli",
							"Shri. H.S.Gadsingh (Dy.R.T.O) Dy. Regional Transport Office Madhav nagar road, Industrial estate, Sangli 416 416",
							"0233/2310888", "0233/2310555", "", "", "",
							"MH10@mahatranscom.in", "Shri. H.S.Gadsingh"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 11",
							"Dy.RTO Satara",
							"Shri. S.P Raut (Dy.R.T.O) Dy. Regional Transport Office Sharve No. 409/6, 515/1 & 515/2 Sadar Bazar, Camp, Satara - 415 001.",
							"02162/235888", "02162/230330", "02162/235888", "",
							"", "MH11@mahatranscom.in", "Shri. S.P Raut"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 12",
							"RTO Pune",
							"Shri. J.B.Patil (R.T.O) Regional Transport Office 39, Dr. Ambedkar Raod, Near Sangam bridge, Pune - 411 001.",
							"020/26058282", "020/26058080", "020 / 26058090",
							"", "", "MH12@mahatranscom.in", "Shri. J.B.Patil"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 13",
							"Dy.RTO Solapur",
							"Shri. D.A.Patil (Addl. Charge) (Dy.R.T.O) Dy. Regional Transport Office Vijapur road, S.T. colony, Sundaram nagar, Solapur - 413 004.",
							"0217/2339034", "0217/2303099", "", "", "",
							"MH13@mahatranscom.in", "Shri. D.A.Patil"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 14",
							"Dy. RTO Pimpri -chinchwad",
							"Shri. A.B.Shinde (Dy.R.T.O) Dy. Regional Transport Office Purna Complex, A Wing,Opp. Telco Gate, Chikhali Rd ,Pimpari - Chinchwad Pune -411019",
							"020/27492829", "020/27492828", "", "", "",
							"MH14@mahatranscom.in", "Shri. A.B.Shinde"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 15",
							"RTO Nashik",
							"Regional Transport Office eth road, Panchvati, Nashik - 422 044.",
							"0253/229009", "0253/2229005", "", "", "",
							"MH15@mahatranscom.in", "Shri.J. S.Bansod"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 16",
							"Dy.RTO Ahmednagar",
							"Shri. V.D. Kamble (Dy.R.T.O) Dy. Regional Transport Office Bunglow No-8, Nagar Wanbori Road, Ahmednager. 414001",
							"0241/2431530", "0241/2431530", "", "", "",
							"MH16@mahatranscom.in", "Shri. V.D. Kamble"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 17",
							"Dy.RTO Shrirampur",
							"Shri. S.T. Alwaris (Dy.R.T.O) Dy. Regional Transport Office Market yard, Nevasa road,Dist . Ahemed nagar Shrirampur. 413709",
							"02422/224751", "02422/222175", "02422/223102", "",
							"", "MH17@mahatranscom.in", "Shri. S.T. Alwaris"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 18",
							"Dy.RTO Dhule",
							"Shri. V.D. Pandkar (R.T.O) Regional Transport Office Dhdh Bhavan, Mohadi Upanagar N.H. No -3 Mumbai Agra Road Dhule - 424 311",
							"02562/281751", "02562/281351", "02562/281352", "",
							"", "MH18@mahatranscom.in", "Shri. V.D. Pandkar"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 19",
							"Dy.RTO Jalgaon",
							"Shri.S. S. Ware (Dy.R.T.O) Dy. Regional Transport Office Ploe No.7 Adarsh Nagar Near S. P. Chowk Jalgaon - 425 001.",
							"0257/2261819", "0257/2262619", "", "", "",
							"MH19@mahatranscom.in", "Shri.S. S. Ware"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 20",
							"RTO Aurangabad",
							"Shri. G. R. Saindane (R.T.O) Regional Transport Office Railway Station, Road Aurangabad - 431 001",
							"0240/2331133", "0240/2331135", ",0240/2321164",
							"", "", "MH20@mahatranscom.in",
							"Shri. G. R. Saindane"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 21",
							"Dy. RTO Jalna",
							"Shri Sham S. Lohi (Dy.R.T.O.) Regional Transport Office Group no. 246, Nagewadi, Dist. Jalna.",
							"0240/2331133", "02482/220929", "02482/220968", "",
							"", "MH21@mahatranscom.in", "Shri Sham S. Lohi"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 22",
							"Dy. RTO Parbhani",
							"Shri. R.K.Gaikawad, (Dy.R.T.O) Dy. Regional Transport Office Manvat Road, Parbhani-433715",
							"02452/291000", "02452/291000", "", "", "",
							"MH22@mahatranscom.in", "Shri. A.A.I.Khan"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 23",
							"Dy. RTO Beed",
							"Shri. A.A.I.Khan (Dy.R.T.O.) Jalna Road, Mauje Ghosapuri, Namal Gaon Phata, Beed",
							"02442/256111", "02442/256111", "", "", "",
							"MH23@mahatranscom.in", "Dr. D.T.Pawar"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 24",
							"RTO Latur",
							"Dr. D.T. Pawar (R.T.O) Regional Transport Office Parivahan Bhavan,Bhabhalgaon Road, Latur-413512",
							"02382 /242434", "02382/242434", " 02382/242435",
							"", "", "MH24@mahatranscom.in",
							"Shri. S.P. Metrewar"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 25",
							"Dy. RTO Osmanabad",
							"Shri. S.P. Metrewar (Dy.R.T.O) Dy.Regional Transport Office Plot No. 18 MIDC Area , Osmanabad.- 413 501",
							"02472/221555", "02472/221555", "", "", "",
							"MH25@mahatranscom.in", "Shri.R.S. Lode Patil"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 26",
							"RTO Nanded",
							"Shri.R.S. Lode Patil. (R.T.O) Regional Transport Office B-13 Marathwada ceramioc compl, MIDC Cidco Nanded-431603",
							"02462/228900", "02462/259900", "", "", "",
							"MH26@mahatranscom.in", "Shri.S.K.Wadekar"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 27",
							"RTO Amravati",
							"Shri.S.K.Wadekar (R.T.O) Regional Transport Office Near Collectorate Camp, Amravati-444602",
							"0721/2662606", "0721/2662032", "0721/2662606", "",
							"", "MH27@mahatranscom.in", "Shri. S.M.Chavan"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 28",
							"Dy.RTO Buldhana",
							"Shri. S.M.Chavan ( Dy.R.T.O ) Dy. Regional Transport Office Opp. Malkapur Road, Buldhana Tq. Dist -Buldhana Pin - 443001.",
							"07262/242244", "07262/242244", "", "", "",
							"MH28@mahatranscom.in", "Shri.S.S.Zol"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 29",
							"Dy. RTO Yavatmal",
							"Shri.S.S.Zol , ( Dy.R.T.O ) Dy. Regional Transport Office Yawatmal Near Kalamb Chowk, Nagpur Road, Yawatmal, Tq. -Dist",
							"07232/255111", "07232/255111", "", "", "",
							"MH29@mahatranscom.in", "Shri.V.S. Ahire"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 30",
							"Dy. RTO Akola",
							"Shri.V.S. Ahire (Dy.R.T.O) Dy. Regional Transport Office N. H.No.6 Murtizapurr Road, Near Krishi Nagar, Akola - 444104",
							"0233/2310888", "0233/2310555", "", "", "",
							"MH30@mahatranscom.in", "Shri.S.R.Shelke"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 31",
							"RTO Nagpur(Urban",
							"Shri.S.R.Shelke ( R.T.O ) Regional Transport Office Opp. Giripeth Post Office, Amravati Road Nagpur-440001.",
							"0712/2561698", "0712/2560781", "", "", "",
							"MH31@mahatranscom.in", "Shri. V.R.Majrikar"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 32",
							"Dy. RTO Wardha",
							"Shri. V.R.Majrikar ( Dy.R.T.O ) Dy. Regional Transport Office Administrative Bldg.,1st Floor, Sevagram Road, Wardha-442001",
							"07152/243543", "07152/252400", "", "", "",
							"MH32@mahatranscom.in", "Shri.V.S.Jichakar"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 33",
							"Dy.RTO Gadchiroli",
							"Shri.V.S.Jichakar ( Dy.R.T.O ) Dy. Regional Transport Office New Administrative Bldg No .2., Near Collector Office, Complex, Gadchiroli - 442605",
							"07132/222195", "07132/222195", "", "", "",
							"MH33@mahatranscom.in", "Shri.P.D.Gandawar"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 34",
							"Dy.RTO Chandrapur",
							"Shri.P.D.Gandawar ( Dy.R.T.O ) Dy. Regional Transport Office Behind LIC Bldg, Jailnagar ward, Chandrapur Pin -442401",
							"07172/2555", "0712/255372", "", "", "",
							"MH34@mahatranscom.in", "Shri.D.G.Waghule"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 35",
							"Dy.RTO Gondia",
							"Shri.D.G.Waghule ( Dy.R.T.O ) Fulchur Naka, Fulchurtola, Gondia,Tah -Dist. Gondia -",
							"07182/237321", "07182/237321", "", "", "",
							"MH15@mahatranscom.in",
							"Shri.Atul Aade(Addl.charge)"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 36",
							"Dy.RTO Bhandara",
							"Shri.Atul Aade(Addl.charge)(Dy.R.T.O) Dy. Regional Transport Office Administrative Bldg.,NH-6, .Bhandara-441904",
							"07184/288167", "07184/258165", "", "", "",
							"MH36@mahatranscom.in", "Shri G. M. Nerpagar"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 37",
							"Dy. RTO Washim",
							"Shri G. M. Nerpagar (Dy.R.T.O) Dy. Regional Transport Office A/P -D .Ed . College Building , Risod Road Lakhala, Washim- 444505",
							"07252/235244", "07252/235244", "", "", "",
							"MH37@mahatranscom.in", "Shri. R.R.Sawant"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 38",
							"Dy. RTO Hingoli",
							"Shri. V.D. Pandkar (R.T.O) Regional Transport Office Dhdh Bhavan, Mohadi Upanagar N.H. No -3 Mumbai Agra Road Dhule - 424 311",
							"02562/281751", "02562/281351", "02562/281352", "",
							"", "MH18@mahatranscom.in", "Shri. P.K. Tadvi"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 39",
							"Dy. RTO Nandurbar",
							"Shri. P.K. Tadvi (Dy.R.T.O) Dy. Regional Transport Office Shasakiya Dhudh Bhavan, Sakri Road Nandurbar.-425412",
							"02564/210129", "02564/210129", "", "", "",
							"MH39@mahatranscom.in",
							"Shri. S.B. Badhiye (Addl.Charge)"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 40",
							"RTO Nagpur (Rural",
							"Shri. S.B. Badhiye (Addl.Charge) ( R.T.O ) Regional Transport Office Indora, Lal Godown No.9, Teka Naka,Kamptee Road, Nagpur (R)-440014",
							"0712/2630647", "0712/2630574", "", "", "",
							"MH40@mahatranscom.in", "Shri. Sudhakar B. More"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 41",
							"Dy.RTO Malegaon",
							"Shri. Sudhakar B. More (Dy.R.T.O) Dy. Regional Transport Office Market Yard, Camp Road Malegaon, Camp Malegaon, Dist.Nasik - 423105",
							"02554/258850", "02554/258850", "", "", "",
							"MH41@mahatranscom.in", "Shri. A. A. Patil"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 42",
							"Dy. RTO Baramati",
							"Shri. A. A. Patil (Dy.R.T.O) Dy. Regional Transport Office Vidhya Corner, MIDC Circle, Bhigwan Road,Baramati. Dist -Pune -413133",
							"02112/243805", "02112/243111", "", "", "",
							"MH42@mahatranscom.in", "Shri.S.P Dhigude"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 43",
							"Dy.RTO Vashi-Navi Mum",
							"Shri. V.R.Majrikar ( Dy.R.T.O ) Dy. Regional Transport Office Administrative Bldg.,1st Floor, Sevagram Road, Wardha-442001",
							"07152/243543", "07152/252400", "", "", "",
							"MH32@mahatranscom.in", "Shri. S.J. Sadamate"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 44",
							"Dy. RTO Ambajogai",
							"Shri. S.J. Sadamate (not joined) Shri.V.V. Chavan (Addl.charge) (Dy.R.T.O) Dy. Regional Transport Office Yeshwantrao Chavan Chowk, Morewadi Ambajogai, Dist.Beed",
							"02446/246251", "02446/247755", "", "", "",
							"MH33@mahatranscom.in", "Shri. Deepak A.Patil"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 45",
							"Dy.RTO Akluj",
							"Shri. Deepak A.Patil (Dy.R.T.O) Dy. Regional Transport Office Tahshil - Malshiras, Dist. Solapur. Pin -413101",
							"02185/227555", "02185 /231231", "", "", "",
							"MH45@mahatranscom.in", "Shri. A.D.Yeola"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 46",
							"RTO Panvel",
							"Regional Transport Office,Central Facility Bldg, Steel Market, Kalamboli, Tal -Panvel, Dist -Raigad, Pin - 410 218",
							"022/2636695", "022/27424444", "", "", "",
							"MH46@mahatranscom.in", "Shri. B.D. Kalaskar"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 47",
							"Dy. RTO Borivali",
							"Shri. B.D. Kalaskar. (Dy. R.T.O) Dy. Regional Transport Office C/o : RTO Mumbai (W).111-D, Ambivali village, New manish nagar, Versova road, Mumbai - 400 053",
							"07184/288167", "07184/258165", "", "", "",
							"MH47@mahatranscom.in", "Shri. A.S. Patil"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 48",
							"Dy. RTO Vasai",
							"Shri. A.S. Patil (Dy.R.T.O) Dy. Regional Transport Office At. Post Chandansar, Virar (E), Tal -Vasai,Dist -Thane - 401 303.",
							"0250/2523888", "0250/2523888", "", "", "",
							"MH48@mahatranscom.in", ""));

			arryOfficeLists
					.add(new OfficeList(
							"MH 49",
							"Dy.RTO Nagpur (EAST",
							"Shri.R.S.Bhuyar ( Dy.R.T.O ) Dy. Regional Transport Office C/O .Opp. Giripeth post office, Nagur-440001.",
							"Not Available", "Not Avaialable", "", "", "",
							"MH49@mahatranscom.in", "Shri.R.S.Bhuyar"));

			arryOfficeLists
					.add(new OfficeList(
							"MH 50",
							"Dy. RTO Nandurbar",
							"Shri. P.K. Tadvi (Dy.R.T.O) Dy. Regional Transport Office Shasakiya Dhudh Bhavan, Sakri Road Nandurbar.-425412",
							"02564/210129", "02564/210129", "", "", "",
							"MH50@mahatranscom.in", "Shri. L.A. Darade"));

			AdapterOfficeList adapterOfficeList = new AdapterOfficeList(
					getApplicationContext(), arryOfficeLists);
			lst_officeDetails.setAdapter(adapterOfficeList);
		} else {

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ०१ ",
							"प्रादेशिक परिवहन अधिकारी,मुंबई (मध्य) ",
							"प्रादेशिक परिवहन अधिकारी,मुंबई (मध्य) जुने बॉडीगार्ड लेन, तुळशीवाडी,ताडदेव, मुंबई- 400 034",
							"०२२/२३५३४६०३", "२३५३२३३७", "२३५३४६००", "२३५३४६०३",
							"", "MH01@mahatranscom.in", "Shri.K.T. Golani."));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ०२",
							"प्रादेशिक परिवहन अधिकारी,मुंबई (पश्चिम)",
							"प्रादेशिक परिवहन अधिकारी,मुंबई (पश्चिम) 111-डी, आबिवली व्हिलेज, मनिष नगर समोर, वर्सोवा रोड, अंधेरी पश्चिम, मुंबई 400 053",
							"०२२/२६३६६९५७", "०२२/२६३६२२५२", " ०२२/२६३१९८२१",
							"०२२/२६३२३३१५", "०२२/२६३६६९५७",
							"MH02@mahatranscom.in", "Shri.P.G.Bhalerao"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-०३",
							"प्रादेशिक परिवहन अधिकारी,मुंबई(पूर्व)",
							"प्रादेशिक परिवहन अधिकारी,मुंबई(पूर्व) 1) वडाळा ट्रक टर्मिनल, बिÏल्डग बी-2, 2 रा मजला, वडाळा, मुंबई-37 2) शासकीय परिवहन सेवा बिल्डिग शेजारी, सर पोचखानवाला मार्ग, वरळी, मंुबई-400 025.",
							"०२२/२४०३६२६१", " ०२२/२४०३६२२१", "०२२/२४०३६४७९",
							"", "", "MH03@mahatranscom.in", "Shri.B.I.Ajri"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-०४",
							"प्रादेशिक परिवहन अधिकारी, ठाणे",
							"प्रादेशिक परिवहन अधिकारी, ठाणे मध्यवर्ती कारागृहाजवळ,ठाणे-400 601.",
							"०२२/२५३६५६६०", " ०२२/२५३४३५८०", "०२२/२५३६३८३८",
							"०२२/२५४४२५५५", "", "MH04@mahatranscom.in",
							"Shri.M.B.Jadhav"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ०५",
							"उप प्रादेशिक परिवहन अधिकारी,कल्याण",
							"उप प्रादेशिक परिवहन अधिकारी, कल्याण सहयाद्री नगर, चिकण घर, बिर्ला कॉलेज जवळ, कल्याण, जिल्हा ठाणे 431301",
							"०२५१/२२३०८८८", "०२५१/२२३०५०५", "", "", "",
							"MH05@mahatranscom.in", "Shri. V.R. Gujrathi"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-०६",
							"उप प्रादेशिक परिवहन अधिकारी, पेण",
							"उप प्रादेशिक परिवहन अधिकारी, पेण महानगरपालिका कार्यालय कंपाऊंड, मुक्काम पोस्ट पेण, जिल्हा रायगड,",
							"०२१४३/२५५८६८", "०२१४३/२५२२३४", "", "", "",
							"MH06@mahatranscom.in", "Shri. S.S.Meshram Kamat"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ०७",
							"उप प्रादेशिक परिवहन अधिकारी, सिंधुदुर्ग",
							"उप प्रादेशिक परिवहन अधिकारी, सिंधुदुर्ग मु.पो. ओरस, मुंबई गोवा महामार्गाजवळ, ता. कुडाळ, जि.सिधुदुर्ग. 416520",
							"०२३६/२२२९०२०", " ०२३६२/२२९०५०", "", "", "",
							"MH07@mahatranscom.in", "Shri. K.G.Bidkar"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ०८",
							"उप प्रादेशिक परिवहन अधिकारी, रत्नागिरी",
							"उप प्रादेशिक परिवहन अधिकारी, रत्नागिरी पामोडी खुर्द गणेशनगर, कुवारबाव, जि. रत्नागिर्री.",
							"०२३५२/२३०३७७", "०२३५२/२२९४४४", "", "", "",
							"MH08@mahatranscom.in", "Shri.D.N.Manvar"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ०९ ",
							"प्रादेशिक परिवहन अधिकारी, कोल्हापूर",
							"प्रादेशिक परिवहन अधिकारी, कोल्हापूर 213, ई नागळा पार्क, कोल्हापूर",
							"०२३१/२६६१०१०", "०२३१ /२६६३१३१", "", "", "",
							"MH09@mahatranscom.in", "Shri.L.A.Darade"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-  १०",
							"उप प्रादेशिक परिवहन अधिकारी, सांगली",
							"उप प्रादेशिक परिवहन अधिकारी, सांगली माधव नगर रोड,, औद्योगिक वसाहत, सांगली 416 416.",
							"०२३३/२३१०८८८", "०२३३/२३१०५५५", "", "", "",
							"MH10@mahatranscom.in", "Shri. H.S.Gadsingh"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ११",
							"उप प्रादेशिक परिवहन अधिकारी, सातारा",
							"उप प्रादेशिक परिवहन अधिकारी, सातारा 484, सदर बाजार, भुरके बंगलो, कॅम्प, सातारा-415 401",
							"०२१६२/२३५८८८", "०२१६२/२३०३३०", "०२१६२/२३५८८८", "",
							"", "MH11@mahatranscom.in", "Shri. S.P Raut"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-  १२",
							"प्रादेशिक परिवहन अधिकारी, पुणे",
							"प्रादेशिक परिवहन अधिकारी, पुणे 38, डॉ.आंबेडकर रोड, संगम ब्रिाजजवळ, पुणे-411 001.",
							"०२०/२६०५८२८२", "०२०/२६०५८०८०", "०२० / २६०५८०९०",
							"", "", "MH12@mahatranscom.in", "Shri. J.B.Patil"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- १३",
							"उप प्रादेशिक परिवहन अधिकारी, सोलापूर",
							"उप प्रादेशिक परिवहन अधिकारी, सोलापूर विजापूर रोड, एस.टी.कॉलनी, सुंदरनगर, सोलापूर-413 004.",
							"०२१७/२३३९०३४", "०२१७/२३०३०९९", "", "", "",
							"MH13@mahatranscom.in", "Shri. D.A.Patil"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- १४",
							"उप प्रादेशिक परिवहन अधिकारी, पिंपरी -चिंचवड ",
							"उप प्रादेशिक परिवहन अधिकारी, पिंपरी -चिंचवड पूर्णा कॉम्प्लेक्स, ए विंग, टेल्को गेटसमोर, चिखली रोड, चिंचवड,पुणे 411019.",
							"०२०/२७४९२८२९", "०२०/२७४९२८२८", "", "", "",
							"MH14@mahatranscom.in", "Shri. A.B.Shinde"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-  १५",
							"प्रादेशिक परिवहन अधिकारी, नाशिक ",
							"प्रादेशिक परिवहन अधिकारी, नाशिक पेठ रोड, पंचवटी,नाशिक 422 004.",
							"०२५३/२२९००९", "०२५३/२२२९००५", "", "", "",
							"MH15@mahatranscom.in", "Shri.J. S.Bansod"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-  १६",
							"उप प्रादेशिक परिवहन अधिकारी, अहमदनगर ",
							"उप प्रादेशिक परिवहन अधिकारी, अहमदनगर बंगला क्रमांक 8, नगर बंबोरी रोड, अहमदनगर.",
							"०२४१/२४३१५३०", "०२४१/२४३१५३०", "", "", "",
							"MH16@mahatranscom.in", "Shri. V.D. Kamble"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-  १७",
							"उप प्रादेशिक परिवहन अधिकारी, श्रीरामपूर",
							"उप प्रादेशिक परिवहन अधिकारी, श्रीरामपूर मार्केट यार्ड, नेवासा रोड, श्रीरामपूर.",
							"०२४२२/२२४७५१", "०२४२२/२२२१७५", "०२४२२/२२३१०२", "",
							"", "MH17@mahatranscom.in", "Shri. S.T. Alwaris"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- १८",
							"प्रादेशिक परिवहन अधिकारी, धुळे ",
							"प्रादेशिक परिवहन अधिकारी, धुळे दुध भवन, मुंबई आग्रा रोड, मोहाडी परिसर, धुळे.424 001.",
							"०२५६२/२८१७५१", "०२५६२/२८१३५१", "०२५६२/२८१३५२", "",
							"", "MH18@mahatranscom.in", "Shri. V.D. Pandkar"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- १९",
							"उप प्रादेशिक परिवहन अधिकारी, जळगाव",
							"उप प्रादेशिक परिवहन अधिकारी, जळगाव 7 आदर्श नगर, महाबळ कॉलनी रोड, डी.एस.पी. बंगल्याजवळ, जळगाव.425 001",
							"०२५७/२२६१८१९", "०२५७/२२६२६१९", "", "", "",
							"MH19@mahatranscom.in", "Shri.S. S. Ware"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- २०",
							"प्रादेशिक परिवहन अधिकारी, औरंगाबाद",
							"प्रादेशिक परिवहन अधिकारी, औरंगाबाद रेल्वे स्टेशनजवळ, औरंगाबाद-431 001.",
							"०२४०/२३३११३३", "०२४०/२३३११३५", ",0240/2321164",
							"", "", "MH20@mahatranscom.in",
							"Shri. G. R. Saindane"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- २१ ",
							"उप प्रादेशिक परिवहन अधिकारी, जालना ",
							"उप प्रादेशिक परिवहन अधिकारी, जालना अतिरिक्त औद्योगिक वसाहत, नागेवाडी, जालना औरंगाबाद रोड, जालना.",
							"०२४०/२३३११३३", "०२४८२/२२०९२९", "०२४८२/२२०९६८", "",
							"", "MH21@mahatranscom.in", "Shri Sham S. Lohi"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- २२",
							"उप प्रादेशिक परिवहन अधिकारी, परभणी",
							"उप प्रादेशिक परिवहन अधिकारी, परभणी राजेश बिल्डींग, मोहिते गॅरेजजवळ, शिवमनगर, परभणी 431 122.",
							"०२४५२/२९१००० ", "०२४५२/२९१००० ", "", "", "",
							"MH22@mahatranscom.in", "Shri. A.A.I.Khan"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- २३",
							"उप प्रादेशिक परिवहन अधिकारी, बीड",
							"उप प्रादेशिक परिवहन अधिकारी, बीड भावे इमारत, दिपक बंगल्याजवळ, जुनी चंपावती ऑईल्स मिलजवळ, बार्शी नाका, बीड 431 122.",
							"०२४४२/२५६१११", "०२४४२ /२५६१११", "", "", "",
							"MH23@mahatranscom.in", "Dr. D.T.Pawar"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- २४",
							"्रादेशिक परिवहन अधिकारी, लातूर",
							"प्रादेशिक परिवहन अधिकारी, लातूर दत्त मंदिराजवळ, वोरा रोड, लातूर.",
							"०२३८२/२४२४३४", "०२३८२/२४२४३४ ", " ०२३८२ /२४२४३५ ",
							"", "", "MH24@mahatranscom.in",
							"Shri. S.P. Metrewar"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-  २५ ",
							"उप प्रादेशिक ारिवहन कार्यालय, उस्मानाबाद ",
							"उप प्रादेशिक ारिवहन कार्यालय, उस्मानाबाद शिवनेरी बंगला, भोसला शाळेजवळ, उस्मानाबाद",
							"०२४७२/२२१५५५ ", "०२४७२ /२२१५५५ ", "", "", "",
							"MH25@mahatranscom.in", "Shri.R.S. Lode Patil"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- २६",
							"प्रादेशिक परिवहन अधिकारी, नांदेड ",
							"प्रादेशिक परिवहन अधिकारी, नांदेड एम.आय.डी.सी. परिसर,नांदेड 431 601.",
							"०२४६२ /२२८९०० ", "०२४६२ /२५९९०० ", "", "", "",
							"MH26@mahatranscom.in", "Shri.S.K.Wadekar"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-  २७",
							"प्रादेशिक परिवहन अधिकारी, अमरावती",
							"प्रादेशिक परिवहन अधिकारी, अमरावती कलेक्टर कॅम्पजवळ, अमरावती-444 602.",
							"०७२१/२६६२६०६", "०७२१/२६६२०३२", "०७२१/२६६२६०६", "",
							"", "MH27@mahatranscom.in", "Shri. S.M.Chavan"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- २८",
							"उप प्रादेशिक परिवहन अधिकारी, बुलढाणा",
							"उप प्रादेशिक परिवहन अधिकारी, बुलढाणा सदरशिव निवास वॉर्ड क्र. 9, मलकापूर रोड, बुलढाणा. 443001.",
							"०७२६२/२४२२४४", "०७२६२/२४२२४४", "", "", "",
							"MH28@mahatranscom.in", "Shri.S.S.Zol"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- २९",
							"उप प्रादेशिक परिवहन अधिकारी, यवतमाळ",
							"उप प्रादेशिक परिवहन अधिकारी, यवतमाळ यवतमाळ नागपूर रोड, कळंब नाक्याजवळ, यवतमाळ, 445001",
							"०७२३२/२५५१११", "०७२३२/२५५१११", "", "", "",
							"MH29@mahatranscom.in", "Shri.V.S. Ahire"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ३०",
							"उप प्रादेशिक परिवहन अधिकारी, अकोला",
							"उप प्रादेशिक परिवहन अधिकारी, अकोला मेहेर बिÏल्डग, रामदास पेठ, खामकर लेन, वॉर्ड क्र. 40, नझुल प्लॅट क्र. 50 अकोला.444001.",
							"०२३३/२३१०८८८", "०२३३/२३१०५५५", "", "", "",
							"MH30@mahatranscom.in", "Shri.S.R.Shelke"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ३१",
							"प्रादेशिक परिवहन अधिकारी, नागपूर(शहर)",
							"प्रादेशिक परिवहन अधिकारी, नागपूर(शहर)ग िरीपेठ पोस्ट कार्यालयासमोर, अमरावती रोड, नागपूर 440 001.",
							"०७१२/२५६१६९८", "०७१२/२५६०७८१", "", "", "",
							"MH31@mahatranscom.in", "Shri. V.R.Majrikar"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ३२",
							"उप प्रादेशिक परिवहन अधिकारी, वर्धा",
							"उप प्रादेशिक परिवहन अधिकारी, वर्धा प्रशासकीय इमारत, जिल्हाधिकारी कार्यालय आवार, सेवाग्राम रोड, वर्धा-442 001.",
							"०७१५२/२४३५४३", "०७१५२/२५२४००", "", "", "",
							"MH32@mahatranscom.in", "Shri.V.S.Jichakar"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-  ३३",
							"उप प्रादेशिक परिवहन अधिकारी, गडचिरोली",
							"उप प्रादेशिक परिवहन अधिकारी, गडचिरोली नवीन प्रशासकीय इमारत, जिल्हाधिकारी कार्यालय, गडचिरोली.442605",
							"०७१३२/२२२१९५", "०७१३२/२२२१९५", "", "", "",
							"MH33@mahatranscom.in", "Shri.P.D.Gandawar"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-  ३४",
							"उप प्रादेशिक परिवहन अधिकारी, चंद्रपूर ",
							"उप प्रादेशिक परिवहन अधिकारी, चंद्रपूर नगीना बाग वॉर्ड, बोक रे प्लॉट, चंद्रपूर 442 401.",
							"०७१७२/२५५५", "०७१२/२५५३७२", "", "", "",
							"MH34@mahatranscom.in", "Shri.D.G.Waghule"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-  ३५",
							"उप प्रादेशिक परिवहन अधिकारी, गोंदिया ",
							"उप प्रादेशिक परिवहन अधिकारी, गोंदिया डॉ.वैयपी बंगला सिव्हिल लाईन,गोंदिया-440 016",
							"०७१८२/२३७३२१", "०७१८२/२३७३२१", "", "", "",
							"MH15@mahatranscom.in",
							"Shri.Atul Aade(Addl.charge)"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ३६",
							"उप प्रादेशिक परिवहन अधिकारी, भंडारा ",
							"उप प्रादेशिक परिवहन अधिकारी, भंडारा भरंतुकासिंग गिल इमारत, मुक्काम-करधा, जिल्हा-भंडारा. 441904",
							"०७१८४/२८८१६७", "०७१८४/२५८१६५", "", "", "",
							"MH36@mahatranscom.in", "Shri G. M. Nerpagar"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-  ३७ ",
							"उप प्रादेशिक परिवहन अधिकारी, वाशिम",
							"उप प्रादेशिक परिवहन अधिकारी, वाशिम बी.एड.कॉलेज बिÏल्डग, रिसोड रोड, वाशिम.444505",
							"०७२५२/२३५२४४", "०७२५२/२३५२४४", "", "", "",
							"MH37@mahatranscom.in", "Shri. R.R.Sawant"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ३८",
							"उप प्रादेशिक परिवहन अधिकारी, हिंगोली",
							"उप प्रादेशिक परिवहन अधिकारी, हिंगोली सर्वे न. 4, प्लॉट नं. 190, लिंबाळा मक्ता, हिंगोली. 413513",
							"०२५६२/२८१७५१", "०२५६२/२८१३५१", "०२५६२/२८१३५२", "",
							"", "MH18@mahatranscom.in", "Shri. P.K. Tadvi"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ३९",
							"उप प्रादेशिक परिवहन अधिकारी, नंदूरबार",
							"उप प्रादेशिक परिवहन अधिकारी, नंदूरबार शासकीय दूध योजना इमारत, जुने जिल्हाधिकारी कार्यालय, साखरी रोड, नंदुरबार 425 412",
							"०२५६४/२१०१२९", "०२५६४/२१०१२९", "", "", "",
							"MH39@mahatranscom.in",
							"Shri. S.B. Badhiye (Addl.Charge)"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-  ४० ",
							"प्रादेशिक परिवहन अधिकारी, नागपूर(ग्रामीण)",
							"प्रादेशिक परिवहन अधिकारी, नागपूर(ग्रामीण), इंदोरा लाल गोडाऊन नं.9, टेका नाका, कामठी रोड, नागपूर (ग्रामीण), 440 014.",
							"०७१२/२६३०६४७", "०७१२/२६३०५७४", "", "", "",
							"MH40@mahatranscom.in", "Shri. Sudhakar B. More"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ४१",
							"उप प्रादेशिक परिवहन अधिकारी, मालेगांव",
							"उप प्रादेशिक परिवहन अधिकारी, मालेगांव मालेगाव तालुका शेतकरी सहकारी संघ इमारत, मार्केट यार्ड, मालेगांव कॅम्प, मालेगाव, नासिक 423205",
							"०२५५४/२५८८५०", "०२५५४/२५८८५०", "", "", "",
							"MH41@mahatranscom.in", "Shri. A. A. Patil"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ४२",
							"उप प्रादेशिक परिवहन अधिकारी, बारामती",
							"उप प्रादेशिक परिवहन अधिकारी, बारामती विदयानगरी कॉर्नर, सुपर मार्केट, पी- 15, एमआयडीसी चौक, भिगवण रोड, बारामती 413 102.",
							"०२११२/२४३८०५", "०२११२/२४३१११", "", "", "",
							"MH42@mahatranscom.in", "Shri.S.P Dhigude"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ४३",
							"उप प्रादेशिक परिवहन अधिकारी, वाशी",
							"उप प्रादेशिक परिवहन अधिकारी, वाशी कृषि उत्पन्न बाजार समिती, धान्य मार्केट, सेक्टर नं. 19/ब, वाय ब्लॉक गेट नं.6, नवी मुंुबई.400703",
							"०७१५२/२४३५४३", "०७१५२/२५२४००", "", "", "",
							"MH32@mahatranscom.in", "Shri. S.J. Sadamate"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ४४",
							"उप प्रादेशिक परिवहन अधिकारी, अंबेजोगाई",
							"उप प्रादेशिक परिवहन अधिकारी, अंबेजोगाई प्लॉट नं.1, सहयोग गृहनिर्माण सोसायटी यशवंतराव चव्हाण चौक, मोरेवाडी, अंबाजोगाई. जि. बीड, 431501",
							"०२४४६/२४६२५१", "०२४४६/२४७७५५", "", "", "",
							"MH33@mahatranscom.in", "Shri. Deepak A.Patil"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ४५",
							"उप प्रादेशिक परिवहन अधिकारी, अकलूज",
							"उप प्रादेशिक परिवहन अधिकारी, अकलूज अकलूज, ता-माळशिरस, जि. सोलापूर.",
							"०२१८५/२२७५५५", "०२१८५ /२३१२३१", "", "", "",
							"MH45@mahatranscom.in", "Shri. A.D.Yeola"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ४६",
							"प्रादेशिक परिवहन अधिकारी, पनवेल",
							"प्रादेशिक परिवहन अधिकारी, पनवेल केंद्रीय सुविधा इमारत, लोखंड व पोलाद बाजार, कळंबोली, ता. पनवेल, जि. रायगड.",
							"०२२/२६३६६९५", "०२२/२७४२४४४४", "", "", "",
							"MH46@mahatranscom.in", "Shri. B.D. Kalaskar"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-  ४७",
							"उप प्रादेशिक परिवहन अधिकारी, बोरीवली ",
							"उप प्रादेशिक परिवहन अधिकारी, बोरीवली उप प्रा.प.अ. द्वारा प्रा.प.अ.,मुंबई(पश्चिम) अंधेरी",
							"०७१८४/२८८१६७", "०७१८४/२५८१६५", "", "", "",
							"MH47@mahatranscom.in", "Shri. A.S. Patil"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच- ४८",
							"उप प्रादेशिक परिवहन अधिकारी, वसई",
							"उप प्रादेशिक परिवहन अधिकारी, वसई मु.पो. चंदनसार, /भाटपाडा, विरार (पूर्व) ता. वसई, जि. ठाणे 401303",
							"०२५०/२५२३८८८", "०२५०/२५२३८८८", "", "", "",
							"MH48@mahatranscom.in", ""));

			arryOfficeLists.add(new OfficeList("एमएच- ४९",
					"उप प्रादेशिक परिवहन अधिकारी, नागपूर शहर(पूर्व)",
					"उप प्रादेशिक परिवहन अधिकारी, नागपूर शहर(पूर्व).",
					"Not Available", "Not Avaialable", "", "", "",
					"MH49@mahatranscom.in", "Shri.R.S.Bhuyar"));

			arryOfficeLists
					.add(new OfficeList(
							"एमएच-५० ",
							"उप प्रादेशिक परिवहन अधिकारी, कराड.",
							"उप प्रादेशिक परिवहन अधिकारी, कराड. शारदा मंगल कार्यालय, मौजे - पाडळी, कराड पाटण रोड, ता. कराड, जि. सातारा,415104",
							"०२५६४/२१०१२९", "०२५६४/२१०१२९", "", "", "",
							"MH50@mahatranscom.in", "Shri. L.A. Darade"));

			AdapterOfficeList adapterOfficeList = new AdapterOfficeList(
					getApplicationContext(), arryOfficeLists);
			lst_officeDetails.setAdapter(adapterOfficeList);

		}
		lst_officeDetails.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int pos,
					long id) {

				// arryOfficeLists.get(pos).get
				// OfficeView officeView = (OfficeView) view;
				Intent intent = new Intent(getApplicationContext(),
						ActivityOfficeDetails.class);

				intent.putExtra("id", arryOfficeLists.get(pos).getOfficeId());
				intent.putExtra("name", arryOfficeLists.get(pos)
						.getOfficeName());

				intent.putExtra("address", arryOfficeLists.get(pos)
						.getOfficeAddress());
				intent.putExtra("email", arryOfficeLists.get(pos).getEmailId());
				intent.putExtra("fax", arryOfficeLists.get(pos).getFax());
				intent.putExtra("telno", arryOfficeLists.get(pos).getTelNo());
				intent.putExtra("telno1", arryOfficeLists.get(pos).getTelNo1());
				intent.putExtra("telno2", arryOfficeLists.get(pos).getTelNo2());
				intent.putExtra("telno3", arryOfficeLists.get(pos).getTelNo3());
				intent.putExtra("officerName", arryOfficeLists.get(pos)
						.getOfficerName());
				startActivity(intent);
			}
		});

	}

	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();

		if (ActivityLanguage.lang.equals("English")) {
			inflater.inflate(R.menu.marathi, menu);
		} else {
			inflater.inflate(R.menu.english, menu);
		}

		return super.onCreateOptionsMenu(menu);
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);
		switch (item.getItemId()) {
		case R.id.action_lanMarathi:
			ActivityLanguage.lang = "Marathi";
			Intent i = getIntent();
			overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
					R.anim.exit_from_bottom);
			finish();
			// i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(i);
			overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
					R.anim.exit_from_bottom);
			break;

		case R.id.action_lanEnglish:
			ActivityLanguage.lang = "English";
			Intent iM = getIntent();
			finish();
			startActivity(iM);
			overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
					R.anim.exit_from_bottom);
			break;
		case android.R.id.home:
			this.finish();
			overridePendingTransition(R.anim.enter_from_bottom,
					R.anim.anim_for_eng_mar_switch_exit);
			break;

		default:
			return super.onOptionsItemSelected(item);

		}
		return true;

	}

	public static void main(String[] args) {
		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ०१ ",
						"प्रादेशिक परिवहन अधिकारी,मुंबई (मध्य) ",
						"प्रादेशिक परिवहन अधिकारी,मुंबई (मध्य) जुने बॉडीगार्ड लेन, तुळशीवाडी,ताडदेव, मुंबई- 400 034",
						"०२२/२३५३४६०३", "२३५३२३३७", "२३५३४६००", "२३५३४६०३", "",
						"MH01@mahatranscom.in", "Shri.K.T. Golani."));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ०२",
						"प्रादेशिक परिवहन अधिकारी,मुंबई (पश्चिम)",
						"प्रादेशिक परिवहन अधिकारी,मुंबई (पश्चिम) 111-डी, आबिवली व्हिलेज, मनिष नगर समोर, वर्सोवा रोड, अंधेरी पश्चिम, मुंबई 400 053",
						"०२२/२६३६६९५७", "०२२/२६३६२२५२", " ०२२/२६३१९८२१",
						"०२२/२६३२३३१५", "०२२/२६३६६९५७", "MH02@mahatranscom.in",
						"Shri.P.G.Bhalerao"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-०३",
						"प्रादेशिक परिवहन अधिकारी,मुंबई(पूर्व)",
						"प्रादेशिक परिवहन अधिकारी,मुंबई(पूर्व) 1) वडाळा ट्रक टर्मिनल, बिÏल्डग बी-2, 2 रा मजला, वडाळा, मुंबई-37 2) शासकीय परिवहन सेवा बिल्डिग शेजारी, सर पोचखानवाला मार्ग, वरळी, मंुबई-400 025.",
						"०२२/२४०३६२६१", " ०२२/२४०३६२२१", "०२२/२४०३६४७९", "",
						"", "MH03@mahatranscom.in", "Shri.B.I.Ajri"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-०४",
						"प्रादेशिक परिवहन अधिकारी, ठाणे",
						"प्रादेशिक परिवहन अधिकारी, ठाणे मध्यवर्ती कारागृहाजवळ,ठाणे-400 601.",
						"०२२/२५३६५६६०", " ०२२/२५३४३५८०", "०२२/२५३६३८३८",
						"०२२/२५४४२५५५", "", "MH04@mahatranscom.in",
						"Shri.M.B.Jadhav"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ०५",
						"उप प्रादेशिक परिवहन अधिकारी,कल्याण",
						"उप प्रादेशिक परिवहन अधिकारी, कल्याण सहयाद्री नगर, चिकण घर, बिर्ला कॉलेज जवळ, कल्याण, जिल्हा ठाणे 431301",
						"०२५१/२२३०८८८", "०२५१/२२३०५०५", "", "", "",
						"MH05@mahatranscom.in", "Shri. V.R. Gujrathi"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-०६",
						"उप प्रादेशिक परिवहन अधिकारी, पेण",
						"उप प्रादेशिक परिवहन अधिकारी, पेण महानगरपालिका कार्यालय कंपाऊंड, मुक्काम पोस्ट पेण, जिल्हा रायगड,",
						"०२१४३/२५५८६८", "०२१४३/२५२२३४", "", "", "",
						"MH06@mahatranscom.in", "Shri. S.S.Meshram Kamat"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ०७",
						"उप प्रादेशिक परिवहन अधिकारी, सिंधुदुर्ग",
						"उप प्रादेशिक परिवहन अधिकारी, सिंधुदुर्ग मु.पो. ओरस, मुंबई गोवा महामार्गाजवळ, ता. कुडाळ, जि.सिधुदुर्ग. 416520",
						"०२३६/२२२९०२०", " ०२३६२/२२९०५०", "", "", "",
						"MH07@mahatranscom.in", "Shri. K.G.Bidkar"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ०८",
						"उप प्रादेशिक परिवहन अधिकारी, रत्नागिरी",
						"उप प्रादेशिक परिवहन अधिकारी, रत्नागिरी पामोडी खुर्द गणेशनगर, कुवारबाव, जि. रत्नागिर्री.",
						"०२३५२/२३०३७७", "०२३५२/२२९४४४", "", "", "",
						"MH08@mahatranscom.in", "Shri.D.N.Manvar"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ०९ ",
						"प्रादेशिक परिवहन अधिकारी, कोल्हापूर",
						"प्रादेशिक परिवहन अधिकारी, कोल्हापूर 213, ई नागळा पार्क, कोल्हापूर",
						"०२३१/२६६१०१०", "०२३१ /२६६३१३१", "", "", "",
						"MH09@mahatranscom.in", "Shri.L.A.Darade"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-  १०",
						"उप प्रादेशिक परिवहन अधिकारी, सांगली",
						"उप प्रादेशिक परिवहन अधिकारी, सांगली माधव नगर रोड,, औद्योगिक वसाहत, सांगली 416 416.",
						"०२३३/२३१०८८८", "०२३३/२३१०५५५", "", "", "",
						"MH10@mahatranscom.in", "Shri. H.S.Gadsingh"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ११",
						"उप प्रादेशिक परिवहन अधिकारी, सातारा",
						"उप प्रादेशिक परिवहन अधिकारी, सातारा 484, सदर बाजार, भुरके बंगलो, कॅम्प, सातारा-415 401",
						"०२१६२/२३५८८८", "०२१६२/२३०३३०", "०२१६२/२३५८८८", "", "",
						"MH11@mahatranscom.in", "Shri. S.P Raut"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-  १२",
						"प्रादेशिक परिवहन अधिकारी, पुणे",
						"प्रादेशिक परिवहन अधिकारी, पुणे 38, डॉ.आंबेडकर रोड, संगम ब्रिाजजवळ, पुणे-411 001.",
						"०२०/२६०५८२८२", "०२०/२६०५८०८०", "०२० / २६०५८०९०", "",
						"", "MH12@mahatranscom.in", "Shri. J.B.Patil"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- १३",
						"उप प्रादेशिक परिवहन अधिकारी, सोलापूर",
						"उप प्रादेशिक परिवहन अधिकारी, सोलापूर विजापूर रोड, एस.टी.कॉलनी, सुंदरनगर, सोलापूर-413 004.",
						"०२१७/२३३९०३४", "०२१७/२३०३०९९", "", "", "",
						"MH13@mahatranscom.in", "Shri. D.A.Patil"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- १४",
						"उप प्रादेशिक परिवहन अधिकारी, पिंपरी -चिंचवड ",
						"उप प्रादेशिक परिवहन अधिकारी, पिंपरी -चिंचवड पूर्णा कॉम्प्लेक्स, ए विंग, टेल्को गेटसमोर, चिखली रोड, चिंचवड,पुणे 411019.",
						"०२०/२७४९२८२९", "०२०/२७४९२८२८", "", "", "",
						"MH14@mahatranscom.in", "Shri. A.B.Shinde"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-  १५",
						"प्रादेशिक परिवहन अधिकारी, नाशिक ",
						"प्रादेशिक परिवहन अधिकारी, नाशिक पेठ रोड, पंचवटी,नाशिक 422 004.",
						"०२५३/२२९००९", "०२५३/२२२९००५", "", "", "",
						"MH15@mahatranscom.in", "Shri.J. S.Bansod"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-  १६",
						"उप प्रादेशिक परिवहन अधिकारी, अहमदनगर ",
						"उप प्रादेशिक परिवहन अधिकारी, अहमदनगर बंगला क्रमांक 8, नगर बंबोरी रोड, अहमदनगर.",
						"०२४१/२४३१५३०", "०२४१/२४३१५३०", "", "", "",
						"MH16@mahatranscom.in", "Shri. V.D. Kamble"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-  १७",
						"उप प्रादेशिक परिवहन अधिकारी, श्रीरामपूर",
						"उप प्रादेशिक परिवहन अधिकारी, श्रीरामपूर मार्केट यार्ड, नेवासा रोड, श्रीरामपूर.",
						"०२४२२/२२४७५१", "०२४२२/२२२१७५", "०२४२२/२२३१०२", "", "",
						"MH17@mahatranscom.in", "Shri. S.T. Alwaris"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- १८",
						"प्रादेशिक परिवहन अधिकारी, धुळे ",
						"प्रादेशिक परिवहन अधिकारी, धुळे दुध भवन, मुंबई आग्रा रोड, मोहाडी परिसर, धुळे.424 001.",
						"०२५६२/२८१७५१", "०२५६२/२८१३५१", "०२५६२/२८१३५२", "", "",
						"MH18@mahatranscom.in", "Shri. V.D. Pandkar"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- १९",
						"उप प्रादेशिक परिवहन अधिकारी, जळगाव",
						"उप प्रादेशिक परिवहन अधिकारी, जळगाव 7 आदर्श नगर, महाबळ कॉलनी रोड, डी.एस.पी. बंगल्याजवळ, जळगाव.425 001",
						"०२५७/२२६१८१९", "०२५७/२२६२६१९", "", "", "",
						"MH19@mahatranscom.in", "Shri.S. S. Ware"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- २०",
						"प्रादेशिक परिवहन अधिकारी, औरंगाबाद",
						"प्रादेशिक परिवहन अधिकारी, औरंगाबाद रेल्वे स्टेशनजवळ, औरंगाबाद-431 001.",
						"०२४०/२३३११३३", "०२४०/२३३११३५", ",0240/2321164", "",
						"", "MH20@mahatranscom.in", "Shri. G. R. Saindane"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- २१ ",
						"उप प्रादेशिक परिवहन अधिकारी, जालना ",
						"उप प्रादेशिक परिवहन अधिकारी, जालना अतिरिक्त औद्योगिक वसाहत, नागेवाडी, जालना औरंगाबाद रोड, जालना.",
						"०२४०/२३३११३३", "०२४८२/२२०९२९", "०२४८२/२२०९६८", "", "",
						"MH21@mahatranscom.in", "Shri Sham S. Lohi"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- २२",
						"उप प्रादेशिक परिवहन अधिकारी, परभणी",
						"उप प्रादेशिक परिवहन अधिकारी, परभणी राजेश बिल्डींग, मोहिते गॅरेजजवळ, शिवमनगर, परभणी 431 122.",
						"०२४५२/२९१००० ", "०२४५२/२९१००० ", "", "", "",
						"MH22@mahatranscom.in", "Shri. A.A.I.Khan"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- २३",
						"उप प्रादेशिक परिवहन अधिकारी, बीड",
						"उप प्रादेशिक परिवहन अधिकारी, बीड भावे इमारत, दिपक बंगल्याजवळ, जुनी चंपावती ऑईल्स मिलजवळ, बार्शी नाका, बीड 431 122.",
						"०२४४२/२५६१११", "०२४४२ /२५६१११", "", "", "",
						"MH23@mahatranscom.in", "Dr. D.T.Pawar"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- २४",
						"्रादेशिक परिवहन अधिकारी, लातूर",
						"प्रादेशिक परिवहन अधिकारी, लातूर दत्त मंदिराजवळ, वोरा रोड, लातूर.",
						"०२३८२/२४२४३४", "०२३८२/२४२४३४ ", " ०२३८२ /२४२४३५ ", "",
						"", "MH24@mahatranscom.in", "Shri. S.P. Metrewar"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-  २५ ",
						"उप प्रादेशिक ारिवहन कार्यालय, उस्मानाबाद ",
						"उप प्रादेशिक ारिवहन कार्यालय, उस्मानाबाद शिवनेरी बंगला, भोसला शाळेजवळ, उस्मानाबाद",
						"०२४७२/२२१५५५ ", "०२४७२ /२२१५५५ ", "", "", "",
						"MH25@mahatranscom.in", "Shri.R.S. Lode Patil"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- २६",
						"प्रादेशिक परिवहन अधिकारी, नांदेड ",
						"प्रादेशिक परिवहन अधिकारी, नांदेड एम.आय.डी.सी. परिसर,नांदेड 431 601.",
						"०२४६२ /२२८९०० ", "०२४६२ /२५९९०० ", "", "", "",
						"MH26@mahatranscom.in", "Shri.S.K.Wadekar"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-  २७",
						"प्रादेशिक परिवहन अधिकारी, अमरावती",
						"प्रादेशिक परिवहन अधिकारी, अमरावती कलेक्टर कॅम्पजवळ, अमरावती-444 602.",
						"०७२१/२६६२६०६", "०७२१/२६६२०३२", "०७२१/२६६२६०६", "", "",
						"MH27@mahatranscom.in", "Shri. S.M.Chavan"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- २८",
						"उप प्रादेशिक परिवहन अधिकारी, बुलढाणा",
						"उप प्रादेशिक परिवहन अधिकारी, बुलढाणा सदरशिव निवास वॉर्ड क्र. 9, मलकापूर रोड, बुलढाणा. 443001.",
						"०७२६२/२४२२४४", "०७२६२/२४२२४४", "", "", "",
						"MH28@mahatranscom.in", "Shri.S.S.Zol"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- २९",
						"उप प्रादेशिक परिवहन अधिकारी, यवतमाळ",
						"उप प्रादेशिक परिवहन अधिकारी, यवतमाळ यवतमाळ नागपूर रोड, कळंब नाक्याजवळ, यवतमाळ, 445001",
						"०७२३२/२५५१११", "०७२३२/२५५१११", "", "", "",
						"MH29@mahatranscom.in", "Shri.V.S. Ahire"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ३०",
						"उप प्रादेशिक परिवहन अधिकारी, अकोला",
						"उप प्रादेशिक परिवहन अधिकारी, अकोला मेहेर बिÏल्डग, रामदास पेठ, खामकर लेन, वॉर्ड क्र. 40, नझुल प्लॅट क्र. 50 अकोला.444001.",
						"०२३३/२३१०८८८", "०२३३/२३१०५५५", "", "", "",
						"MH30@mahatranscom.in", "Shri.S.R.Shelke"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ३१",
						"प्रादेशिक परिवहन अधिकारी, नागपूर(शहर)",
						"प्रादेशिक परिवहन अधिकारी, नागपूर(शहर)ग िरीपेठ पोस्ट कार्यालयासमोर, अमरावती रोड, नागपूर 440 001.",
						"०७१२/२५६१६९८", "०७१२/२५६०७८१", "", "", "",
						"MH31@mahatranscom.in", "Shri. V.R.Majrikar"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ३२",
						"उप प्रादेशिक परिवहन अधिकारी, वर्धा",
						"उप प्रादेशिक परिवहन अधिकारी, वर्धा प्रशासकीय इमारत, जिल्हाधिकारी कार्यालय आवार, सेवाग्राम रोड, वर्धा-442 001.",
						"०७१५२/२४३५४३", "०७१५२/२५२४००", "", "", "",
						"MH32@mahatranscom.in", "Shri.V.S.Jichakar"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-  ३३",
						"उप प्रादेशिक परिवहन अधिकारी, गडचिरोली",
						"उप प्रादेशिक परिवहन अधिकारी, गडचिरोली नवीन प्रशासकीय इमारत, जिल्हाधिकारी कार्यालय, गडचिरोली.442605",
						"०७१३२/२२२१९५", "०७१३२/२२२१९५", "", "", "",
						"MH33@mahatranscom.in", "Shri.P.D.Gandawar"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-  ३४",
						"उप प्रादेशिक परिवहन अधिकारी, चंद्रपूर ",
						"उप प्रादेशिक परिवहन अधिकारी, चंद्रपूर नगीना बाग वॉर्ड, बोक रे प्लॉट, चंद्रपूर 442 401.",
						"०७१७२/२५५५", "०७१२/२५५३७२", "", "", "",
						"MH34@mahatranscom.in", "Shri.D.G.Waghule"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-  ३५",
						"उप प्रादेशिक परिवहन अधिकारी, गोंदिया ",
						"उप प्रादेशिक परिवहन अधिकारी, गोंदिया डॉ.वैयपी बंगला सिव्हिल लाईन,गोंदिया-440 016",
						"०७१८२/२३७३२१", "०७१८२/२३७३२१", "", "", "",
						"MH15@mahatranscom.in", "Shri.Atul Aade(Addl.charge)"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ३६",
						"उप प्रादेशिक परिवहन अधिकारी, भंडारा ",
						"उप प्रादेशिक परिवहन अधिकारी, भंडारा भरंतुकासिंग गिल इमारत, मुक्काम-करधा, जिल्हा-भंडारा. 441904",
						"०७१८४/२८८१६७", "०७१८४/२५८१६५", "", "", "",
						"MH36@mahatranscom.in", "Shri G. M. Nerpagar"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-  ३७ ",
						"उप प्रादेशिक परिवहन अधिकारी, वाशिम",
						"उप प्रादेशिक परिवहन अधिकारी, वाशिम बी.एड.कॉलेज बिÏल्डग, रिसोड रोड, वाशिम.444505",
						"०७२५२/२३५२४४", "०७२५२/२३५२४४", "", "", "",
						"MH37@mahatranscom.in", "Shri. R.R.Sawant"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ३८",
						"उप प्रादेशिक परिवहन अधिकारी, हिंगोली",
						"उप प्रादेशिक परिवहन अधिकारी, हिंगोली सर्वे न. 4, प्लॉट नं. 190, लिंबाळा मक्ता, हिंगोली. 413513",
						"०२५६२/२८१७५१", "०२५६२/२८१३५१", "०२५६२/२८१३५२", "", "",
						"MH18@mahatranscom.in", "Shri. P.K. Tadvi"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ३९",
						"उप प्रादेशिक परिवहन अधिकारी, नंदूरबार",
						"उप प्रादेशिक परिवहन अधिकारी, नंदूरबार शासकीय दूध योजना इमारत, जुने जिल्हाधिकारी कार्यालय, साखरी रोड, नंदुरबार 425 412",
						"०२५६४/२१०१२९", "०२५६४/२१०१२९", "", "", "",
						"MH39@mahatranscom.in",
						"Shri. S.B. Badhiye (Addl.Charge)"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-  ४० ",
						"प्रादेशिक परिवहन अधिकारी, नागपूर(ग्रामीण)",
						"प्रादेशिक परिवहन अधिकारी, नागपूर(ग्रामीण), इंदोरा लाल गोडाऊन नं.9, टेका नाका, कामठी रोड, नागपूर (ग्रामीण), 440 014.",
						"०७१२/२६३०६४७", "०७१२/२६३०५७४", "", "", "",
						"MH40@mahatranscom.in", "Shri. Sudhakar B. More"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ४१",
						"उप प्रादेशिक परिवहन अधिकारी, मालेगांव",
						"उप प्रादेशिक परिवहन अधिकारी, मालेगांव मालेगाव तालुका शेतकरी सहकारी संघ इमारत, मार्केट यार्ड, मालेगांव कॅम्प, मालेगाव, नासिक 423205",
						"०२५५४/२५८८५०", "०२५५४/२५८८५०", "", "", "",
						"MH41@mahatranscom.in", "Shri. A. A. Patil"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ४२",
						"उप प्रादेशिक परिवहन अधिकारी, बारामती",
						"उप प्रादेशिक परिवहन अधिकारी, बारामती विदयानगरी कॉर्नर, सुपर मार्केट, पी- 15, एमआयडीसी चौक, भिगवण रोड, बारामती 413 102.",
						"०२११२/२४३८०५", "०२११२/२४३१११", "", "", "",
						"MH42@mahatranscom.in", "Shri.S.P Dhigude"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ४३",
						"उप प्रादेशिक परिवहन अधिकारी, वाशी",
						"उप प्रादेशिक परिवहन अधिकारी, वाशी कृषि उत्पन्न बाजार समिती, धान्य मार्केट, सेक्टर नं. 19/ब, वाय ब्लॉक गेट नं.6, नवी मुंुबई.400703",
						"०७१५२/२४३५४३", "०७१५२/२५२४००", "", "", "",
						"MH32@mahatranscom.in", "Shri. S.J. Sadamate"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ४४",
						"उप प्रादेशिक परिवहन अधिकारी, अंबेजोगाई",
						"उप प्रादेशिक परिवहन अधिकारी, अंबेजोगाई प्लॉट नं.1, सहयोग गृहनिर्माण सोसायटी यशवंतराव चव्हाण चौक, मोरेवाडी, अंबाजोगाई. जि. बीड, 431501",
						"०२४४६/२४६२५१", "०२४४६/२४७७५५", "", "", "",
						"MH33@mahatranscom.in", "Shri. Deepak A.Patil"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ४५",
						"उप प्रादेशिक परिवहन अधिकारी, अकलूज",
						"उप प्रादेशिक परिवहन अधिकारी, अकलूज अकलूज, ता-माळशिरस, जि. सोलापूर.",
						"०२१८५/२२७५५५", "०२१८५ /२३१२३१", "", "", "",
						"MH45@mahatranscom.in", "Shri. A.D.Yeola"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ४६",
						"प्रादेशिक परिवहन अधिकारी, पनवेल",
						"प्रादेशिक परिवहन अधिकारी, पनवेल केंद्रीय सुविधा इमारत, लोखंड व पोलाद बाजार, कळंबोली, ता. पनवेल, जि. रायगड.",
						"०२२/२६३६६९५", "०२२/२७४२४४४४", "", "", "",
						"MH46@mahatranscom.in", "Shri. B.D. Kalaskar"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-  ४७",
						"उप प्रादेशिक परिवहन अधिकारी, बोरीवली ",
						"उप प्रादेशिक परिवहन अधिकारी, बोरीवली उप प्रा.प.अ. द्वारा प्रा.प.अ.,मुंबई(पश्चिम) अंधेरी",
						"०७१८४/२८८१६७", "०७१८४/२५८१६५", "", "", "",
						"MH47@mahatranscom.in", "Shri. A.S. Patil"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच- ४८",
						"उप प्रादेशिक परिवहन अधिकारी, वसई",
						"उप प्रादेशिक परिवहन अधिकारी, वसई मु.पो. चंदनसार, /भाटपाडा, विरार (पूर्व) ता. वसई, जि. ठाणे 401303",
						"०२५०/२५२३८८८", "०२५०/२५२३८८८", "", "", "",
						"MH48@mahatranscom.in", ""));

		arryOfficeLists.add(new OfficeList("एमएच- ४९",
				"उप प्रादेशिक परिवहन अधिकारी, नागपूर शहर(पूर्व)",
				"उप प्रादेशिक परिवहन अधिकारी, नागपूर शहर(पूर्व).",
				"Not Available", "Not Avaialable", "", "", "",
				"MH49@mahatranscom.in", "Shri.R.S.Bhuyar"));

		arryOfficeLists
				.add(new OfficeList(
						"एमएच-५० ",
						"उप प्रादेशिक परिवहन अधिकारी, कराड.",
						"उप प्रादेशिक परिवहन अधिकारी, कराड. शारदा मंगल कार्यालय, मौजे - पाडळी, कराड पाटण रोड, ता. कराड, जि. सातारा,415104",
						"०२५६४/२१०१२९", "०२५६४/२१०१२९", "", "", "",
						"MH50@mahatranscom.in", "Shri. L.A. Darade"));

	}
}
