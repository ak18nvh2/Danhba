package com.example.danhb;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.danhb.adapter.ContactAdapter;
import com.example.danhb.moldue.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private EditText edtName, edtNumber;
private RadioButton rbtnMale, rbtnFemale;
private Button btnAdd;
private ListView lvContact;
private  ContactAdapter ad;
private ArrayList<Contact> arrContac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        arrContac= new ArrayList<>();
        ad= new ContactAdapter(this, R.layout.danhba, arrContac);

        lvContact.setAdapter(ad);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showDiaLog();
            }
        });
    }

    public  void init(){
        edtName= findViewById(R.id.edtName);
        edtNumber= findViewById(R.id.edtNumber);
        rbtnFemale= findViewById(R.id.rbtnFemale);
        rbtnMale= findViewById(R.id.rbtnMale);
        btnAdd= findViewById(R.id.btnAdd);

        lvContact= findViewById(R.id.lvContact);

    }

    public void adđContact(View view) {
        if(view.getId()==R.id.btnAdd){
            String name= edtName.getText().toString();
            String number= edtNumber.getText().toString();
            int gt;
            if(rbtnFemale.isChecked()){
                gt=0;
            }
            else
                gt=1;
            Contact x=new Contact(gt,name,number);
            arrContac.add(x);
        }
        ad.notifyDataSetChanged();
    }
    public  void showDiaLog(){
        Dialog dialog= new Dialog(this);
        dialog.setContentView(R.layout.dialog);
        dialog.show();
        Button btnCall= dialog.findViewById(R.id.btnCall);
        Button btnMess= dialog.findViewById(R.id.btnMess);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Call", Toast.LENGTH_SHORT).show();
            }
        });
        btnMess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Messeage", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
