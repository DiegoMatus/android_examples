package com.example.diego.codigofacilito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = (TextView) findViewById(R.id.text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras != null){
            text.setText(extras.getString("DATO"));
        }

    }
}
