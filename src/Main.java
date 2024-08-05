public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var dog1 = dog + 4;
        var cat1 = cat + 4;
        var paper1 = paper + 4;
        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(paper1);

        var dog2 = dog - 3.5;
        var cat2 = cat - 1.6;
        var paper2 = paper - 7639;
        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);

        var friend = 19;
        var friend1 = friend + 2;
        var friend2 = friend1 / 7;
        System.out.println(friend);
        System.out.println(friend1);
        System.out.println(friend2);

        var frog = 3.5;
        var frog1 = frog * 10;
        var frog2 = frog1 / 3.5;
        var frog3 = frog2 + 4;
        System.out.println(frog);
        System.out.println(frog1);
        System.out.println(frog2);
        System.out.println(frog3);

        var weight1Fighter = 78.2;
        var weight2Fighter = 82.7;
        var totalWeight = weight1Fighter + weight2Fighter;
        var differenceBetweenWeights = weight2Fighter - weight1Fighter;
        System.out.println(totalWeight);
        System.out.println(differenceBetweenWeights);

        var remainderOfTheDivision = weight2Fighter % weight1Fighter;
        System.out.println(remainderOfTheDivision + " остаток от деления между весами бойцов");

        var totalHours = 640;
        var onePerHours = 8;
        var totalPer = totalHours / onePerHours;
        System.out.println(" Всего работников в компании — " + totalPer + " человек");
        var newTotalPer = totalPer + 94;
        var newTotalHours = newTotalPer * onePerHours;
        System.out.println("Если в компании работает " + newTotalPer + " человека,то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками");
    }
}