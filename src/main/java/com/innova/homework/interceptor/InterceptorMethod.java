package com.innova.homework.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@InterceptorInterface
@Interceptor
public class InterceptorMethod {

	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		
		System.out.println("onceki durumum " + context.getMethod().getName() + " " + context.getClass());
		
		boolean isCardEmpty = false;
		Object isContinue = null;
		if (isCardEmpty) {
			System.out.println("oncelikle sepete bir esya ekleyiniz.");
			return null;
		} else {
			try {
				isContinue = context.proceed();
				System.out.println("sepet ekranina yonlendiriliyorsunuz.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return isContinue;
	}

}
