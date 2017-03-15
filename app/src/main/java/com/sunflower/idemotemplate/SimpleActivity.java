package com.sunflower.idemotemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SimpleActivity extends AppCompatActivity {

    public static final String EXTRA_TAG = "simple";

    @BindView(R.id.tv_text)
    TextView tv_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        ButterKnife.bind(this);
        Intent intent = getIntent();

        String extraString = intent.getStringExtra(EXTRA_TAG);
        tv_text.setText(TextUtils.isEmpty(extraString) ? "is null" : extraString);
    }
}
