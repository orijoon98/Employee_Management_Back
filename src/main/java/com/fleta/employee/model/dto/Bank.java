package com.fleta.employee.model.dto;

import lombok.Data;

@Data
public class Bank {
    private String 사번;
    private String 급여이체은행;
    private String 계좌번호;
    private String 예금주;
}