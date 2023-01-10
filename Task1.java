//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно
// приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
package Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Boolean ch = false;
        while (ch == false){
            try { 
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите тип float:");
                Float name = sc.nextFloat();            
                ch = true;
                System.out.println("Вы молодец! Ваше число:" + name);
            } catch (Exception e) {
                System.out.println("Вы ввели не float, введите заново:");
                System.out.close();
            }
        }
    }
}
        


