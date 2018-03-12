package com.lijq.gp.pattern.proxy;

import com.lijq.gp.pattern.proxy.cglib.CglibObject;
import com.lijq.gp.pattern.proxy.cglib.CglibProxy;
import com.lijq.gp.pattern.proxy.gp.Finder;
import com.lijq.gp.pattern.proxy.gp.GPFinder;
import com.lijq.gp.pattern.proxy.jdk.HouseProxy;
import com.lijq.gp.pattern.proxy.jdk.MrLi;
import com.lijq.gp.pattern.proxy.statics.People;
import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.math.BigDecimal;

/**
 * @author Lijq
 * @date 2018/3/10 21:21
 * @description 代理测试
 */
public class ProxyTest {


    @Test
    public void staticTest() {
        People people = new People();
        people.setMinPrice(BigDecimal.valueOf(1000));
        people.setMaxPrice(BigDecimal.valueOf(2000));
        people.setMinArea(15);
        people.setMaxArea(30);

        com.lijq.gp.pattern.proxy.statics.HouseProxy proxy = new com.lijq.gp.pattern.proxy.statics.HouseProxy();
        proxy.findHouse(people).forEach(System.out::println);
    }


    @Test
    public void jdkTest() {
        try {


            IFinder proxy = (IFinder) new HouseProxy().getInstance(new MrLi());
            proxy.findWork();
            System.out.println(proxy.getClass());
            System.out.println(proxy.toString());

            //原理：
            //1、拿到被代理对象的引用，并且获取到它的所有的接口，反射获取
            //2、JDK Proxy类重新生成一个新的类、同时新的类要实现被代理类所有实现的所有的接口
            //3、动态生成Java代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）
            //4、编译新生成的Java代码.class
            //5、再重新加载到JVM中运行
            //以上这个过程就叫字节码重组

            //JDK中有个规范，只要要是$开头的一般都是自动生成的

            //通过反编译工具可以查看源代码
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{MrLi.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void cglibTest() {

        CglibObject obj = (CglibObject) new CglibProxy().getInstance(CglibObject.class);
        obj.find();
        System.out.println(obj.getClass());
    }

    @Test
    public void gpTest() {

        try {
            com.lijq.gp.pattern.proxy.gp.IFinder obj = (com.lijq.gp.pattern.proxy.gp.IFinder) new GPFinder().getInstance(new Finder());
            System.out.println(obj.getClass());
            obj.findHouse();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
