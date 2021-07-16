package com.jhmarryme.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jiahao Wang
 * @since 2021-07-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_TRAVELWEB_PRI_ACCOUNT_LOG")
public class TTravelwebPriAccountLogEntity extends Model<TTravelwebPriAccountLogEntity> {

    private static final long serialVersionUID=1L;

    @TableId(value = "ACCOUNTLOGID", type = IdType.ASSIGN_ID)
    private String accountlogid;

    @TableField("OPERATORID")
    private String operatorid;

    @TableField("OPERATORNAME")
    private String operatorname;

    @TableField("OPERATIONTYPE")
    private String operationtype;

    @TableField("OPERATIONREASON")
    private String operationreason;

    @TableField("OPERATIONDESC")
    private String operationdesc;

    @TableField("OPERATIONTIME")
    private LocalDateTime operationtime;

    @TableField("ID")
    private String id;

    @TableField("ACCOUNTNAME")
    private String accountname;

    @TableField("REALNAME")
    private String realname;

    @TableField("CONFIGID")
    private String configid;

    @TableField("PASSWORD")
    private String password;

    @TableField("LEVELS")
    private String levels;

    @TableField("OFFICENO")
    private String officeno;

    @TableField("PID")
    private String pid;

    @TableField("ORGID")
    private String orgid;

    @TableField("STATE")
    private String state;

    @TableField("ORGNAME")
    private String orgname;

    @TableField("ORGTYPE")
    private String orgtype;

    @TableField("DREDGEDATE")
    private LocalDateTime dredgedate;

    @TableField("ENDDATE")
    private LocalDateTime enddate;

    @TableField("STARTSTOPUSETIME")
    private LocalDateTime startstopusetime;

    @TableField("ENDSTOPUSETIME")
    private LocalDateTime endstopusetime;

    @TableField("USEMONTH")
    private Integer usemonth;

    @TableField("ENDVISIT")
    private LocalDateTime endvisit;

    @TableField("LOGINCOUNT")
    private BigDecimal logincount;

    @TableField("DELAYTIME")
    private BigDecimal delaytime;

    @TableField("LEISURELONGTIME")
    private BigDecimal leisurelongtime;

    @TableField("PHONE")
    private String phone;

    @TableField("HANDSET")
    private String handset;

    @TableField("MAIL")
    private String mail;

    @TableField("USERTYPE")
    private String usertype;

    @TableField("FAX")
    private String fax;

    @TableField("IFTEACHACCOUNT")
    private String ifteachaccount;

    @TableField("VPID")
    private String vpid;

    @TableField("REMARK")
    private String remark;

    @TableField("IUSERID")
    private String iuserid;

    @TableField("ETDZPRINTERNO")
    private String etdzprinterno;

    @TableField("TSLPRINTERNO")
    private String tslprinterno;

    @TableField("ISNEW")
    private String isnew;

    @TableField("REMAINPACKETS")
    private Integer remainpackets;

    @TableField("SOHOTO_USERNAME")
    private String sohotoUsername;

    @TableField("SOHOTO_PASSWORD")
    private String sohotoPassword;

    @TableField("SOHOTO_LOGINCOUNT")
    private BigDecimal sohotoLogincount;

    /**
     * 统一平台签约标识：0未签约、1已签约、2正在签约
     */
    @TableField("ISYEEXINGSIGN")
    private String isyeexingsign;

    @TableField("ISNETSIGN")
    private String isnetsign;

    @TableField("SIGNACCOUNT")
    private String signaccount;

    @TableField("YEEXINGNOTICEFLAG")
    private String yeexingnoticeflag;

    @TableField("ACCOUNT_NAME")
    private String accountName;

    @TableField("AUTO_EMAIL")
    private String autoEmail;

    @TableField("DELAY_TIME")
    private Long delayTime;

    @TableField("DREDGE_DATE")
    private LocalDateTime dredgeDate;

    @TableField("END_DATE")
    private LocalDateTime endDate;

    @TableField("END_STOP_USE_TIME")
    private LocalDateTime endStopUseTime;

    @TableField("END_VISIT")
    private LocalDateTime endVisit;

    @TableField("ETDZ_PRINTERNO")
    private String etdzPrinterno;

    @TableField("HAS_BOUND_LINKO_SKY")
    private String hasBoundLinkoSky;

    @TableField("IAT_SIGN_ACCOUNT")
    private String iatSignAccount;

    @TableField("IF_TEACH_ACCOUNT")
    private String ifTeachAccount;

    @TableField("IS_IAT_SIGN")
    private String isIatSign;

    @TableField("IS_NET_SIGN")
    private String isNetSign;

    @TableField("IS_NEW")
    private String isNew;

    @TableField("IS_YEEXING_SIGN")
    private String isYeexingSign;

    @TableField("LEISURE_LONG_TIME")
    private Long leisureLongTime;

    @TableField("LOGIN_COUNT")
    private Long loginCount;

    @TableField("LOGIN_WARN")
    private String loginWarn;

    @TableField("ORG_NAME")
    private String orgName;

    @TableField("ORG_TYPE")
    private String orgType;

    @TableField("QAUTH")
    private String qauth;

    @TableField("REAL_NAME")
    private String realName;

    @TableField("REMAIN_PACKETS")
    private Long remainPackets;

    @TableField("SIGN_ACCOUNT")
    private String signAccount;

    @TableField("START_STOP_USE_TIME")
    private LocalDateTime startStopUseTime;

    @TableField("TSL_PRINTERNO")
    private String tslPrinterno;

    @TableField("USE_MONTH")
    private Long useMonth;

    @TableField("USER_TYPE")
    private String userType;

    @TableField("YEEXING_NOTICE_FLAG")
    private String yeexingNoticeFlag;

    @TableField("AUTOEMAIL")
    private String autoemail;

    @TableField("HASBOUNDLINKOSKY")
    private String hasboundlinkosky;

    @TableField("IATSIGNACCOUNT")
    private String iatsignaccount;

    @TableField("ISIATSIGN")
    private String isiatsign;

    @TableField("LOGINWARN")
    private String loginwarn;

    @TableField("DAYLIMITPACKETS")
    private BigDecimal daylimitpackets;

    @TableField("DAYUSEPACKETS")
    private BigDecimal dayusepackets;

    @TableField("USERLABEL")
    private String userlabel;

    @TableField("HISTORYCMDCOUNTS")
    private Integer historycmdcounts;

    /**
     * 账号的用户名别名
     */
    @TableField("ACCOUNT_NAME_ALIAS")
    private String accountNameAlias;

    /**
     * 账号的系统类型,TW2:0,星云:1
     */
    @TableField("ACCOUNT_SOURCE")
    private String accountSource;


    @Override
    protected Serializable pkVal() {
        return this.accountlogid;
    }

}
