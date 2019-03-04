package com.example.administrator.psitranslate.glossary.holder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;

import com.example.administrator.psitranslate.R;
import com.example.administrator.psitranslate.holder.BaseHolder;

import butterknife.ButterKnife;

/**
 *  生态系统
 */
public class EcoSystemHolder extends BaseHolder<Object> {
    public EcoSystemHolder(Context context) {
        super(context);
    }

    @NonNull
    @Override
    protected View initView(Context context) {
        mRootView = LayoutInflater.from(context).inflate(R.layout.activity_glossary_ecosystem_holder,null);
        ButterKnife.bind(this,mRootView);
        return mRootView;
    }

    @Override
    protected void updateUI(Context context, Object data) {

    }
}
