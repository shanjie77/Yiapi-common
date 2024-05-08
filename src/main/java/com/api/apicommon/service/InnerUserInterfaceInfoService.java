package com.api.apicommon.service;


import com.api.apicommon.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author liaozhongshan
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-02-19 10:11:48
*/
public interface InnerUserInterfaceInfoService  {

    /**
     * 调用接口统计
     * @param  interfaceInfoId
     * @param  userId
     *
     */
    boolean invokeCount(long interfaceInfoId,long userId);

}
