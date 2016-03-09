package bishe.implement;

import bishe.entity.PatientInfoEntity;
import bishe.repository.PatientInfoRepository;
import bishe.service.PatientInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sjh on 16/3/9.
 */
public class PatientInfoServiceImpl implements PatientInfoService {
    @Autowired
    private PatientInfoRepository patientInfoRepository;
    @Override
    public List<PatientInfoEntity> getAllPatient() {

        return (List<PatientInfoEntity>) patientInfoRepository.findAll();
    }

    @Override
    public PatientInfoEntity findByPatientId(Long patientId) {
        return patientInfoRepository.findOne(patientId);
    }

    @Override
    public PatientInfoEntity saveOrUpdatePatient(PatientInfoEntity patientInfoEntity) {
        return null;
    }

    @Override
    public PatientInfoEntity deletePatient(int patientId) {
        return null;
    }
}
