package com.springboot.project06.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by nick on 16. 9. 25.
 */
@Entity
public class Board implements Serializable{
    private int seq;
    private String sex;
    private String local;
    private String deptno;
    private String title;
    private String content;
    private String hit;
    private String regdate;
    private String moddate;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHit() {
        return hit;
    }

    public void setHit(String hit) {
        this.hit = hit;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getModdate() {
        return moddate;
    }

    public void setModdate(String moddate) {
        this.moddate = moddate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String result = "board = {seq:" + getSeq() + ", sex: " + getSex() + ", local: " + getLocal() + ", deptno: " + getDeptno() + ", title: " + getTitle() +
                                    ", content: " + getContent() + ", hit: " + getHit() + "}";
        return result;
    }
}
