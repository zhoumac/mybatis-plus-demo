package com.zhou.controller;
import com.zhou.service.DataCommodityService ;
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
import com.zhou.service.DataCommodityService;
import com.zhou.entity.DataCommodity;
import com.base.model.BaseReq;
import com.zhou.model.vo.req.AddDataCommodityReq;
import com.zhou.model.vo.req.UpdateDataCommodityReq;
import com.zhou.model.vo.req.ListDataCommodityReq;
import com.zhou.model.vo.req.PageDataCommodityReq;
import org.springframework.validation.annotation.Validated;

/**
 * @author 周希来
 * @since 2019-12-08
 */
@Api(description = "",tags = "dataCommodity" )
@RestController
@RequestMapping("/dataCommodity" )
@Slf4j
public class DataCommodityController  {

@Autowired
private DataCommodityService  dataCommodityService;

    @ApiOperation(value ="列表" ,notes = "周希来")
    @GetMapping("/list" )
    public ApiResp<DataCommodity> list(ListDataCommodityReq req) {

        return dataCommodityService.list(req);

    }

    @ApiOperation(value = "分页" ,notes = "周希来" )
    @GetMapping( "/page")
    public ApiResp<IPage<DataCommodity>> page(PageDataCommodityReq req) {

            return  dataCommodityService.page(req);

    }

    @ApiOperation(value = "获取详情",notes = "周希来" )
    @GetMapping("/get" )
    public ApiResp<DataCommodity> get(BaseReq req,@RequestParam("id")Long id) {

            return  dataCommodityService.get( id);

    }

    @ApiOperation(value = "添加",notes = "周希来" )
    @PostMapping("/add" )
    public ApiResp add(@Validated  @RequestBody AddDataCommodityReq req) {

            return  dataCommodityService.add(req);

    }

    @ApiOperation(value = "修改",notes = "周希来" )
    @PostMapping("/modify" )
    public ApiResp modify(@RequestBody UpdateDataCommodityReq req) {

            return  dataCommodityService.modify(req);

    }

    @ApiOperation(value = "删除" ,notes = "周希来")
    @GetMapping("/delete" )
    public ApiResp delete(BaseReq req,@RequestParam("id")Long id) {

            return  dataCommodityService.delete( id);

    }
}