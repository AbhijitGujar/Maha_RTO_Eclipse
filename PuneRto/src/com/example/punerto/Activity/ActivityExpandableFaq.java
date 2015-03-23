package com.example.punerto.Activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.androidexample.gcm.R;
import com.example.punerto.Adapter.ExpandableListAdapter;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ExpandableListView;

public class ActivityExpandableFaq extends ActionBarActivity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ActionBar actionBar = getSupportActionBar();
		actionBar.setHomeButtonEnabled(true);
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#F93B00")));
		if (ActivityLanguage.lang.equals("English")) {
			setContentView(R.layout.activity_expandable_faq);
			actionBar.setTitle("FAQ");
		} else {
			setContentView(R.layout.activity_expandable_faq);
			actionBar.setTitle(R.string.faq);

		}
		actionBar.show();
		// get the listview
		expListView = (ExpandableListView) findViewById(R.id.lvExp);

		// preparing list data
		prepareListData();

		listAdapter = new ExpandableListAdapter(this, listDataHeader,
				listDataChild);

		// setting list adapter
		expListView.setAdapter(listAdapter);
	}

	/*
	 * Preparing the list data
	 */
	private void prepareListData() {

		if (ActivityLanguage.lang.equals("English")) {
			listDataHeader = new ArrayList<String>();
			listDataChild = new HashMap<String, List<String>>();

			// Adding child data
			listDataHeader.add("1 What is RTO?");
			listDataHeader.add("2 How long is a learner license valid?");
			listDataHeader
					.add("3 I have obtained a learner license in mumbai, is it valid in chennai?");

			listDataHeader
					.add("4 My license is expired 2 yearï¿½s back, do I need to get a fresh one or can I still renew it?");
			listDataHeader
					.add("5 Can I drive a motorcycle with learner license?");
			listDataHeader
					.add("6 My license is expired 2 yesr's back, do I need to get a fresh one or can I still renew it?");

			listDataHeader
					.add("7 Can I drive a motorcycle with learner license?");
			listDataHeader
					.add("8 Who is exempted from test of competence for driving license?");
			listDataHeader
					.add("9 No, driving with such licence is an offence under motor vehicle laws. ");

			listDataHeader.add("10 Can I drive with an expired license?");
			listDataHeader
					.add("11 Do I need to keep the documents of vehicle with me while driving?");
			listDataHeader
					.add("12 Which douments I need to produce in support of age group?");

			listDataHeader
					.add("13 Which documents I need to produce in support of Address proof?");
			listDataHeader
					.add("14 Do I need to produce original age address proof while obtaining certificate?");
			listDataHeader
					.add("15 Do I need to be present while obtaining the license?");

			listDataHeader
					.add("16 How many hours of drving instructions a motor driving school is supposed to impart to the candidateenrolled?");
			listDataHeader
					.add("17 What is difference between contract carriage and stage carriage?");
			listDataHeader
					.add("18 What is the gross vehicle weight of the vehicle?");

			listDataHeader.add("19 What is invalid carriage?");
			listDataHeader.add("20 Which are non-transport vehicles?");
			listDataHeader.add("21 Which are the transport vehicles?");

			listDataHeader
					.add("22 I have purchased a new car, how long I can use it without registering with R.T.O.?");
			listDataHeader
					.add("23 Can a vehicle registered in one state can be used in another state?");
			listDataHeader
					.add("24 I have lost registration certificate (RC Book) of my car where can I get new one?");

			listDataHeader
					.add("25 Can a RTO officer catch my vehicle for not paying motor vehicle taxes?");
			listDataHeader
					.add("26 I have valid P.U.C. certificate obtained from authorised P.U.C. centre. Can I be stopped on road and asked to retest my vehicle by RTO Officer?");
			listDataHeader
					.add("27 Is a police on duty at traffic junctions belongs to RTO dept.?");

			listDataHeader.add("28 Can I drive a vehicle without insurance?");
			listDataHeader
					.add("29 What is the validity of fitness certificate?");
			listDataHeader
					.add("30 How long is the registration certificate is valid for any vehicle?");

			listDataHeader
					.add("31 How can I renew the registration of my motorcycle and car? ");
			listDataHeader
					.add("32 Can RTO cancel the valid certificate of fitness at any time?");
			listDataHeader
					.add("33 What to do if a checking report / memo / challan is issued to my vehicle by RTO?");

			listDataHeader
					.add("34 Is there any speed limit to drive the vehicle?  ");
			listDataHeader
					.add("35 Is there any code to paint the number plates?");
			listDataHeader
					.add("36 Which are the permissible emission norms for different vehicles?");

			listDataHeader
					.add("37 How to changing /updating one's address in the driving license?");
			listDataHeader
					.add("38 How can new buyer of the car come to know about tax calculation?");
			listDataHeader
					.add("39 What is the procedure for trnasfer of ownership duplicate registration change of address for citizen?");

			// Adding child data
			List<String> q1 = new ArrayList<String>();
			q1.add("Ans :RTO is an abbreviation used for Regional Transport Officer. Regional Transport Officer is licensing, registration, taxation authority of that region.");

			List<String> q2 = new ArrayList<String>();
			q2.add("Ans : 6 months");

			List<String> q3 = new ArrayList<String>();
			q3.add("Ans :A learner as well as permanent licence is valid throughout India");

			List<String> q4 = new ArrayList<String>();
			q4.add("Ans :Very well, prior to the date of expiry.");

			List<String> q5 = new ArrayList<String>();
			q5.add("Ans :You have to apply to the licencing authority (RTO) in the jurisdiction in which you ordinarily reside or carry on business or the motor driving school from where you intend to get the instructions is situated.");

			List<String> q6 = new ArrayList<String>();
			q6.add("Ans :You can renew your licence within 5 years from its date of expiry. Penalty for late renewal is charged after first 30 days of expiry. Meaning you have 30 days grace period after the date of expiry to renew it. Penalty for late renewal is Rs10 per year or part of year for the period lapsed.");

			List<String> q7 = new ArrayList<String>();
			q7.add("Ans :Learnerï¿½s licence is meant for learning purpose only. It is not a full-fledged licence. You can drive only with pillion rider possessing valid driving licence with him. ");

			List<String> q8 = new ArrayList<String>();
			q8.add("Ans :A person holding a driving licence issued by the Defence Department to drive their vehicles Or issued by a competent authority of any country outside India subject to the compliance of medical certificate is exempted from the test of competence to drive such class of vehicle");

			List<String> q9 = new ArrayList<String>();
			q9.add("Ans :No, driving with such licence is an offence under motor vehicle laws. ");

			List<String> q10 = new ArrayList<String>();
			q10.add("Ans :Not Available");

			List<String> q11 = new ArrayList<String>();
			q11.add("Ans :You must produce following valid document in original if demanded by police officer in uniform or an officer from motor vehicle dept. I. Driving licence II. Registration certificate III. Taxation certificate IV. Insurance certificate V. PUC certificate VI. Road permit and fitness certificate ");

			List<String> q12 = new ArrayList<String>();
			q12.add("Ans :Any of the following documents can be used for Age proof: 1.School leaving certificate 2.SSC certificate 3.Passport 4.Electricity bill 5.Telephone bill 6.Rent receipt ");

			List<String> q13 = new ArrayList<String>();
			q13.add("Ans :Any of the following documents can be used for Address proof: 1.Electoral roll/ voters I-card 2.Life insurance policy 3.Birth certificate 4.Passport 5.Civil sersurgeon's certificate ");

			List<String> q14 = new ArrayList<String>();
			q14.add("Ans :You can produce the copies attested by a gazetted officer of the state government or central or local body ");

			List<String> q15 = new ArrayList<String>();
			q15.add("Ans :You must be present for obtaining a licence at RTO office ");

			List<String> q16 = new ArrayList<String>();
			q16.add("Ans :Not Available");

			List<String> q17 = new ArrayList<String>();
			q17.add("Ans :Contract carriage is the vehicle engaged for the whole journey between two points for carriage of persons hiring it but it has no right to take other passengers on route. The stage carrier is a vehicle, which runs between two points irrespective of any prior contract and is boarded by passengers on route who pay the fare for the distance they travel. ");

			List<String> q18 = new ArrayList<String>();
			q18.add("Ans :It is the weight of empty vehicle plus the payload certified by the registering authority. ");

			List<String> q19 = new ArrayList<String>();
			q19.add("Ans :It is the vehicle specially designed for the use of persons suffering from physical defects or disability and essentially used for or by such perso");

			List<String> q20 = new ArrayList<String>();
			q20.add("Ans :Vehicles used for non-commercial purposes by the registered owner for his own use. e.g motorcycle, motorcar. ");

			List<String> q21 = new ArrayList<String>();
			q21.add("Ans :The Vehicle used for commercial purpose for carrying goods and passengers. e.g. Truck, buses, Tourist taxies. ");

			List<String> q22 = new ArrayList<String>();
			q22.add("Ans :1.No person can drive a motor vehicle, which is not registered with R.T.O. 2. No owner of a motor vehicle can allow or permit the use of unregistered vehicle. 3. No dealer of vehicle can deliver the unregistered motor vehicle to the purchaser. He can only deliver the vehicles which are temporarily /permanently registered with R.T.O 4. Register your vehicle at the registering authority (RTO) in whosejurisdiction you reside or you have a place of business where the vehicle is normally kept. ");

			List<String> q23 = new ArrayList<String>();
			q23.add("Ans :A vehicle registered in one state can be used in other state with the same registration number for temporary purpose. The registration number is valid throughout the India, but if vehicle is migrated to some other state for long use then the fresh registration number from the state the vehicle is migrated to needs to taken and taxes to be paid. Taxes paid at time of registration are motor vehicle taxes for that particular state not for India. For more details see NOC & transfer. ");

			List<String> q24 = new ArrayList<String>();
			q24.add("Ans :You need to apply for duplicate registration certificate where your vehicle has been registered with. ");

			List<String> q25 = new ArrayList<String>();
			q25.add("Ans :Taxation on motor vehicles is governed by the Bombay Motor Vehicles (BMV) Tax Act,1958. NO vehicle which is not duly registered and for which taxes are not paid can be used in public place. It is an offence to drive any vehicle for which taxes have not been paid. RTO official can detain / Seize your vehicle if you have not paid the taxes in time");

			List<String> q26 = new ArrayList<String>();
			q26.add("Ans :Though possession of a valid PUC certificate is a legal requirement, RTO can stop your vehicle to undergo the fresh PUC testing if your vehicle is found emitting visible pollutants. ");

			List<String> q27 = new ArrayList<String>();
			q27.add("Ans :In city the job of traffic control is performed by the traffic branch of police. Thus the corps on duty in white shirts belongs to traffic branch of police. They are constabulary staff of traffic police regulating traffic at large. RTO dept doesnï¿½t have constabulary staff. Officers of RTO are always in khaki uniform. ");

			List<String> q28 = new ArrayList<String>();
			q28.add("Ans :No person can drive a vehicle in public place without a valid insurance certificate under section 147 of M. V. act. ");

			List<String> q29 = new ArrayList<String>();
			q29.add("Ans :Every transport vehicle must posses a valid fitness certificate, newly registered transport vehicles certificate is valid for first two years. It has to be renewed every year after inspection of vehicle by the concerned RTO. ");

			List<String> q30 = new ArrayList<String>();
			q30.add("Ans :In case of non transport vehicles like two wheelers and cars the registration certificate is valid for 15 years from date of first registration. And it is renewed after every five subsequent years. In case of transport vehicles like goods and passenger carriers the registration certificate is valid till certificate of fitness if valid. ");

			List<String> q31 = new ArrayList<String>();
			q31.add("Ans :Submit your motorcycle and car which is mechanically fit, neat and clean along with form 25 duly filled along with registration certificate, taxation certificate and prescribed fees paid. Your vehicle is inspected by the inspector of motor vehicles and if he is satisfied the registration is renewed. ");

			List<String> q32 = new ArrayList<String>();
			q32.add("Ans :RTO is empowered to cancel the valid fitness certificate if your vehicle is caught in mechanically unfit and unroadworthy condition. ");

			List<String> q33 = new ArrayList<String>();
			q33.add("Ans :RTO official can issue you a memo for the breach of provisions of motor vehicle act and rules. Such a memo essentially consist of description of the offence, seal and signature of the issuing authority. Normally the documents are impounded for minor offenceï¿½s whereas a vehicle is detained for the offences like failure to pay the Bombay motor vehicle taxes, overloading of vehicle, plying without certificate of fitness and permit, clandestine operation of passengers. Report to the concerned RTO office along with all valid documents of vehicle within the time mentioned in the memo. You would either be prosecuted in the court of law or asked to pay the compounding fee (penalty) as the case may be. ");

			List<String> q34 = new ArrayList<String>();
			q34.add("Ans :No person shall drive a motor vehicle in any public place at a speed exceeding the maximum speed. ");

			List<String> q35 = new ArrayList<String>();
			q35.add("Ans :Colour ï¿½ code for number plates:-");

			List<String> q36 = new ArrayList<String>();
			q36.add("Ans :Not Available");

			List<String> q37 = new ArrayList<String>();
			q37.add("Ans :You have to apply on a plain paper indicating your new address alongwith proof of address like passport, lic policy which mentions your new address to the licensing authority which issued you the license. In case your new address falls in the jurisdiction of another licensing authority then you have get No Objection Certificate from the licensing authority which issued you the license. Once you get the NOC you have to submit your license alongwith the NOC to the authority who has jurisdiction of your address. Please carry three recent passport size photographs along with you. We will incorporate the procedure regarding noting change of address in license on our site shortly. Incase of any difficulty You can contact Dy RTO of the office where you want your work done Transport Grievance cell. ");

			List<String> q38 = new ArrayList<String>();
			q38.add("Ans :Any applicant or a new car buyer come to know about the tax calculation from tax calculation box where system calculates tax on ad valorem rate.This will help car buyers check on the unscrupulous demands from the dealers under the guise of rto tax. ");

			List<String> q39 = new ArrayList<String>();
			q39.add("Ans :Citizen can register by filling the information like name,my number,chassis number,date of sale, and the system keys in the information at appropriate places in the form and print itThis will avoid the confusion from the citizens point of view as he is not confused in filling varied details in the forms. this will turnout to be a very citizen friendly utility as they wont require to seek guidance of agents and touts. ");

			listDataChild.put(listDataHeader.get(0), q1);
			listDataChild.put(listDataHeader.get(1), q2);
			listDataChild.put(listDataHeader.get(2), q3);
			listDataChild.put(listDataHeader.get(3), q4);
			listDataChild.put(listDataHeader.get(4), q5);
			listDataChild.put(listDataHeader.get(5), q6);
			listDataChild.put(listDataHeader.get(6), q7);
			listDataChild.put(listDataHeader.get(7), q8);
			listDataChild.put(listDataHeader.get(8), q9);
			listDataChild.put(listDataHeader.get(9), q10);
			listDataChild.put(listDataHeader.get(10), q11);
			listDataChild.put(listDataHeader.get(11), q12);
			listDataChild.put(listDataHeader.get(12), q13);
			listDataChild.put(listDataHeader.get(13), q14);
			listDataChild.put(listDataHeader.get(14), q15);
			listDataChild.put(listDataHeader.get(15), q16);
			listDataChild.put(listDataHeader.get(16), q17);
			listDataChild.put(listDataHeader.get(17), q18);
			listDataChild.put(listDataHeader.get(18), q19);
			listDataChild.put(listDataHeader.get(19), q20);
			listDataChild.put(listDataHeader.get(20), q21);
			listDataChild.put(listDataHeader.get(21), q22);
			listDataChild.put(listDataHeader.get(22), q23);
			listDataChild.put(listDataHeader.get(23), q24);
			listDataChild.put(listDataHeader.get(24), q25);
			listDataChild.put(listDataHeader.get(25), q26);
			listDataChild.put(listDataHeader.get(26), q27);
			listDataChild.put(listDataHeader.get(27), q28);
			listDataChild.put(listDataHeader.get(28), q29);
			listDataChild.put(listDataHeader.get(29), q30);
			listDataChild.put(listDataHeader.get(30), q31);
			listDataChild.put(listDataHeader.get(31), q32);
			listDataChild.put(listDataHeader.get(32), q33);
			listDataChild.put(listDataHeader.get(33), q34);
			listDataChild.put(listDataHeader.get(34), q35);
			listDataChild.put(listDataHeader.get(35), q36);
			listDataChild.put(listDataHeader.get(36), q37);
			listDataChild.put(listDataHeader.get(37), q38);
			listDataChild.put(listDataHeader.get(38), q39);
		} else {

			listDataHeader = new ArrayList<String>();
			listDataChild = new HashMap<String, List<String>>();

			// Adding child data
			listDataHeader.add("1.RTO  काय आहे?");
			listDataHeader.add("2. शिकाऊ परवाना किती कालावधीसाठी वैध असतो?");
			listDataHeader
					.add("3. मी मुंबई मधून शिकाऊ परवाना प्राप्त केलेला आहे. तो चेन्नई मध्ये वैध आहे का?");

			listDataHeader
					.add("4. माझा परवाना दोन वर्षांपूर्वी कालबाह्य झाला आहे, मला नवीन परवाना काढण्याची गरज आहे का मी अजूनही नूतनीकरण करू शकतो?");
			listDataHeader
					.add("5. मी शिकाऊ परवाना असताना मोटार सायकल चालवू शकतो का?");
			listDataHeader
					.add("6. वाहन परवाना क्षमतेच्या चाचणी मधून कोणास सूट दिली जाते?");

			listDataHeader
					.add("7. मी कालबाह्य परवाना असताना वाहन चालवू शकतो का?");
			listDataHeader
					.add("8. वाहन चालवीत असताना मी वाहनाचे दस्तऐवज बाळगणे गरजेचे आहे का?");

			listDataHeader
					.add("9. वयोगटासाठीच्या आधारासाठी कोणते दस्तऐवज दाखवणे आवश्यक आहे?");

			listDataHeader
					.add("10. राहण्याच्या ठिकाणाच्या दाखल्यासाठी कोणते दस्तऐवज दाखवणे आवश्यक आहे?");

			listDataHeader
					.add("11.प्रमाणपत्र प्राप्त करताना मला वयाचा व राहत्या ठिकाणाचा मूळ दाखला प्रस्तुत करणे आवश्यक आहे का?");
			listDataHeader
					.add("12.परवाना प्राप्त करतेवेळी मी उपस्थित असणे आवश्यक आहे का?");

			listDataHeader
					.add("13 मोटार चालक प्रशिक्षण संस्थेमध्ये उमेदवारास किती तास वाहन चालविण्याचे प्रशिक्षण देणे गरजेचे आहे?");
			listDataHeader
					.add("14 कंत्राट वाहतुक वाहन व टप्पा वाहतुक वाहन यात काय फरक आहे?");
			listDataHeader.add("15 वाहनाचे एकूण वजन काय असते?");

			listDataHeader.add("16 अवैध वाहन म्हणजे काय?");
			listDataHeader.add("17 अव्यावसायिक वाहने कोणती असतात?");
			listDataHeader.add("18 वाहतुकीसाठीची वाहने कोणती आहेत?");

			listDataHeader
					.add("19 मी एक नवीन कार खरेदी केलेली आहे. प्रादेशिक परिवहन कार्यालयात नोंदणी केल्याशिवाय मी ती किती काळापर्यंत वापरु शकतो?");
			listDataHeader
					.add("20 एका राज्यात नोंदणी केलेले वाहन दुसर्या राज्यात वापरता येऊ शकते का?");

			List<String> q1 = new ArrayList<String>();
			q1.add("उत्तर - RTO हे Regional Transport Office (प्रादेशिक परिवहन कार्यालय) याचे संक्षिप्त रूप आहे. प्रादेशिक परिवहन अधिकारी त्या प्रदेशातील परवाना, नोंदणी,कर आकारणी संदर्भातील अधिकारी व्यक्ती असतो.");

			List<String> q2 = new ArrayList<String>();
			q2.add("उत्तर -6 महिने");

			List<String> q3 = new ArrayList<String>();
			q3.add("उत्तर- शिकाऊ आणि कायम परवाना संपूर्ण भारतात वैध आहे.");

			List<String> q4 = new ArrayList<String>();
			q4.add("उत्तर-कालबाह्य होण्यापूर्वी नूतनीकरण करता येते.");

			List<String> q5 = new ArrayList<String>();
			q5.add("उत्तर- ज्या कार्यक्षेत्रात आपण रहता किंवा व्यवसाय करता अथवा वाहन प्रशिक्षण संस्था आहे तेथील प्रादेशिक परिवहन कार्यालयात आपणास अर्ज द्यावा लागेल .");

			List<String> q6 = new ArrayList<String>();
			q6.add("उत्तर- संरक्षण विभागातून त्यांचे वाहन चालविण्यासाठी परवाना प्राप्त झालेली व्यक्ती अथवा भारताबाहेरील एखाद्या सक्षम अधिकारी संस्थेतून वैद्यकीय प्रमाणपत्र असणारी व्यक्ती अशांना वाहन परवाना क्षमतेच्या चाचणी मधून सूट दिली जाते. ");

			List<String> q7 = new ArrayList<String>();
			q7.add("उत्तर- नाही. असा परवाना असताना वाहन चालवणे हा मोटार वाहन कायद्याप्रमाणे गुन्हा आहे.");

			List<String> q8 = new ArrayList<String>();
			q8.add("उत्तर- गणावेशामधील पोलीस अधिकारी आठवा मोटार वाहन विभागातील अधिकारी यांच्यातर्फे विचारणा झाल्यास आपण खालील मूळ दस्तऐवज दाखवले पाहिजेत.\n 1. वाहन परवाना \n 2. नोंदणी प्रमाणपत्र \n 3. कर आकारणी प्रमाणपत्र \n 4. विमा प्रमाणपत्र \n 5. प्रमाणपत्र \n 6. रस्ता अनुज्ञा पत्र व सक्षमता प्रमाणपत्र");

			List<String> q9 = new ArrayList<String>();
			q9.add("उत्तर- खालीलपैकी कोणतेही दस्तऐवज वयाचा दाखला म्हणून वापरता येतात: \n 1. शाळा सोडल्याचा दाखला \n 2. माध्यमिक शालान्त परीक्षा प्रमाणपत्र \n 3. पासपोर्ट \n 4. वीज बिल \n 5. दूरध्वनी बिल \n 6. भाड्याची पावती");

			List<String> q10 = new ArrayList<String>();
			q10.add("उत्तर- खालीलपैकी कोणतेही दस्तऐवज राहण्याच्या ठिकाणाचा दाखला म्हणून वापरता येतात: \n 1. मतदार यादी / मतदाता ओळख पत्र \n 2. जीवन विमा धोरण \n3. जन्माचे प्रमाणपत्र \n 4. पासपोर्ट \n 5. नागरी चिकित्सकाचे प्रमाणपत्र");

			//

			List<String> q11 = new ArrayList<String>();
			q11.add("उत्तर- आपण स्थानिक भागातील अथवा राज्य शासनातील राजपत्रीत अधिकार्याकडून साक्षांकीत प्रती प्रस्तुत करू शकता");

			List<String> q12 = new ArrayList<String>();
			q12.add("उत्तर- परवाना प्राप्त करण्यासाठी आपण प्रादेशिक परिवहन कार्यालयात उपस्थित राहणे आवश्यक आहे.");

			List<String> q13 = new ArrayList<String>();
			q13.add("उत्तर- उपलब्ध नाही.");

			List<String> q14 = new ArrayList<String>();
			q14.add("उत्तर -कंत्राट वाहतुक वाहन हे एखाद्या व्यक्तीने दोन ठिकाणामध्ये भाडे तत्वावर आरक्षित केलेल्या संपूर्ण प्रवासासाठी व्यस्त असते परंतु वाटेत इतर प्रवाशांना घेण्याचा हक्क यांना नसतो. टप्पा वाहतुक करणारे वाहन दोन ठिकाणामध्ये धावते जिथे अगोदर केलेले कंत्राट नसते आणि यात मार्गावरील प्रवासी असतात जे त्यांनी प्रवास केलेल्या अंतराचे भाडे प्रदान करतात.");

			List<String> q15 = new ArrayList<String>();
			q15.add("उत्तर-रिकामे वाहन अधिक नोंदणी अधिकार्याने प्रमाणित केलेले वजन / भार यांचे एकत्रित वजन म्हणजे  वाहनाचे एकूण वजन होय.");

			List<String> q16 = new ArrayList<String>();
			q16.add("उत्तर- शारीरिक उणीवा अथवा अपंगत्व असलेल्या व्यक्तींसाठी रचीत वाहन जे त्या अथवा तत्सम व्यक्तीने वापरावयाचे असते असे वाहन म्हणजे अवैध वाहन होय.");

			List<String> q17 = new ArrayList<String>();
			q17.add("उत्तर- अ व्यावसायिक उद्देशासाठी वापरात येणारी तसेच मालकाने स्व वापरासाठी नोंदणी केलेले वाहन. उ. मोटार सायकल,मोटार कार ई.");

			List<String> q18 = new ArrayList<String>();
			q18.add("उत्तर- व्यावसायिक उद्देशाने माल वाहतुक तसेच प्रवाशांना घेऊन जाणारे वाहन हे वाहतुक वाहन असते. उ. ट्रक,बस,प्रवासी टॅक्सी ई.");

			List<String> q19 = new ArrayList<String>();
			q19.add("उत्तर-1.प्रादेशिक परिवहन कार्यालयात नोंदणी न केलेले कोणतेही वाहन कोणीही चालवू शकत नाही.\n 2.मोटारीचा मालक नोंदणी न केलेले वाहन चालविण्याची परवानगी देऊ शकत नाही.\n 3.कोणताही विक्रेता नोंदणी न केलेले वाहन ग्राहकास देऊ शकत नहि. प्रादेशिक परिवहन कार्यालयात तात्पुरते / कायमचे नोंदणी केलेले वाहन तो देऊ शकतो.\n 4.आपल्या राहत्या कार्य कक्षेतील आठवा आपल्या व्यवसायाच्या जागेतील प्रादेशिक परिवहन कार्यालयात आपले वाहन नोंदणी कृत करून घ्यावे.");

			List<String> q20 = new ArrayList<String>();
			q20.add("उत्तर- एका राज्यात नोंदणी कृत केलेले वाहन त्याच नोंदणी क्रमांकाचा वापर करून दुसर्या राज्यात तात्पुरत्या उद्देशानी वापरता येऊ शकते. नोंदणी क्रमांक संपूर्ण भारतात वैध आहे, परंतु वाहन इतर राज्यात जास्त काळासाठी वापरण्यात येत असेल तर कर प्रदान करून नवीन नोंदणी क्रमांक प्राप्त करून घेणे गरजेचे आहे. त्या वेळी भरलेला कर हा  मोटार वाहन कर त्या राज्यातील असून भारतासाठी नाही. अधिक माहितीसाठी ना हरकत प्रमाणपत्र आणि हस्तांतरण बघावे.");

			listDataChild.put(listDataHeader.get(0), q1);
			listDataChild.put(listDataHeader.get(1), q2);
			listDataChild.put(listDataHeader.get(2), q3);
			listDataChild.put(listDataHeader.get(3), q4);
			listDataChild.put(listDataHeader.get(4), q5);
			listDataChild.put(listDataHeader.get(5), q6);
			listDataChild.put(listDataHeader.get(6), q7);
			listDataChild.put(listDataHeader.get(7), q8);
			listDataChild.put(listDataHeader.get(8), q9);
			listDataChild.put(listDataHeader.get(9), q10);
			listDataChild.put(listDataHeader.get(10), q11);
			listDataChild.put(listDataHeader.get(11), q12);
			listDataChild.put(listDataHeader.get(12), q13);
			listDataChild.put(listDataHeader.get(13), q14);
			listDataChild.put(listDataHeader.get(14), q15);
			listDataChild.put(listDataHeader.get(15), q16);
			listDataChild.put(listDataHeader.get(16), q17);
			listDataChild.put(listDataHeader.get(17), q18);
			listDataChild.put(listDataHeader.get(18), q19);
			listDataChild.put(listDataHeader.get(19), q20);

		}

		// listDataChild.put(listDataHeader.get(39), q39);

		// Header, Child data
		// listDataChild.put(listDataHeader.get(1), nowShowing);
		// listDataChild.put(listDataHeader.get(2), comingSoon);
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
}
