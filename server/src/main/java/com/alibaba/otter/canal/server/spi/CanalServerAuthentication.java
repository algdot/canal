package com.alibaba.otter.canal.server.spi;

import com.alibaba.otter.canal.protocol.CanalPacket;
import com.alibaba.otter.canal.server.exception.CanalServerAuthenticationException;

/**
 * @author baiju Aug 08 2016
 */
public interface CanalServerAuthentication {

    /**
     * 验权
     *
     * @param clientAuth 权限验证包
     * @throws CanalServerAuthenticationException 验证失败异常
     */
    void handleAuthentication(CanalPacket.ClientAuth clientAuth) throws CanalServerAuthenticationException;

}
