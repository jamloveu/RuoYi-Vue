package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BizPackageMapper;
import com.ruoyi.system.domain.BizPackage;
import com.ruoyi.system.service.IBizPackageService;

/**
 * 套餐Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-09-06
 */
@Service
public class BizPackageServiceImpl implements IBizPackageService 
{
    @Autowired
    private BizPackageMapper bizPackageMapper;

    /**
     * 查询套餐
     * 
     * @param id 套餐主键
     * @return 套餐
     */
    @Override
    public BizPackage selectBizPackageById(Long id)
    {
        return bizPackageMapper.selectBizPackageById(id);
    }

    /**
     * 查询套餐列表
     * 
     * @param bizPackage 套餐
     * @return 套餐
     */
    @Override
    public List<BizPackage> selectBizPackageList(BizPackage bizPackage)
    {
        return bizPackageMapper.selectBizPackageList(bizPackage);
    }

    /**
     * 新增套餐
     * 
     * @param bizPackage 套餐
     * @return 结果
     */
    @Override
    public int insertBizPackage(BizPackage bizPackage)
    {
        bizPackage.setCreateTime(DateUtils.getNowDate());
        return bizPackageMapper.insertBizPackage(bizPackage);
    }

    /**
     * 修改套餐
     * 
     * @param bizPackage 套餐
     * @return 结果
     */
    @Override
    public int updateBizPackage(BizPackage bizPackage)
    {
        bizPackage.setUpdateTime(DateUtils.getNowDate());
        return bizPackageMapper.updateBizPackage(bizPackage);
    }

    /**
     * 批量删除套餐
     * 
     * @param ids 需要删除的套餐主键
     * @return 结果
     */
    @Override
    public int deleteBizPackageByIds(Long[] ids)
    {
        return bizPackageMapper.deleteBizPackageByIds(ids);
    }

    /**
     * 删除套餐信息
     * 
     * @param id 套餐主键
     * @return 结果
     */
    @Override
    public int deleteBizPackageById(Long id)
    {
        return bizPackageMapper.deleteBizPackageById(id);
    }
}
