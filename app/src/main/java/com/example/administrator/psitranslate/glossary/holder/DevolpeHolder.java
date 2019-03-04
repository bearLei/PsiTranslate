package com.example.administrator.psitranslate.glossary.holder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.psitranslate.R;
import com.example.administrator.psitranslate.holder.BaseHolder;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DevolpeHolder extends BaseHolder<Object> {
    @BindView(R.id.Glossary_acty_development_Overview)
    TextView GlossaryActyDevelopmentOverview;
    @BindView(R.id.Glossary_acty_development_Security_privacy)
    TextView GlossaryActyDevelopmentSecurityPrivacy;
    @BindView(R.id.Glossary_acty_development_Changelogs)
    TextView GlossaryActyDevelopmentChangelogs;
    @BindView(R.id.Glossart_acty_develope_coins_btc)
    TextView GlossartActyDevelopeCoinsBtc;
    @BindView(R.id.Glossart_acty_develope_coins_eth)
    TextView GlossartActyDevelopeCoinsEth;
    @BindView(R.id.Glossart_acty_develope_coins_erc20)
    TextView GlossartActyDevelopeCoinsErc20;
    @BindView(R.id.Glossart_acty_develope_coins_eos)
    TextView GlossartActyDevelopeCoinsEos;

    public DevolpeHolder(Context context) {
        super(context);
    }

    @NonNull
    @Override
    protected View initView(Context context) {
        mRootView = LayoutInflater.from(context).inflate(R.layout.activity_glossary_develop_holder, null);
        ButterKnife.bind(this.mRootView);
        return mRootView;
    }

    @Override
    protected void updateUI(Context context, Object data) {

    }

    @OnClick({R.id.Glossary_acty_development_Overview, R.id.Glossary_acty_development_Security_privacy, R.id.Glossary_acty_development_Changelogs, R.id.Glossart_acty_develope_coins_btc, R.id.Glossart_acty_develope_coins_eth, R.id.Glossart_acty_develope_coins_erc20, R.id.Glossart_acty_develope_coins_eos})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Glossary_acty_development_Overview:
                break;
            case R.id.Glossary_acty_development_Security_privacy:
                break;
            case R.id.Glossary_acty_development_Changelogs:
                break;
            case R.id.Glossart_acty_develope_coins_btc:
                break;
            case R.id.Glossart_acty_develope_coins_eth:
                break;
            case R.id.Glossart_acty_develope_coins_erc20:
                break;
            case R.id.Glossart_acty_develope_coins_eos:
                break;
        }
    }
}
