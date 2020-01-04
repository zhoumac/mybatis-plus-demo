package com.zhou.controller;
import com.zhou.service.ConfigDescService ;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.base.model.ApiResp;;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhou.service.ConfigDescService;
import com.zhou.entity.ConfigDesc;
import com.base.model.BaseReq;
import com.zhou.model.vo.req.AddConfigDescReq;
import com.zhou.model.vo.req.UpdateConfigDescReq;
import com.zhou.model.vo.req.ListConfigDescReq;
import com.zhou.model.vo.req.PageConfigDescReq;
import org.springframework.validation.annotation.Validated;

/**
 * @author 周希来
 * @since 2019-12-08
 */
@Api(description = "配置",tags = "configDesc" )
@RestController
@RequestMapping("/configDesc" )
@Slf4j
public class ConfigDescController  {

@Autowired
private ConfigDescService  configDescService;

    @ApiOperation(value ="列表" ,notes = "周希来")
    @GetMapping("/list" )
    public ApiResp<ConfigDesc> list(ListConfigDescReq req) {

        return configDescService.list(req);

    }

    @ApiOperation(value = "分页" ,notes = "周希来" )
    @GetMapping( "/page")
    public ApiResp<IPage<ConfigDesc>> page(PageConfigDescReq req) {

            return  configDescService.page(req);

    }

    @ApiOperation(value = "获取详情",notes = "周希来" )
    @GetMapping("/get" )
    public ApiResp<ConfigDesc> get(BaseReq req,@RequestParam("id")Long id) {

            return  configDescService.get( id);

    }

    @ApiOperation(value = "添加",notes = "周希来" )
    @PostMapping("/add" )
    public ApiResp add(@Validated  @RequestBody AddConfigDescReq req) {

            return  configDescService.add(req);

    }

    @ApiOperation(value = "修改",notes = "周希来" )
    @PostMapping("/modify" )
    public ApiResp modify(@RequestBody UpdateConfigDescReq req) {

            return  configDescService.modify(req);

    }

    @ApiOperation(value = "删除" ,notes = "周希来")
    @GetMapping("/delete" )
    public ApiResp delete(BaseReq req,@RequestParam("id")Long id) {

            return  configDescService.delete( id);

    }
}