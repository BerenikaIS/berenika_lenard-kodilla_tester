public class User {
    private String name;
    private int size;
    private int age;

    public User(String name, int age) {
    }

    public void User(String name, int age){
        this.name = name;
        this.size = 0;
        this.age = age;
    }
    public static void main(String[] args) {

        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);

        User[] users = {anna, betty, carl, david};

        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }
        int average = 0;
        average = sum / users.length;

        int summary = 0;
        int lessThanAverage = average;
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < lessThanAverage) {
            }
        }
    }
}