package com.base.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author 周希来
 * @Date 2019/12/6 16:07
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ApiEbum {
    SUCCESS(200,"success"),
    FAIL_201(201,"参数异常"),
    ;
    private int code;
    private String msg;
}
