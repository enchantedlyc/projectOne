package com.lanou.Util;

/**
 * Created by lanou on 2018/7/25.
 */
public class MD5 {
    //如何用最快的方式实现 5*8
    public static void main(String[] args) {
        System.out.println(5 << 3);
        //表示八进制 以0开头
        System.out.println(0123);
        //表示16进制 以0x开头
        System.out.println(0x123);
        //与(&)运算 换成二进制 都为1才是1
        // 5 & 3 ==> 0101 & 0011 = 0001
        //或(|)运算 换成二进制 有1则为1 无1则为0
        // 5 | 3 ==> 0101 | 0011 = 0111
        System.out.println(5 | 3);

        //现在有一个八进制的数 转换成十六进制
    }
}
