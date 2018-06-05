public class Loop {
    public static void main(String args[]) {
        Loop loop = new Loop();
        loop.whileLoop();
        loop.doWhileLoop();
        loop.forLoop();
        loop.arrayLoop();
        loop.breakLoop();
        loop.continueLoop();
    }

    private void whileLoop() {
        int x = 10;
        while(x < 20) {
            System.out.println("value of x :"+x);
            x++;
        }
    }

    private void doWhileLoop() {
        int x = 10;
        do {
            System.out.println("value of x :"+x);
            x++;
        } while(x < 20);
    }

    private void forLoop() {
        for(int x = 10; x < 20; x++) {
            System.out.println("value of x :"+x);
        }
    }

    private void arrayLoop() {
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers) {
            System.out.println("value of numbers :"+x);
        }

        String [] names = {"James", "Larry", "Tom", "Lacy"};
        for(String name : names) {
            System.out.println("value of names :" + name);
        }
    }

    private void breakLoop() {
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.println("value of numbers :"+x);
        }
    }

    private void continueLoop() {
        String [] names = {"James", "Larry", "linzhen", "Tom", "Lacy"};
        for(String name : names) {
            if (name.equals("linzhen")) {
                continue;
            }
            System.out.println("value of names :" + name);
        }
    }
}
