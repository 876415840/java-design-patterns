package com.alan.prototype.domain;

/**
 * @Description 学生对象
 * @Author MengQingHao
 * @Date 2019/11/6 11:13 上午
 * @Version 1.0
 */
public class Student implements Cloneable {

    private String name;

    private String gender;

    private Integer age;

    private String region;

    private String classes;

    @Override
    public Object clone() throws CloneNotSupportedException {
        // java 的 clone函数是浅拷贝，如果需要深度拷贝需自己重写
        return super.clone();
    }

    public Student(String name, String gender, Integer age, String region, String classes) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.region = region;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", region='" + region + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
