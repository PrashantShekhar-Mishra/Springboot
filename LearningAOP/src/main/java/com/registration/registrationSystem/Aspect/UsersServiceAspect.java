package com.registration.registrationSystem.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UsersServiceAspect {
	 @Before("execution(* com.registration.registrationSystem.Service.UserService.*(..))")
	    public void beforeUserServiceMethods() {
	        System.out.println("AOP: Before UserService method execution");
	    }
	 @After("execution(* com.registration.registrationSystem.Service.UserService.*(..))")
	    public void AfterUserServiceMethods() {
	        System.out.println("AOP: After UserService method execution");
	    }
}
