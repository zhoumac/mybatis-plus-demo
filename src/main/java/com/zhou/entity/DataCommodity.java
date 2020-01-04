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
 * DataCommodity对象
 * </p>
 *
 * @author 周希来
 * @since 2019-12-08
 */
@Data
@TableName("data_commodity")
@ApiModel(value = "DataCommodity对象", description="")
public class DataCommodity extends Model<DataCommodity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private LocalDateTime createTimestamp;

    private LocalDateTime updateTimestamp;

    private String bclass;

    private String bismt;

    private String brgew;

    private String bstrf;

    private String craft;

    private String degree;

    private String ean11;

    private String gewei;

    private String grapebarity;

    private String grapeyear;

    private String groes;

    private String isunique;

    private String lastmodifytime;

    private String loevm;

    private String maktx;

    private String material;

    private String matnr;

    private String meins;

    private String mhdhb;

    private String mtart;

    private String mznd;

    private String ntgew;

    private String qty;

    private String sclass;

    private String smell;

    private String swor;

    private String tag;

    private String voleh;

    private String volum;

    private String zjyms;

    private String zzbrand;

    private String zzclass;

    private String zzcountry;

    private Boolean zzewm;

    private String zzgrape;

    private String zzhydj;

    private String zzkfspsj;

    private String zzkfspsx;

    private String zzlsdj;

    private String zzmlfs;

    private String zzname;

    private String zzpsms;

    private String zzqy;

    private String zzregion;

    private String zzsccj;

    private String zzsdbl;

    private String zzspbm;

    private String zzspsx;

    private String zzspzsx;

    private String zzzysfj;


    @Override
    protected Serializable pkVal() {
                return this.id;
            }
        }