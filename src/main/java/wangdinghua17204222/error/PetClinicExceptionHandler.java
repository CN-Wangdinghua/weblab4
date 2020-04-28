package wangdinghua17204222.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PetClinicExceptionHandler {
	@ExceptionHandler(PetClinicException.class)
	public ResponseEntity<PetClinicErrorMessage> handlePetClinicException(PetClinicException ex){
		return new ResponseEntity<>(ex.getErrorMessage(), HttpStatus.BAD_REQUEST);
	}
}
