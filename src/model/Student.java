package model;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 9:45 2019/6/27
 * @Description:
 */
public class Student {
    private String name;
    private int age;
    private int sex;
    private long id;

    public Student(String name, int age, int sex, long id) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
