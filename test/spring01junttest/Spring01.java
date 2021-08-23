package spring01junttest;

import org.junit.Test;

public class Spring01 {
    @Test
    public void test01(){
        System.out.println("1.我是单元测试，在公司中，单元测试是Java程序员的自己的必须的测试，用来测试 "+
                "dao层，controller层，是否能正常运行"+
                ""+
                "2.单元测试的写法，必须是@Test 注解来自于org.junit.Test这个包，必须是void静态 没有返回值方法！！"+
                "3.方法名称和类名 最好 不可以起 test（） Test.java"+
                "4.单元测试 是用来代替main方法测试，main方法测试有一定的局限性，例如：无法 测试web项目，比如 项目request等"
                );
    }
    //反射:是在jvm 虚拟机的类加载中.java -------> class 文件﹑在这个转换期间
    // jvm可以看到类的所有的信息，比如属性，方法，父类，接口等
    //即:反射.对于任意一个对象都能够调用出他的.任意方法和属性﹒
    //这样的动态获取信息以及动态调用对象的方法的功能﹑叫做java的反射机制，不是我们通俗讲的镜面反射光线的反射。

    //为什么要学反射?.因为反射就是 Spring框架的底层实现
    // 为什么Spring框架要用到反射，. 因为反射可以解耦
    // 什么是解耦，  答:解耦就是解除程序之间的耦合
    // 什么是耦合,答:耦合就是程序之间过于依赖了.
    //什么叫做依赖，答 ：依赖就是A程序调用B程序，A程序中有B的方法调用

//先讲耦合

}
