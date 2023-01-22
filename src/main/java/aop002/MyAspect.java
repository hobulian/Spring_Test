package aop002;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
/*
    Aspect = Advices + PointCuts
    Advisor = Advice + PointCut -> 이제는 사용하지 말라고 권고된 기능. Aspect에 의해 대체 중이다.
 */
public class MyAspect {
    /*
        Before는 ()안 메소드 실행 전 before에 지정된 메소드 사용. JoinPoint = runSometing()
        광의의 JoinPoint는 스프링 프레임워크가 관리하는 빈의 모든 메소드(Aspect 적용이 가능한 모든 지점)
        협의의 JoinPoint는 호출된 객체의 메소드.
    */
    @Before("execution(* runSomething ())")
    /*
        runSomething ())는 PointCut이 된다. 횡단 관심사를 적용할 타겟 함수를 선택하는 지시자(메소드 선택 필터)
        스프링 외에 다른 AOP 프레임워크까지 생각한다면, Aspect 적용 위치 지정자(Indicator) 혹은 메소드 선정 알고리즘이라 한다.
    */
    public void before(JoinPoint joinPoint) { // Advice, 언제 무엇을 적용할 것인가?
        System.out.println("얼굴 인식 확인: 문을 개방하라");
        //System.out.println("철컥. 열쇠로 문을 열고 집에 들어가다");
    }
}
