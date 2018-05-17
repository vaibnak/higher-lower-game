package com.example.dell.higher_lower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
  int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   newran();

    }

 void newran(){
     Random randy = new Random();
     num = randy.nextInt(100);

 }
public void lock(View view){

    EditText ed = (EditText)findViewById(R.id.editText);
   int val =Integer.parseInt(ed.getText().toString());

   if(val == num){
       Toast.makeText(this, "correctly guessed", Toast.LENGTH_SHORT).show();
   newran();
   }

   else if(val < num){
        Toast.makeText(this, "Go higher , Boy", Toast.LENGTH_SHORT).show();
    }

    else if(val > num){
        Toast.makeText(this, "Go lower , Boy", Toast.LENGTH_SHORT).show();
    }
}
}
