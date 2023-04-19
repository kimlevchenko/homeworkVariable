public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        float dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5f;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 2;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var allBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов " + allBoxersWeight + " кг");
        var differentWeight = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Разница веса между двумя бойцами " + differentWeight + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var differentWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница веса между двумя бойцами " + differentWeight + " кг");
        var differentWeightMetod2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница веса между двумя бойцами " + differentWeightMetod2 + " кг");
    }

    public static void task8() {
        System.out.println("Задача 8");
        var totalWorkHours = 640;
        var dayWorkHours = 8;
        var totalWorks = totalWorkHours / dayWorkHours;
        System.out.println("Всего работников в компании — " + totalWorks + " человек");
        totalWorks = totalWorks + 94;
        var fullHours = totalWorks * 8;
        System.out.println("Если в компании работает " + totalWorks + " человека, то всего " + fullHours + " часа работы может быть поделено между сотрудниками.");
    }
}
