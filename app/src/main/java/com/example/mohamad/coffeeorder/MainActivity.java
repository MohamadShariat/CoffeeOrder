package com.example.mohamad.coffeeorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count=1;
    }
    public void afzayesh_click(View view){
        afzayesh();
        disply();

    }



    private void afzayesh() {
        if(count<20)
            count++;
    }
    public void kahesh_click(View view){
        kahesh();
        disply();
    }

    private void kahesh() {
        if(count>1)
            count--;
    }

    private void disply() {
        TextView coontTextView=(TextView)findViewById(R.id.count);
        coontTextView.setText(String.valueOf(count));
    }
}
