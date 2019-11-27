package cn.itcast.day10.practise;

public class Practise01Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        USB mouse = new Mouse();
        Board board = new Board();

        laptop.on();
        laptop.useDevice(mouse);
        laptop.useDevice(board);
        laptop.off();
    }
}
