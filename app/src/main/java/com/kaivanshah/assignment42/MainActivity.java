package com.kaivanshah.assignment42;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lv_Customers;
    private ArrayList<Customer> CustomerColl;
    private MyAdapter oAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_Customers = (ListView) this.findViewById(R.id.lv_Customers);

        CustomerColl = new ArrayList<Customer>();
        CustomerColl.add(new Customer("ABC","1111111111"));
        CustomerColl.add(new Customer("XYZ","2222222222"));
        CustomerColl.add(new Customer("LMN","3333333333"));
        CustomerColl.add(new Customer("PQR","4444444444"));
        CustomerColl.add(new Customer("ABC1","2111111111"));
        CustomerColl.add(new Customer("XYZ1","3222222222"));
        CustomerColl.add(new Customer("LMN1","4333333333"));
        CustomerColl.add(new Customer("PQR1","5444444444"));
        CustomerColl.add(new Customer("ABC2","3111111111"));
        CustomerColl.add(new Customer("XYZ2","4222222222"));
        CustomerColl.add(new Customer("LMN2","5333333333"));
        CustomerColl.add(new Customer("PQR2","6444444444"));
        CustomerColl.add(new Customer("ABC3","4111111111"));
        CustomerColl.add(new Customer("XYZ3","5222222222"));
        CustomerColl.add(new Customer("LMN3","6333333333"));
        CustomerColl.add(new Customer("PQR3","7444444444"));

        oAdapter = new MyAdapter(CustomerColl.size(), this, CustomerColl);
        lv_Customers.setAdapter(oAdapter);

    }
}
