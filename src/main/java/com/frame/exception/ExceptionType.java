package com.frame.exception;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author 周希来
 * @Date 2019/12/6 14:40
 */
public interface ExceptionType {

    int getCode();

    String getDescription();

    default String descriptionWithArgs(Object[] args) {
        return StringUtils.isNotBlank(this.getDescription()) ? String.format(this.getDescription(), args) : this.getDescription();
    }

}
