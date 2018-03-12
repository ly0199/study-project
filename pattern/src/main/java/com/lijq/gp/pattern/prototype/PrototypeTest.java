package com.lijq.gp.pattern.prototype;

import com.alibaba.fastjson.JSON;
import com.lijq.gp.pattern.prototype.simple.Book;
import com.lijq.gp.pattern.prototype.vo.Child;
import com.lijq.gp.pattern.prototype.vo.Family;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lijq
 * @date 2018/3/8 15:00
 * @description
 */
public class PrototypeTest {

    @Test
    public void simpleClone() throws CloneNotSupportedException {

        Book book1 = new Book();

        List<String> authors = new ArrayList<>();
        authors.add("宝宝");
        authors.add("父亲");

        book1.setAuthors(authors);
        book1.setName("《快乐父女》");
        book1.setPage(Integer.MAX_VALUE);

        Book book2 = (Book) book1.clone();

        System.out.println(book1 == book2);
        System.out.println(book1.getAuthors() == book2.getAuthors());

        authors.add("母亲");

        System.out.println();

        System.out.println(JSON.toJSONString(book1));
    }

    @Test
    public void deepClone() {

        Child child = new Child();
        child.setName("宝宝");
        child.setAge(3);

        List<Child> children = new ArrayList<>();
        children.add(child);

        Family family = new Family();
        family.setFather("父亲");
        family.setMother("母亲");
        family.setChildren(children);

        Family family1 = (Family) family.clone();

        System.out.println(family);
        System.out.println(family1);

        System.out.println(family.getChildren());
        System.out.println(family1.getChildren());

    }
}
