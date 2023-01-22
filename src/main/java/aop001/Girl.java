package aop001;

public class Girl {
    public void runSomething() {
        System.out.println("철컥. 열쇠로 문을 열고 집에 들어가다.");

        try {
            System.out.println("요리를 하다.");
        } catch (Exception e) {
            if(e.getMessage().equals("fire!")) {
                System.out.println("Call 911");
            }
        } finally {
            System.out.println("불을 끄고 잠에 들다.");
        }

        System.out.println("철컥. 자물쇠로 문을 잠그고 집을 나서다.");
    }
}
