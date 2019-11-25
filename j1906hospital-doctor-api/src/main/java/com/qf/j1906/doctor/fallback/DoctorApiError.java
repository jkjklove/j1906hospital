package com.qf.j1906.doctor.fallback;

import com.qf.j1906.common.po.Doctor;
import com.qf.j1906.doctor.api.DoctorApi;

import com.qf.j1906.doctor.vo.MsgResult;
import org.springframework.stereotype.Component;

@Component
public class DoctorApiError implements DoctorApi {
    @Override
    public MsgResult findDoctorsaa() {
        return null;
    }

    @Override
    public MsgResult addDoctoraa(Doctor doctor) {
        return null;
    }

    @Override
    public MsgResult delDoctoraa(int id) {
        return null;
    }

    @Override
    public MsgResult upDoctoraa(Doctor doctor) {
        return null;
    }

    /*@Override
    public MsgResult souSuoaa(String name, String gender, String doInfo) {
        return null;
    }*/


}
