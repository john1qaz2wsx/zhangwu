package com.ruoyi.system.enums;

import lombok.Getter;

/**
 * 删除状态查询
 * 
 * @author ruoyi
 */
@Getter
public enum DeleteTypeStatusEnums {


    //正常
    NORMAL("NORMAL", 0, "正常"),
    //删除
    DELETE("DELETE", 1, "删除"),
    ;

    private final String key;
    private final Integer val;
    private final String message;

    DeleteTypeStatusEnums(String key, Integer val, String message) {
        this.key = key;
        this.val = val;
        this.message = message;
    }
}

