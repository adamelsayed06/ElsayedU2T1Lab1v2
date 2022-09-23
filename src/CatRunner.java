public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Fluffy", 8, 38.92);

        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Kate", 3, 40.29);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
