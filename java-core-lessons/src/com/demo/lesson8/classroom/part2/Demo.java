package com.demo.lesson8.classroom.part2;

public class Demo {

    public static void main(String[] args) {
//        var aa = new Pc();
//        aa.test();

        Computer pc = new Pc();
        pc.setData(1000, 10);

        Computer notebook = new Notebook();
        notebook.setData(2000, 20);

//        Computer gamePc = new GamePc();
//        gamePc.setData(2000, 20);

        print(pc);
        print(notebook);
//        print(gamePc);
    }

    public static void print(Equipment equipment) {
        equipment.printInfo();
        System.out.println(equipment.getCashback());
    }

}
