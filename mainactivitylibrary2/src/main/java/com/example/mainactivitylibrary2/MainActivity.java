package com.example.mainactivitylibrary2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.messageprovider.MessageProvider;
import com.example.mylibrary.Toaster;

public class MainActivity extends AppCompatActivity {

    private TextView tv_test;
    static {
        System.loadLibrary("native-lib");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_test = (TextView) findViewById(R.id.tv_test);
        tv_test.setText(stringFromJNI());
        System.out.println(stringFromJNI());

    }
    public native String stringFromJNI();

    @Override
    protected void onResume() {
        super.onResume();

        String message = new MessageProvider(1).getMessage();
        Toaster.showToast(this, message);
    }
}
