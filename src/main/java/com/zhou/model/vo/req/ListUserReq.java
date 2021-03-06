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
 * ListUserReq对象
 * </p>
 *
 * @author 周希来
 * @since 2020-03-02
 */
@Data
@ApiModel(value = "ListUser列表请求对象", description = "用户表")
public class ListUserReq extends BaseReq implements Serializable {

    @ApiModelProperty(value = "关键字查询", required = false)
    private String keyword;

}


