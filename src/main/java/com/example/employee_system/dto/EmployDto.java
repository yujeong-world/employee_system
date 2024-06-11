package com.example.employee_system.dto;

import java.time.LocalDateTime;

public class EmployDto {
    private int empId;
    private int empNum;
    private String empName;
    private String position;
    private String phone;
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime modifyAt;

    // 기본 생성자
    public EmployDto() {
    }

    // 모든 필드를 포함하는 생성자
    public EmployDto(int empId, int empNum, String empName, String position, String phone, String email, LocalDateTime createAt, LocalDateTime modifyAt) {
        this.empId = empId;
        this.empNum = empNum;
        this.empName = empName;
        this.position = position;
        this.phone = phone;
        this.email = email;
        this.createAt = createAt;
        this.modifyAt = modifyAt;
    }

    // Getter와 Setter 메소드
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(LocalDateTime modifyAt) {
        this.modifyAt = modifyAt;
    }

    // toString 메소드 (디버깅 용도)
    @Override
    public String toString() {
        return "EmployDto{" +
                "empId=" + empId +
                ", empNum=" + empNum +
                ", empName='" + empName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", createAt=" + createAt +
                ", modifyAt=" + modifyAt +
                '}';
    }
}