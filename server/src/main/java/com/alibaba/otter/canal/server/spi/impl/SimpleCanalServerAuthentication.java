package com.alibaba.otter.canal.server.spi.impl;

import com.alibaba.otter.canal.protocol.CanalPacket;
import com.alibaba.otter.canal.server.exception.CanalServerException;
import com.alibaba.otter.canal.server.spi.CanalServerAuthentication;
import com.google.common.base.Objects;

/**
 * @author baiju Aug 08 2016
 */
public class SimpleCanalServerAuthentication implements CanalServerAuthentication {

    private String username;
    private String password;


    public void handleAuthentication(CanalPacket.ClientAuth clientAuth) {
        if (!Objects.equal(clientAuth.getUsername(), username)
                || !Objects.equal(clientAuth.getPassword(), password)) {
            throw new CanalServerException("authentication error. ");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
