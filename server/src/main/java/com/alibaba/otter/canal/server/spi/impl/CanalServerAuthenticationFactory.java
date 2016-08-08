package com.alibaba.otter.canal.server.spi.impl;

import com.alibaba.otter.canal.server.spi.CanalServerAuthentication;
import org.apache.commons.lang.StringUtils;

import java.util.Properties;

/**
 * @author baiju Aug 08 2016
 */
public class CanalServerAuthenticationFactory {

    public static final String CANAL_SERVER_USERNAME = "canal.server.username";
    public static final String CANAL_SERVER_PASSWORD = "canal.server.password";

    public static CanalServerAuthentication createAuthentication(final Properties properties) {
        SimpleCanalServerAuthentication canalServerAuthentication = new SimpleCanalServerAuthentication();
        canalServerAuthentication.setUsername(getProperty(properties, CANAL_SERVER_USERNAME));
        canalServerAuthentication.setPassword(getProperty(properties, CANAL_SERVER_PASSWORD));
        return canalServerAuthentication;
    }

    private static String getProperty(Properties properties, String key) {
        return StringUtils.trim(properties.getProperty(StringUtils.trim(key)));
    }

}
