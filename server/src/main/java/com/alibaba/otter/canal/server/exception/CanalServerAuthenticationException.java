package com.alibaba.otter.canal.server.exception;

/**
 *
 *
 * @author baiju Aug 09 2016
 */
public class CanalServerAuthenticationException extends CanalServerException {

    private static final long serialVersionUID = 1L;

    public CanalServerAuthenticationException(String errorCode) {
        super(errorCode);
    }

    public CanalServerAuthenticationException(String errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public CanalServerAuthenticationException(String errorCode, String errorDesc) {
        super(errorCode, errorDesc);
    }

    public CanalServerAuthenticationException(String errorCode, String errorDesc, Throwable cause) {
        super(errorCode, errorDesc, cause);
    }

    public CanalServerAuthenticationException(Throwable cause) {
        super(cause);
    }
}
