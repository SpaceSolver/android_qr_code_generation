package com.example.generate_qr_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

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
        imageView.setImageBitmap(null);
    }

    public void onTestButtonClicked(View view) {
        AssetManager assets = getResources().getAssets();
        try (InputStream istream = assets.open("chuka_ryouriya.png")){
            Bitmap bitmap = BitmapFactory.decodeStream(istream);
            imageView.setImageBitmap(bitmap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
