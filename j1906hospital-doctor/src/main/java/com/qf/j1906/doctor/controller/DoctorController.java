package com.qf.j1906.doctor.controller;


import com.qf.j1906.common.po.Doctor;
import com.qf.j1906.doctor.service.DoctorService;
import com.qf.j1906.doctor.vo.MsgResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 提供者
 */

@RestController
public class DoctorController {
    private static final Logger log = LogManager.getLogger(DoctorController.class);
    @Autowired
    private DoctorService doctorService;
    @RequestMapping(value = "/findDoctors",method = RequestMethod.GET)
    public MsgResult findAllDoctor(){
        MsgResult all = doctorService.findAll();
        return all;
    }
    @RequestMapping(value = "/addDoctors",method = RequestMethod.POST)
    public MsgResult addDoctor(@RequestBody Doctor doctor){
        MsgResult msgResult = doctorService.addDoctor(doctor);
        return msgResult;
    }
    @RequestMapping(value = "/delDoctor/{id}",method = RequestMethod.DELETE)
    public MsgResult deleteById(@PathVariable("id") int id){
        log.info(id + "这是要删除的对象id。。。。。。。");
        MsgResult msgResult = doctorService.deleteDoctorById(id);
        return msgResult;
    }
    @RequestMapping(value = "/upDoctor",method = RequestMethod.PUT)
    public MsgResult updateDoctor(@RequestBody Doctor doctor){
        MsgResult msgResult = doctorService.updateDoctor(doctor);
        return msgResult;
    }
    @RequestMapping(value = "/souSuo",method = RequestMethod.GET)
    public MsgResult souSuo(String name, String gender, String  doInfo){
        MsgResult msgResult = doctorService.souSou(name, gender, doInfo);
        return msgResult;
    }
}
