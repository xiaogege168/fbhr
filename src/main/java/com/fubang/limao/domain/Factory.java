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
public class Factory {
    /**
     *
     */
    private Integer idfactory;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String location;

    /**
     *
     */
    private String leader;

    /**
     *
     */
    private String phone;

    private List<Department> departments;
}

