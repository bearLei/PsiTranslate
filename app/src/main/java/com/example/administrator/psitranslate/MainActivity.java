package com.example.administrator.psitranslate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.home_layout)
    RelativeLayout homeLayout;
    @BindView(R.id.user_title)
    TextView userTitle;
    @BindView(R.id.user_sub_title_01)
    TextView userSubTitle01;
    @BindView(R.id.user_sub_title_02)
    TextView userSubTitle02;
    @BindView(R.id.user_layout)
    RelativeLayout userLayout;
    @BindView(R.id.developer_title)
    TextView developerTitle;
    @BindView(R.id.developer_sub_title)
    TextView developerSubTitle;
    @BindView(R.id.developer_layout)
    RelativeLayout developerLayout;
    @BindView(R.id.security_layout)
    RelativeLayout securityLayout;
    @BindView(R.id.parterner_layout)
    RelativeLayout parternerLayout;
    @BindView(R.id.feedback_layout)
    RelativeLayout feedbackLayout;
    @BindView(R.id.linked_layout)
    RelativeLayout linkedLayout;
    @BindView(R.id.shop_layout)
    RelativeLayout shopLayout;
    @BindView(R.id.support_layout)
    RelativeLayout supportLayout;
    @BindView(R.id.trezor_layout)
    RelativeLayout trezorLayout;
    @BindView(R.id.wallet_layout)
    RelativeLayout walletLayout;
    @BindView(R.id.blog_layout)
    RelativeLayout blogLayout;
    @BindView(R.id.twitter_layout)
    RelativeLayout twitterLayout;
    @BindView(R.id.facebook_layout)
    RelativeLayout facebookLayout;
    @BindView(R.id.reddit_layout)
    RelativeLayout redditLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.home_layout, R.id.user_title, R.id.user_sub_title_01, R.id.user_sub_title_02, R.id.user_layout, R.id.developer_title, R.id.developer_sub_title, R.id.developer_layout, R.id.security_layout, R.id.parterner_layout, R.id.feedback_layout, R.id.linked_layout, R.id.shop_layout, R.id.support_layout, R.id.trezor_layout, R.id.wallet_layout, R.id.blog_layout, R.id.twitter_layout, R.id.facebook_layout, R.id.reddit_layout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.home_layout:
                JumpUtil.jump(this,HomeActivity.class);
                break;
            case R.id.user_title:
                break;
            case R.id.user_sub_title_01:
                break;
            case R.id.user_sub_title_02:
                break;
            case R.id.user_layout:
                break;
            case R.id.developer_title:
                break;
            case R.id.developer_sub_title:
                break;
            case R.id.developer_layout:
                break;
            case R.id.security_layout:
                break;
            case R.id.parterner_layout:
                break;
            case R.id.feedback_layout:
                break;
            case R.id.linked_layout:
                break;
            case R.id.shop_layout:
                break;
            case R.id.support_layout:
                break;
            case R.id.trezor_layout:
                break;
            case R.id.wallet_layout:
                break;
            case R.id.blog_layout:
                break;
            case R.id.twitter_layout:
                break;
            case R.id.facebook_layout:
                break;
            case R.id.reddit_layout:
                break;
        }
    }
}
