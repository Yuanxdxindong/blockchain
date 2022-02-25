package com.yaunxindong.blockchain.controller;

import com.yaunxindong.blockchain.dto.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanxindong
 * @date 2022-02-25 20:34
 **/
@RestController
@RequestMapping(path = "/file")
public class FileController {

    @PostMapping("/save")
    public Response<Object> save(@RequestParam String name, @RequestParam String base64) {
        return Response.ok(new Object());
    }

}
