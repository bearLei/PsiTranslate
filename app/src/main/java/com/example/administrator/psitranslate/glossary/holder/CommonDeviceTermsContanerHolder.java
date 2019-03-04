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

public class CommonDeviceTermsContanerHolder extends BaseHolder<Object> {

    @BindView(R.id.Glossary_acty_Common_device_terms_Operating_systems)
    TextView GlossaryActyCommonDeviceTermsOperatingSystems;
    @BindView(R.id.Glossary_acty_Common_device_terms_Supported_cryptocurrencies)
    TextView GlossaryActyCommonDeviceTermsSupportedCryptocurrencies;
    @BindView(R.id.Glossary_acty_Common_device_terms_Psi_Wallet)
    TextView GlossaryActyCommonDeviceTermsPsiWallet;
    @BindView(R.id.Glossary_acty_Common_device_terms_Compatibility)
    TextView GlossaryActyCommonDeviceTermsCompatibility;
    @BindView(R.id.Glossary_acty_Common_device_terms_android)
    TextView GlossaryActyCommonDeviceTermsAndroid;
    @BindView(R.id.Glossary_acty_Common_device_terms_ChromeOS)
    TextView GlossaryActyCommonDeviceTermsChromeOS;
    @BindView(R.id.Glossary_acty_Common_device_terms_ios)
    TextView GlossaryActyCommonDeviceTermsIos;
    @BindView(R.id.Glossary_acty_Common_device_terms_Linux)
    TextView GlossaryActyCommonDeviceTermsLinux;
    @BindView(R.id.Glossary_acty_Common_device_terms_macos)
    TextView GlossaryActyCommonDeviceTermsMacos;
    @BindView(R.id.Glossary_acty_Common_device_terms_Windows)
    TextView GlossaryActyCommonDeviceTermsWindows;
    @BindView(R.id.Glossary_acty_Common_device_terms_Windows_Phone)
    TextView GlossaryActyCommonDeviceTermsWindowsPhone;
    @BindView(R.id.Glossary_acty_Common_device_terms_Wallet_components)
    TextView GlossaryActyCommonDeviceTermsWalletComponents;
    @BindView(R.id.Glossary_acty_Common_device_terms_Passphrase)
    TextView GlossaryActyCommonDeviceTermsPassphrase;
    @BindView(R.id.Glossary_acty_Common_device_terms_Recovery_seed)
    TextView GlossaryActyCommonDeviceTermsRecoverySeed;
    @BindView(R.id.Glossary_acty_Common_device_terms_Protection_personalization)
    TextView GlossaryActyCommonDeviceTermsProtectionPersonalization;
    @BindView(R.id.Glossary_acty_Common_device_terms_name)
    TextView GlossaryActyCommonDeviceTermsName;
    @BindView(R.id.Glossary_acty_Common_device_terms_pin)
    TextView GlossaryActyCommonDeviceTermsPin;

    public CommonDeviceTermsContanerHolder(Context context) {
        super(context);
    }

    @NonNull
    @Override
    protected View initView(Context context) {
        mRootView = LayoutInflater.from(context).inflate(R.layout.activity_glossary_common_device_terms, null);
        ButterKnife.bind(this,mRootView);
        return mRootView;
    }

    @Override
    protected void updateUI(Context context, Object data) {

    }
}
