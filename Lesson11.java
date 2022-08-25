package classwork;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Lesson11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        /*
-------Павел Кучмель--------------------------------------------------------------------------
         */
        /*
        ArrayList<Integer> arr = new ArrayList<>();
        fillArray(arr, -5, 10, 10);
        showArray(arr);
        System.out.print("\nМинимальная позиция: "+findMinPos(arr));
        System.out.print("\nМаксимальная позиция: "+findMaxPos(arr));
        swapPos(arr, findMinPos(arr),findMaxPos(arr));
        showArray(arr);
         */
        /*
----------------------------------------------------------------------------------------------
         */
        /*
        //BlackJack - Array
        ArrayList<Integer> deck = new ArrayList(52);
        fillDeck(deck);
        System.out.println();
        shaffleDeck(deck);
        showDeck(deck);
         */
        /*
----------------------------------------------------------------------------------------------
         */
        //Series1. Даны десять вещественных чисел. Найти их сумму.
        /*
        ArrayList<Integer> arr = new ArrayList<>(10);
        fillArray(arr,10, 10, 10);
        showArray(arr);
        System.out.println();
        System.out.print("Сумма: "+sumArray(arr));
        */
        /*
----------------------------------------------------------------------------------------------
         */
        //Series2. Даны десять вещественных чисел. Найти их произведение.
        /*
        ArrayList<Integer> arr = new ArrayList<>(10);
        fillArray(arr, -10, 10, 10);
        showArray(arr);
        System.out.println();
        System.out.print("Произведение: "+multArray(arr));
        */
        /*
----------------------------------------------------------------------------------------------
         */

        //Series3. Даны десять вещественных чисел. Найти их среднее арифметическое.
        /*
        ArrayList<Integer> arr = new ArrayList<>(10);
        fillArray(arr, -10, 10, 10);
        showArray(arr);
        System.out.println();
        System.out.println(srArray(arr));
         */
        /*
----------------------------------------------------------------------------------------------
         */
        //Series4. Дано целое число N и набор из N вещественных чисел. Вывести
        //сумму и произведение чисел из данного набора.
        /*
        System.out.print("Введите N: ");
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        fillArray(arr, -10, 10, n);
        showArray(arr);
        System.out.println();
        System.out.println("Сумма = "+sumArray(arr));
        System.out.println("Произведение = "+multArray(arr));
        */
        /*
----------------------------------------------------------------------------------------------
         */
        //Series5. Дано целое число N и набор из N положительных вещественных
        //чисел. Вывести в том же порядке целые части всех чисел из данного
        //набора (как вещественные числа с нулевой дробной частью), а также
        //сумму всех целых частей.
        System.out.print("Введите N: ");
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        fillArray(arr, -10, 10, n);
        showArray(arr);
        
    }
    static double srArray(ArrayList<Integer> arrayName){
        double sr = sumArray(arrayName)/(double)arrayName.size();
        return sr;
    }
    static int multArray(ArrayList<Integer> arrayName){
        int mult = 1;
        for (int i = 0; i < arrayName.size(); i++){
            mult = mult * arrayName.get(i);
        }
        return mult;
    }
    static void fillArray(ArrayList<Double> arrayName, double left, double right, int qty){
        Random gen = new Random();
        for (int i = 0; i < qty;i++){
            arrayName.add(gen.nextDouble());
        }
    }
    /*static void showArray(ArrayList<Double> arrayName){
        for (int i = 0; i < arrayName.size(); i++){
            System.out.print(arrayName.get(i)+" ");
        }
    }
    static double sumArray(ArrayList<Double> arrayName){
        double sum = 0;
        for (int i = 0; i < arrayName.size(); i++){
            sum = sum + arrayName.get(i);
        }
        return sum;
    }*/
    static int sumArray(ArrayList<Integer> arrayName){
        int sum = 0;
        for (int i = 0; i < arrayName.size(); i++){
            sum = sum + arrayName.get(i);
        }
        return sum;
    }
    static void fillDeck(ArrayList<Integer> arrayName){
        int numCard = 2;
        for (int i = 0; i < 52; ++i) {
            if (i % 4 == 0 && i != 0 && i < 36) {
                ++numCard;
            }
            if (i >= 48) {
                numCard = 11;
            }
            arrayName.add(i, numCard);
        }
    }
    static void shaffleDeck(ArrayList<Integer> arrayName){
        Random rdm = new Random();
        for (int j = 0; j < 3; j++){
            for (int i = 0; i < arrayName.size(); i++) {
                int rdmIndex = rdm.nextInt(arrayName.size());
                swapPos(arrayName, i, rdmIndex);
            }
        }
    }
    static void fillArray(ArrayList<Integer> arrayName, int left, int right, int qty){
        Random gen = new Random();
        for (int i = 0; i < qty;i++){
            arrayName.add(gen.nextInt(right-left+1)+left);
        }
    }
    static void showDeck(ArrayList<Integer> arrayName){
        for (int i = 1; i <= arrayName.size(); i++){
            System.out.print(arrayName.get(i-1)+" ");
            if (i%4==0) System.out.println();
        }
    }
    static void showArray(ArrayList<Integer> arrayName){
        for (int i = 0; i < arrayName.size(); i++){
            System.out.print(arrayName.get(i)+" ");
        }
    }
    static int findMinPos(ArrayList<Integer> arrayName){
        int minPos = -1;
        if (arrayName.size() == 0) return minPos;
        int min = arrayName.get(0);
        for (int i = 0; i < arrayName.size(); i++){
            if (min>arrayName.get(i)){
                min = arrayName.get(i);
                minPos = i;
            }
        }
        return minPos;
    }
    static int findMaxPos(ArrayList<Integer> arrayName){
        int maxPos = -1;
        if (arrayName.size() == 0) return maxPos;
        int max = arrayName.get(0);
        for (int i = 0; i < arrayName.size(); i++){
            if (max<arrayName.get(i)){
                max = arrayName.get(i);
                maxPos = i;
            }
        }
        return maxPos;
    }
    static void swapPos(ArrayList<Integer> arrayName, int index1, int index2){
        int temp = arrayName.get(index1);
        arrayName.set(index1, index2);
        arrayName.set(index2, temp);
    }
}
