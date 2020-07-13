package cn.itcast.day04.demo02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int result=getSum(10,20);
        System.out.println("求和结果为："+result);
        System.out.println("**********************");
        printSum(100,200);

    }

    public static int getSum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void printSum(int a,int b){
        System.out.println("求和结果为："+(a+b));
    }
}
