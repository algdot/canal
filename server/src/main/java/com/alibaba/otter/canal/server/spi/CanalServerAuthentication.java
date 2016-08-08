package com.alibaba.otter.canal.server.spi;

import com.alibaba.otter.canal.protocol.CanalPacket;

/**
 * @author baiju Aug 08 2016
 */
public interface CanalServerAuthentication {

    /**
     * 验权
     *
     * @param clientAuth
     */
    void handleAuthentication(CanalPacket.ClientAuth clientAuth);

}
