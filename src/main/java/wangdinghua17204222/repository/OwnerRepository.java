package wangdinghua17204222.repository;

import java.util.Collection;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import wangdinghua17204222.model.Owner;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Integer>{

	@Query("select * from owners where last_name like :lastName")
	Collection<Owner> findByLastName(@Param("lastName") String lastName);
}
