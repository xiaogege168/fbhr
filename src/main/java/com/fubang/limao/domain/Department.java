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
public class Department {
    private Integer iddepartment;

    private String name;

    private String coments;

    private Integer sumwoker;

    private String factoryid;

    private Factory factory;

    private List<Hours> hours;

}