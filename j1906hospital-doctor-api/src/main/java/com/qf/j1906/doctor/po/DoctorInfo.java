package com.qf.j1906.doctor.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DoctorInfo {
    private Integer id;
    private String username;
    private String password;
}
