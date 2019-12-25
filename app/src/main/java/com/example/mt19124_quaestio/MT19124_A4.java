package com.example.mt19124_quaestio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MT19124_A4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt19124__a4);
        TextView textView = findViewById(R.id.textView2);
        int state=Integer.parseInt(getIntent().getExtras().getString(getString(R.string.value1)));
        if(state==0)
            textView.setText(R.string.better);
        else if(state<=2)
            textView.setText(R.string.good);
        else if(state>2 && state<=4)
            textView.setText(R.string.awesome);
        else if(state>4)
            textView.setText(R.string.excellent);
        RatingBar ratingBar=findViewById(R.id.ratingBar);
        ratingBar.setRating(Float.parseFloat(getIntent().getExtras().getString(getString(R.string.value1))));
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), MT19124_A3.class);
                String arr[]=new String[7];
                arr[1]=getIntent().getExtras().getString(getString(R.string.Ans1));
                arr[2]=getIntent().getExtras().getString(getString(R.string.Ans2));
                arr[3]=getIntent().getExtras().getString(getString(R.string.Ans3));
                arr[4]=getIntent().getExtras().getString(getString(R.string.Ans4));
                arr[5]=getIntent().getExtras().getString(getString(R.string.Ans5));
                arr[6]=getIntent().getExtras().getString(getString(R.string.Ans6));
                intent.putExtra(getString(R.string.Ans1),arr[1]);
                intent.putExtra(getString(R.string.Ans2),arr[2]);
                intent.putExtra(getString(R.string.Ans3),arr[3]);
                intent.putExtra(getString(R.string.Ans4),arr[4]);
                intent.putExtra(getString(R.string.Ans5),arr[5]);
                intent.putExtra(getString(R.string.Ans6),arr[6]);
                    startActivity(intent);
            }

        });

    }
    @Override
    public void onBackPressed()
    {
        //Do nothing
    }
}
