package com.zhou.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.base.model.ApiResp;
import com.base.model.BaseReq;
import com.zhou.model.vo.req.AddUserReq;
import com.zhou.model.vo.req.UpdateUserReq;
import com.zhou.model.vo.req.ListUserReq;
import com.zhou.model.vo.req.PageUserReq;
import com.zhou.mapper.UserMapper;
import com.zhou.service.UserService;
import com.zhou.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;
import java.util.Date;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * User服务类
 * </p>
 *
 * @author 周希来
 * @since 2020-03-02
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User>  {

    public ApiResp list(ListUserReq req){
            String keyword = req.getKeyword();
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            if (!StringUtils.isEmpty(keyword)) {
                queryWrapper.like("", req.getKeyword());
            }
                return ApiResp.builder().data(baseMapper.selectList(queryWrapper)).build();
    }

    public ApiResp page(PageUserReq req){
            String keyword = req.getKeyword();
            IPage<User> page = new Page<>( req.getCurrent() ,req.getSize());
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            if (!StringUtils.isEmpty(keyword)) {
                queryWrapper.like("", keyword);
            }
                return ApiResp.builder().data(baseMapper.selectPage(page, queryWrapper)).build();
    }

    public ApiResp add(AddUserReq req){
        User data = new  User();
            BeanUtils.copyProperties(req, data);
            baseMapper.insert(data);
                return ApiResp.builder().data(data.getId()).build();
            }

    public ApiResp modify(UpdateUserReq req){
        User data = new  User();
            BeanUtils.copyProperties(req, data);
            baseMapper.updateById(data);
             return ApiResp.builder().data(Boolean.TRUE).build();
    }

    public ApiResp delete(String id){
            baseMapper.deleteById(id);
            return ApiResp.builder().data(Boolean.TRUE).build();
    }

    public ApiResp get(String id){
            return ApiResp.builder().data(baseMapper.selectById(id)).build();
    }
}