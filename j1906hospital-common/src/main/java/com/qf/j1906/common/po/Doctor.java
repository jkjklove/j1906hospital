package com.qf.j1906.common.po;

public class Doctor {
    private Integer doctorId;

    private String doctorName;

    private String gender;

    private String department;

    private String doImg;

    private String doInfo;

    private String doStatus;

    private String paName;

    private String telphone;

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getDoImg() {
        return doImg;
    }

    public void setDoImg(String doImg) {
        this.doImg = doImg == null ? null : doImg.trim();
    }

    public String getDoInfo() {
        return doInfo;
    }

    public void setDoInfo(String doInfo) {
        this.doInfo = doInfo == null ? null : doInfo.trim();
    }

    public String getDoStatus() {
        return doStatus;
    }

    public void setDoStatus(String doStatus) {
        this.doStatus = doStatus == null ? null : doStatus.trim();
    }

    public String getPaName() {
        return paName;
    }

    public void setPaName(String paName) {
        this.paName = paName == null ? null : paName.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }
}