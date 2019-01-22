package com.chiu;

public class Hello {
    public static void main(String[] args) {
        //System.out.println("Hello World!!");
        //new Person().Hello();
        Person p = new Person();
        p.Hello();

        char a='A';// 只能儲存１個字元
        Character b = 'c';
        //float weight = 55.2; 在Java小數點一律使用double
        float weight1 = 55.2f;//加上f就可以放在float裡了
        Float x = Float.valueOf(25);
        Double weight = 55.2;
        String name = "邱俊鈐";
        Integer age2 = 19;

        System.out.println(b);


    }

}
