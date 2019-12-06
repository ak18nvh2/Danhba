package com.example.danhb.moldue;

public class Contact {
    private int mGioiTinh;
    private String mName, mNumber;

    public Contact(int mGioiTinh, String mName, String mNumber) {
        this.mGioiTinh = mGioiTinh;
        this.mName = mName;
        this.mNumber = mNumber;
    }

    public int getmGioiTinh() {
        return mGioiTinh;
    }

    public void setmGioiTinh(int mGioiTinh) {
        this.mGioiTinh = mGioiTinh;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }
}
