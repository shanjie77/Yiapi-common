package com.api.apicommon.service;


import com.api.apicommon.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author liaozhongshan
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-01-23 13:43:57
*/
public interface InnerInterfaceInfoService{

    /**
     * 从数据库中查询模拟接口是否存在
     */
    InterfaceInfo getInterfaceInfo(String url,String method);
}
