package com.example.administrator.workrunactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv=(TextView) findViewById(R.id.text3);
        tv.setText(String.format("任务堆栈的ID号是：%d\nActivity实例ID:%s\n", getTaskId(), toString()));
        
    }

    
}
