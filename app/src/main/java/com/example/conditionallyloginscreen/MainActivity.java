package com.example.conditionallyloginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    @SuppressWarnings("unused")
    private  static final String SHARED_PREF_NAME="MyPref";
    @SuppressWarnings("unused")
    private  static final String KEY_NAME="Name";
    @SuppressWarnings("unused")
    private  static final String KEY_NUMBER="Number";

    Button b1,b2;
    EditText ed1,ed2;

    TextView tx1;
    int counter = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);

        b2 = (Button)findViewById(R.id.button2);
        tx1 = (TextView)findViewById(R.id.textView3);
        tx1.setVisibility(View.GONE);


        sharedPreferences=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
        @SuppressWarnings("unused")
        SharedPreferences.Editor editor= sharedPreferences.edit();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    editor.putString(KEY_NAME,ed1.getText().toString());
                    editor.putString(KEY_NUMBER,ed2.getText().toString());
                    editor.commit();
                    Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),
                            "Redirecting..Log in Successfully", Toast.LENGTH_SHORT).show();


                }
                else if (ed1.getText().length()==0 ) {
                    ed1.setError("Enter first name");

                } else if (ed2.getText().length()==0) {
                    ed2.setError("Enter last name");

                } else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        b1.setEnabled(false);
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}