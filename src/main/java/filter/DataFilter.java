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
        Enumeration<String> parametrsEnumeration = servletRequest.getParameterNames();
        Enumeration<String> attributesEnum = servletRequest.getSession().getAttributeNames();

        System.out.println(">>Start DataFilter. List Parameters request:");
       while(parametrsEnumeration.hasMoreElements()){
           String s=parametrsEnumeration.nextElement();
           String s1=servletRequest.getParameter(s);
           System.out.println(">>"+s+"="+s1);
       }
        System.out.println(">>List attributes session:");
        while(attributesEnum.hasMoreElements()){
            String s=attributesEnum.nextElement();
            String s1=servletRequest.getSession().getAttribute(s).toString();
            System.out.println(">>"+s+"="+s1);
        }
        System.out.println();
       chain.doFilter(servletRequest,servletResponse);
    }
}
