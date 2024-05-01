package com.dvyne.parkinglotsst.models;

public class Operator extends BaseModel{
    private String name;
    private int EmpId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }
}
