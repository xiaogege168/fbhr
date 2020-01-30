package com.fubang.limao.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hours {
    private Integer idhours;

    private Integer workerId;

    private Worker worker;

    private Date riqi;

    private Integer gongshi;
    private Integer gongshiPlus;

    private Integer jiezi;
    private Integer jieziPlus;

    private String jieziSata;

    private String qingjia;
}