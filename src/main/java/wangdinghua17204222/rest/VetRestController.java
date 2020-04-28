package wangdinghua17204222.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import wangdinghua17204222.model.Vet;
import wangdinghua17204222.service.ClinicService;

@RestController
@RequestMapping("api/v1/vets")
public class VetRestController {

	@Autowired
	private ClinicService clientService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Collection<Vet>> vets() {
		Collection<Vet> vets = clientService.getAllVets();
		return new ResponseEntity<Collection<Vet>>(vets, HttpStatus.OK);
	}
}
