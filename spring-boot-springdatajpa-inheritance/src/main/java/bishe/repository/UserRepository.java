package bishe.repository;

import bishe.models.User;
import bishe.repository.UserBaseRepository;

import javax.transaction.Transactional;

/**
 * Repository for the entity User.
 * 
 * @see UserBaseRepository
 */
@Transactional
public interface UserRepository extends UserBaseRepository<User> { }
