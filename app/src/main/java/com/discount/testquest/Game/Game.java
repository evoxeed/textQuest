package com.discount.testquest.Game;
import java.util.Scanner;

public class Game {

    public static Character manager;
    public static indexStone story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("На пути Добрыне встретился указательный камень...\n"
                + "На нем обычно от 2 до 3 направлений, куда сможет пойти Добрыня, но будьте остарожны!\n" +
                "Не каждый путь окажется правельным...");
        manager = new Character();
        story = new indexStone();
        while (true) {
            manager.health += story.current_situation.deltaHealth;
            manager.endurance += story.current_situation.deltaEndurance;
            System.out.println("=====\nЗдоровье:" + manager.health + "\tВыносливость:"
                    + manager.endurance + "\n=====");
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            System.out.println(story.current_situation.description);
            if (story.isEnd()) {
                System.out
                        .println("====================КОНЕЦ!===================");
                return;
            }
            story.go(in.nextInt());
        }

    }
}