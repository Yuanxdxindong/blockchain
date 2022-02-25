package com.yaunxindong.blockchain.dto;

import com.yaunxindong.blockchain.enumerate.ResultCodeEnum;
import lombok.Data;

/**
 * @author yuanxindong
 * @date 2022-02-25 20:38
 **/
@Data
public class Response<T> {
    private T result;
    private int code;
    private String message;

    public static Response ok(Object object) {
        Response<Object> re = new Response<>();
        re.setCode(ResultCodeEnum.OK.getVal());
        re.setResult(object);
        re.setMessage(ResultCodeEnum.OK.getDesc());
        return re;
    }
}
