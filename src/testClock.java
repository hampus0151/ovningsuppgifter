public class testClock {
    public static void main(String[] args) {
        Clock clock = new Clock(00,00);
        int i = 0;
        do {
            System.out.println(clock.getTime());
            clock.timeTick();
            i++;
        } while (i < 15);
    }
}