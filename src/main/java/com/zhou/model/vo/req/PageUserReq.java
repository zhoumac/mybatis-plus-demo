
package com.zhou.model.vo.req;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.base.model.BasePageReq;
import io.swagger.annotations.ApiModel;
/**
 * <p>
 * PageUserReq对象
 * </p>
 *
 * @author 周希来
 * @since 2020-03-02
 */
@Data
@ApiModel(value = "ListUser列表请求对象", description = "用户表")
public class PageUserReq extends BasePageReq implements Serializable {

    @ApiModelProperty(value = "关键字查询", required = false)
    private String keyword;

}