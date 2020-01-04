package com.base.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;

/**
 * @Author 周希来
 * @Date 2019/12/3 15:22
 */
@Data
@ApiModel("请求父类")
public class BaseReq implements Serializable {
    /**
     * 供应商名称
     */
    @ApiModelProperty(value = "请求参数",example = "1001")
    String param;
}
