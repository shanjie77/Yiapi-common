package com.api.apicommon.service;


import com.api.apicommon.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户服务
 *
 * @author yupi
 */
public interface InnerUserService {
    /**
     * 从数据库中查询是否给用户分配了密钥 accesskey
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
