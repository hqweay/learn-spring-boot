package net.leay.demo.filter;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/12/20 7:33 PM
 */
@Configuration
@ConditionalOnProperty(name = "LoginFilter.enable", havingValue = "true")
@WebFilter(filterName = "LoginFilter", urlPatterns = {"/login"})
public class LoginFilter implements Filter {

  @Value("${LoginFilter.enable}")
  private boolean isLoginFilterEnable = true;

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    //  对 Request 处理一下
    String name = (String) servletRequest.getParameter("name");// getAttribute("name");
    if (name.equals("admin")) {
      System.out.println("admin logged !!");
    } else {
      System.out.println("not admin");
      servletResponse.setContentType("ss");
    }
    filterChain.doFilter(servletRequest, servletResponse);
  }

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    System.out.println("init MyFilter !!");
  }

  @Override
  public void destroy() {
    System.out.println("destroy MyFilter !!");
  }
}
