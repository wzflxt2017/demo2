package com.wang.tools;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangzefeng on 2019/5/22 0022.
 */
public class WebUtils {
    /**
     * 获取上下文URL全路径
     *
     * @param request
     * @return
     */
    public static String getContextPath(HttpServletRequest request) {
        StringBuilder sb = new StringBuilder();
        sb.append(request.getScheme()).append("://").append(request.getServerName());
        int port = request.getServerPort();
        if(port != 80 ){
            sb.append(":").append(port);
        }
        sb.append(request.getContextPath());
        String path = sb.toString();
        sb = null;
        return path;
    }
}
