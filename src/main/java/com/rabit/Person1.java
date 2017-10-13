package com.rabit;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person1 {
    private String name;
    private  int age;
    private  boolean sex;

    public Person1(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @NotNull(message = "person  --name 不能为空")
    @Size(min = 5,max = 24,message = "person -name 长度必须在{min}与{max}之间")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Min(value = 10,message = "person--年龄必须大于等{value}")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @AssertTrue(message = "person--性别必须为真")
    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
