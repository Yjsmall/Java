package com.small.domain;

/**
 * @author smallYJ
 */
public class MyUser {
    private Integer myId;
    private String myName;
    private String myPwd;

    public Integer getMyId() {
        return myId;
    }

    public void setMyId(Integer myId) {
        this.myId = myId;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyPwd() {
        return myPwd;
    }

    public void setMypwd(String myPwd) {
        this.myPwd = myPwd;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "myId=" + myId +
                ", myName='" + myName + '\'' +
                ", myPwd='" + myPwd + '\'' +
                '}';
    }
}
