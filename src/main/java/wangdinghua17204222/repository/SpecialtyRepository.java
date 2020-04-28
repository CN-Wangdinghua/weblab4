package wangdinghua17204222.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wangdinghua17204222.model.Specialty;

@Repository
public interface SpecialtyRepository extends CrudRepository<Specialty, Integer> {
}
