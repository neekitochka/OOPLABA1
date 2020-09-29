package com.company;

public class Primes {

    // в данном методе описан алгоритм, который перебирает числа от 2 до 100, и с помощью функции isPrime, выбирает какие числа стоит вывести, а какие нет
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++){
            isPrime(i);
            if (isPrime(i) == true){
                System.out.println(i);
            }
        }
    }

    // функция которая определяет простое число или нет. если это простое то возвращает true, если нет, то false
    public static boolean isPrime (int n) {
        for (int i = 2; i < n; i++ ){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
