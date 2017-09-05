package com.example.aggge12.labbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
            NewText(bundle.getString("key"));

    }

    public void NewText(String text)
    {
        TextView text1 = (TextView)findViewById(R.id.textView1);
        text1.setText(text);
    }
}
