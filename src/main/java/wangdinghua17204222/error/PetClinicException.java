package wangdinghua17204222.error;

public class PetClinicException extends Exception {
	private PetClinicErrorMessage errorMessage;

	public PetClinicException(PetClinicErrorMessage errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public PetClinicErrorMessage getErrorMessage() {
		return errorMessage;
	}
	
	public String getMessage() {
		return errorMessage.getMessage();
	}
}
