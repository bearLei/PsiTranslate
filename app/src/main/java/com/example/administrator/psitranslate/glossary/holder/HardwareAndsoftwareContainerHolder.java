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

public class HardwareAndsoftwareContainerHolder extends BaseHolder<Object> {

    @BindView(R.id.Glossary_acty_hardware_holder_models)
    TextView GlossaryActyHardwareHolderModels;
    @BindView(R.id.Glossary_acty_hardware_and_software_board)
    TextView GlossaryActyHardwareAndSoftwareBoard;

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

    @OnClick({R.id.Glossary_acty_hardware_holder_models, R.id.Glossary_acty_hardware_and_software_board})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Glossary_acty_hardware_holder_models:
                break;
            case R.id.Glossary_acty_hardware_and_software_board:
                break;
        }
    }
}
