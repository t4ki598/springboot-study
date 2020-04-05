package com.ldr.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 类 描 述：TODO
 * 创建时间：2020-04-04 20:38
 * 创 建 人：t4ki
 */

//将配置文件中配置的每一个属性的值映射到这个组件中
//@ConfigurationProperties 告诉springboot将本类中所有属性和配置文件中的相关配置进行绑定

@PropertySource(value = {"classpath:person.properties"}) //不支持yml文件
@Component //只有这个组件式容器中的，才能使用容器功能
@ConfigurationProperties("person") //默认从全局配置文件中获取值
//@Validated //jsr303

public class Person {

    //@Email //输入名字必须为电子邮件
    private String name;
    private Integer age;
    private Date birth;
    private boolean sex;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", sex=" + sex +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
