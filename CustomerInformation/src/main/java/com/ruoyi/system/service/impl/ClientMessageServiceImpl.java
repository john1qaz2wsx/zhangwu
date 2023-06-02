package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ClientMessageMapper;
import com.ruoyi.system.domain.ClientMessage;
import com.ruoyi.system.service.IClientMessageService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
@Service
public class ClientMessageServiceImpl implements IClientMessageService 
{
    @Autowired
    private ClientMessageMapper clientMessageMapper;

    /**
     * 查询客户信息
     * 
     * @param id 客户信息主键
     * @return 客户信息
     */
    @Override
    public ClientMessage selectClientMessageById(Long id)
    {
        return clientMessageMapper.selectClientMessageById(id);
    }

    /**
     * 查询客户信息列表
     * 
     * @param clientMessage 客户信息
     * @return 客户信息
     */
    @Override
    public List<ClientMessage> selectClientMessageList(ClientMessage clientMessage)
    {
        return clientMessageMapper.selectClientMessageList(clientMessage);
    }

    /**
     * 新增客户信息
     * 
     * @param clientMessage 客户信息
     * @return 结果
     */
    @Override
    public int insertClientMessage(ClientMessage clientMessage)
    {
        clientMessage.setCreateTime(DateUtils.getNowDate());
        return clientMessageMapper.insertClientMessage(clientMessage);
    }

    /**
     * 修改客户信息
     * 
     * @param clientMessage 客户信息
     * @return 结果
     */
    @Override
    public int updateClientMessage(ClientMessage clientMessage)
    {
        clientMessage.setUpdateTime(DateUtils.getNowDate());
        return clientMessageMapper.updateClientMessage(clientMessage);
    }

    /**
     * 批量删除客户信息
     * 
     * @param ids 需要删除的客户信息主键
     * @return 结果
     */
    @Override
    public int deleteClientMessageByIds(String ids)
    {
        return clientMessageMapper.deleteClientMessageByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息信息
     * 
     * @param id 客户信息主键
     * @return 结果
     */
    @Override
    public int deleteClientMessageById(Long id)
    {
        return clientMessageMapper.deleteClientMessageById(id);
    }
}
