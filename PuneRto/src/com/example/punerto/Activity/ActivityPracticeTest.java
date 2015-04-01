package com.example.punerto.Activity;

import java.util.ArrayList;
import java.util.Collections;
import co.example.punerto.classes.PracticeTest;
import com.androidexample.gcm.R;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

public class ActivityPracticeTest extends ActionBarActivity {

	ListView lst_PracticeTest;
	public static ArrayList<PracticeTest> arrayPracticeTests = new ArrayList<PracticeTest>();

	TextView txt_Question;
	RadioButton txt_Option1;
	RadioButton txt_Option2;
	RadioButton txt_Option3;
	TextView txt_QueNo;
	TextView txt_status;
	TextView txt_correctAns;
	Button btn_Next;
	int position = 0;
	static int queCount = 0;
	static int marks = 0;
	ImageView img_Identify;
	String ans;
	boolean flag = false;
	String correctAns;
	String temp;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#5D7B2B")));
		if (ActivityLanguage.lang.equals("English")) {
			setContentView(R.layout.activity_practice_test);
			actionBar.setTitle("Practice Test");
		} else {
			setContentView(R.layout.activity_practice_test_maratrhi);
			actionBar.setTitle("सराव परीक्षा ");
		}
		actionBar.show();
		arrayPracticeTests.clear();
		queCount = 0;

		txt_Question = (TextView) findViewById(R.id.txt_Question);
		txt_Option1 = (RadioButton) findViewById(R.id.radio_Option1);
		txt_Option2 = (RadioButton) findViewById(R.id.radio_Option2);
		txt_Option3 = (RadioButton) findViewById(R.id.radio_option3);
		btn_Next = (Button) findViewById(R.id.btn_Next);

		img_Identify = (ImageView) findViewById(R.id.img_Sign);
		txt_QueNo = (TextView) findViewById(R.id.txt_QueNo);
		txt_status = (TextView) findViewById(R.id.txt_ansStatus);
		txt_correctAns = (TextView) findViewById(R.id.txt_Correct_ans);

