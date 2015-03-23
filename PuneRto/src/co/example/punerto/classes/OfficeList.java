package co.example.punerto.classes;

public class OfficeList {

	String telNo;
	String telNo1;
	String telNo2;
	String telNo3;
	String fax;
	String emailId;
	String officeName;
	String officeAddress;
	String officeId;
	String officerName;

	public OfficeList(String officeId, String officeName, String officeAddress,
			String fax, String telNo, String telNo1, String telNo2, String telNo3, String emailId,String officerName) {
		// TODO Auto-generated constructor stub
		super();
		this.telNo = telNo;
		this.telNo1=telNo1;
		this.telNo2=telNo2;
		this.telNo3=telNo3;
		
		this.fax = fax;
		this.emailId = emailId;
		this.officeName = officeName;
		this.officeAddress = officeAddress;
		this.officeId = officeId;
		this.officerName=officerName;
		
	}

	
	
	public String getTelNo1() {
		return telNo1;
	}

	public void setTelNo1(String telNo1) {
		this.telNo1 = telNo1;
	}

	public String getTelNo2() {
		return telNo2;
	}

	public void setTelNo2(String telNo2) {
		this.telNo2 = telNo2;
	}

	public String getTelNo3() {
		return telNo3;
	}

	public void setTelNo3(String telNo3) {
		this.telNo3 = telNo3;
	}
	public String getOfficerName() {
		return officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

}
