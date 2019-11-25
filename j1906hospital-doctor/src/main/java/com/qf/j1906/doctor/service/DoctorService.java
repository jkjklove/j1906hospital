package com.qf.j1906.doctor.service;



import com.qf.j1906.common.po.Doctor;
import com.qf.j1906.doctor.vo.MsgResult;



/**
 * 医生对象操作方法的业务逻辑层接口（生产者）
 */
public interface DoctorService {
    /**
     * 全查所有医生对象详细信息
     * @return
     */
    public MsgResult findAll();

    /**
     * 添加医生
     * @return
     */
    public MsgResult addDoctor(Doctor doctor);

    /**
     * 根据id删除医生信息
     * @param id
     * @return
     */
    public MsgResult deleteDoctorById(int id);

    /**
     * 修改医生对象信息
     * @param doctor
     * @return
     */
    public MsgResult updateDoctor(Doctor doctor);

    /**
     * 条件查询医生对象
     * @param name
     * @param gender
     * @param doInfo
     * @return
     */
    public MsgResult souSou(String name, String gender, String doInfo);
}
