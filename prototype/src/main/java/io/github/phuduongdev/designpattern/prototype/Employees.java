/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.phuduongdev.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phudev
 */
public class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    public void initData() {
        empList.add("Java");
        empList.add("Kotlin");
        empList.add("CSharp");
        empList.add("Javasript");
        empList.add("HTML");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String emp : this.getEmpList()) {
            temp.add(emp);
        }
        return new Employees(temp);
    }

}
