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
 * DataBusinessMode对象
 * </p>
 *
 * @author 周希来
 * @since 2019-12-08
 */
@Data
@TableName("data_business_mode")
@ApiModel(value = "DataBusinessMode对象", description="")
public class DataBusinessMode extends Model<DataBusinessMode> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private LocalDateTime createTimestamp;

    private LocalDateTime updateTimestamp;

    private Boolean brandFactory;

    private Boolean brandedCompany;

    private String businessMode;

    private String businessModeDescription;

    private LocalDateTime endTime;

    private String matnr;

    private String productName;

    private String purchaserCode;

    private String purchaserName;

    private Integer purchaserProvinceCode;

    private String purchaserProvinceName;

    private Boolean remove;

    private Boolean sole;

    private LocalDateTime startTime;

    private String stockLocation;

    private String supplierAccount;

    private Boolean supplierCompany;

    private Boolean supplierFactory;

    private String supplierName;

    private Integer supplierProvinceCode;

    private String supplierProvinceName;

    private String warehouseName;

    private String categoryAttributeCode;

    private String categoryAttributeName;

    private String categoryCode;

    private String categoryName;

    private String primeAttributeCode;

    private String primeAttributeName;

    private Integer commodityQualificationStatus;


    @Override
    protected Serializable pkVal() {
                return this.id;
            }
        }