package com.zhou.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * <p>
 * ConfigDesc对象
 * </p>
 *
 * @author 周希来
 * @since 2019-12-08
 */
@Data
@TableName("config_desc")
@ApiModel(value = "ConfigDesc对象", description="配置")
public class ConfigDesc extends Model<ConfigDesc> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTimestamp;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTimestamp;

    @ApiModelProperty(value = "分类")
    private String category;

    @ApiModelProperty(value = "是否删除")
    private Boolean deleteFlag;

    private LocalDateTime lastUpdateTime;

    private String parentTypeCode;

    private String parentTypeDesc;

    private String subTypeCode;

    private String subTypeDesc;


    @Override
    protected Serializable pkVal() {
                return this.id;
            }
        }