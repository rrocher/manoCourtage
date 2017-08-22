package com.mano.courtage.aop;

import javax.inject.Inject;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.mano.courtage.config.JwtUser;
import com.mano.courtage.domain.AbstractEntity;
import com.mano.courtage.domain.User;
import com.mano.courtage.repo.UserDao;

@Aspect
@Component
public class SecurityAspect {
	@Inject
	UserDao userDao;
	
	@Before("execution(* com.mano.courtage.service.*.create(..))")
	public void logBefore(JoinPoint joinPoint) throws Exception {

		System.out.println("logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		AbstractEntity entity = (AbstractEntity) joinPoint.getArgs()[0];
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User user = null;
		if (authentication.getPrincipal().equals("anonymousUser"))
		{
			user = userDao.findByFirstNameAndLastName("root", "root");
		}
		else
		{
			JwtUser aud = (JwtUser) authentication.getPrincipal();
			if (aud == null || aud.getUsername() == null)
				throw new Exception("User does not exist");
			user = (User) aud.getUser();
		}

		entity.setIdUserInsert(user);
		entity.setIdUserUpdate(user);
		System.out.println("******");
	}

}
