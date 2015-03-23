package co.example.punerto.classes;

public class NotificationMessage {

	String no_id;
	String not_message;
	String time_stamp;

	public NotificationMessage(String no_id, String not_message, String time_stamp) {
		// TODO Auto-generated constructor stub

		this.no_id = no_id;
		this.not_message = not_message;
		this.time_stamp = time_stamp;
	}

	public String getNo_id() {
		return no_id;
	}

	public void setNo_id(String no_id) {
		this.no_id = no_id;
	}

	public String getNot_message() {
		return not_message;
	}

	public void setNot_message(String not_message) {
		this.not_message = not_message;
	}

	public String getTime_stamp() {
		return time_stamp;
	}

	public void setTime_stamp(String time_stamp) {
		this.time_stamp = time_stamp;
	}

}
