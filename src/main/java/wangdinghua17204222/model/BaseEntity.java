package wangdinghua17204222.model;

import org.springframework.data.annotation.Id;

public class BaseEntity {

	@Id
	protected int id;

	public int getId() {
		return id;
	}
}
