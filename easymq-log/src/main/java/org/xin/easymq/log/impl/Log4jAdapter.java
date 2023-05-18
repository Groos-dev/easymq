package org.xin.easymq.log.impl;

import org.xin.easymq.log.Logger;

/**
 * @author Mr.xin
 */
public class Log4jAdapter implements Logger {

    public Log4jAdapter(org.apache.logging.log4j.Logger logger) {
        this.logger = logger;
    }

    private org.apache.logging.log4j.Logger logger;

    public void trace(String var, Object... obj) {
        logger.trace(var,obj);
    }

    public void debug(String var, Object... obj) {
        logger.debug(var,obj);
    }

    public void info(String var, Object... obj) {
        logger.info(var, obj);
    }

    public void warn(String var, Object... obj) {
        logger.warn(var, obj);
    }

    public void error(String var, Object... obj) {
        logger.error(var, obj);
    }

    public void fatal(String var, Object... obj) {

    }
}
