package com.yaunxindong.blockchain.enumerate;


import lombok.Getter;

/**
 * @author yuanxindong
 * @date 2022-02-25 20:38
 **/
public enum ResultCodeEnum {
    /**
     * 成功状态
     */
    OK("SUCCESS", 1),

    FAIL("FAILED", 0);

    /**
     * 描述
     */
    @Getter
    private String desc;
    @Getter
    private int val;

    ResultCodeEnum(String desc, int val) {
        this.desc = desc;
        this.val = val;
    }
}
