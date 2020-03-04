package com.zhou.controller;
import com.zhou.service.UserService ;
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
import com.zhou.service.UserService;
import com.zhou.entity.User;
import com.base.model.BaseReq;
import com.zhou.model.vo.req.AddUserReq;
import com.zhou.model.vo.req.UpdateUserReq;
import com.zhou.model.vo.req.ListUserReq;
import com.zhou.model.vo.req.PageUserReq;
import org.springframework.validation.annotation.Validated;

/**
 * @author 周希来
 * @since 2020-03-02
 */
@Api(description = "用户表",tags = "user" )
@RestController
@RequestMapping("/user" )
@Slf4j
public class UserController  {

@Autowired
private UserService  userService;

    @ApiOperation(value ="列表" ,notes = "周希来")
    @GetMapping("/list" )
    public ApiResp<User> list(ListUserReq req) {

        return userService.list(req);

    }

    @ApiOperation(value = "分页" ,notes = "周希来" )
    @GetMapping( "/page")
    public ApiResp<IPage<User>> page(PageUserReq req) {

            return  userService.page(req);

    }

    @ApiOperation(value = "获取详情",notes = "周希来" )
    @GetMapping("/get" )
    public ApiResp<User> get(BaseReq req,@RequestParam("id")String id) {

            return  userService.get( id);

    }

    @ApiOperation(value = "添加",notes = "周希来" )
    @PostMapping("/add" )
    public ApiResp add(@Validated  @RequestBody AddUserReq req) {

            return  userService.add(req);

    }

    @ApiOperation(value = "修改",notes = "周希来" )
    @PostMapping("/modify" )
    public ApiResp modify(@RequestBody UpdateUserReq req) {

            return  userService.modify(req);

    }

    @ApiOperation(value = "删除" ,notes = "周希来")
    @GetMapping("/delete" )
    public ApiResp delete(BaseReq req,@RequestParam("id")String id) {

            return  userService.delete( id);

    }
}