package bishe.controllers;

import bishe.entity.PatientInfoEntity;
import bishe.repository.PatientInfoRepository;
import ch.qos.logback.core.net.SyslogOutputStream;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sjh on 16/3/9.
 */
@RestController
public class PatientController {
    @Autowired
    private PatientInfoRepository patientInfoRepository;

    @RequestMapping(value = "/patientinfo/getbyname",method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get a single hotel.", notes = "You have to provide a valid hotel ID.")
    @ResponseBody
    public List<PatientInfoEntity> getPatientInfoByName() {
        try {

            List<PatientInfoEntity> patientInfoEntities = (List<PatientInfoEntity>) patientInfoRepository.findAll();
            for (PatientInfoEntity patientEntity:patientInfoEntities
                 ) {
                System.out.println(patientEntity.getPatientName());
            }
            return patientInfoEntities;
        }
        catch (Exception e) {
        return null;
        }
    }
    @RequestMapping(value = "/patientinfo/findbyname/{patientname}",method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get a single hotel.", notes = "You have to provide a valid hotel ID.")
    @ResponseBody
    public PatientInfoEntity getPatientByone(@PathVariable String patientname){
        System.out.println(patientInfoRepository.findByPatientName(patientname).getPatientName());
        return patientInfoRepository.findByPatientName(patientname);
    }
}
