/**   
 * @Title: ThisDemo.java 
 * @Package com.test 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author A18ccms A18ccms_gmail_com   
 * @date 2019年1月13日 下午8:00:17 
 * @version V1.0   
 */
package demo.test;


import java.util.function.IntUnaryOperator;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2019年1月13日]
 * @package com.test
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2019年1月13日|tianpei|新增|ThisDemo.java新增
 */
public class ThisDemo {

    public static void main(String[] args) {
        // 静态方法的方法引用
        IntUnaryOperator methodRefrence1 = DemoClass::staticMethod;
        System.out.println(methodRefrence1.applyAsInt(111));

        DemoClass demo = new DemoClass();

        // 实例方法的方法引用
        IntUnaryOperator methodRefrence2 = demo::normalMethod;
        System.out.println(methodRefrence2.applyAsInt(111));
        demo.normalMethod(88);
    }
}
class DemoClass {

    /**
     * 这里是一个静态方法
     */
    public static int staticMethod(int i) {
        return i * 2;
    }

    /**
     * 这里是一个实例方法
     */
    public int normalMethod(DemoClass this,int i) {
        System.out.println("实例方法可以访问this:" + this);
        return i * 2;
    }

}