package aop004;


import org.aspectj.lang.JoinPoint;

public class MyAspect {
    public void before(JoinPoint joinPoint) {
        System.out.println("얼굴 인식 확인: 문을 개방하라");
        //System.out.println("철컥. 열쇠로 문을 열고 집에 들어가다");
    }

    public void lockDoor(JoinPoint joinPoint) {
        System.out.println("주인님 나갔다: 어이! 문 잠가!");
    }
}
