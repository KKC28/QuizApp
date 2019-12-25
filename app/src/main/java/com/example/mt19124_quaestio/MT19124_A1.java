package com.example.mt19124_quaestio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MT19124_A1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (getIntent().getBooleanExtra(getString(R.string.ex), false)) {
            finish();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt19124__a1);
        Button button = findViewById(R.id.start);
        final EditText editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editText.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),getString(R.string.welcome) +" "+editText.getText(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), MT19124_A2.class);
                    intent.putExtra(getString(R.string.value),editText.getText().toString());
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), getString(R.string.name), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
