package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BizPackage;

/**
 * 套餐Mapper接口
 * 
 * @author ruoyi
 * @date 2022-09-06
 */
public interface BizPackageMapper 
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
     * 删除套餐
     * 
     * @param id 套餐主键
     * @return 结果
     */
    public int deleteBizPackageById(Long id);

    /**
     * 批量删除套餐
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBizPackageByIds(Long[] ids);
}
