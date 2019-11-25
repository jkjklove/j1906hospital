package com.qf.j1906.admin.controller;

import com.qf.j1906.common.po.Doctor;
import com.qf.j1906.doctor.api.DoctorApi;
import com.qf.j1906.doctor.vo.MsgResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorController {
    private static final Logger log = LogManager.getLogger(DoctorController.class);
    @Autowired
    private DoctorApi doctorApi;
    @RequestMapping(value = "/api/findDoctors",method = RequestMethod.GET)
    @CrossOrigin
    public MsgResult findDoctors1(){
        MsgResult doctors = doctorApi.findDoctorsaa();
        return doctors;
    }
    @RequestMapping(value = "/api/addDoctors",method = RequestMethod.POST)
    @CrossOrigin
    public MsgResult addDoctor1(@RequestBody Doctor doctor){
        MsgResult msgResult = doctorApi.addDoctoraa(doctor);
        return msgResult;
    }
    @RequestMapping(value = "/api/delDoctor",method = RequestMethod.DELETE)
    @CrossOrigin
    public MsgResult delDocById(@RequestParam("id") int id){
        log.info("delete successful" + id);
        MsgResult msgResult = doctorApi.delDoctoraa(id);
        return msgResult;
    }
    @RequestMapping(value = "/upDoctor",method = RequestMethod.PUT)
    @CrossOrigin
    public MsgResult upDoctor(@RequestBody Doctor doctor){
        log.info("修改成功！！！" + doctor);
        MsgResult msgResult = doctorApi.upDoctoraa(doctor);
        return msgResult;
    }

  /*@RequestMapping(value = "/souSuo",method = RequestMethod.GET)
    @CrossOrigin
    public MsgResult souSuo(String name,String gender,String doInfo){
        MsgResult msgResult = doctorApi.souSuoaa(name, gender, doInfo);
        return msgResult;
    }*/

}
