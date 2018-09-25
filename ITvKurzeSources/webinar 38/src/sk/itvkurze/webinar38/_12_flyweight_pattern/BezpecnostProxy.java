package sk.itvkurze.webinar38._12_flyweight_pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BezpecnostProxy implements InvocationHandler {

	private Object obj;
	
	private BezpecnostProxy(Object obj) {
		this.obj = obj;
	}
	
	public static Object newInstance(Object obj) {
	    return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
	            .getClass().getInterfaces(), new BezpecnostProxy(obj));
	}

	@Override
	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
	    Object result;
	    try {
	    		if(m.getName().contains("pridaj")) {
	    			throw new IllegalAccessException("Pridavanie na casovu os momentalne nie je moyne");
	    		}
	    		else {
	    			result = m.invoke(obj, args);
	    		}
	    	} catch (InvocationTargetException e) {
	        throw e.getTargetException(); 
	    } catch (Exception e) {
	        throw new RuntimeException("neocakavana chzba pri volani sluzby: " 
	        		+ e.getMessage());
	    }
	    return result;
	}

}
