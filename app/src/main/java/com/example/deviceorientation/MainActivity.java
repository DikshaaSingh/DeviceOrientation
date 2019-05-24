package com.example.deviceorientation;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et,et1,et2,et3;
Button btn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.email1);
        et1=findViewById(R.id.pass1);
        et2=findViewById(R.id.email);
        et3=findViewById(R.id.pass);





    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        et2.setText(savedInstanceState.getString("email"));
        et3.setText(savedInstanceState.getString("pass"));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("email",et.getText().toString());
        outState.putString("pass1",et1.getText().toString());
    }
}
