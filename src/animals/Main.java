package animals;

enum Animals {
    CAT(2){
        @Override
        public String toString() {
            return "Cat age " + age;
        }
    },DOG(4){
        @Override
        public String toString() {
            return "Dog age " + age;
        }
    },FROG(1){
        @Override
        public String toString() {
            return "Frog age " + age;
        }
    },TIGER(5){
        @Override
        public String toString() {
            return "Tiger age " + age;
        }
    };
    int age;

    Animals(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Animals.CAT);
        System.out.println(Animals.DOG);
        System.out.println(Animals.FROG);
        System.out.println(Animals.TIGER);
    }
}
