package com.samsung.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView v = findViewById(R.id.textView);
int IDS [] = {
       R.id.textView0,
       R.id.textView1,
       R.id.textView2,
       R.id.textView3,
       R.id.textView4,
       R.id.textView5,
       R.id.textView6,
       R.id.textView7,
       R.id.textView8,
       R.id.textView9,
       R.id.textViewMin,
       R.id.textViewPl,
       R.id.textViewEq,
       R.id.textViewPo,
       R.id.textViewMul,
       R.id.textViewDevide,
       R.id.textViewPlMin,
       R.id.textViewAC,
       R.id.textViewPer

 };
 TextView textViewArray [] = new TextView[IDS.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i = 0 ; i < textViewArray.length ; i++){
            textViewArray[i] = findViewById(IDS[i]);
            textViewArray[i].setOnClickListener( this);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.textView1:v.setText(v.getText()+"1"); ;break;
            case R.id.textView2:v.setText(v.getText()+"2"); ;break;
            case R.id.textView3:v.setText(v.getText()+"3"); ;break;
            case R.id.textView4:v.setText(v.getText()+"4"); ;break;
            case R.id.textView5:v.setText(v.getText()+"5"); ;break;
            case R.id.textView6:v.setText(v.getText()+"6"); ;break;
            case R.id.textView7:v.setText(v.getText()+"7"); ;break;
            case R.id.textView8:v.setText(v.getText()+"8"); ;break;
            case R.id.textView9:v.setText(v.getText()+"9"); ;break;
        }
    }

}