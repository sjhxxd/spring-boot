package bishe.repository;

import bishe.models.Company;

import javax.transaction.Transactional;

/**
 * Repository for the entity Company.
 *
 * @see UserBaseRepository
 */

@Transactional
public interface CompanyRepository extends UserBaseRepository<Company> {
}
