//package com.java2.web.filter;
//
//import java.io.IOException;
//import java.util.Base64;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.WebApplicationContextUtils;
//
//import com.java2.web.service.UserService;
//
//public class AuthentacationFilter implements Filter{
//	
//	WebApplicationContext context;
//	FilterConfig fc;
//
//	@Override
//	public void destroy() {
//		
//	}
//
//	@Override
//	//类似静态代理类，
//	//chain 一环扣一环
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		// getUser Info by userName
//		// compare password in httpRequest is equals password in DB
//		//
//		
//		HttpServletRequest httpRequest = (HttpServletRequest) request;
//		HttpServletResponse httpResponse = (HttpServletResponse) response;
//
//		String basicCreditial = httpRequest.getHeader("Authorization");
//
////		if(httpRequest.getAuthType() == HttpServletRequest.BASIC_AUTH){
//			String[] array = basicCreditial.split(" ");
//			String creditial = new String(Base64.getDecoder().decode(array[1]));
//			String[] creditialArray = creditial.split(":");
//			String userName = creditialArray[0];
//			String password = creditialArray[1];
//			UserService us = (UserService) context.getBean("userServiceImpl");
////		}
//		if(us.isUserCreditialValid(userName, password)){
//			chain.doFilter(request,response);
//		}else{
//			httpResponse.sendError(401, "password or username not right");
//		}
//		
//	}
//
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//		fc = filterConfig;
//		context = WebApplicationContextUtils.getRequiredWebApplicationContext(fc.getServletContext());
//	}
//
//}
