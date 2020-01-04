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
 * AddConfigDescReq 请求对象
 * </p>
 *
 * @author 周希来
 * @since 2019-12-08
 */
@Data
@ApiModel(value = "ConfigDesc新增请求对象", description = "配置")
public class AddConfigDescReq extends BaseReq implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTimestamp;
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTimestamp;
    @ApiModelProperty(value = "分类")
    private String category;
    @ApiModelProperty(value = "是否删除")
    private Boolean deleteFlag;
}

