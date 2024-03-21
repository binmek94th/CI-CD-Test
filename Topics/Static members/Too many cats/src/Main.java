class Cat {

    String name;
    int age;
    static int counter;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        if (counter >= 5) {
            System.out.println("You have too many cats");
        }

        counter++;


        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        return counter;
    }
}