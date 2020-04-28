package wangdinghua17204222.model;

import java.util.Collection;

import javax.validation.constraints.Pattern;

import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Table("owners")
public class Owner extends Person {

	private String address;
	private String city;
	@Pattern(regexp = "[0-9]{10}", message = "Please input 10 numbers...")
	private String telephone;
	//idColumn:外键，keyColumn:排序方式
	@MappedCollection(idColumn = "owner_id",keyColumn = "name")
	private Collection<Pet> pets;

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getTelephone() {
		return telephone;
	}

	public Collection<Pet> getPets() {
		return pets;
	}
}
