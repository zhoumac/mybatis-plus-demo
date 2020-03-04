package com.zhou.model.vo.req;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import java.time.LocalDateTime;
import com.base.model.BaseReq;
import io.swagger.annotations.ApiModel;

/**
 * <p>
 * UpdateUserReq 请求对象
 * </p>
 *
 * @author 周希来
 * @since 2020-03-02
 */
@Data
@ApiModel(value = "User更新请求对象", description = "用户表")
public class UpdateUserReq extends BaseReq implements Serializable {

    private static final long serialVersionUID = 1L;
            @ApiModelProperty(value = "主键ID", required = true)
            private String id;
}

