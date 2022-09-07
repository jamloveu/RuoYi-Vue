package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.BizPackage;
import com.ruoyi.system.service.IBizPackageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 套餐Controller
 * 
 * @author ruoyi
 * @date 2022-09-06
 */
@RestController
@RequestMapping("/system/package")
public class BizPackageController extends BaseController
{
    @Autowired
    private IBizPackageService bizPackageService;

    /**
     * 查询套餐列表
     */
    @PreAuthorize("@ss.hasPermi('system:package:list')")
    @GetMapping("/list")
    public TableDataInfo list(BizPackage bizPackage)
    {
        startPage();
        List<BizPackage> list = bizPackageService.selectBizPackageList(bizPackage);
        return getDataTable(list);
    }

    /**
     * 导出套餐列表
     */
    @PreAuthorize("@ss.hasPermi('system:package:export')")
    @Log(title = "套餐", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BizPackage bizPackage)
    {
        List<BizPackage> list = bizPackageService.selectBizPackageList(bizPackage);
        ExcelUtil<BizPackage> util = new ExcelUtil<BizPackage>(BizPackage.class);
        util.exportExcel(response, list, "套餐数据");
    }

    /**
     * 获取套餐详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:package:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bizPackageService.selectBizPackageById(id));
    }

    /**
     * 新增套餐
     */
    @PreAuthorize("@ss.hasPermi('system:package:add')")
    @Log(title = "套餐", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BizPackage bizPackage)
    {
        return toAjax(bizPackageService.insertBizPackage(bizPackage));
    }

    /**
     * 修改套餐
     */
    @PreAuthorize("@ss.hasPermi('system:package:edit')")
    @Log(title = "套餐", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BizPackage bizPackage)
    {
        return toAjax(bizPackageService.updateBizPackage(bizPackage));
    }

    /**
     * 删除套餐
     */
    @PreAuthorize("@ss.hasPermi('system:package:remove')")
    @Log(title = "套餐", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bizPackageService.deleteBizPackageByIds(ids));
    }
}
