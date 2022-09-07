package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 套餐对象 biz_package
 * 
 * @author ruoyi
 * @date 2022-09-06
 */
public class BizPackage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 套餐名 */
    @Excel(name = "套餐名")
    private String packageName;

    /** 覆盖率 */
    @Excel(name = "覆盖率")
    private String coverage;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPackageName(String packageName) 
    {
        this.packageName = packageName;
    }

    public String getPackageName() 
    {
        return packageName;
    }
    public void setCoverage(String coverage) 
    {
        this.coverage = coverage;
    }

    public String getCoverage() 
    {
        return coverage;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("packageName", getPackageName())
            .append("coverage", getCoverage())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
