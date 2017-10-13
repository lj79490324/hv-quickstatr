package com.rabit;

import javax.validation.Valid;
import javax.validation.constraints.*;

public class Sun {
    @NotNull(message = "id主键必须存在")
    private int id;

    @Min(value = 5,message = "age必须大于或等于5！！{value}")
    private int age;

    @NotNull(message = "name 不为空")
    private String name;

    @NotNull(message = "desc 不能为空")
    @Size(min =4,max = 14,message = "desc长度必须在4-14之间")
    private String desc;

    private boolean is_vip;

    @NotNull
    @Valid
    private Person1 person;
    public Sun(int age, String name, String desc, boolean is_vip) {
        this.age = age;
        this.name = name;
        this.desc = desc;
        this.is_vip = is_vip;
    }

    @AssertFalse(message = "is_vip 必须是假")
    public boolean isIs_vip() {
        return is_vip;
    }

    public void setIs_vip(boolean is_vip) {
        this.is_vip = is_vip;
    }

    public Sun(int age, String name, String desc) {
        super();
        this.age = age;
        this.name = name;
        this.desc = desc;
    }

    public Sun(int id, int age, String name, String desc,Person1 person) {
        super();
        this.id = id;
        this.age = age;
        this.name = name;
        this.desc = desc;
        this.person=person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
