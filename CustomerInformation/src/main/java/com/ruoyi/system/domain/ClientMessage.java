package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户信息对象 client_message
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
public class ClientMessage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客户主键id */
    private Long id;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String clientName;

    /** 客户编号 */
    @Excel(name = "客户编号")
    private String clientCode;

    /** 客户类型 */
    @Excel(name = "客户类型")
    private String clientType;

    /** 客户手机 */
    @Excel(name = "客户手机")
    private String clientPhone;

    /** 客户地址 */
    @Excel(name = "客户地址")
    private String clientLocation;

    /** 客户备注 */
    @Excel(name = "客户备注")
    private String clientRemark;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 用户名 */
    @Excel(name = "用户名")
    private String userName;

    /** 删除标识;删除标识（0正常 1删除） */
    @Excel(name = "删除标识;删除标识", readConverterExp = "0=正常,1=删除")
    private Integer deleteFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setClientName(String clientName) 
    {
        this.clientName = clientName;
    }

    public String getClientName() 
    {
        return clientName;
    }
    public void setClientCode(String clientCode) 
    {
        this.clientCode = clientCode;
    }

    public String getClientCode() 
    {
        return clientCode;
    }
    public void setClientType(String clientType) 
    {
        this.clientType = clientType;
    }

    public String getClientType() 
    {
        return clientType;
    }
    public void setClientPhone(String clientPhone) 
    {
        this.clientPhone = clientPhone;
    }

    public String getClientPhone() 
    {
        return clientPhone;
    }
    public void setClientLocation(String clientLocation) 
    {
        this.clientLocation = clientLocation;
    }

    public String getClientLocation() 
    {
        return clientLocation;
    }
    public void setClientRemark(String clientRemark) 
    {
        this.clientRemark = clientRemark;
    }

    public String getClientRemark() 
    {
        return clientRemark;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setDeleteFlag(Integer deleteFlag) 
    {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeleteFlag() 
    {
        return deleteFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("clientName", getClientName())
            .append("clientCode", getClientCode())
            .append("clientType", getClientType())
            .append("clientPhone", getClientPhone())
            .append("clientLocation", getClientLocation())
            .append("clientRemark", getClientRemark())
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("deleteFlag", getDeleteFlag())
            .toString();
    }
}
