package com.demo.progresstests.exam1.exercies15;
/*
На спектакль в кассу театра было выделено определенное количество билетов,
и продажа осуществлялась до тех пор, пока не были проданы все билеты.
Напишите класс, который сначала принимает с клавиатуры количество билетов, переданных в кассу.
Затем класс принимает с клавиатуры серию чисел, каждое из которых указывает на число билетов,
которое желает приобрести очередной покупатель.
Если нет возможности продать очередному покупателю требуемое им число билетов,
принимается заказ от следующего покупателя.
Класс должен вывести на экран следующую итоговую информацию:
• какое число покупателей приобрели билеты;
• какому числу покупателей было отказано в продаже билетов.
 */
// ete xndir@ chisht em haskacel uremn anteri lucuma, ete che todos-um kases vonc lucem
import java.util.Scanner;

public class Exercies15_46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ticket");
        int ticket = scanner.nextInt();
        int ticketAmount = 0;
        int numRegect = 0;
        int num = 0;

        while (true) {
            System.out.println("ticket num");
            int ticketNum = scanner.nextInt();
            num += ticketNum;

            if (ticket > num) {
                ticketAmount++;
            } else if (ticket < num) {
                numRegect++;
                System.out.println("aydqan toms chunenq, hajord@");
                num -= ticketNum;
            }

            if (ticket == num) {
                System.out.println("bingo bolor tomser@ vajarvac en");
                System.out.println(numRegect + " andznavorutyan chenq spasarkel");
                break;
            }
        }
        scanner.close();
    }
}
