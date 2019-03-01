package com.example.administrator.psitranslate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class HomeActivity extends Activity {

    @BindView(R.id.user_layout)
    LinearLayout userLayout;
    @BindView(R.id.security_layout)
    LinearLayout securityLayout;
    @BindView(R.id.developer_layout)
    LinearLayout developerLayout;
    @BindView(R.id.busy_layout)
    LinearLayout busyLayout;
    @BindView(R.id.knowledge_layout)
    LinearLayout knowledgeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home_activity);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.user_layout, R.id.security_layout, R.id.developer_layout, R.id.busy_layout, R.id.knowledge_layout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.user_layout:
                break;
            case R.id.security_layout:
                break;
            case R.id.developer_layout:
                break;
            case R.id.busy_layout:
                break;
            case R.id.knowledge_layout:
                break;
        }
    }
}
