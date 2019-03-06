package com.jk.pojo;

public class Goods {

    private Integer id;

    private String name;

    private Integer sex;

    private Integer age;

    private String shouji;

    private String aihao;

    private String pwd;

    private Integer kucun;

    private Integer baosunshu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getShouji() {
        return shouji;
    }

    public void setShouji(String shouji) {
        this.shouji = shouji;
    }

    public String getAihao() {
        return aihao;
    }

    public void setAihao(String aihao) {
        this.aihao = aihao;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getKucun() {
        return kucun;
    }

    public void setKucun(Integer kucun) {
        this.kucun = kucun;
    }

    public Integer getBaosunshu() {
        return baosunshu;
    }

    public void setBaosunshu(Integer baosunshu) {
        this.baosunshu = baosunshu;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", shouji='" + shouji + '\'' +
                ", aihao='" + aihao + '\'' +
                ", pwd='" + pwd + '\'' +
                ", kucun=" + kucun +
                ", baosunshu=" + baosunshu +
                '}';
    }
}
