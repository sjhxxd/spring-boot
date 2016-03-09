package bishe.repository;

import bishe.models.Person;
import bishe.repository.UserBaseRepository;

import javax.transaction.Transactional;

/**
 * Repository for the entity Person.
 * 
 * @see UserBaseRepository
 */
@Transactional
public interface PersonRepository extends UserBaseRepository<Person> { }
