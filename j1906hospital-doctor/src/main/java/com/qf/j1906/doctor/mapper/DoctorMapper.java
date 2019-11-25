package com.qf.j1906.doctor.mapper;

import com.qf.j1906.common.po.Doctor;
import com.qf.j1906.common.po.DoctorExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DoctorMapper {
    //查询所有医生详细信息
    List<Doctor> selectAllDoctor();

    //添加医生对象
    Boolean saveDoctor(Doctor doctor);

    //修改医生对象信息
    int upDoctor(Doctor doctor);

    //搜索查询医生对象
    List<Doctor> souSuo(String name, String gender, String doInfo);

    int countByExample(DoctorExample example);

    int deleteByExample(DoctorExample example);

    int deleteByPrimaryKey(Integer doctorId);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    List<Doctor> selectByExample(DoctorExample example);

    Doctor selectByPrimaryKey(Integer doctorId);

    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
}