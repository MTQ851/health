package com.He.controller;


import com.He.common.constant.MessageConstant;
import com.He.common.entity.Result;
import com.He.pojo.CheckItem;
import com.He.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;


@RestController
public class CheckItemController {
    @Autowired
    CheckItemService checkItemService;

    @PostMapping ("/checkitem/add")
    public Result add(@RequestBody CheckItem checkItem, HttpServletResponse response) throws Exception{
        checkItemService.add(checkItem);
        Result result = new Result(true, MessageConstant.ADD_CHECKGROUP_SUCCESS);
        return result;
    }

}
