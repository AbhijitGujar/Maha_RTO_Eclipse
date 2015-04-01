package co.example.punerto.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ActivityLearnLicAppointment 
{
	 
	
	// all the from variables are here 
	// Tab 1 
	 public static String applicantrefno="";  
	 public static String licence_type="l";  
	 public static String statecode="MH";  
	 public static String rtocode="";  
	 public static String first_name="";  
	 public static String middle_name="";  
	 public static String last_name="";  
	 public static String applicant_name="";  
	 public static String gender_type="";  
	 public static String dob="";  
	 public static String birth_place="";  
	 public static String migration_year="";  
	 public static String migration_month="";  
	 public static String birth_country="";  
	 public static String email_id="";  
	 public static String relation_type="";  
	 public static String p_first_name="";  
	 public static String p_middle_name="";  
	 public static String p_last_name="";  
	 //tab 2
	 public static String p_flat_house_no="";  
	 public static String p_street_locality="";  
	 public static String p_village_city="";  
	 public static String p_district="";  
	 public static String p_state="";  
	 public static String p_pin="";  
	 public static String p_phone_no="";  
	 public static String p_mobile_no="";  
	 public static String p_durationofstay_year="";  
	 public static String p_durationofstay_month="";  
	 public static String t_flat_house_no="";  
	 public static String t_street_locality="";  
	 public static String t_village_city="";  
	 public static String t_district="";  
	 public static String t_state="";  
	 public static String t_pin="";  
	 public static String t_phone_no="";  
	 public static String t_durationofstay_year="";  
	 public static String t_durationofstay_month="";  
	 public static String citizenship_status_type="";  
	 public static String edu_qualification="";  
	 public static String identification_marks1="";  
	 public static String identification_marks2="";  
	 public static String blood_group="";  
	 
	 // tab 3 
	 public static String covs="";  
	 public static String rcnumber="";  
	 
	 
	 //tab 4
	 public static String doc1_proof_code="";  
	 public static String doc1_licence_certificate_badge_no="";  
	 public static String doc1_issuing_authority="";   
	 public static String doc1_date_of_issue="";  

	 public static String doc2_proof_code="";  
	 public static String doc2_licence_certificate_badge_no="";  
	 public static String doc2_issuing_authority="";   
	 public static String doc2_date_of_issue="";  

	 public static String doc3_proof_code="";  
	 public static String doc3_licence_certificate_badge_no="";  
	 public static String doc3_issuing_authority="";   
	 public static String doc3_date_of_issue="";  

	 public static String doc4_proof_code="";  
	 public static String doc4_licence_certificate_badge_no="";  
	 public static String doc4_issuing_authority="";   
	 public static String doc4_date_of_issue="";  

	 public static String doc5_proof_code="";  
	 public static String doc5_licence_certificate_badge_no="";  
	 public static String doc5_issuing_authority="";   
	 public static String doc5_date_of_issue="";  
	 
	 //tab 5

	 public static String parentletterforbelow18age="";  
	 public static String allnecessarycertificates="";  
	 public static String examptedmadicaltest="";  
	 public static String examptedpreliminarytest="";  
	 public static String convicted="";  
	 public static String attdlnumber="";  
	 public static String attdtofconviction="";  
	 public static String attreason="";  
	 
	 
	
	
	
	
	
	
	
	 public static List<String> proof_code1 = new ArrayList<String>();
	 public static List<String> proof_code2 = new ArrayList<String>();
	 public static List<String> array_rtocode = new ArrayList<String>();
	
	public static List<Map<String, String>> qualification_master = new ArrayList<Map<String, String>>();
	
	public void initializedata()
	{
		
		
		proof_code1.add("B");proof_code2.add("Psv Badge");
		proof_code1.add("C");proof_code2.add("First Aid Certificate");
		proof_code1.add("D");proof_code2.add("Driving Licence (DL)");
		proof_code1.add("F");proof_code2.add("FIR(First Information Report)");
		proof_code1.add("H");proof_code2.add("Hill Driving Training Certificate");
		proof_code1.add("I");proof_code2.add("International Driving Permit (IDP)");
		proof_code1.add("L");proof_code2.add("Learners Licence (LL)");
		proof_code1.add("T");proof_code2.add("Driving Training Certificate");
		proof_code1.add("V");proof_code2.add("Visa");
		proof_code1.add("Z");proof_code2.add("Hazardous Training Certificate");
		proof_code1.add("E");proof_code2.add("Age-School/Educational Cert.");
		proof_code1.add("A");proof_code2.add("Age-Passport");
		proof_code1.add("1");proof_code2.add("Age-Birth Certificate");
		proof_code1.add("2");proof_code2.add("Age-Affidavit by Magistrate/Notary Public");
		proof_code1.add("3");proof_code2.add("Address-Voter-ID");
		proof_code1.add("P");proof_code2.add("Address-Passport");
		proof_code1.add("4");proof_code2.add("Address-LIC Policy");
		proof_code1.add("5");proof_code2.add("Address-ID Card issued by Central/State Govt");
		proof_code1.add("6");proof_code2.add("Address-PaySlip by Central/State Govt/Localbody");
		proof_code1.add("7");proof_code2.add("Address-AADHAAR CARD");
		
		
		HashMap<String, String> quali_list = new HashMap<String, String>();
		quali_list.put("0", "Illiterate");
		quali_list.put("1", "Not specified");
		quali_list.put("2", "Below  8th");
		quali_list.put("3", "8th   PASSED");
		quali_list.put("4", "10th Class /SSC/ SSLC/CBSE (X)/ICSE (X)");
		quali_list.put("6", "I T I");
		quali_list.put("7", "Certificate  course");
		quali_list.put("10", "+2/Intermediate/ICSE (12th )/CBSE(12th)");
		quali_list.put("11", "Diploma in Engineering (non Mechanical)");
		quali_list.put("12", "Diploma in Mechanical Engineering");
		quali_list.put("13", "Diploma in Other faculties");
		quali_list.put("14", "DHMS");
		quali_list.put("30", "B A / BBA / B. Com / B Sc");
		quali_list.put("31", "Bachelor of  Agriculture / Vet.Sciences");
		quali_list.put("32", "B E ( other than Mechanical)");
		quali_list.put("33", "B E (Mechanical)");
		quali_list.put("34", "MBBS / BHMS / BAMS");
		quali_list.put("35", "BadgasfaBachelor of Education / Lawsfsfe");
		quali_list.put("39", "Any Other Graduation Not specified above");
		quali_list.put("50", "MA / MBA / M.Com / M.SC");
		quali_list.put("51", "PG Diploma In Science/Arts/Commerce/Mgt");
		quali_list.put("51", "PG Diploma In Science/Arts/Commerce/Mgt");
		quali_list.put("52", "PG Diploma In Engineering / Medicine");
		quali_list.put("53", "M Sc (Agriculture / Vet. Sciences)");
		quali_list.put("54", "M E ( other than Mechanical )");
		quali_list.put("55", "M E (Mechanical)");
		quali_list.put("56", "MS / MD /  MHMS / MAMS / MDS");
		quali_list.put("57", "Master of Education / Law");
		quali_list.put("58", "CA / ICWA / ICS – or  equivalent");
		quali_list.put("59", "Any Other PG/PG Diploma  Not specified");
		quali_list.put("70", "M Phil. (Sci/Arts/Com/ Edn/Law/ Mgt/etc)");
		quali_list.put("80", "Ph.D. (Sci/Arts/Com/ Edn/Law/ Mgt/etc)");
		quali_list.put("81", "Ph.D in Engineering");
		quali_list.put("82", "Ph. D. in Medicine");
		quali_list.put("90", "M. Ch. ( Surgery )/ D.M. ( Medicine )");
		
		qualification_master.add(quali_list);
		
		array_rtocode.add("MH01");
		array_rtocode.add("MH02");
		array_rtocode.add("MH03");
		array_rtocode.add("MH04");
		array_rtocode.add("MH05");
		array_rtocode.add("MH06");
		array_rtocode.add("MH06");
		array_rtocode.add("MH08");
		array_rtocode.add("MH09");
		array_rtocode.add("MH10");
		array_rtocode.add("MH11");
		array_rtocode.add("MH12");
		array_rtocode.add("MH13");
		array_rtocode.add("MH14");
		array_rtocode.add("MH15");
		array_rtocode.add("MH16");
		array_rtocode.add("MH17");
		array_rtocode.add("MH18");
		array_rtocode.add("MH19");
		array_rtocode.add("MH20");
		array_rtocode.add("MH21");
		array_rtocode.add("MH22");
		array_rtocode.add("MH23");
		array_rtocode.add("MH24");
		array_rtocode.add("MH25");
		array_rtocode.add("MH26");
		array_rtocode.add("MH27");
		array_rtocode.add("MH28");
		array_rtocode.add("MH29");
		array_rtocode.add("MH30");
		array_rtocode.add("MH31");
		array_rtocode.add("MH32");
		array_rtocode.add("MH33");
		array_rtocode.add("MH34");
		array_rtocode.add("MH35");
		array_rtocode.add("MH36");
		array_rtocode.add("MH37");
		array_rtocode.add("MH38");
		array_rtocode.add("MH39");
		array_rtocode.add("MH40");
		array_rtocode.add("MH41");
		array_rtocode.add("MH42");
		array_rtocode.add("MH43");
		array_rtocode.add("MH44");
		array_rtocode.add("MH45");
		array_rtocode.add("MH46");
		array_rtocode.add("MH47");
		array_rtocode.add("MH48");
		array_rtocode.add("MH49");
		array_rtocode.add("MH50");
		
		
		
		
	}
	public boolean  checkSpecialCharacters(String strcheck )
	{
		
		Pattern regex = Pattern.compile("[,″&<>′]");
		Matcher matcher = regex.matcher(strcheck);
		if (matcher.find())
			return true;
		else
			return false;
		
		
	}

}
