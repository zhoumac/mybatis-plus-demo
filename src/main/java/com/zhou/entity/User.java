package com.zhou.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * <p>
 * User对象
 * </p>
 *
 * @author 周希来
 * @since 2020-03-02
 */
@Data
@TableName("uk_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private String id;

    @TableField("LANGUAGE")
    private String language;

    @TableField("USERNAME")
    private String username;

    @TableField("PASSWORD")
    private String password;

    @TableField("AVATAR")
    private String avatar;

    @TableField("SECURECONF")
    private String secureconf;

    @TableField("EMAIL")
    private String email;

    @TableField("FIRSTNAME")
    private String firstname;

    @TableField("MIDNAME")
    private String midname;

    @TableField("LASTNAME")
    private String lastname;

    @TableField("JOBTITLE")
    private String jobtitle;

    @TableField("DEPARTMENT")
    private String department;

    @TableField("GENDER")
    private String gender;

    @TableField("BIRTHDAY")
    private String birthday;

    @TableField("NICKNAME")
    private String nickname;

    @TableField("USERTYPE")
    private String usertype;

    @TableField("RULENAME")
    private String rulename;

    @TableField("SEARCHPROJECTID")
    private String searchprojectid;

    @TableField("ORGI")
    private String orgi;

    @TableField("ORGID")
    private String orgid;

    @TableField("CREATER")
    private String creater;

    @TableField("CREATETIME")
    private LocalDateTime createtime;

    @TableField("MEMO")
    private String memo;

    @TableField("UPDATETIME")
    private LocalDateTime updatetime;

    @TableField("ORGAN")
    private String organ;

    @TableField("MOBILE")
    private String mobile;

    private LocalDateTime passupdatetime;

    private String sign;

    private Integer del;

    private String uname;

    private Integer musteditpassword;

    @TableField("AGENT")
    private Integer agent;

    @TableField("SKILL")
    private String skill;

    private String province;

    private String city;

    private Integer fans;

    private Integer follows;

    private Integer integral;

    private LocalDateTime lastlogintime;

    private String status;

    private LocalDateTime deactivetime;

    private String title;

    @TableField("DATASTATUS")
    private Integer datastatus;

    private Integer callcenter;

    private String sipaccount;

    @TableField("SUPERUSER")
    private Integer superuser;

    private Integer maxuser;

    private String ordertype;


    @Override
    protected Serializable pkVal() {
                return this.id;
            }
        }