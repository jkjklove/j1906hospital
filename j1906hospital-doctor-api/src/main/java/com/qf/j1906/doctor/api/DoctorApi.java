package com.qf.j1906.doctor.api;


import com.qf.j1906.common.po.Doctor;
import com.qf.j1906.doctor.fallback.DoctorApiError;

import com.qf.j1906.doctor.vo.MsgResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@FeignClient(value = "j1906hospital-doctor",fallback = DoctorApiError.class)
public interface DoctorApi {
    @RequestMapping(value = "/findDoctors",method = RequestMethod.GET)
    public MsgResult findDoctorsaa();

    @RequestMapping(value = "/addDoctors",method = RequestMethod.POST)
    public MsgResult addDoctoraa(@RequestBody Doctor doctor);

    @RequestMapping(value = "/delDoctor/{id}",method = RequestMethod.DELETE)
    public MsgResult delDoctoraa(@PathVariable int id);

    @RequestMapping(value = "/upDoctor",method = RequestMethod.PUT)
    public MsgResult upDoctoraa(@RequestBody Doctor doctor);

    /*@RequestMapping(value = "/souSuo",method = RequestMethod.GET)
    public MsgResult souSuoaa(String name, String gender, String doInfo);*/
}
