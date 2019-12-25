package com.example.mt19124_quaestio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MT19124_A2 extends AppCompatActivity {
    String ques;
    String arr[]=new String[7];
    String STATE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ques=getString(R.string.yes);
        STATE=getString(R.string.st);
        super.onCreate(savedInstanceState);
        if(savedInstanceState!=null)
        {
            ques=savedInstanceState.getString(STATE);
        }
        setContentView(R.layout.mt19124__a2);

        TextView textView = findViewById(R.id.textView);
        textView.setText(getString(R.string.welcome) +" " +getIntent().getExtras().getString(getString(R.string.value)).toUpperCase());

        Toast.makeText(getApplicationContext(), ques+getString(R.string.left), Toast.LENGTH_SHORT).show();

        Button button = findViewById(R.id.submit_a1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkAllRadioButton()) {
                     Intent intent = new Intent(getApplicationContext(), MT19124_A4.class);
                     int score=total();
                    intent.putExtra(getString(R.string.value1),Integer.toString(score));
                    intent.putExtra(getString(R.string.Ans1),arr[1]);
                    intent.putExtra(getString(R.string.Ans2),arr[2]);
                    intent.putExtra(getString(R.string.Ans3),arr[3]);
                    intent.putExtra(getString(R.string.Ans4),arr[4]);
                    intent.putExtra(getString(R.string.Ans5),arr[5]);
                    intent.putExtra(getString(R.string.Ans6),arr[6]);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), getString(R.string.mandate), Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

    @Override
    public void onBackPressed()
    {
        //Do nothing
    }

    public boolean checkAllRadioButton() {
        RadioGroup r1 = findViewById(R.id.ques1);
        RadioGroup r2 = findViewById(R.id.ques2);
        RadioGroup r3 = findViewById(R.id.ques3);
        RadioGroup r4 = findViewById(R.id.ques4);
        RadioGroup r5 = findViewById(R.id.ques5);
        RadioGroup r6 = findViewById(R.id.ques6);
        if (r1.getCheckedRadioButtonId() == -1 || r2.getCheckedRadioButtonId() == -1 || r3.getCheckedRadioButtonId() == -1 || r4.getCheckedRadioButtonId() == -1 || r5.getCheckedRadioButtonId() == -1 || r6.getCheckedRadioButtonId() == -1)
            return false;
        else
            return true;
    }

    public void checkRadioButton(View view) {
        Toast.makeText(this, getString(R.string.record), Toast.LENGTH_SHORT).show();
        if(checkAllRadioButton()) {
            Toast.makeText(getApplicationContext(), getString(R.string.sub), Toast.LENGTH_SHORT).show();
            ques=getString(R.string.no);
        }
    }

    public int total() {
        int score=0;
        RadioGroup r1 = findViewById(R.id.ques1);
        RadioGroup r2 = findViewById(R.id.ques2);
        RadioGroup r3 = findViewById(R.id.ques3);
        RadioGroup r4 = findViewById(R.id.ques4);
        RadioGroup r5 = findViewById(R.id.ques5);
        RadioGroup r6 = findViewById(R.id.ques6);

        String s1=((RadioButton)(findViewById(r1.getCheckedRadioButtonId()))).getText().toString();
        arr[1]=s1;
        String s2=((RadioButton)(findViewById(r2.getCheckedRadioButtonId()))).getText().toString();
        arr[2]=s2;
        String s3=((RadioButton)(findViewById(r3.getCheckedRadioButtonId()))).getText().toString();
        arr[3]=s3;
        String s4=((RadioButton)(findViewById(r4.getCheckedRadioButtonId()))).getText().toString();
        arr[4]=s4;
        String s5=((RadioButton)(findViewById(r5.getCheckedRadioButtonId()))).getText().toString();
        arr[5]=s5;
        String s6=((RadioButton)(findViewById(r6.getCheckedRadioButtonId()))).getText().toString();
        arr[6]=s6;



        if(s1.equalsIgnoreCase(getString(R.string.ans1)))
        {
            score++;
        }
        if(s2.equalsIgnoreCase(getString(R.string.ans2)))
        {
            score++;
        }
        if(s3.equalsIgnoreCase(getString(R.string.ans3))) {
            score++;
        }

        if(s4.equalsIgnoreCase(getString(R.string.ans4)))
        {
            score++;
        }
        if(s5.equalsIgnoreCase(getString(R.string.ans5)))
        {
            score++;
        }
        if(s6.equalsIgnoreCase(getString(R.string.ans6)))
        {
            score++;
        }
        return score;
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        savedInstanceState.putString(STATE,ques);
        super.onSaveInstanceState(savedInstanceState);
    }
}