package bishe.repository;

import bishe.entity.PatientInfoEntity;

import javax.transaction.Transactional;

/**
 * Created by sjh on 16/3/9.
 */
@Transactional
public interface PatientInfoRepository extends BaseRepository<PatientInfoEntity> {

    public PatientInfoEntity findByPatientName(String patientName);
}
