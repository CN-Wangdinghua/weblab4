package wangdinghua17204222.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wangdinghua17204222.model.Specialty;
import wangdinghua17204222.service.ClinicService;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/specialties")
public class VetListRestController {
    @Autowired
    private ClinicService clinicService;
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Specialty>> specialties() {
        Collection<Specialty> specialties = clinicService.getAllSpecialties();
        return new ResponseEntity<Collection<Specialty>>(specialties, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Specialty> specialty(@PathVariable int id) {
        Optional<Specialty> specialty = clinicService.findSpecialtyById(id);
        return new ResponseEntity<>(specialty.get(), HttpStatus.OK);
    }
}
