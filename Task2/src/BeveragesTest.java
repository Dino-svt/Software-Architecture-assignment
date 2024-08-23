import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BeveragesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.print("Do you want extras for tea?  (yes/no): ");
        String teaExtras = scanner.nextLine();
        tea.setWantsExtras(teaExtras.equalsIgnoreCase("yes"));

        System.out.print("Do you want extras with your coffee (yes/no)?");
        String coffeeExtras = scanner.nextLine();
        coffee.setWantsExtras(coffeeExtras.equalsIgnoreCase("yes"));


        System.out.println("\nMaking tea...");
        tea.finalTemplateMethod();

        System.out.println("\nMaking coffee..");
        coffee.finalTemplateMethod();


        scanner.close();





        }
}