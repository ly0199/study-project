package com.lijq.gp.pattern.prototype.vo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lijq
 * @date 2018/3/8 15:18
 * @description
 */

public class Family implements Cloneable, Serializable {

    private String father;
    private String mother;
    private List<Child> children = new ArrayList<>();


    @Override
    public Object clone() {
        return this.deepClone();
    }


    private Object deepClone() {

        try {

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            oos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
