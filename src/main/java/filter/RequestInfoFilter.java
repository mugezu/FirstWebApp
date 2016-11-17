package filter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 16.11.2016.
 */
public class RequestInfoFilter extends AbstractFilter {
    private FilterConfig filterConfig;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(">>Init RequestInfoFilter");
        this.filterConfig=filterConfig;
    }

    @Override
    public void doFilter(HttpServletRequest servletRequest, HttpServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        String method = servletRequest.getMethod();
        String remoteAddr=servletRequest.getRemoteAddr();
        String queryString = servletRequest.getQueryString();
        String protocol = servletRequest.getProtocol();
        System.out.println(">>RequestInfoFilter:\n>>Method='"+method+"'\n>>RemoveAddr='"+remoteAddr+"'\n>>Query='"+queryString+"'\n>>Protocol='"+protocol+"'\n");
        chain.doFilter(servletRequest,servletResponse);
    }
}
