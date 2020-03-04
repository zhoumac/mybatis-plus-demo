package com.zhou.model.vo.req;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import java.time.LocalDateTime;
import com.base.model.BaseReq;
import io.swagger.annotations.ApiModel;

/**
 * <p>
 * AddUserReq 请求对象
 * </p>
 *
 * @author 周希来
 * @since 2020-03-02
 */
@Data
@ApiModel(value = "User新增请求对象", description = "用户表")
public class AddUserReq extends BaseReq implements Serializable {

    private static final long serialVersionUID = 1L;
}

