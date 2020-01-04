
package com.zhou.model.vo.req;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.base.model.BasePageReq;
import io.swagger.annotations.ApiModel;
/**
 * <p>
 * PageDataCommodityReq对象
 * </p>
 *
 * @author 周希来
 * @since 2019-12-08
 */
@Data
@ApiModel(value = "ListDataCommodity列表请求对象", description = "")
public class PageDataCommodityReq extends BasePageReq implements Serializable {

    @ApiModelProperty(value = "关键字查询", required = false)
    private String keyword;

}