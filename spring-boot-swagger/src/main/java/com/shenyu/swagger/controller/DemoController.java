package com.shenyu.swagger.controller;

import com.shenyu.swagger.model.Demo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName DemoController
 * @Author shenyu
 * @Date 2020/6/5
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/api/demo")
@Api(tags = "DemoController",description = "测试demoswagger")
public class DemoController {


    @ApiOperation(value="创建Demo", notes="创建demo")
    @ApiImplicitParam(name = "demo", value = "demo实体", required = true, dataType = "com.shenyu.swagger.model.Demo")
    @RequestMapping(value="/createDemo", method= RequestMethod.POST)
    public String createDemo(@RequestBody Demo demo) {
        return "success";
    }

    @ApiOperation(value = "删除demo", notes = "删除demo")
    @ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteDemo(@PathVariable String id) {
        return "success";
    }

}
