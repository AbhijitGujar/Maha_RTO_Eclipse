package co.example.punerto.classes;

public class PracticeTest {

	
	String question;
	String opt1;
	String opt2;
	String opt3;
	String img_Path;
	String ans;
	public PracticeTest(String question,String opt1,String opt2,String opt3,String img_Path,String ans) {
		
		this.question=question;
		this.opt1=opt1;
		this.opt2=opt2;
		this.opt3=opt3;
		this.img_Path=img_Path;
		this.ans=ans;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOpt1() {
		return opt1;
	}
	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}
	public String getOpt2() {
		return opt2;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}
	public String getOpt3() {
		return opt3;
	}
	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}
	public String getImg_Path() {
		return img_Path;
	}
	public void setImg_Path(String img_Path) {
		this.img_Path = img_Path;
	}
	
}
