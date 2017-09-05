package com.example.aggge12.labbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nav(View view)
    {
        EditText userText = (EditText)findViewById(R.id.editText2);

        Intent intent = new Intent(this, Main2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putString("key",userText.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }


}
