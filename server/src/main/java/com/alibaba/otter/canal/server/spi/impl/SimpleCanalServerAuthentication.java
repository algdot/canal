package com.alibaba.otter.canal.server.spi.impl;

import com.alibaba.otter.canal.protocol.CanalPacket;
import com.alibaba.otter.canal.server.exception.CanalServerAuthenticationException;
import com.alibaba.otter.canal.server.spi.CanalServerAuthentication;
import com.google.common.base.Objects;

/**
 * @author baiju Aug 08 2016
 */
public class SimpleCanalServerAuthentication implements CanalServerAuthentication {

    private String username;
    private String password;

    public void handleAuthentication(CanalPacket.ClientAuth clientAuth) {
        if (!Objects.equal(clientAuth.getUsername(), username)) {
            throw new CanalServerAuthenticationException("authentication error. username is invalid.");
        }
        if (!Objects.equal(getPassword(clientAuth), password)) {
            throw new CanalServerAuthenticationException("authentication error. password is invalid.");
        }
    }

    protected String getPassword(CanalPacket.ClientAuth clientAuth) {
        if (clientAuth.hasPassword()) {
            return clientAuth.getPassword().toStringUtf8();
        }
        return null;
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
