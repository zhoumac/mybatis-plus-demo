package com.zhou.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.base.model.ApiResp;
import com.base.model.BaseReq;
import com.zhou.model.vo.req.AddDataBusinessModeReq;
import com.zhou.model.vo.req.UpdateDataBusinessModeReq;
import com.zhou.model.vo.req.ListDataBusinessModeReq;
import com.zhou.model.vo.req.PageDataBusinessModeReq;
import com.zhou.mapper.DataBusinessModeMapper;
import com.zhou.service.DataBusinessModeService;
import com.zhou.entity.DataBusinessMode;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;
import java.util.Date;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * DataBusinessMode服务类
 * </p>
 *
 * @author 周希来
 * @since 2019-12-08
 */
@Service
public class DataBusinessModeService extends ServiceImpl<DataBusinessModeMapper, DataBusinessMode>  {

    public ApiResp list(ListDataBusinessModeReq req){
            String keyword = req.getKeyword();
            QueryWrapper<DataBusinessMode> queryWrapper = new QueryWrapper<>();
            if (!StringUtils.isEmpty(keyword)) {
                queryWrapper.like("", req.getKeyword());
            }
                return ApiResp.builder().data(baseMapper.selectList(queryWrapper)).build();
    }

    public ApiResp page(PageDataBusinessModeReq req){
            String keyword = req.getKeyword();
            IPage<DataBusinessMode> page = new Page<>( req.getCurrent() ,req.getSize());
            QueryWrapper<DataBusinessMode> queryWrapper = new QueryWrapper<>();
            if (!StringUtils.isEmpty(keyword)) {
                queryWrapper.like("", keyword);
            }
                return ApiResp.builder().data(baseMapper.selectPage(page, queryWrapper)).build();
    }

    public ApiResp add(AddDataBusinessModeReq req){
        DataBusinessMode data = new  DataBusinessMode();
            BeanUtils.copyProperties(req, data);
            baseMapper.insert(data);
                return ApiResp.builder().data(data.getId()).build();
            }

    public ApiResp modify(UpdateDataBusinessModeReq req){
        DataBusinessMode data = new  DataBusinessMode();
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