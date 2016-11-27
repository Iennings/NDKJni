package com.example.helloanotherjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView hellojni1;
    private TextView hellojni2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hellojni1 = (TextView) findViewById(R.id.hellojni);
        hellojni2 = (TextView) findViewById(R.id.hellojni2);
        hellojni1.setText(com.example.ienning.hellojni.MainActivity.test());
        hellojni2.setText(TestThirdSo.test());
    }
}
