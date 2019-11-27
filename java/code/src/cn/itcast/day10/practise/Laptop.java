package cn.itcast.day10.practise;

public class Laptop {
    public void on() {
        System.out.println("笔记本开机");
    }

    public void off() {
        System.out.println("笔记本关机");
    }

    public void useDevice(USB usb) {
        usb.on();
        if (usb instanceof  Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }

        if (usb instanceof Board) {
            Board board = (Board) usb;
            board.input();
        }
        usb.off();
    }
}
