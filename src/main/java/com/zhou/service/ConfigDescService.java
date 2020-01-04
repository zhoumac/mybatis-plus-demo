package com.zhou.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.base.model.ApiResp;
import com.base.model.BaseReq;
import com.zhou.model.vo.req.AddConfigDescReq;
import com.zhou.model.vo.req.UpdateConfigDescReq;
import com.zhou.model.vo.req.ListConfigDescReq;
import com.zhou.model.vo.req.PageConfigDescReq;
import com.zhou.mapper.ConfigDescMapper;
import com.zhou.service.ConfigDescService;
import com.zhou.entity.ConfigDesc;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;
import java.util.Date;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * ConfigDesc服务类
 * </p>
 *
 * @author 周希来
 * @since 2019-12-08
 */
@Service
public class ConfigDescService extends ServiceImpl<ConfigDescMapper, ConfigDesc>  {

    public ApiResp list(ListConfigDescReq req){
            String keyword = req.getKeyword();
            QueryWrapper<ConfigDesc> queryWrapper = new QueryWrapper<>();
            if (!StringUtils.isEmpty(keyword)) {
                queryWrapper.like("", req.getKeyword());
            }
                return ApiResp.builder().data(baseMapper.selectList(queryWrapper)).build();
    }

    public ApiResp page(PageConfigDescReq req){
            String keyword = req.getKeyword();
            IPage<ConfigDesc> page = new Page<>( req.getCurrent() ,req.getSize());
            QueryWrapper<ConfigDesc> queryWrapper = new QueryWrapper<>();
            if (!StringUtils.isEmpty(keyword)) {
                queryWrapper.like("", keyword);
            }
                return ApiResp.builder().data(baseMapper.selectPage(page, queryWrapper)).build();
    }

    public ApiResp add(AddConfigDescReq req){
        ConfigDesc data = new  ConfigDesc();
            BeanUtils.copyProperties(req, data);
            baseMapper.insert(data);
                return ApiResp.builder().data(data.getId()).build();
            }

    public ApiResp modify(UpdateConfigDescReq req){
        ConfigDesc data = new  ConfigDesc();
            BeanUtils.copyProperties(req, data);
            baseMapper.updateById(data);
             return ApiResp.builder().data(Boolean.TRUE).build();
    }

    public ApiResp delete(Long id){
            baseMapper.deleteById(id);
            return ApiResp.builder().data(Boolean.TRUE).build();
    }

    public ApiResp get(Long id){
            return ApiResp.builder().data(baseMapper.selectById(id)).build();
    }
}