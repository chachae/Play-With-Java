package com.chachae;

import com.chachae.example.threadLocal.RequestHolder;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author chachae
 * @date 2019/11/4 11:39
 */
@Slf4j
public class HttpFilter implements Filter {
  @Override
  public void init(FilterConfig filterConfig) {}

  @Override
  public void doFilter(
      ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
      throws IOException, ServletException {
    HttpServletRequest request = (HttpServletRequest) servletRequest;
    log.info(
        "【Do filter】 URI: {},CurrentThread: {}",
        request.getServletPath(),
        Thread.currentThread().getId());
    RequestHolder.add(Thread.currentThread().getId());
    filterChain.doFilter(servletRequest, servletResponse);
  }

  @Override
  public void destroy() {}
}
