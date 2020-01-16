package com.jiangc.mvc.render;

import com.jiangc.mvc.RequestHandlerChain;

/**
 * 渲染请求结果 interface
 */
public interface Render {
    /**
     * 执行渲染
     */
    void render(RequestHandlerChain handlerChain) throws Exception;
}