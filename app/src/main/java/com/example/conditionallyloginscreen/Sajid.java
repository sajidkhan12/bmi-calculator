package com.example.conditionallyloginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Sajid extends AppCompatActivity {

  TextView t1,t2,t3,t4 ,t5,t6;
  ImageView img;
  Button add;
  String string;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sajid);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);
        add=findViewById(R.id.btn);

        img=findViewById(R.id.img);

        String a=getIntent().getStringExtra("sonu");
        t1.setText(a);
        String b=getIntent().getStringExtra("monu");
        t2.setText(b);
        String c=getIntent().getStringExtra("motu");
        t3.setText(c);


        String image=getIntent().getStringExtra("patlu");
        Picasso.with(this).load(image).into(img);

        int position=getIntent().getIntExtra("id",0);
        if (position==0){
            string="5";
            t5.setText("This self-paced course also includes assessment tests to help you evaluate your growth. So join the ever-growing family of 5 million+ geeks and start learning ..." +
                    "fork() to execute processes from bottom to up using wait() in C++ C++Server Side ProgrammingProgramming. We know that the fork() system call is used to divide the process into two processes. If the function fork() returns 0, then it is child process, and otherwise it is parent process." +
                    "So at first we will use fork() function two times. So it will generate a child process, then from the next fork it will generate another child. After that from the inner fork it will automatically generates a grandchild of them.");
            t6.setText(string);
        } else if (position==1) {
            string="10";
            t5.setText("In this course, you'll learn exactly what scripts are, the components that make up a script, how to use variables in your scripts, how to perform tests and make decisions, how to accept command line arguments, and how to accept input from a user. This course is part of the Linux Administration Bootcamp learning path, designed to get you up and running with Linux." +
                    "Shell scripts are great at automating tasks. If you find yourself running a series of commands to accomplish a given task, and you need to perform that task again in the future, you can and probably should create a shell script for that task. Let's look at a simple shell script. Before you can execute the shell script, make sure that it has the executable bits set. So, we can chmod at 755 for instance.");
            t6.setText(string);

        } else if (position==2) {
            string="15";
            t5.setText("In this course we will understand different data structures and how to use them effectively for solving problems. It is expected that the students have basic experience in any high-level programming language. Data structures and algorithms are a crucial part of programming interviews. This course is a complete course on Complete data structure and algorithms. The main focus here will be mastering the Data structures, implementing those and some problems explaining application of those data structures and understand different programming paradigms, analysis of algorithms and applying different data structures.\n" +
                    "In this course, we will cover the following topics:");
            t6.setText(string);

        } else {
            string="20";
            t5.setText("A good understanding of data structures and algorithms is very crucial for programming interview. After completing this course you should be able to understand which data structures and algorithms should be used to solve a problem and why. It will not only prepare you for your coding interviews, but also make you a better programmer in general.\n" +
                    "\n" +
                    "So, let's start our wonderful journey towards mastering data structures and algorithms.");
            t6.setText(string);
        }

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sajid.this, Laptop.class);
                intent.putExtra("xyz",a);
                intent.putExtra("pqr",b);
                intent.putExtra("abc",image);

                String getttt=t6.getText().toString();
                intent.putExtra("llll",getttt);

                startActivity(intent);
            }
        });

    }
}