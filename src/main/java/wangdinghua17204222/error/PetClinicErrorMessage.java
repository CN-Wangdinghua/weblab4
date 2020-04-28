package wangdinghua17204222.error;

public class PetClinicErrorMessage {
	private int code;
	private String message;

	public PetClinicErrorMessage(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
