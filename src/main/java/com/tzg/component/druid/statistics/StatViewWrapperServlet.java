package com.tzg.component.druid.statistics;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet( name = "druidStatView", urlPatterns = "/druid/*" )
public class StatViewWrapperServlet extends StatViewServlet { }