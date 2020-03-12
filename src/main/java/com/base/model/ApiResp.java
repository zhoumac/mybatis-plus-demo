package com.base.model;
import com.base.model.enums.ApiEbum;
import com.base.model.enums.ApiEbum.*;
import com.frame.exception.BusinessSilentException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * @Author 周希来
 * @Date 2019/12/3 15:22
 */
@Data
@Builder
@ApiModel("返回数据")
public class ApiResp<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 返回code
     */
    @ApiModelProperty(value = "code",example = "200")
    private Integer code;
    /**
     * 返回信息
     */
    @ApiModelProperty(value = "错误信息",example = "201")
    private String msg;

    @ApiModelProperty(value = "异常类", position = 3)
    private String exception;

    /**
     * 返回数据对象
     */
    @ApiModelProperty(value = "返回数据对象",example = "true")
    private T data;

    /**
     * 请求成功
     * @param data
     * @return
     */
    public static ApiResp getSuccess(Object data){
        ApiEbum success = ApiEbum.SUCCESS;
        return  ApiResp.builder()
                .code(success.getCode())
                .msg(success.getMsg())
                .data(data)
                .build();
    }
    /**
     * 参数异常
     * @param msg
     * @return
     */
    public static ApiResp getFailByArg(String msg){
        ApiEbum success = ApiEbum.FAIL_201;
        ApiResp build = ApiResp.builder()
                .code(success.getCode())
                .build();
        if(StringUtils.isNotBlank(msg)){
            build.setMsg(msg);
        }
        return  build;
    }

    /**
     * 业务异常
     * @param e
     * @return
     */
    public static ApiResp getFailByBusiness(BusinessSilentException e){

        ApiResp build = ApiResp.builder()
                .code(e.getCode())
                .exception(e.getMessage())
                .msg(e.getDescription())
                .build();

        return  build;
    }

    /**
     * 其他异常
     * @param e
     * @return
     */
    public static ApiResp getFailByException(Exception e){

        ApiResp build = ApiResp.builder()
                .code(500)
                .exception(e.getMessage())
                .msg("系统错误")
                .build();

        return  build;
    }

    public static void main(String[] args) {
        ApiResp apiResp = ApiResp.builder().code(200).msg("success").build();
        System.out.println(apiResp.toString());
    }
}
