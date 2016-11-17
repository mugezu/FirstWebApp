package filter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by user on 17.11.2016.
 */
public class DataFilter extends AbstractFilter {
    private FilterConfig filterConfig;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(">>Init DataFilter");
        this.filterConfig=filterConfig;
    }
    @Override
    public void doFilter(HttpServletRequest servletRequest, HttpServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        Enumeration<String> stringEnumeration = servletRequest.getParameterNames();
        System.out.println(">>Start DataFilter. List Parameters:");
       while(stringEnumeration.hasMoreElements()){
           String s=stringEnumeration.nextElement();
           String s1=servletRequest.getParameter(s);
           System.out.println(">>"+s+"="+s1);
       }
        System.out.println();
       chain.doFilter(servletRequest,servletResponse);
    }
}
