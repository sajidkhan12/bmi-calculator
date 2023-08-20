package com.example.conditionallyloginscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Laptop extends AppCompatActivity {

    ArrayList<Model> arrayList;
    ListView listView;
    TextView orderplaced;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);
        arrayList = new ArrayList<>();

        listView = findViewById(R.id.lv);


         String p=getIntent().getStringExtra("xyz");
         String q=getIntent().getStringExtra("pqr");
         String m=getIntent().getStringExtra("abc");

         String l=getIntent().getStringExtra("llll");
        arrayList.add(new Model(p,q,m,l));

        MyAdapter adapter=new MyAdapter(Laptop.this,arrayList);

        listView.setAdapter(adapter);


    }
}