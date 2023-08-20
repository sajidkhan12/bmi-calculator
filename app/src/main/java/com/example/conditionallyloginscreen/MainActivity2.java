package com.example.conditionallyloginscreen;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    TextView t1,t2;

    Button logout,button;

    SharedPreferences sharedPreferences;

    private  static final String SHARED_PREF_NAME="MyPref";

    private  static final String KEY_NAME="Name";

    private  static final String KEY_NUMBER="Number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1=findViewById(R.id.name);
        t2=findViewById(R.id.number);
        logout=findViewById(R.id.logout);
        button=findViewById(R.id.imagebutton);

        sharedPreferences=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String stringname=sharedPreferences.getString(KEY_NAME,null);

        String stringnumber=sharedPreferences.getString(KEY_NUMBER,null);

        t1.setText(stringname);
        t2.setText(stringnumber);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this, RecyclerActivity.class);
                Toast.makeText(MainActivity2.this, "Fetching Data From InternetResources", Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.clear();
                editor.apply();
                Toast.makeText(MainActivity2.this, "logout successfully", Toast.LENGTH_SHORT).show();
                finish();
                Intent intent=new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity2.this, "Fill all Details", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);

        builder.setMessage("Do you want to exit ?");

        builder.setTitle("Alert !");

        builder.setCancelable(false);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {
              finish();

          }
      });
      builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}