package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button rt;
private TextView rr;
private EditText rrr, tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rt = findViewById(R.id.rt);
        rr = findViewById(R.id.rr);
        rrr = findViewById(R.id.rrr);
        tt = findViewById(R.id.tt);

        rt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rrr.getVisibility() == View.VISIBLE) {
                    rrr.setVisibility(View.GONE);
                } else {
                    rrr.setVisibility(View.VISIBLE);
                }
                if (tt.getVisibility() == View.VISIBLE) {
                    tt.setVisibility(View.GONE);
                } else {
                    tt.setVisibility(View.VISIBLE);
                }
                if (rr.getVisibility() == View.VISIBLE) {
                    rr.setVisibility(View.GONE);
                } else {
                    rr.setVisibility(View.VISIBLE);
                }
                Toast toast = new Toast(MainActivity.this);
                String text = rrr.getText().toString();
                if (text.isEmpty()) {
                    toast.setText("Введите данные");
                } else {
                    toast.setText("Вы успешно зарегистрировались");
                }
                toast.show();
            }
        });
    }
}