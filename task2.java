public class Seminar_1 {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.print("Введите ваш возраст: ");
                String userInput = sc.nextLine();
                int age = Integer.parseInt(userInput);
                if (age >= 0) {
                    System.out.println("Ваш возраст: " + age);
                    break;
                } else {
                    System.out.println("Введите положительное число!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Некорректный ввод!");
            }
        }
        System.out.println();
        sc.close();
    }