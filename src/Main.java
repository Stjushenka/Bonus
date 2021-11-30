public class Main {
    public static void main(String[] args) {
        int balance1 = 100;
        int replenishment = 100;
        int bonus;
        if (replenishment > 100) {
            bonus = replenishment/100;
        } else {
            bonus = 0;
        }
        int balance2 = balance1+replenishment+bonus;
            System.out.println("Ваш баланс " +balance2);
    }
}
