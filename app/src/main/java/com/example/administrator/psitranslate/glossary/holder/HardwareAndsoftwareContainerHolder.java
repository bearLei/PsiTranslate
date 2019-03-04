package com.example.administrator.psitranslate.glossary.holder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.psitranslate.JumpUtil;
import com.example.administrator.psitranslate.R;
import com.example.administrator.psitranslate.glossary.BoardActivity;
import com.example.administrator.psitranslate.glossary.ModelActivity;
import com.example.administrator.psitranslate.glossary.WalletIntroduceActivity;
import com.example.administrator.psitranslate.holder.BaseHolder;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HardwareAndsoftwareContainerHolder extends BaseHolder<Object> {

    @BindView(R.id.Glossary_acty_hardware_holder_models)
    TextView GlossaryActyHardwareHolderModels;
    @BindView(R.id.Glossary_acty_hardware_and_software_board)
    TextView GlossaryActyHardwareAndSoftwareBoard;
    @BindView(R.id.Glossary_acty_hardware_and_software_android)
    TextView GlossaryActyHardwareAndSoftwareAndroid;
    @BindView(R.id.Glossary_acty_hardware_and_software_ios)
    TextView GlossaryActyHardwareAndSoftwareIos;

    public HardwareAndsoftwareContainerHolder(Context context) {
        super(context);
    }

    @NonNull
    @Override
    protected View initView(Context context) {
        mRootView = LayoutInflater.from(context).inflate(R.layout.activity_glossary_hardware_and_software_holder, null);
        ButterKnife.bind(this, mRootView);
        return mRootView;
    }

    @Override
    protected void updateUI(Context context, Object data) {

    }


    @OnClick({R.id.Glossary_acty_hardware_holder_overview,R.id.Glossary_acty_hardware_holder_models, R.id.Glossary_acty_hardware_and_software_board, R.id.Glossary_acty_hardware_and_software_android, R.id.Glossary_acty_hardware_and_software_ios})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Glossary_acty_hardware_holder_overview:
                JumpUtil.jump(mContext,WalletIntroduceActivity.class);
                break;
            case R.id.Glossary_acty_hardware_holder_models:
                JumpUtil.jump(mContext,ModelActivity.class);
                break;
            case R.id.Glossary_acty_hardware_and_software_board:
                JumpUtil.jump(mContext,BoardActivity.class);
                break;
            case R.id.Glossary_acty_hardware_and_software_android:
                break;
            case R.id.Glossary_acty_hardware_and_software_ios:
                break;
        }
    }
}
