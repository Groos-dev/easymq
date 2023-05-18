package org.xin.easymq.log;

import org.apache.logging.log4j.LogManager;
import org.xin.easymq.log.impl.Log4jAdapter;

/**
 * @author Mr.xin
 */
public class LoggerFactory {
    public static Logger getLogger(Class<?> clazz){
        org.apache.logging.log4j.Logger logger = LogManager.getLogger(clazz);
        return new Log4jAdapter(logger);
    }
}
