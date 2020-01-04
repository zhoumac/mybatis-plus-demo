package com.base.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author 周希来
 * @Date 2019/12/3 15:22
 */
@Data
@ApiModel("分页请求")
public class BasePageReq implements Serializable {
    @ApiModelProperty(value = "第几页",example = "1")
    private Integer current =1;
    @ApiModelProperty(value = "每页大小",example = "10" )
    private Integer size = 10;
}
