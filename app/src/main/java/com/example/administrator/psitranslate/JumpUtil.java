package com.example.administrator.psitranslate;

import android.content.Context;
import android.content.Intent;

public class JumpUtil {

    public static final void jump(Context context,Class clazz){

        context.startActivity(new Intent(context,clazz));
    }

}
