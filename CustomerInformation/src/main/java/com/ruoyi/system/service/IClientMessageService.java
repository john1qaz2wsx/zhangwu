package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ClientMessage;

/**
 * 客户信息Service接口
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
public interface IClientMessageService 
{
    /**
     * 查询客户信息
     * 
     * @param id 客户信息主键
     * @return 客户信息
     */
    public ClientMessage selectClientMessageById(Long id);

    /**
     * 查询客户信息列表
     * 
     * @param clientMessage 客户信息
     * @return 客户信息集合
     */
    public List<ClientMessage> selectClientMessageList(ClientMessage clientMessage);

    /**
     * 新增客户信息
     * 
     * @param clientMessage 客户信息
     * @return 结果
     */
    public int insertClientMessage(ClientMessage clientMessage);

    /**
     * 修改客户信息
     * 
     * @param clientMessage 客户信息
     * @return 结果
     */
    public int updateClientMessage(ClientMessage clientMessage);

    /**
     * 批量删除客户信息
     * 
     * @param ids 需要删除的客户信息主键集合
     * @return 结果
     */
    public int deleteClientMessageByIds(String ids);

    /**
     * 删除客户信息信息
     * 
     * @param id 客户信息主键
     * @return 结果
     */
    public int deleteClientMessageById(Long id);
}
