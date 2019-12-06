package com.example.danhb.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.danhb.R;
import com.example.danhb.moldue.Contact;

import java.util.ArrayList;


public class ContactAdapter extends ArrayAdapter<Contact> {

    private  Context context;
    private  int resource;
    private ArrayList<Contact> arrContact;
    public ContactAdapter(Context context, int resource, ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.arrContact= objects;
    }



    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.danhba, parent, false);
            viewHolder= new ViewHolder();
            viewHolder.imgAvt= convertView.findViewById(R.id.imgAvatar);
            viewHolder.tvName= convertView.findViewById(R.id.tvName);
            viewHolder.tvNumber= convertView.findViewById(R.id.tvNumber);

            convertView.setTag(viewHolder);

        }
        else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        Contact contact= arrContact.get(position);
        viewHolder.tvNumber.setText(contact.getmNumber());
        viewHolder.tvName.setText(contact.getmName());
        if(contact.getmGioiTinh()==1){
            viewHolder.imgAvt.setBackgroundResource(R.drawable.images);
        }
        else
            viewHolder.imgAvt.setBackgroundResource(R.drawable.girl);
        return convertView;
    }

    public  class  ViewHolder{
        ImageView imgAvt;
        TextView tvName,tvNumber;
    }

}
