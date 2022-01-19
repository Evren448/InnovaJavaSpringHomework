package com.innova.homework.interceptor;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "interceptorAop")
@ApplicationScoped
public class AopBean implements Serializable {

	private static final long serialVersionUID = 2564361584692308395L;
	
	@Inject
	private Card card;
	
	public String getCard() {
		return card.isCardEmpty("Sepet ekrani.");
	}

}
