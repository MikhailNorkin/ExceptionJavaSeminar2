// Задание 2
// Если необходимо, исправьте данный код 
// try {
//     int d = 0;
//     double catchedRes1 = int Array[8] / d;
//     System.out.println("catchedRes1 = " + catchedRes1);
//  } catch (ArithmeticException e) {
//     System.out.println("Catching exception: " + e);
//  }
 

//для того, чтобы обойтись без исключений, необходимо проверить, 
//1. выходит ли за пределы массива intArray[8] 
//2. равно ли d нулю
// для этого необходимо прописать условия следющим образом:

// if (intArray.length > 8) {
//     throw new IndexOutOfBoundsException("Catching exception: index out of bounds ");
// } else if (d == 0){
//     throw new ArithmeticException("Catching exception: division by zero ");
// }

package Homework2;

public class Task2 {
    public static void main(String[] args) {
        int index = 8;
        int[] intArray = new int[index];
        int d = 0;
        if (d == 0) {
            throw new ArithmeticException("Catching exception: division by zero ");
        }else if (index >= intArray.length) {
            throw new IndexOutOfBoundsException("Catching exception: index out of bounds ");
        }
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);

    }
}
