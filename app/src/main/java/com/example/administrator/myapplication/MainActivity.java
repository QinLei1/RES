package com.example.administrator.myapplication;

import android.media.JetPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private String TEXT = "sssssssssssssssssssssssssssssss";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String key = AesUtil.generateKey();
        String encrypt = AesUtil.encrypt(key, TEXT);

        Log.e(TAG,"加密前的数据:"+TEXT);
        Log.e(TAG,"加密后的数据:"+encrypt);
        String decrypt = AesUtil.decrypt(key, encrypt);
        Log.e(TAG,"解密后的数据:"+decrypt);
    }
}
