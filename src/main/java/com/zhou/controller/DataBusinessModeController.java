package com.zhou.controller;
import com.zhou.service.DataBusinessModeService ;
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
import com.zhou.service.DataBusinessModeService;
import com.zhou.entity.DataBusinessMode;
import com.base.model.BaseReq;
import com.zhou.model.vo.req.AddDataBusinessModeReq;
import com.zhou.model.vo.req.UpdateDataBusinessModeReq;
import com.zhou.model.vo.req.ListDataBusinessModeReq;
import com.zhou.model.vo.req.PageDataBusinessModeReq;
import org.springframework.validation.annotation.Validated;

/**
 * @author 周希来
 * @since 2019-12-08
 */
@Api(description = "",tags = "dataBusinessMode" )
@RestController
@RequestMapping("/dataBusinessMode" )
@Slf4j
public class DataBusinessModeController  {

@Autowired
private DataBusinessModeService  dataBusinessModeService;

    @ApiOperation(value ="列表" ,notes = "周希来")
    @GetMapping("/list" )
    public ApiResp<DataBusinessMode> list(ListDataBusinessModeReq req) {

        return dataBusinessModeService.list(req);

    }

    @ApiOperation(value = "分页" ,notes = "周希来" )
    @GetMapping( "/page")
    public ApiResp<IPage<DataBusinessMode>> page(PageDataBusinessModeReq req) {

            return  dataBusinessModeService.page(req);

    }

    @ApiOperation(value = "获取详情",notes = "周希来" )
    @GetMapping("/get" )
    public ApiResp<DataBusinessMode> get(BaseReq req,@RequestParam("id")Long id) {

            return  dataBusinessModeService.get( id);

    }

    @ApiOperation(value = "添加",notes = "周希来" )
    @PostMapping("/add" )
    public ApiResp add(@Validated  @RequestBody AddDataBusinessModeReq req) {

            return  dataBusinessModeService.add(req);

    }

    @ApiOperation(value = "修改",notes = "周希来" )
    @PostMapping("/modify" )
    public ApiResp modify(@RequestBody UpdateDataBusinessModeReq req) {

            return  dataBusinessModeService.modify(req);

    }

    @ApiOperation(value = "删除" ,notes = "周希来")
    @GetMapping("/delete" )
    public ApiResp delete(BaseReq req,@RequestParam("id")Long id) {

            return  dataBusinessModeService.delete( id);

    }
}