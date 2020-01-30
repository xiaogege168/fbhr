package com.fubang.limao.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Worker {
    private Integer idworker;

    private String name;

    private String password;

    private Integer age;

    private String sfz;

    private String photo;

    private Integer departmentId;

    private String phone;

    private Integer managerid;

    private List<Hours> hours;

    private Department department;
}