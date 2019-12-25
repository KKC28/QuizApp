package com.example.mt19124_quaestio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MT19124_A3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt19124__a3);
        ((TextView) findViewById(R.id.textView21)).setText(getString(R.string.yourans) + "    " + getIntent().getExtras().getString(getString(R.string.Ans1)));
        if (getIntent().getExtras().getString(getString(R.string.Ans1)).equals(getString(R.string.ans1)))
            ((TextView) findViewById(R.id.textView21)).setTextColor(getResources().getColor(R.color.colorPrimary));
        else
            ((TextView) findViewById(R.id.textView21)).setTextColor(getResources().getColor(R.color.colorAccent));
        ((TextView) findViewById(R.id.textView31)).setText(getString(R.string.expect) + "    " + getString(R.string.ans1));


        ((TextView) findViewById(R.id.textView22)).setText(getString(R.string.yourans) + "    " + getIntent().getExtras().getString(getString(R.string.Ans2)));
        if (getIntent().getExtras().getString(getString(R.string.Ans2)).equals(getString(R.string.ans2)))
            ((TextView) findViewById(R.id.textView22)).setTextColor(getResources().getColor(R.color.colorPrimary));
        else
            ((TextView) findViewById(R.id.textView22)).setTextColor(getResources().getColor(R.color.colorAccent));
        ((TextView) findViewById(R.id.textView32)).setText(getString(R.string.expect) + "    " + getString(R.string.ans2));


        ((TextView) findViewById(R.id.textView23)).setText(getString(R.string.yourans) + "    " + getIntent().getExtras().getString(getString(R.string.Ans3)));
        if (getIntent().getExtras().getString(getString(R.string.Ans3)).equals(getString(R.string.ans3)))
            ((TextView) findViewById(R.id.textView23)).setTextColor(getResources().getColor(R.color.colorPrimary));
        else
            ((TextView) findViewById(R.id.textView23)).setTextColor(getResources().getColor(R.color.colorAccent));
        ((TextView) findViewById(R.id.textView33)).setText(getString(R.string.expect) + "    " + getString(R.string.ans3));

        ((TextView) findViewById(R.id.textView24)).setText(getString(R.string.yourans) + "    " + getIntent().getExtras().getString(getString(R.string.Ans4)));
        if (getIntent().getExtras().getString(getString(R.string.Ans4)).equals(getString(R.string.ans4)))
            ((TextView) findViewById(R.id.textView24)).setTextColor(getResources().getColor(R.color.colorPrimary));
        else
            ((TextView) findViewById(R.id.textView24)).setTextColor(getResources().getColor(R.color.colorAccent));
        ((TextView) findViewById(R.id.textView34)).setText(getString(R.string.expect) + "    " + getString(R.string.ans4));


        ((TextView) findViewById(R.id.textView25)).setText(getString(R.string.yourans) + "    " + getIntent().getExtras().getString(getString(R.string.Ans5)));
        if (getIntent().getExtras().getString(getString(R.string.Ans5)).equals(getString(R.string.ans5)))
            ((TextView) findViewById(R.id.textView25)).setTextColor(getResources().getColor(R.color.colorPrimary));
        else
            ((TextView) findViewById(R.id.textView25)).setTextColor(getResources().getColor(R.color.colorAccent));
        ((TextView) findViewById(R.id.textView35)).setText(getString(R.string.expect) + "    " + getString(R.string.ans5));


        ((TextView) findViewById(R.id.textView26)).setText(getString(R.string.yourans) + "    " + getIntent().getExtras().getString(getString(R.string.Ans6)));
        if (getIntent().getExtras().getString(getString(R.string.Ans6)).equals(getString(R.string.ans6)))
            ((TextView) findViewById(R.id.textView26)).setTextColor(getResources().getColor(R.color.colorPrimary));
        else
            ((TextView) findViewById(R.id.textView26)).setTextColor(getResources().getColor(R.color.colorAccent));
        ((TextView) findViewById(R.id.textView36)).setText(getString(R.string.expect) + "    " + getString(R.string.ans6));


        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MT19124_A1.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra(getString(R.string.ex), true);
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
