package com.discount.testquest.Game;

public class indexStone {

    private Trail start_story;
    public Trail current_situation;

    indexStone() {
        start_story = new Trail(
                "Указательный камень №1",
                "Только вы начали свой путь и тут же встретили указаельный камень.\n"
                        + "Куда идем?\n"
                        + " (1)Направо. Там нас ждет испытание храбрости\n"
                        + " (2)Прямо.\n"
                        + " (3)Налево. Иди туда, если доверяешь мне...",
                3, 0, 0);



        start_story.direction[0] = new Trail(
                "Направо",
                "Испытание уже началось! "
                        + "Перед тобой стоит 2 двери. Тебе нужно выбрать одну из них.\n" +
                        "   (1) Дверь с надписью Быстрый проход, но при выборе этой двери остается 1% здоровья\n" +
                        "   (2) Дверь с надписью Долгий проход, при этом выборе здоровье не меняется",
                2, 0, -20);
        start_story.direction[0].direction[0] = new Trail(
                "Быстрый проход",
                "Ты выбрал быстрый путь и теперь у тебя 1% здоровья\n" +
                        "Ты уже близок к цели! Остался последний выбор:\n" +
                        "   (1) ты гуль?))))))))))))))))))))))))\n" +
                        "   (2) я позер",
                2,-99,-20);
        start_story.direction[0].direction[0].direction[0] = new Trail(
                "Ты прошел!",
                "Выбор был очивиден\n",
                0,100,100);
        start_story.direction[0].direction[0].direction[1] = new Trail(
                "Ты не прошел!",
                "фууууу позер :)\n",
                0,1000-7,1000-7);


        start_story.direction[0].direction[1] = new Trail(
                "Долгий проход",
                "Ты выбрал долгый путь и теперь тебе предстоит долго выбирать ответ....\n" +
                        "Вопрос: Hunter x Hunter или Башня Бога?\n" +
                        "   (1) чел ты.... конечно башня бога\n" +
                        "   (2) выбор очевиден... я выбираю hunter",
                2,-99,-20);
        start_story.direction[0].direction[1].direction[0] = new Trail(
                "Ты не прошел!",
                "Нельзя выбирать лучшего из этих шедевров\n",
                0,-100,-100);
        start_story.direction[0].direction[1].direction[1] = new Trail(
                "Ты не прошел!",
                "Нельзя выбирать лучшего из этих шедевров\n",
                0,-100,-100);



        start_story.direction[1] = new Trail(
                "Ты прошел!!",
                "Вы бы заплакали, узнав, на сколько же мне лень писать сюжет\n",
                0, -1000000, 1000000);



        start_story.direction[2] = new Trail(
                "Хмм, Налево...",
                "А ты мне и правда веришь... чтожжж идем дальше\n" +
                        "Сейчас выбери 1 дверь, не читая вторую, если по прежднему веришь в меня....\n" +
                        "   (1)Ну жми" +
                        "   (2)НЕЕЕТ ЭТО ЛОВУШКА НЕ ИДИ в 1 дверь ВЫБЕРИ 2 пжпжпж", 2, 0,
                -50);

        start_story.direction[2].direction[0] = new Trail(
                "Игра закончилась..",
                "Следущие ответы никак не повлияют на исход, этот вопрос создан чисто для вида\n" +
                        "Вопрос: 9 или 10? я глухая\n" +
                        "   (1) 9\n" +
                        "   (2) 10",
                2,-99,-20);
        start_story.direction[2].direction[0].direction[0] = new Trail(
                "Ты не прошел!",
                "там 10 должно было быть\n" +
                        "да я знаю что тот вопрос не должен влиять на решение но мне таааак все равно все даввай не плакать а принять жествокую правду тЫ ПРОИГАРл",
                0,-100,-100);
        start_story.direction[2].direction[0].direction[1] = new Trail(
                "Ты прошел!",
                "урааааа\n",
                0,-100,-100);

        current_situation = start_story;
    }

    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}

