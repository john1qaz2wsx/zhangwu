package com.ruoyi.system.controller;

import java.util.List;

import com.ruoyi.system.enums.DeleteTypeStatusEnums;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.ClientMessage;
import com.ruoyi.system.service.IClientMessageService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户信息Controller
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
@Controller
@RequestMapping("/clientMessage/message")
public class ClientMessageController extends BaseController
{
    private String prefix = "system/message";

    @Autowired
    private IClientMessageService clientMessageService;

    @RequiresPermissions("system:message:view")
    @GetMapping()
    public String message()
    {
        System.out.println("biubgkewbfuiawgekuwib");
        return prefix + "/clientMessage";
    }

    /**
     * 查询客户信息列表
     */
    @RequiresPermissions("system:message:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ClientMessage clientMessage)
    {
        startPage();
        List<ClientMessage> list = clientMessageService.selectClientMessageList(clientMessage);
        return getDataTable(list);
    }

    /**
     * 导出客户信息列表
     */
    @RequiresPermissions("system:message:export")
    @Log(title = "客户信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ClientMessage clientMessage)
    {
        List<ClientMessage> list = clientMessageService.selectClientMessageList(clientMessage);
        ExcelUtil<ClientMessage> util = new ExcelUtil<ClientMessage>(ClientMessage.class);
        return util.exportExcel(list, "客户信息数据");
    }

    /**
     * 新增客户信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户信息
     */
    @RequiresPermissions("system:message:add")
    @Log(title = "客户信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ClientMessage clientMessage)
    {
        clientMessage.setDeleteFlag(DeleteTypeStatusEnums.NORMAL.getVal());
        return toAjax(clientMessageService.insertClientMessage(clientMessage));
    }

    /**
     * 修改客户信息
     */
    @RequiresPermissions("system:message:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ClientMessage clientMessage = clientMessageService.selectClientMessageById(id);
        mmap.put("clientMessage", clientMessage);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户信息
     */
    @RequiresPermissions("system:message:edit")
    @Log(title = "客户信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ClientMessage clientMessage)
    {
        return toAjax(clientMessageService.updateClientMessage(clientMessage));
    }

    /**
     * 删除客户信息
     */
    @RequiresPermissions("system:message:remove")
    @Log(title = "客户信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(clientMessageService.deleteClientMessageByIds(ids));
    }
}
