package com.jrapcloud.common.util;

import java.util.Random;

/**
 * @author IvanStephen
 * @project jrapcloud
 * @date 2019/12/21 9:12
 **/
public class ServerPortUtils {
    /**
     * 获取可用端口，范围2000-65535
     * @return
     */
    public static int getAvailablePort() {
        int max = 65535;
        int min = 2000;
        Random random = new Random();
        int port = random.nextInt(max)%(max-min+1) + min;
        boolean using = NetUtils.isLoclePortUsing(port);
        if (using) {
            return getAvailablePort();
        } else {
            return port;
        }
    }
}
