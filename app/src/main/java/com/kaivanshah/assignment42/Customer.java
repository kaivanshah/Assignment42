package com.kaivanshah.assignment42;

/**
 * Created by kaivanrasiklal.s on 08-02-2017.
 */

public class Customer {

    private String name;
    private String phoneum;

    public Customer(String Name,String PhonNum)
    {
        name = Name;
        phoneum =  PhonNum;
    }


    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneum;
    }

    public void setName( String Name) {
        name = Name;
    }

    public void setPhoneNum(String PhonNum) {
        phoneum = PhonNum;
    }
}
