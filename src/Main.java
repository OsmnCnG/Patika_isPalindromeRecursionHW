import static java.lang.Math.pow;

public class Main {

    /*
    Palindrom Sayı Nedir ?
    Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

    Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
    */

    public static int isPalindrome(int number){
        int flag=number;
        int count=0;
        while(flag!=0){
            flag/=10;
            count++;
        }
        double reverse=0;
        reverse+=((number%10)*pow(10,count-1));
        if (number==0)
            return 0;
        else
        return (int) (reverse+isPalindrome( number/10));
    }
    public static void main(String[] args) {
        int sayi=101;
        if(isPalindrome(sayi)==sayi)
            System.out.println("Palindrome");
        else
            System.out.println("Not Polindrome");
    }
}