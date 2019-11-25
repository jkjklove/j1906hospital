package com.qf.j1906.doctor.service.impl;


import com.qf.j1906.common.po.Doctor;
import com.qf.j1906.doctor.mapper.DoctorMapper;
import com.qf.j1906.doctor.service.DoctorService;
import com.qf.j1906.doctor.vo.MsgResult;
import org.springframework.stereotype.Service;



import javax.annotation.Resource;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Resource
    private DoctorMapper doctorMapper;
    @Override
    public MsgResult findAll() {
        List<Doctor> doctors = doctorMapper.selectAllDoctor();
        MsgResult msgResult = new MsgResult();
        msgResult.setStatusCode(200);
        msgResult.setData(doctors);
        return msgResult;
    }

    @Override
    public MsgResult addDoctor(Doctor doctor) {
        Boolean aBoolean = doctorMapper.saveDoctor(doctor);
        MsgResult msgResult = new MsgResult();
        msgResult.setStatusCode(200);
        msgResult.setData("添加成功！！！" + aBoolean);
        return msgResult;
    }

    @Override
    public MsgResult deleteDoctorById(int id) {
        int i = doctorMapper.deleteByPrimaryKey(id);
        MsgResult msgResult = new MsgResult();
        if (i > 0){
            msgResult.setData(i + "删除成功！！！");
            msgResult.setStatusCode(200);
            return msgResult;
        }
       return null;
    }

    @Override
    public MsgResult updateDoctor(Doctor id) {
        Integer i= doctorMapper.upDoctor(id);
        MsgResult msgResult = new MsgResult();
        if (i != null){
            msgResult.setData(i + "修改成功！！！");
            msgResult.setStatusCode(200);
            return msgResult;
        }
        return null;
    }

    @Override
    public MsgResult souSou(String name, String gender, String doInfo) {
        List<Doctor> doctors = doctorMapper.souSuo(name, gender, doInfo);
        MsgResult msgResult = new MsgResult();
        msgResult.setStatusCode(200);
        msgResult.setData(doctors + "查询成功");
        return msgResult;
    }
}
