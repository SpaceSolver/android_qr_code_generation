package com.example.generate_qr_code;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView codeText;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        codeText = (TextView)findViewById(R.id.CodeTextView);
        imageView = (ImageView) findViewById(R.id.CodeImageView);
    }

    public void onGenerateButtonClicked(View view) {
    }

    public void onResetButtonClicked(View view) {
        codeText.setText(R.string.default_text_code);
    }

    public void onTestButtonClicked(View view) {
    }
}
