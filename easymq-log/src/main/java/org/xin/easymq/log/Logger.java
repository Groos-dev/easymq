package org.xin.easymq.log;

/**
 * @author Mr.xin
 */
public interface Logger {

    void trace(String var, Object... obj);

    void debug(String var, Object... obj);

    void info(String var, Object... obj);

    void warn(String var, Object... obj);

    void error(String var, Object... obj);

    void fatal(String var, Object... obj);

}
