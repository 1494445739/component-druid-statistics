package com.tzg.component.druid.statistics;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * druid连接池启用Web监控统计功能
 */
@WebFilter(
        filterName = "druidStatFilter",
        urlPatterns = { "/*" },
        initParams = { @WebInitParam( name = "exclusions", value = "*.js, *.gif, *.jpg, *.png, *.css, *.ico, /druid/*" ) } )
public class WebStatWrapperFilter extends WebStatFilter { }
