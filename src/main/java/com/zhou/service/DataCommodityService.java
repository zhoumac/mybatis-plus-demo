package com.zhou.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.base.model.ApiResp;
import com.base.model.BaseReq;
import com.zhou.model.vo.req.AddDataCommodityReq;
import com.zhou.model.vo.req.UpdateDataCommodityReq;
import com.zhou.model.vo.req.ListDataCommodityReq;
import com.zhou.model.vo.req.PageDataCommodityReq;
import com.zhou.mapper.DataCommodityMapper;
import com.zhou.service.DataCommodityService;
import com.zhou.entity.DataCommodity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;
import java.util.Date;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * DataCommodity服务类
 * </p>
 *
 * @author 周希来
 * @since 2019-12-08
 */
@Service
public class DataCommodityService extends ServiceImpl<DataCommodityMapper, DataCommodity>  {

    public ApiResp list(ListDataCommodityReq req){
            String keyword = req.getKeyword();
            QueryWrapper<DataCommodity> queryWrapper = new QueryWrapper<>();
            if (!StringUtils.isEmpty(keyword)) {
                queryWrapper.like("", req.getKeyword());
            }
                return ApiResp.builder().data(baseMapper.selectList(queryWrapper)).build();
    }

    public ApiResp page(PageDataCommodityReq req){
            String keyword = req.getKeyword();
            IPage<DataCommodity> page = new Page<>( req.getCurrent() ,req.getSize());
            QueryWrapper<DataCommodity> queryWrapper = new QueryWrapper<>();
            if (!StringUtils.isEmpty(keyword)) {
                queryWrapper.like("", keyword);
            }
                return ApiResp.builder().data(baseMapper.selectPage(page, queryWrapper)).build();
    }

    public ApiResp add(AddDataCommodityReq req){
        DataCommodity data = new  DataCommodity();
            BeanUtils.copyProperties(req, data);
            baseMapper.insert(data);
                return ApiResp.builder().data(data.getId()).build();
            }

    public ApiResp modify(UpdateDataCommodityReq req){
        DataCommodity data = new  DataCommodity();
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