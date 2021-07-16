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
@TableName("T_TRAVELWEB_PRI_ACCOUNT")
public class TTravelwebPriAccountEntity extends Model<TTravelwebPriAccountEntity> {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 1—7级账号
     */
    @TableField("ACCOUNTNAME")
    private String accountname;

    /**
     * 真实姓名
     */
    @TableField("REALNAME")
    private String realname;

    /**
     * 配置ID，T_TRAVELWEB_PRI_CONFIG表的主键
     */
    @TableField("CONFIGID")
    private String configid;

    /**
     * 密码
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * PID号
     */
    @TableField("PID")
    private String pid;

    /**
     * 分支机构管理员对应的T_TRAVELWEB_ORG_BRANCH表中的id
     */
    @TableField("ORGID")
    private String orgid;

    /**
     * 判断白屏账号是否开通。0开通；1直接停用；2 因B类office停用而停用；3 因C类office停用而停用；4 因Branch停用而停用；若该字段为1，登录时会提示“该账号已停用”
     */
    @TableField("STATE")
    private String state;

    @TableField("ORGNAME")
    private String orgname;

    @TableField("ORGTYPE")
    private String orgtype;

    /**
     * 开通日期
     */
    @TableField("DREDGEDATE")
    private LocalDateTime dredgedate;

    /**
     * 截止日期
     */
    @TableField("ENDDATE")
    private LocalDateTime enddate;

    /**
     * 开始停用日期（最近一次停用时间）
     */
    @TableField("STARTSTOPUSETIME")
    private LocalDateTime startstopusetime;

    /**
     * 结束停用时间（最近一次启用时间，但这字段没使用）
     */
    @TableField("ENDSTOPUSETIME")
    private LocalDateTime endstopusetime;

    /**
     * 使用月数
     */
    @TableField("USEMONTH")
    private Integer usemonth;

    /**
     * 最后一次登录时间
     */
    @TableField("ENDVISIT")
    private LocalDateTime endvisit;

    /**
     * 登录次数
     */
    @TableField("LOGINCOUNT")
    private BigDecimal logincount;

    /**
     * 延迟时间，此字段没有使用
     */
    @TableField("DELAYTIME")
    private BigDecimal delaytime;

    /**
     * 空闲最长时间，
     */
    @TableField("LEISURELONGTIME")
    private BigDecimal leisurelongtime;

    /**
     * 电话
     */
    @TableField("PHONE")
    private String phone;

    /**
     * 手机
     */
    @TableField("HANDSET")
    private String handset;

    /**
     * 邮箱
     */
    @TableField("MAIL")
    private String mail;

    /**
     * 01 操作员;02 分支机构管理员;03 客户管理员;04 超级管理员;05 c类管理员(公司管理员);06 超级管理员创建的操作员;07  航空公司管理员
     */
    @TableField("USERTYPE")
    private String usertype;

    /**
     * 传真
     */
    @TableField("FAX")
    private String fax;

    /**
     * 0 是培训账号1 不是培训账号
     */
    @TableField("IFTEACHACCOUNT")
    private String ifteachaccount;

    /**
     * 虚拟PID
     */
    @TableField("VPID")
    private String vpid;

    @TableField("REMARK")
    private String remark;

    /**
     * 所属office
     */
    @TableField("OFFICENO")
    private String officeno;

    /**
     * 1 超级管理员2 客户管理员3 分支机构管理员4 公司管理员5 c类操作员6 B类操作员7 航空公司管理员
     */
    @TableField("LEVELS")
    private String levels;

    /**
     * Iterm账号ID，与T_TRAVELWEB_PRI_IUSER表关联
     */
    @TableField("IUSERID")
    private String iuserid;

    /**
     * 打票机号
     */
    @TableField("ETDZPRINTERNO")
    private String etdzprinterno;

    /**
     * 打票机号，TSL指令是打印出票统计的   （我们建议用户每天工作结束之后，将TSL的内容打印并保存下来，以备以 后核对和检查使用）此字段暂未使用
     */
    @TableField("TSLPRINTERNO")
    private String tslprinterno;

    /**
     * 0 不是新建账号；O 新建固定账号；D 新建共享账号；判断黑屏配置是否生效，0为开通，若该字段不为0，登录时会提示“该账号未开通”。只有STATE字段和ISNEW字段都为0时才能登录。
     */
    @TableField("ISNEW")
    private String isnew;

    /**
     * 剩余流量，页面上提示用户剩余流量信息从此字段取出。夜维时才更新数据。
     */
    @TableField("REMAINPACKETS")
    private Integer remainpackets;

    @TableField("SOHOTO_USERNAME")
    private String sohotoUsername;

    @TableField("SOHOTO_PASSWORD")
    private String sohotoPassword;

    @TableField("SOHOTO_LOGINCOUNT")
    private BigDecimal sohotoLogincount;

    /**
     * 是否能自动接收邮件，主要用于开户申请、配置申请、充值申请后是否邮件通知相应的分支机构管理员，如果其值为1，表示邮件通知，其他值或空表示不通知
     */
    @TableField("AUTOEMAIL")
    private String autoemail;

    /**
     * 是否绑定过航旅天空账号，如果值为1，表示绑定过航旅天空账号，当取消绑定时，不修改该值
     */
    @TableField("HASBOUNDLINKOSKY")
    private String hasboundlinkosky;

    /**
     * 统一平台签约标识：0未签约、1已签约、2正在签约
     */
    @TableField("ISYEEXINGSIGN")
    private String isyeexingsign;

    @TableField("ISNETSIGN")
    private String isnetsign;

    /**
     * 签约的易行天下平台账户
     */
    @TableField("SIGNACCOUNT")
    private String signaccount;

    @TableField("YEEXINGNOTICEFLAG")
    private String yeexingnoticeflag;

    /**
     * 操作员是否拥有清理office Q信箱的权限（0是、1否）
     */
    @TableField("QAUTH")
    private String qauth;

    @TableField("LOGINWARN")
    private String loginwarn;

    @TableField("ISIATSIGN")
    private String isiatsign;

    @TableField("IATSIGNACCOUNT")
    private String iatsignaccount;

    @TableField("LOGINTYPE")
    private String logintype;

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

    @TableField("TCSKEY")
    private String tcskey;

    @TableField("FIRSTERRTIME")
    private LocalDateTime firsterrtime;

    @TableField("LOCKEDFLAG")
    private String lockedflag;

    @TableField("LOCKEDTIME")
    private LocalDateTime lockedtime;

    @TableField("ERRLOGINCOUNT")
    private Integer errlogincount;

    @TableField("ROLEID")
    private String roleid;

    @TableField("SOHOTO_PASSWORDS")
    private String sohotoPasswords;

    /**
     * 每日流量限制
     */
    @TableField("DAYLIMITPACKETS")
    private BigDecimal daylimitpackets;

    /**
     * 当日已使用流量
     */
    @TableField("DAYUSEPACKETS")
    private BigDecimal dayusepackets;

    /**
     * 用户标签。01：操作；02：出票；03：外部；04：自定义；
     */
    @TableField("USERLABEL")
    private String userlabel;

    /**
     * APP用户自定义标签配置
     */
    @TableField("USERDEFINECONFIGID")
    private String userdefineconfigid;

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
        return this.id;
    }

}
