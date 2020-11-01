public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"Альпенов", "Бозтаев", "Пак"};
        String[] wordListTwo = {"Евгений", "Данияр", "Юрий"};
        String[] wordListThree = {"Юрьевич", "Анатольевич", "Михайлович"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int random1 = (int) (Math.random() * oneLength);
        int random2 = (int) (Math.random() * twoLength);
        int random3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[random1] + " " + wordListTwo[random2] + " " + wordListThree[random3];
        System.out.println(phrase);
    }
}