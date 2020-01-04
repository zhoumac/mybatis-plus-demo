package com.zhou.model.vo.req;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import java.time.LocalDateTime;
import com.base.model.BaseReq;
import io.swagger.annotations.ApiModel;

/**
 * <p>
 * UpdateDataBusinessModeReq 请求对象
 * </p>
 *
 * @author 周希来
 * @since 2019-12-08
 */
@Data
@ApiModel(value = "DataBusinessMode更新请求对象", description = "")
public class UpdateDataBusinessModeReq extends BaseReq implements Serializable {

    private static final long serialVersionUID = 1L;
            @ApiModelProperty(value = "", required = true)
            private Long id;
}
