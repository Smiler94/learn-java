public class Branch {
    public static void main(String args[]) {
        Branch branch = new Branch();
        branch.ifBranch();
        branch.switchBranch();
    }

    private void ifBranch() {
        int x = 10;
        int y = 20;

        if (x < 20) {
            System.out.println("这是 if 语句");
        } else {
            System.out.println("这是 else 语句");
        }

        if (x < 20) {
            System.out.println("条件1");
        } else if(x < 40) {
            System.out.println("条件2");
        } else if (x < 60) {
            System.out.println("条件3");
        } else {
            System.out.println("条件4");
        }

        if (x > 5) {
            if (y > 10) {
                System.out.println("嵌套 if");
            }
        }
    }

    private void switchBranch() {
        int a = 10;
        switch(a) {
            case 5:
                System.out.println("switch 1");
                break;
            case 10:
                System.out.println("switch 2");
                break;
            default:
                System.out.println("switch default");
                break;
        }
    }
}
