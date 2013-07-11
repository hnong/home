package com.hnong.page.util;

public class DomainUtil {
    private static final String DOMAIN_MAIN = "www.huinong.com.cn";

    private static final String DOMAIN_MOBILE = "m.huinong.com.cn";

    public static boolean isMobileRequest(String serverName) {
        return serverName.contains(DOMAIN_MOBILE);
    }
}
