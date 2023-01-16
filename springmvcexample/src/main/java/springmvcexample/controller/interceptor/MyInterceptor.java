package springmvcexample.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("this is prehandler");
		
		String name=request.getParameter("user");
		if(name.startsWith("d")) {
			response.setContentType("text//html");
			response.getWriter().println("<h1>Invalid Name ...Name should not Starts With d </h1>");
			return false;
		}
		return true; // true return karne ka mtlb h request age bhejni h.. 
	}           // false return karne pr request wahi se wapas chali jayegi..

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("this is post Handler");

	
	
}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	System.out.println("This Is After Competion");
	}
	
}