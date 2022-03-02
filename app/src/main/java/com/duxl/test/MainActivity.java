package com.duxl.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.duxl.test.annotation.BindView;

/**
 * APT基数：参考 https://www.jianshu.com/p/7af58e8e3e18
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_text)
    TextView mTvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindViewTools.bind(this);
        mTvText.setText("Hello APT");
    }
}