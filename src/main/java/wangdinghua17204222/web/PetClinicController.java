package wangdinghua17204222.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetClinicController {
	
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/vets")
	public String vets() {
		return "vets/vetList";
	}
	
	@RequestMapping("/owners")
	public String owners() {
		return "owners/ownerList";
	}
	
	@RequestMapping("/owners/add")
	public String addOwner() {
		return "owners/ownerAdd";
	}
}
