/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.phuduongdev.designpattern.test;

import io.github.phuduongdev.designpattern.prototype.Employees;
import java.util.List;

/**
 *
 * @author phudev
 */
public class NewClass {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.initData();

        Employees employeesCloneOne = (Employees) employees.clone();
        Employees employeesCloneTwo = (Employees) employees.clone();

        List<String> list = employeesCloneOne.getEmpList();
        list.add("CSS");

        List<String> listTwo = employeesCloneTwo.getEmpList();
        listTwo.remove("CSharp");

        System.out.println("employees list" + employees.getEmpList());
        System.out.println("employeesCloneOne list" + list);
        System.out.println("employeesCloneTwo list" + listTwo);
    }
}
