package com.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@EnableAspectJAutoProxy
@Aspect
@Component
public class TestAop {

	@Pointcut("execution(* com.test.service.TestInterface.test(..))")
	//@Pointcut("execution(* com.test.service..*.*(..))")
	private void anyMethod(){};

	//@Before("@annotation(test)")
	@Before("anyMethod()")
	public void beforeMethod(JoinPoint jp) {
		System.out.println("-------------------注解拦截------before-------------");
		Signature signature = jp.getSignature();
		MethodSignature methodSignature = (MethodSignature)signature;
		Method targetMethod = methodSignature.getMethod();
		if(targetMethod.isAnnotationPresent(TestSource.class)){
			System.out.println("----------111---you le--------------");
		}
		Class clazz = targetMethod.getClass();
		String className=jp.getTarget().getClass().getSimpleName();
		String methodName=jp.getSignature().getName();
		Object[] args=jp.getArgs();
		Class<?> classTarget=jp.getTarget().getClass();

		Class<?> inter[]=null;//声明一个对象数组
		inter=classTarget.getInterfaces();//获取类实现的所有接口
		for(int i=0;i<inter.length;i++){
			try {
				System.out.println(inter[i].getName());//打印出完整的包名+接口
				Method method = inter[i].getMethod(methodName, targetMethod.getParameterTypes());
				if (method != null) {
					if(method.isAnnotationPresent(TestSource.class)){
						System.out.println("-------------you le--------------");
					}
				}
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
		}

		Class<?>[] par=((MethodSignature) jp.getSignature()).getParameterTypes();
		try {
			Method objMethod=classTarget.getMethod(methodName, par);
			TestSource aCache=objMethod.getAnnotation(TestSource.class);
			if(aCache!=null){
				System.out.println("-----------------");
				System.out.println("-----------------获取注解实现类上的注解");
				System.out.println("-----------------");
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}


	}

	@After("@annotation(test)")
	public void afterMethod(JoinPoint jp, TestSource test) {
		System.out.println("-------------------注解拦截---------after----------");
	}

	@AfterReturning("@annotation(test)")
	public void afterReturnMethod(JoinPoint jp, TestSource test) {
		System.out.println("-------------------注解拦截-----------afterreturn--------");
	}

	@Around("@annotation(test)")
	public Object aroundMethod(ProceedingJoinPoint jp, TestSource test) throws Throwable {
		System.out.println("-------------------注解拦截----------around--start-------");
		Object ret = jp.proceed();
		System.out.println("-------------------注解拦截----------around--end-------");
		return ret;
	}

	@AfterThrowing(pointcut = "@annotation(test)",throwing="ex")
	public void afterTrow(JoinPoint jp, TestSource test, Throwable ex) {
		System.out.println("-------------------注解拦截----------throwing-------");
	}
}
