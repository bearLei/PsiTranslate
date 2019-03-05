package com.example.administrator.psitranslate.glossary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.administrator.psitranslate.R;

public class CoinActivity extends AppCompatActivity {

    public static final int Btc = 111;
    public static final int ETH = 222;
    public static final int EOS = 333;
    public static final int Erc20 = 444;

    private TextView describe,title;
    private int type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin);
        title = findViewById(R.id.title);
        describe = findViewById(R.id.describe);
        parseIntent();
    }

    private void parseIntent(){
        if (getIntent() != null){
            type = getIntent().getIntExtra("type",0);
        }
        switch (type){
            case Btc:
                title.setText(this.getResources().getString(R.string.Develope_Coin_btc_title));
                describe.setText(this.getResources().getString(R.string.Develope_Coin_btc));
                break;
            case ETH:
                title.setText(this.getResources().getString(R.string.Develope_Coin_eth_title));
                describe.setText(this.getResources().getString(R.string.Develope_Coin_eth));
                break;
            case Erc20:
                title.setText(this.getResources().getString(R.string.Develope_Coin_erc20_title));
                describe.setText(this.getResources().getString(R.string.Develope_Coin_erc20));
                break;
            case EOS:
                title.setText(this.getResources().getString(R.string.Develope_Coin_eos_title));
                describe.setText(this.getResources().getString(R.string.Develope_Coin_eos));
                break;
        }
    }
}
