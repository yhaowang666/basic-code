package cn.itcast.day04.demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        sum(10,20);
        System.out.println("**********************");

        System.out.println(sum(10,20));
        System.out.println("**********************");

        int number=sum(10,20);
        number++;
        System.out.println("number的值为："+number);

    }
    public static int sum(int a,int b){
        System.out.println("方法调用啦!");
        int result=a+b;
        return result;
    }
}