		if (ActivityLanguage.lang.equals("English")) 
		{
			arrayPracticeTests
					.add(new PracticeTest(
							"Near a pedestrian crossing, when the pedestrians are waiting to cross the road, you should",
							"Sound horn and procceed",
							"Slow down, sound horn and pass",
							"Stop the vehicle and wait till the pedestrians cross the road and then proceed",
							"img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "Stop", "No parking",
					"Hospital ahead", "q2", "1"));
			arrayPracticeTests
					.add(new PracticeTest(
							"You are approaching a narrow bridge, another vehicle is about to enter  the bridge from",
							"Increase the speed and try to cross the bridge as fast as possible",
							"opt2",
							"Wait till the other vehicle crosses the bridge and then proceed",
							"img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "Keep left",
					"There is no road to the left", "Compulsory turn left",
					"q4", "3"));
			arrayPracticeTests
					.add(new PracticeTest(
							"When a vehicle  is involved in an accident causing injury to any person",
							"Take the vehicle to the nearest police station and report the accident",
							"Stop the vehicle and report to the police station",
							"Take all reasonable steps to secure medical attention to injured & report to the nearest police station",
							"img_Path", "3"));
			// 5

			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "Give way",
					"Hospital ahead", "Traffic island  ahead", "q6", "1"));
			arrayPracticeTests.add(new PracticeTest(
					"On a road designated as one way", "Parking is prohibited",
					"Overtaking is prohibited",
					"Should not drive in reverse gear", " img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "No entry", "one way",
					"Speed limit ends", "q8", "2"));
			arrayPracticeTests.add(new PracticeTest(
					"You can overtake a vehicle in front",
					"Through the right side of that vehicle",
					"Through the left side",
					"Through the left side, if the road is wide ", " img_Path",
					"1"));
			arrayPracticeTests
					.add(new PracticeTest("The following sign represents..",
							"Right turn prohibited",
							"Sharp curve to the right", "U-turn prohibited",
							"q10", "3"));
			// 10

			arrayPracticeTests
					.add(new PracticeTest(
							"When a vehicle approaches an unguarded railway level crossing before crossing it the driver shall",
							"", "Wait till the train passes", "", "img_Path",
							"1"));
			arrayPracticeTests
					.add(new PracticeTest(
							"The following sign represents..",
							"Stop the vehicle on the left side of the road, get down from the vehicle, go to the railway track, and ensure that no train",
							"opt2", "Pedestrians prohibited", "q12", "1"));
			arrayPracticeTests.add(new PracticeTest(
					"How can you distinguish a transport vehicle.",
					"Pedestrian crossing", "opt2",
					"By looking at the number plate of the vehicle.",
					"img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "Keep right side",
					"opt2", "Compulsory turn to right", "q14", "2"));
			arrayPracticeTests.add(new PracticeTest(
					"Validity of learners licence",
					"Till the Driving licence is obtained", "opt2", "30 days",
					"img_Path", "2"));

			// 15

			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "U- Turn prohibited ",
					"Right tum prohibited",
					"Overtaking through left prohibited", "q16", "2"));

			arrayPracticeTests.add(new PracticeTest(
					"In a road without footpath, the pedestrians",
					"Should walk on the left side of the road",
					"Should walk on the right side of the road",
					"May walk on either side of the road", "img_Path", "2"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "Horn prohibited",
					"Compulsory sound horn", "May sound horn", "q18", "1"));
			arrayPracticeTests
					.add(new PracticeTest(
							"Free passage should be given to the following types of vehicles",
							"Police vehicles.",
							"Ambulance and fire service vehicles",
							"Express, Super Express buses", "", "2"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..",
					"Roads on both sides in front", "Narrow bridge ahead",
					"Narrow road ahead", "q20", "2"));
			// 20

			arrayPracticeTests
					.add(new PracticeTest(
							"Vehicles proceeding from opposite direction should be allowed to pass through",
							"Your right side", "Your left side",
							"The convenient side", "img_Path", "1"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents", "First aid post",
					"Resting place", "Hospital", "q22", "3"));
			arrayPracticeTests
					.add(new PracticeTest(
							"Driver of a vehicle may overtake �",
							"While driving down hill",
							"If the road is sufficiently wide",
							"When the driver of the vehicle in front shows the signal to overtake",
							"img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "First aid post",
					"Resting place", "Hospital", "q24", "1"));
			arrayPracticeTests.add(new PracticeTest(
					"Driver of a motor vehicle shall drive through",
					"The right side of the road", "The left side of the road",
					"The centre of the road", "img_Path", "2"));

			// 25

			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "Hospital",
					"Resting place", "First aid post", "q26", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"When a Vehicle is parked on the road side during night",
							"The vehicle should be locked",
							"The person having licence to drive such a vehicle should be in the drivers seat",
							"opt3", "img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "Road closed",
					"No parking", "End of restriction", "q28", "3"));
			arrayPracticeTests.add(new PracticeTest("Fog lamps are used",
					"During night.", "When there is mist.",
					"When the opposite vehicle is not using dim light",
					" img_Path", "2"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "Narrow road ahead",
					"Narrow bridge ahead", "Roads on both sides ahead", "q30",
					"1"));

			// 30

			arrayPracticeTests.add(new PracticeTest(
					"Zebra lines are meant for..", "Stopping vehicle.",
					"Pedestrians crossing", "For giving preference to vehicle",
					"img_Path", "2"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "Railway station near",
					"Level crossing unguarded", "Level crossing Guarded",
					"q32", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"When an ambulance is approaching ..",
							"Allow passage if there are no vehicles from front side.",
							"No preference need be given.",
							"The driver shall allow free passage by drawing to the side of the road",
							"img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..",
					"Entry through right side prohibited",
					"Entry through left prohibited", "Overtaking prohibited",
					"q34", "3"));
			arrayPracticeTests.add(new PracticeTest(
					"Red traffic light indicates ..",
					"Vehicle can proceed with caution.", "Stop the vehicle.",
					"Slow down.", "img_Path", "2"));

			// 35
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "Cross road",
					"No entry", "Hospital", "q36", "1"));
			arrayPracticeTests.add(new PracticeTest(
					"Parking a vehicle in front of entrance to hospital",
					"Proper", "Improper",
					"Proper if NO PARKING sign is not provided", "img_Path",
					"2"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "Restriction ends",
					"No entry", "No overtaking", "q38", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"Where the slippery road sign is seen on the road, the driver shall",
							"Reduce the speed by changing the gear",
							"Apply brake", "Proceed in the same speed",
							"img_Path", "1"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "May turn to left",
					"Compulsory go ahead or turn left", "Side road left",
					"q40", "3"));

			// 40

			arrayPracticeTests
					.add(new PracticeTest(
							"Overtaking is prohibited in following circumstances",
							"When it is likely to Cause inconvenience or danger to other traffic",
							"When the vehicle in front is reducing speed",
							"During night", "img_Path", "1"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "Sound horn compulsory",
					"Sound horn continuously", "Horn prohibited", "q42", "1"));
			arrayPracticeTests.add(new PracticeTest(
					"Overtaking when approaching a bend", "Is permissible",
					"Not permissible", "Is permissible with care", "img_Path",
					"2"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..",
					"Road to the right in front", "Compulsory turn right",
					"Turn to right prohibited", "q44", "2"));
			arrayPracticeTests.add(new PracticeTest("Drunken driving",
					"Allowed in private vehicles", "Allowed during night time",
					"Prohibited in all vehicles.", "img_Path", "3"));

			// 45

			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "End of restriction",
					"Do not stop", "No parking", "q46", "3"));
			arrayPracticeTests.add(new PracticeTest("Use of horn prohibited",
					"Mosque, Church and Temple",
					"Near Hospital, Courts of Law", "Near Police Station",
					"img_Path", "2"));
			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "Go straight",
					"One-way", "Prohibited in both direction", "q48", "2"));
			arrayPracticeTests.add(new PracticeTest("Rear view mirror is used",
					"For seeing face",
					"For watching the traffic approaching from behind",
					"For seeing the back seat passenger", "img_Path", "2"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"No entry for all motor vehicles",
					"No entry for cars and motor cycles",
					"Entry allowed for cars and motor vehicles", "q50", "1"));

			// 50

			arrayPracticeTests.add(new PracticeTest(
					"Boarding in and alighting from a vehicle while in motion",
					"Permitted in bus", "Permitted in autorikshaw",
					"Prohibited", "img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Trucks Prohibited", "Bus Prohibited",
					"Parking Prohibited", "q52", "1"));
			arrayPracticeTests.add(new PracticeTest("Parking is permitted",
					"In turnings", "On foot paths",
					"Where parking is not prohibited", "img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest(
					"When fuel is filled in a vehicle",
					"Shall not check air pressure", "Shall not smoke",
					"Shall not use any light of the vehicle", "img_Path", "2"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Students prohibited", "Pedestrians permitted",
					"Pedestrians prohibited", "q55", "3"));
			// 55

			arrayPracticeTests.add(new PracticeTest(
					"Mobile phones shall not be used", "In Government offices",
					"In Police Stations", "While driving a vehicle",
					"img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Overtaking prohibited through the right side",
					"Turn left", "Left turn Prohibited", "q57", "3"));
			arrayPracticeTests.add(new PracticeTest("Overtaking is prohibited",
					"When the road ahead is not clearly visible",
					"When the road ahead is wide enough",
					"When the road centre is marked with white broken lines",
					"img_Path", "1"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Drive the vehicle not exceeding 50 km/hr.",
					"Drive the vehicle at 50 km/hr",
					"Drive the vehicle exceeding 50km/hr.", "q59", "3"));
			arrayPracticeTests
					.add(new PracticeTest(
							"The pedestrians shall not cross the road at sharp bends or very near to a stopped vehicle. Why?",
							"Inconvenience to other vehicles.",
							"Inconvenience to other road users.",
							"Drivers of other vehicles coming at a distance may not see persons crossing the road.",
							"img_Path", "3"));
			// 60===completed

			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Right reverse bend",
					"No entry for vehicles having more than 2 meters width",
					"No entry for vehicles having more than 2 meters height",
					"q61", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"Records of a private vehicle are",
							"Till the registration of the vehicle is cancelled",
							"Registration certificate, Insurance Certificate, Tax Token, Driving Licence",
							"Registration Certificate, Permit, Trip Sheet",
							"q57", "3"));
			arrayPracticeTests
					.add(new PracticeTest(
							"This sign represents",
							"Right reverse bend",
							"Entry only for vehicles with width above 3.5 meters .",
							"Entry for vehicles having height not exceeding 3.5 meters.",
							"q63", "3"));
			arrayPracticeTests
					.add(new PracticeTest(
							"While turning to a road to the left of the road in which you are going, you should",
							"No vehicle is approaching from behind",
							"Sound horn and turn to the left",
							"Show the left turn signal, keep to the left side of the road and turn to the left.",
							"q57", "2"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Side road left", "No Stopping or standing", "Junction",
					"q65", "3"));

			// 65

			arrayPracticeTests.add(new PracticeTest(
					"Validity of P.U.C.C. Pollution Under Control Certificate",
					"Turn right", "One Year", "Two years", "img_Path", "1"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Stop your vehicle and let the vehicle toovertake",
					"Ahead only", "Entry in both direction", "q67", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"While you are driving with the head light in high beam during night, a vehicle approaches from",
							"T' intersection",
							"Put the head light in dim and bright alternatively several times",
							"Dim the head light till the vehicle passes",
							"img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"In front of a parked vehicle",
					"Compulsory ahead or turn left", "Side road ahead", "q69",
					"2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"The Driver of a vehicle extends his right arm with the palm downward and moves the arm upward and",
							"Turn right", "He is slowing down the vehicle",
							"Allowing to overtake", "img_Path", "2"));

			// 70

			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"To reduce the speed", "Compulsory keep left", "Turn left",
					"q71", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"Minimum age for getting a licence to drive motor cycle without gear",
							"Narrow road ahead", "21 years", "16 years ",
							"q57", "3"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Allowed in Unavoidable circumstances", "Right hand curve",
					"While driving a vehicle", "q73", "2"));
			arrayPracticeTests.add(new PracticeTest(
					"When you see the traffic sign of School, you should",
					"Guarded level cross",
					"Slow down and proceed with caution",
					"Sound horn continuously and proceed", "q57", "2"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Blow the horn continuously.", "Left ascend", "Keep left",
					"q75", "1"));

			// 75

			arrayPracticeTests
					.add(new PracticeTest(
							"While turning to the left, the driver of a two wheeler shall",
							"Y-inter section left", "Not show hand signal",
							"Show left turn signal with his right hand",
							"img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Illegal", "Right ascend and descend", "Right descend",
					"q77", "1"));
			arrayPracticeTests.add(new PracticeTest(
					"To Signal while taking U-turn", "Y-inter section left",
					"Right turn signal", "Slow down signal", "q78", "2"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"25 years", "Left hair pin bend", "Keep left", "img_Path",
					"2"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Turn left", "Left reverse bend",
					"Turn right and go ahead", "q80", "1"));

			// 80

			arrayPracticeTests.add(new PracticeTest(
					"One time tax for a new car is for", "State highways",
					"15 years", "5 years", "img_Path", "1"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Road to the right in front", "Left reverse bend",
					"Turn left and go ahead", "q82", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"Before overtaking a vehicle, it should be ensured that�..",
							"The driver shall stop the vehicle.",
							"The road ahead is clearly visible and it is safe to overtake",
							"The vehicle in front is turning left.",
							"img_Path", "2"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Slippery road", "Speed limt", "Axle weight limit", "q84",
					"3"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Road side.", "Side road right", "Keep right", "q85", "2"));

			// 85

			arrayPracticeTests.add(new PracticeTest(
					"When your vehicle is being overtaken, you should",
					"Loose gravel", "Increase the speed of your vehicle",
					"Not obstruct the other vehicle from over taking",
					"img_Path", "3"));
			arrayPracticeTests
					.add(new PracticeTest(
							"This sign represents",
							"Is an offence leading to suspension or cancellation of driving licence",
							"Cross road ahead", "Narrow road ahead", "q87", "1"));
			arrayPracticeTests.add(new PracticeTest(
					"A place where parking is prohibited", "Cycle crossing",
					"On one-way road", "On foot-path", "img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Blow horn and proceed", "Turn left", "Round about", "q89",
					"3"));
			arrayPracticeTests.add(new PracticeTest(
					"The hand brake is to be used", "Cattle prohibited",
					"To apply sudden brake", "To park a vehicle", "img_Path",
					"3"));

			// 90

			arrayPracticeTests
					.add(new PracticeTest(
							"This sign represents",
							"The driver of a vehicle shall consider the white cane as a traffic sign to stop the vehicle",
							"Dangerous dip", "Ferry", "q91", "2"));
			arrayPracticeTests.add(new PracticeTest(
					"More than two persons on a two wheeler is",
					"School ahead", "Violation of law",
					"Allowed when the traffic is less", "", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"This sign represents",
							"Shall report to the nearest police station within 24 hours",
							"Unguarded level cross", "Barrier ahead", "q93",
							"1"));
			arrayPracticeTests.add(new PracticeTest(
					"You want to overtake a vehicle near a hospital. You will",
					"Men at work", "Not blow horn.",
					"Blow the horn only intermittently.", "", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"This sign represents",
							"Driver shall report to the nearest police station within 24 hours",
							"Y-inter section right", "Side road right", "q95",
							"1"));

			// 95

			arrayPracticeTests.add(new PracticeTest(
					"Using unregistered vehicle in public place is",
					"Rough road", "Legal", "While driving a vehicle",
					"Legal if there is urgency", "1"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"We shall not overtake another vehicle.",
					"Y-inter section right", "Side road right", "q97", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"Minimum age for obtaining driving licence for transport vehicles.",
							"Bridge ahead", "18 years", "20 years", "img_Path",
							"3"));
			arrayPracticeTests
					.add(new PracticeTest("This sign represents",
							"Steep ascend", "Turn right", "Y-inter section",
							"q99", "3"));
			arrayPracticeTests.add(new PracticeTest(
					"Overtaking is prohibited in the following case",
					"We shall not increase speed", "Panchayath roads",
					"Narrow bridge.", "img_Path", "3"));

			// 100

			arrayPracticeTests.add(new PracticeTest(
					"The following sign represents..", "Steep ascend",
					"There are roads ahead and to the right",
					"Compulsory go ahead or turn to right", "q101", "3"));
			arrayPracticeTests
					.add(new PracticeTest(
							"If a person in charge of an animal apprehending that the animal may become",
							"Entrance of hospital",
							"The driver shall proceed, blowing the horns.",
							"The driver shall reduce the speed.", "", "1"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Narrow road ahead", "Gravel road",
					"No entry for motor car", "q103", "1"));
			arrayPracticeTests.add(new PracticeTest(
					"Parking prohibited in the following case ..",
					"Blocking a fire hydrant", "Where parking is permitted.",
					"Near traffic light", "", "3"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Drainage in middle", "Legal", "No entry for motor car",
					"q105", "1"));

			// 105

			arrayPracticeTests
					.add(new PracticeTest(
							"Over speeding",
							"The vehicle shall be provided with foot rest, hand grip and sari guard",
							"Is an offence leading to punishment by fine only",
							"Is not an offence", "", "1"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Hump or rough road", "Legal", "No entry for cycles",
					"q107", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"When school buses are stopped for picking up or setting down students",
							"Can attract suspension of driving licence",
							"Proceed slowly and cautiously since there is chance of students suddenly crossing the road",
							"No special care is required", "", "2"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Barrier ahead", "Legal",
					"Vehicles carrying cattle prohibited", "q109", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"When a blind person crosses the road holding White Cane",
							"The driving licence is liable to be suspended or cancelled",
							"Blow the horn and proceed",
							"Slow down and proceed with caution", "", "1"));

			// 110

			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"No thorough side road", "Pedestrians crossing",
					"Pedestrians crossing prohibited",
					"Legal if there is urgency", "1"));
			arrayPracticeTests
					.add(new PracticeTest(
							"When a motor vehicle is involved in an accident",
							"Ferry ahead",
							"Shall report to the the nearest police station within 12 hours",
							"Shall report to the the nearest police station within 48 hours",
							"q111", "1"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Legally not punishable", "Children playing",
					"Pedestrian crossing", "Legal if there is urgency", "1"));
			arrayPracticeTests
					.add(new PracticeTest(
							"When any property of a third party is damaged due to an accident",
							"Parking prohibited",
							"Driver shall report to the nearest police station within 7 days",
							"Need not report to any police station", "q113",
							"1"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Can attract Suspension /cancellation of driving licence",
					"Slippery road", "Falling rocks", "q115", "3"));

			// 115

			arrayPracticeTests
					.add(new PracticeTest(
							"When the vehicle behind has begun to over take our vehicle",
							"Parking lot - scooters and motor cycles",
							"we can over take another vehicle.",
							"we can overtake another vehicle blowing horn", "",
							"1"));
			arrayPracticeTests
					.add(new PracticeTest(
							"This sign represents",
							"Give way to traffic approaching the intersection from other roads",
							"Ferry", "Refreshment stall ahead", "q117", "2"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"No entry for private cars", "Steep descend",
					"Slippery road", "q118", "1"));
			arrayPracticeTests.add(new PracticeTest(
					"When our vehicle is being over taken",
					"As there is no restriction, proceed at the same speed",
					"We can increase speed",
					"We can increase speed with due care", "", "1"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Petrol pump", "Steep descend", "Slippery road", "q120",
					"2"));

			// 120

			arrayPracticeTests.add(new PracticeTest(
					"Parking is prohibited in the following place",
					"Not touch or cross the yellow line",
					"Left side of the road", "Market area", "img_Path", "1"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Request to stop the vehicle coming behind",
					"Y-intersection", "Road widens ahead", "q122", "3"));
			arrayPracticeTests.add(new PracticeTest(
					"Parking is prohibited in the following place",
					"Give precedence to the vehicles coming down the hill",
					"Near a public well", "left side of the road", "img_Path",
					"1"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Intends to turn left", "Bridge ahead", "Gap in median",
					"q124", "3"));
			arrayPracticeTests.add(new PracticeTest(
					"To carry pillion rider on a motor cycle",
					"Any person other than the driver.",
					"The vehicle shall be provided with side car",
					"Vehicle shall be provided with rear view mirror",
					"img_Path", "1"));

			// 125

			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Intends to turn right", "Zigzag road", "Ghat road",
					"q126", "1"));
			arrayPracticeTests.add(new PracticeTest(
					"Smoking while driving public service vehicle",
					"To the vehicles coming from the left",
					"Can attract fine only", "None of the above", "img_Path",
					"1"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Intends to go straight", "Railway cross ahead",
					"Weighbridge ahead", "q128", "1"));
			arrayPracticeTests
					.add(new PracticeTest(
							"Abandoning vehicle in a public place causing in convineance to others or passengers",
							"The driver of that vehicle indicates his intention to turn right & proceeds to the center of the road",
							"only fine is attracted",
							"Registration of vehicle can be cancelled",
							"img_Path", "1"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Request to stop the vehicle from behind", "Left turn",
					"Bridge ahead", "q130", "1"));

			// 130

			arrayPracticeTests
					.add(new PracticeTest(
							"This sign represents",
							"Driving too close behind a vehicle in a dangerous manner.",
							"Main road ahead", "No thorough road", "q131", "3"));
			arrayPracticeTests
					.add(new PracticeTest(
							"Carrying overload in goods carriages",
							"Request to pass the vehicles coming from the left",
							"Only fine is attracted",
							"Can attract suspension or cancellation of driving licence",
							"img_Path", "3"));
			arrayPracticeTests
					.add(new PracticeTest(
							"This sign represents",
							"The vehicle is not covered by a valid registration or permit",
							"Parking both sides", "Police aid post", "q133",
							"2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"The driver of a taxi refusing the offer for journey for the reason that the distance is short.",
							"Request to stop the vehicle from front",
							"only fine is attracted",
							"Registration of vehicle can be cancelled",
							"img_Path", "1"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Air- horn", "Scooters and motor cycles prohibited",
					"Scooters and motor cycles repairing", "q135", "1"));

			// 135

			arrayPracticeTests
					.add(new PracticeTest(
							"When you reach an intersection where there is no signal light or police man, you will",
							"One-way road",
							"Give proper signal, sound the horn and proceed",
							"Give way to the traffic approaching the intersection on your right side and proceed after giving necessary signals.",
							"img_Path", "3"));
			arrayPracticeTests
					.add(new PracticeTest(
							"This sign represents",
							"Imprisonment which may extent to 6 months or Rs.2000/- as fine or both",
							"Parking lot - Taxis",
							"Parking for police vehicles", "q137", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"While you are approaching an intersection where the yellow signal light is blinking, you should",
							"You will drive when the traffic is less",
							"Stop the vehicle and wait for the green light to appear",
							"Slow down the vehicle and proceed only after ensuring that it is safe to do so",
							"img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Life Insurance", "Parking lot - Autorikshaws",
					"Auto-rikshaw parking prohibited", "q139", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"Where the road is marked with continuous yellow line the vehicle should",
							"10 meter",
							"Allow to overtake only through the right side of yellow line",
							"Cross the line only when overtaking a vehicle in front",
							"img_Path", "1"));

			// 140

			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Registration Certificate", "Intends to turn right",
					"Request to stop the vehicle from opposite direction",
					"q141", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"While you are driving on gradient roads, you should",
							"The road is marked with broken center line in white colour.",
							"Give precedence to the vehicles going up the hill",
							"Give precedence to the vehicles carrying heavy load",
							"img_Path", "2"));
			arrayPracticeTests.add(new PracticeTest("This sign represents",
					"Shall not change track.", "Intends to turn right",
					"Request to stop all other vehicles", "q143", "1"));
			arrayPracticeTests.add(new PracticeTest(
					"The driver of a tractor shall not carry",
					"Stop the vehicle till green light glows.",
					"More than three persons other than the driver.",
					"More than two persons including the driver.", "img_Path",
					"1"));
			arrayPracticeTests
					.add(new PracticeTest(
							"This signal represents",
							"Driving cautiously anticipating violation of traffic rules & road signs both by drivers & other road users.",
							"Request to stop the vehicle coming from opposite direction",
							"Intends to slow down the vehicle.", "q145", "3"));

			// 145

			arrayPracticeTests
					.add(new PracticeTest(
							"While a vehicle entering a main road from a branch road, the driver shall give preference.",
							"A line in white or yellow colour at the approach of road junction or pedestrian crossings",
							"To the vehicles coming from the right",
							"To all vehicles proceeding along the main road",
							"img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest("This signal represents",
					"Check radiator water level and engine oil level",
					"Intends to stop the vehicle", "Intends to turn right",
					"q147", "2"));
			arrayPracticeTests.add(new PracticeTest(
					"You can overtake a vehicle through the left side if",
					"No Limit", "There is sufficient space on the left side",
					"That vehicle moves slowly", "img_Path", "1"));
			arrayPracticeTests.add(new PracticeTest("This signal represents",
					"Motor Cycle", "Request to pass the vehicle from behind",
					"Request to stop the vehicle from front", "q149", "1"));
			arrayPracticeTests
					.add(new PracticeTest(
							"What is Tailgating ?",
							"Driving too close behind a vehicle in a dangerous manner.",
							"Keeping safe distance from the vehicle ahead regulating the speed proportionately.",
							"Keeping a distance of at least 7 meters from the vehicle ahead.",
							"img_Path", "1"));

			// 150==completed with ans

			arrayPracticeTests.add(new PracticeTest("This signal represents",
					"Request to pass the vehicles coming from the left",
					"Request to pass the vehicle coming in opposite direction",
					"Request to stop the vehicle from behind and front",
					"q151", "3"));
			arrayPracticeTests
					.add(new PracticeTest(
							"A vehicle can be seized by authorised officers, if",
							"The vehicle is not covered by a valid registration or permit",
							"The vehicle is not covered by a valid insurance",
							"The vehicle exceeds the speed limit", "img_Path",
							"1"));
			arrayPracticeTests.add(new PracticeTest("The signal represents",
					"Request to stop the vehicle from front",
					" Request to stop the vehicle from behind",
					"Request to pass the vehicle from front", "q153", "1"));
			arrayPracticeTests.add(new PracticeTest("Type of horn permitted",
					"Air- horn  horn ", "Multi-toned", "Electric horn",
					"img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest(
					"Road on which driving in reverse gear is prohibited",
					"One-way road  road", " Steep descending",
					"Steep ascending road", "img_Path", "1"));

			// 155

			arrayPracticeTests
					.add(new PracticeTest(
							"If drunken driving is detected, the driver is liable to be punished with",
							"Imprisonment which may extent to 6 months or Rs.2000/- as fine or both",
							"Imprisonment which may extent to 1 year or fine up to Rs.4000/- or both",
							"2 years rigorous imprisonment", "img_Path", "1"));
			arrayPracticeTests
					.add(new PracticeTest(
							"You hold a learners licence for motor cycle�",
							"You will drive when the traffic is less",
							" You drive the vehicle with a pillion",
							"You will not carry any other person on the motor cycle except for the purpose of getting instructions from an",
							"img_Path", "3"));
			arrayPracticeTests.add(new PracticeTest(
					"All motor vehicles must be covered by", "Life Insurance ",
					" Third party Insurance", " Comprehensive Insurance",
					"img_Path", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"Minimum distance to be kept from the vehicle going in front",
							"10 meter ", " 5 meter",
							"Safe distance according to speed", "img_Path", "3"));
			arrayPracticeTests
					.add(new PracticeTest(
							"The number of passengers permitted to be taken in private vehicle is recorded in the",
							"Registration Certificate ", "Tax Token",
							" Permit", "img_Path", "1"));

			// 160

			arrayPracticeTests
					.add(new PracticeTest(
							"Overtaking is prohibited when",
							"The road is marked with broken center line in white colour. ",
							" The road is marked with continuous center line in yellow colour.",
							"Vehicle is driven on a steep hill.", "img_Path",
							"3"));
			arrayPracticeTests.add(new PracticeTest(
					"If the road is marked with broken white lines,you �",
					"Shall not change track.",
					" Can change track if required.",
					"Shall stop the vehicle.", "img_Path", "2"));
			arrayPracticeTests.add(new PracticeTest(
					"Blinking red traffic light means.",
					"Stop the vehicle till green light glows.",
					"Stop the vehicle and proceed if safe",
					"Reduce speed and proceed.", "img_Path", "2"));
			arrayPracticeTests
					.add(new PracticeTest(
							"What is defensive driving ?",
							"Driving cautiously anticipating violation of traffic rules and 	road signs both by	drivers and other road users.",
							" Driving with sole aim of reaching the destination with no regards to road	signs",
							"Driving on the	assumption that	other road users will be cautious about	their safety",
							"img_Path", "1"));
			arrayPracticeTests
					.add(new PracticeTest(
							"What is meant by stop line",
							"A line in white or yellow colour at the approach of road junction or pedestrian crossings",
							" A line drawn through the center of the road in yellow colour",
							"A broken white line through the center of the road",
							"img_Path", "1"));

			// 165

			arrayPracticeTests.add(new PracticeTest(
					"Before starting the engine of a vehicle",
					"Check radiator water level and engine oil level",
					" Check head light & brake", "Check brake & tyre pressure",
					"img_Path", "1"));

			arrayPracticeTests.add(new PracticeTest(
					"Maximum permissible speed of a motor cycle", "No Limit",
					" 50 Km/hr", "60 Km/hr", "img_Path", "2"));
			Collections.shuffle(arrayPracticeTests);
		} else {

			arrayPracticeTests
					.add(new PracticeTest(
							" पादचारी सडकपारच्या ठिकाणी जेव्हा रस्ता ओलांडण्याच्या प्रतिक्षेत लोक उभे असतील तेव्हा",
							" हॉर्न वाजवून पुढे जावे ",
							" वाहनांचा वेग कमी करुन, हॉर्न वाजवून पुढे जावे ",
							" वाहन थांबवून पादचारी रस्ता ओलांडेपर्यंत प्रतिक्षा करावी त्यानंतरच पुढे जावे ",
							"image_Path", "3"));

			// 2
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते? ",
					" थांबा ", " वाहने उभी करण्यास बंदी ", " मार्ग द्या ",
					"q2", "1"));
			// 3
			arrayPracticeTests
					.add(new PracticeTest(
							" एका अरुंद पुलाजवळ, विरुध्द बाजूने येणारे वाहन त्या पुलावर प्रवेश करण्याच्या बेतात असेल तेव्हा ",
							" वेग वाढवून पूल लवकरात लवकर ओलांडण्याचा प्रयत्न करावा. ",
							" हेडलाईट चालू करुन पूल ओलांडावा ",
							" समोरील वाहन पूल ओलांडेपर्यंत प्रतिक्षा करावी व त्यानंतर पुढे जावे ",
							"image_Path", "3"));

			// 4
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते? ",
					" डावीकडे रहा", " डावीकडील बाजूस रस्ता नाही ",
					" सक्तीने डावीकडे वळा ", "q4", "3"));

			// 5
			arrayPracticeTests
					.add(new PracticeTest(
							" वाहनास अपघात होवून व्यक्तीस दुखापत झाली असल्यास ",
							" वाहनासह नजिकच्या पोलीस ठाण्यात जावून अपघाताबाबत कळवावे. ",
							" वाहन थांबवून पोलीस ठाण्यास कळवावे ",
							" दुखापतग्रस्तांना वैद्यकीय सुविधा मिळणेसाठी आवश्यक प्रयत्न करुन नजिकच्या पोलीस ठाण्यास 24 तासाच्या आत कळवावे ",
							"image_Path", "3"));

			// 6
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शवित? ",
					" मार्ग द्या ", " थांबा ", " पुढे ट्रँफिक आयलॅंड आहे ",
					"q6", "1"));

			// 7
			arrayPracticeTests.add(new PracticeTest(
					" एकमार्गी वाहतुकीचा रस्त्यावर ",
					" वाहने उभी करण्यास बंदी आहे ",
					" वाहने ओव्हरटेकींग करण्यास बंदी आहे ",
					" रिव्हर्स गिअरमध्ये वाहन चालवू नये. ", "image_Path", "3"));

			// 8
			arrayPracticeTests.add(new PracticeTest(
					" खालील चिन्ह काय दर्शविते ? ", " प्रवेश बंद ",
					" एकमार्गी वाहतूक ", " वेगमर्यादा समाप्त ", "q8", "2"));

			// 9
			arrayPracticeTests
					.add(new PracticeTest(
							" पुढील वाहन ओलांडण्यासाठी/ओव्हरटेक करण्यासाठी  ",
							" पुढील वाहनाच्या उजव्या बाजूकडून जावे ",
							" पुढील वाहनाच्या कोणत्याही बाजूने जावे ",
							" जर रस्ता रुंद असल्यास पुढील वाहनाच्या डाव्या बाजूने जावे ",
							"image_Path", "1"));

			// 10
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते? ",
					" उजवीकडे वळण्यास मनाई ", " उजवीकडे कठीण वळण ",
					" यू-टर्नला मनाई ", "q10", "3"));

			// 11
			arrayPracticeTests
					.add(new PracticeTest(
							" मनुष्यविरीहित रेल्वे क्रॉसिंग ओलांडण्यापूर्वी वाहनचालकाने ",
							" रस्त्याच्या डाव्या बाजूस वाहन थांबवून रेल्वे येत नसल्याची खात्री करावी ",
							" हॉर्न वाजवून लवकरात लवकर रेल्वे मार्ग ओलांडावा ",
							" रेल्वे जाईपर्यंत प्रतिक्षा करावी ", "image_Path",
							"1"));
			// 12
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते? ",
					" पादचारी सडकपार ", " धावू नका ", " पादचा-यांना मनाई ",
					"q12", "1"));

			// 13
			arrayPracticeTests.add(new PracticeTest(
					" तुम्ही परिवहन वाहन कसे ओळखाल? ",
					" वाहनांच्या टायरच्या आकारावरुन ", " वाहनाच्या रंगावरुन ",
					" वाहनाची नंबरप्लेट पाहून ", "image_Path", "3"));
			// 14
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते? ",
					" उजव्या बाजूस रहावे ",
					" उजव्या बाजूस वाहने पार्क करावीत ", " सक्तीचे उजवे वळण ",
					"q14", "2"));
			// 15
			arrayPracticeTests.add(new PracticeTest(
					" शिकाऊ लायसन्सची विधिग्राहयता ", " लायसन्स मिळेपर्यत ",
					"6 महिने ", "30 दिवस ", "image_Path", "2"));
			// 16
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते? ",
					" सक्तीचे उजवे वळण ", " उजव्या बाजूस वळण्यास मनाई ",
					" डावीकडून ओव्हरटेक करण्यास मनाई ", "q16", "2"));

			// 17
			arrayPracticeTests.add(new PracticeTest(
					" फूटपाथविरहित रस्त्यावर पादचा-यांनी ",
					" रस्त्याच्या डाव्या बाजूकडून चालावे ",
					" रस्त्याच्या उजव्या बाजूकडून चालावे ",
					" रस्त्याच्या कोणत्याही बाजूकडून चालावे ", "image_Path",
					"2"));

			// 18
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते? ",
					" हॉर्न वाजवण्यास मनाई ", " सक्तीने हॉर्नचा वापर करावा ",
					" हॉर्नचा वापर करु शकता ", "q18", "1"));
			// 19
			arrayPracticeTests.add(new PracticeTest(
					" खालील प्रकारच्या वाहनांसाठी मार्ग मोकळा करुन द्यावा ",
					" पोलीस वाहने ", " रुग्णवाहिका आणि अग्निशामक वाहन ",
					" एक्सप्रेस, सुपर एक्सप्रेस बसेस ", "image_Path", "2"));

			// 20
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते? ",
					" पुढे दोन्ही बाजूस रस्ता  ", " पुढे अरुंद पूल आहे ",
					" पुढे अरुंद रस्ता आहे ", "q20", "2"));
			// 21
			arrayPracticeTests
					.add(new PracticeTest(
							" विरुध्द बाजूने येणा-या वाहनांना कोणत्या बाजूने जावू द्यावे? ",
							" तुमच्या उजव्या बाजूने ",
							" तुमच्या डाव्या बाजूने ", " कोणत्याही बाजूने ",
							"image_Path", "1"));

			// 22
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते? ",
					" प्रथमोपचार केंद्र ", " विश्रामधाम ", " हॉस्पिटल ", "q22",
					"3"));

			// 23
			arrayPracticeTests
					.add(new PracticeTest(
							" वाहनचालक ओव्हरटेक करुन जावू शकतो ",
							" उतारावरुन वाहन चालविताना ",
							" जर रस्ता पुरेसा रुंद असेल तर ",
							" जेव्हा समोरील वाहनाचा चालक ओव्हरटेक करण्याकरिता इशारा करीत असल्यास ",
							"image_Path", "3"));

			// 24
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते ",
					" प्रथमोपचार केंद्र ", " विश्रामधाम  ", " हॉस्पिटल ",
					"q24", "1"));

			// 25
			arrayPracticeTests.add(new PracticeTest(
					" वाहन चालकाने आपले वाहन  ",
					" रस्त्याच्या उजव्या बाजूने चालवावे ",
					" रस्त्याच्या डाव्या बाजूने चालवावे ",
					" रस्त्याच्या मधोमध चालवावे ", "image_Path", "2"));

			// 26
			arrayPracticeTests.add(new PracticeTest(
					" खालील चिन्ह काय दर्शविते? ", " हॉस्पिटल ",
					" विश्रामधाम ", " प्रथमोपचार केंद्र ", "q26", "2"));

			// 27
			arrayPracticeTests
					.add(new PracticeTest(
							" रात्रीच्या वेळी जेव्हा वाहन रस्त्याच्या कडेला पार्क केले असेल तेव्हा ",
							" वाहन लॉक करावे ",
							" लायसेन्स धारक व्यक्तीने वाहन चालकाच्या सीटवर बसावे ",
							" पार्किंग दिवे चालू करावेत ", "image_Path", "3"));

			// 28
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते ",
					" रस्ता बंद आहे ",
					" वाहने उभी करण्यास / पार्क करण्यास मनाई ",
					" मर्यादा समाप्त ", "q28", "3"));

			// 29
			arrayPracticeTests.add(new PracticeTest(
					" यावेळी फॉग लाईट वापरले जातात ", " रात्रीच्या वेळी ",
					" धुक्याच्या वेळी ",
					" विरुध्द बाजूचे वाहन मंद प्रकाशझोताचा वापर करीत नाही ",
					"image_Path", "2"));

			// 30
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते? ",
					" पुढे अरुंद रस्ता आहे ", " पुढे अरुंद पूल आहे ",
					" दोन्ही बाजूस रस्ते आहेत ", "q30", "1"));

			// 31
			arrayPracticeTests.add(new PracticeTest(" झेब्रा क्रॉसिंगचा अर्थ ",
					" वाहन थांबविणे ", " पादचारी सडक पार ",
					" वाहनांना प्राधान्य देणे ", "image_Path", "2"));

			// 32
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते? ",
					" जवळ रेल्वे स्टेशन आहे ", " असुरक्षित रेल्वे क्रॉसिंग ",
					" सुरक्षित रेल्वे क्रॉसिंग ", "q32", "2"));

			// 33
			arrayPracticeTests
					.add(new PracticeTest(
							" मागील रुग्णवाहिकेस ",
							" समोरुन वाहन येत नसल्यास मार्ग मोकळा करुन द्यावा ",
							" मार्ग मोकळा करण्याची आवश्यकता नाही ",
							" वाहनचालकाने वाहन रस्त्याच्या बाजून घेवून मार्ग मोकळा करुन द्यावा ",
							"image_Path", "3"));

			// 34
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते? ",
					" उजव्या बाजूने प्रवेश मनाई ",
					" डाव्या बाजूने प्रवेश मनाई ",
					" ओव्हरटेकिंग करण्यास मनाई ", "q34", "3"));

			// 35
			arrayPracticeTests.add(new PracticeTest(
					" लाल वाहतूक दिवा काय दर्शवितो? ",
					" सावधानतेसह वाहन पुढे न्या ", " वाहन थांबवा ",
					" वाहनाचा वेग कमी करा ", "image_Path", "2"));

			// 36
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते? ",
					" काट रस्ता ", " प्रवेश बंद ", " हॉस्पिटल ", "q36", "1"));

			// 37
			arrayPracticeTests.add(new PracticeTest(
					" हॉस्पिटलच्या प्रवेशव्दारासमोर वाहन थांबविणे ",
					" परवानगी आहे ", " प्रतिबंध आहे ",
					" वाहन उभे करण्यास बंदीचे चिन्ह नसल्यास योग्य ",
					"image_Path", "2"));

			// 38
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते ",
					" मर्यादा समाप्त ", " प्रवेश बंद ", " ओव्हरटेकिंग मनाई ",
					"q38", "2"));

			// 39
			arrayPracticeTests
					.add(new PracticeTest(
							"‘निसरडा रस्ता’ हे चिन्ह  रस्त्यावर दिसल्यास वाहन चालकाने  ",
							" वाहनाचा वेग कमी करावा ", " वाहनाचा वेग वाढवा ",
							" त्याच वेगात वाहन पुढे न्यावे ", "image_Path", "1"));

			// 40
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते ",
					" डावीकडे वळू शकता ",
					" सक्तीने पुढे जा किंवा डावीकडे वळा ",
					" डावीकडे साईड रस्ता ", "q40", "3"));

			// 41
			arrayPracticeTests.add(new PracticeTest(
					" कोणत्या परिस्थितीत ओव्हरटेक करण्यास मनाई आहे? ",
					" अन्य वाहतूकीस अडथळा अथवा धोका उत्पन्न होत असल्यास ",
					" समोरील वाहन वेग कमी करीत असल्यास ", " रात्रीच्या वेळी ",
					"image_Path", "1"));

			// 42
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते ",
					" सक्तीने हॉर्न वाजवा ", " सतत हॉर्न वाजवा ",
					" हॉर्न वाजवण्यास मनाई ", "q42", "1"));

			// 43
			arrayPracticeTests
					.add(new PracticeTest(
							" आंधळ्या वळणावर ओव्हरटेकिंग करण्यास/वाहन ओलांडून जाण्यास  ",
							" परवानगी आहे ", " परवानगी नाही ",
							" सावधानतेसह परवानगी ", "image_Path", "2"));

			// 44
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते ",
					" पुढे उजवीकडे वळण आहे ", " सक्तीने उजवीकडे वळण ",
					" उजवीकडे वळण्यास मनाई आहे ", "q44", "2"));

			// 45
			arrayPracticeTests.add(new PracticeTest(
					" वाहनचालकाने मद्यपान करुन वाहन चालविण्यास ",
					" खाजगी वाहनासाठी परवानगी आहे ",
					" रात्रीच्या वेळेस परवानगी आहे ", " मनाई आहे ",
					"image_Path", "3"));

			// 46
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते ",
					" मर्यादा समाप्त ", " वाहने थांबवू नयेत ",
					" वाहने उभी करु नयेत ", "q46", "3"));

			// 47
			arrayPracticeTests.add(new PracticeTest(
					" येथे हॉर्न वाजवण्यास मनाई आहे ", " मशिद,चर्च आणि मंदिर ",
					" हॉस्पिटल व न्यायालययांचे जवळ ", " पोलीस ठाणे जवळ ",
					"image_Path", "2"));

			// 48
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते ",
					" सरळ जा ", " एकमार्गी वाहतूक ",
					" दोन्ही दिशांना वाहतूकीस मनाई ", "q48", "2"));

			// 49
			arrayPracticeTests.add(new PracticeTest(" वाहनाचा आरसा ",
					" चेहरा पाहण्यासाठी वापरावा ",
					" पाठीमागील वाहतूक पाहण्यासाठी वापरावा ",
					" पाठीमागील सीटवरील प्रवासी पाहण्यासाठी वापरावा ",
					"image_Path", "2"));

			// 50
			arrayPracticeTests.add(new PracticeTest(" हे चिन्ह काय दर्शविते ",
					" सर्व वाहनांना प्रवेश बंद ",
					" कार व मोटार सायकलसाठी प्रवेश बंद ",
					" कार व मोटार सायकलसाठी प्रवेश  ", "q50", "1"));
			Collections.shuffle(arrayPracticeTests);
			// here paste marathi question and answer.....
		}

		arrayPracticeTests.subList(10, arrayPracticeTests.size()).clear();

		if (position == 0) {
			queCount++;

			if (ActivityLanguage.lang.equals("English")) {
				txt_QueNo.setText("Question No :" + queCount);
			} else {
				txt_QueNo.setText("प्रश्न क्रमांक  :" + queCount);
			}

			correctAns = arrayPracticeTests.get(position).getAns();
			txt_Question
					.setText(arrayPracticeTests.get(position).getQuestion());
			txt_Option1.setText(arrayPracticeTests.get(position).getOpt1());
			txt_Option2.setText(arrayPracticeTests.get(position).getOpt2());
			txt_Option3.setText(arrayPracticeTests.get(position).getOpt3());

			if (arrayPracticeTests.get(position).getImg_Path() != null) {
				String fnm = arrayPracticeTests.get(position).getImg_Path();
				String PACKAGE_NAME = getPackageName();
				int imgId = getResources().getIdentifier(
						PACKAGE_NAME + ":drawable/" + fnm, null, null);
				System.out.println("IMG ID :: " + imgId);
				System.out.println("PACKAGE_NAME :: " + PACKAGE_NAME);
				Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
						imgId);
				img_Identify.setImageBitmap(BitmapFactory.decodeResource(
						getResources(), imgId));
			} else {
				img_Identify.setVisibility(View.INVISIBLE);
			}

		}
		btn_Next.setOnClickListener(new OnClickListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				txt_status.setVisibility(View.VISIBLE);
				txt_correctAns.setVisibility(View.VISIBLE);
				queCount++;
				if (txt_Option1.isChecked()) {
					temp = "1";
					if (correctAns.equals(temp)) {
						if (ActivityLanguage.lang.equals("English")) {
							txt_status.setText("Result:Correct Answer");
							txt_correctAns.setVisibility(View.INVISIBLE);
						} else {
							txt_status.setText("निकाल :बरोबर उत्तर");
							txt_correctAns.setVisibility(View.INVISIBLE);
						}
						marks++;
					} else {
						if (ActivityLanguage.lang.equals("English")) {
							txt_status.setText("Result :Wrong Answer");
							txt_correctAns.setText("Correct Answer Is :"
									+ correctAns);
						} else {

							txt_status.setText("निकाल :चुकीचे उत्तर ");
							txt_correctAns.setText("अचूक पर्याय आहे  :"
									+ correctAns);

						}
					}
				}

				if (txt_Option2.isChecked()) {
					temp = "2";
					if (correctAns.equals(temp)) {
						// Toast.makeText(ActivityPracticeTest.this,
						// "Correct Answer", Toast.LENGTH_SHORT).show();
						marks++;

						if (ActivityLanguage.lang.equals("English")) {
							txt_status.setText("Result:Correct Answer");
							txt_correctAns.setVisibility(View.INVISIBLE);
						} else {
							txt_status.setText("निकाल :बरोबर उत्तर");
							txt_correctAns.setVisibility(View.INVISIBLE);
						}

					} else {
						if (ActivityLanguage.lang.equals("English")) {
							txt_status.setText("Result :Wrong Answer");
							txt_correctAns.setText("Correct Answer Is :"
									+ correctAns);
						} else {

							txt_status.setText("निकाल :चुकीचे उत्तर ");
							txt_correctAns.setText("अचूक पर्याय आहे  :"
									+ correctAns);

						}
					}
				}

				if (txt_Option3.isChecked()) {
					temp = "3";
					if (correctAns.equals(temp)) {

						if (ActivityLanguage.lang.equals("English")) {
							txt_status.setText("Result:Correct Answer");
							txt_correctAns.setVisibility(View.INVISIBLE);
						} else {
							txt_status.setText("निकाल :बरोबर उत्तर");
							txt_correctAns.setVisibility(View.INVISIBLE);
						}

						marks++;
					} else {
						// Toast.makeText(ActivityPracticeTest.this,
						// "Wrong Anser ", Toast.LENGTH_SHORT).show();
						// Toast.makeText(ActivityPracticeTest.this,
						// "Correct Answer Is" + correctAns,
						// Toast.LENGTH_SHORT).show();

						if (ActivityLanguage.lang.equals("English")) {
							txt_status.setText("Result :Wrong Answer");
							txt_correctAns.setText("Correct Answer Is :"
									+ correctAns);
						} else {

							txt_status.setText("निकाल :चुकीचे उत्तर ");
							txt_correctAns.setText("अचूक पर्याय आहे  :"
									+ correctAns);

						}

					}
				}

				if (position < arrayPracticeTests.size() - 1) {
					position++;

					txt_QueNo.setText("Question No :" + queCount);
					correctAns = arrayPracticeTests.get(position).getAns();
					txt_Question.setText(arrayPracticeTests.get(position)
							.getQuestion());
					txt_Option1.setText(arrayPracticeTests.get(position)
							.getOpt1());
					txt_Option2.setText(arrayPracticeTests.get(position)
							.getOpt2());
					txt_Option3.setText(arrayPracticeTests.get(position)
							.getOpt3());

					if (arrayPracticeTests.get(position).getImg_Path() != null) {
						String fnm = arrayPracticeTests.get(position)
								.getImg_Path();

						String PACKAGE_NAME = getPackageName();
						int imgId = getResources().getIdentifier(
								PACKAGE_NAME + ":drawable/" + fnm, null, null);
						System.out.println("IMG ID :: " + imgId);
						System.out.println("PACKAGE_NAME :: " + PACKAGE_NAME);
						Bitmap bitmap = BitmapFactory.decodeResource(
								getResources(), imgId);
						img_Identify.setImageBitmap(BitmapFactory
								.decodeResource(getResources(), imgId));
					} else {
						img_Identify.setVisibility(View.INVISIBLE);
					}
				}

				if (queCount == 11) {
					//
					// btn_Next.setEnabled(false);
					// AlertDialog alertDialog = new AlertDialog.Builder(
					// ActivityPracticeTest.this).create();
					// // Setting Dialog Title
					// alertDialog.setTitle("Test Score");
					// // Setting Dialog Message
					// alertDialog.setMessage("Final Score is :-" + marks);
					// // Setting OK Button
					// alertDialog.setButton("OK",
					// new DialogInterface.OnClickListener() {
					// public void onClick(DialogInterface dialog,
					// int which) {
					// // Write your code here to execute after
					// // dialog closed

					//
					// }
					// });
					//
					// // Showing Alert Message
					// alertDialog.show();

					final Dialog dialog = new Dialog(ActivityPracticeTest.this);
					dialog.setContentView(R.layout.layout_custome_result);
					dialog.setTitle("Result");

					// set the custom dialog components - text, image and button
					TextView text = (TextView) dialog
							.findViewById(R.id.txt_Score_Show);
					text.setText("" + marks);

					Button dialogButton = (Button) dialog
							.findViewById(R.id.dialogButtonOK);
					// if button is clicked, close the custom dialog
					dialogButton.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View v) {
							dialog.dismiss();
							arrayPracticeTests.clear();
							queCount = 0;
							position = 0;
							marks = 0;
							finish();
						}
					});

					dialog.show();
				}

			}

		});

		// AdapterPracticeTest adapterPracticeTest = new AdapterPracticeTest(
		// ActivityPracticeTest.this, arrayPracticeTests);
		// lst_PracticeTest.setAdapter(adapterPracticeTest);

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
			// overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
			// R.anim.exit_from_bottom);
			break;

		case R.id.action_lanEnglish:
			ActivityLanguage.lang = "English";
			Intent iM = getIntent();
			finish();
			startActivity(iM);
			// overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
			// R.anim.exit_from_bottom);
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
