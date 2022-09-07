package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BizPackage;

/**
 * 套餐Service接口
 * 
 * @author ruoyi
 * @date 2022-09-06
 */
public interface IBizPackageService 
{
    /**
     * 查询套餐
     * 
     * @param id 套餐主键
     * @return 套餐
     */
    public BizPackage selectBizPackageById(Long id);

    /**
     * 查询套餐列表
     * 
     * @param bizPackage 套餐
     * @return 套餐集合
     */
    public List<BizPackage> selectBizPackageList(BizPackage bizPackage);

    /**
     * 新增套餐
     * 
     * @param bizPackage 套餐
     * @return 结果
     */
    public int insertBizPackage(BizPackage bizPackage);

    /**
     * 修改套餐
     * 
     * @param bizPackage 套餐
     * @return 结果
     */
    public int updateBizPackage(BizPackage bizPackage);

    /**
     * 批量删除套餐
     * 
     * @param ids 需要删除的套餐主键集合
     * @return 结果
     */
    public int deleteBizPackageByIds(Long[] ids);

    /**
     * 删除套餐信息
     * 
     * @param id 套餐主键
     * @return 结果
     */
    public int deleteBizPackageById(Long id);
}
