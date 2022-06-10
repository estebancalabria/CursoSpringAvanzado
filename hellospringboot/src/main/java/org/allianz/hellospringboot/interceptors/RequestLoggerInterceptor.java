package org.allianz.hellospringboot.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class RequestLoggerInterceptor implements HandlerInterceptor {
	
	Logger logger = LoggerFactory.getLogger(RequestLoggerInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {		
		long inicio = System.currentTimeMillis();
		request.setAttribute("inicio", inicio);
		
		logger.info("BEFORE " + request.getMethod() + " " + request.getRequestURI()+" FROM "+ request.getRemoteAddr());
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("AFTER " + request.getMethod() + " " + request.getRequestURI());
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long inicio = (long)request.getAttribute("inicio");
		long tiempo = System.currentTimeMillis() - inicio; 
				
		logger.info("AFTER COMPLETION " + request.getMethod() + " " + request.getRequestURI() +"("+ tiempo +" ms)");
	}
}
