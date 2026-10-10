package com.pwd.documents;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titleView = findViewById(R.id.title);
        TextView contentView = findViewById(R.id.content);

        titleView.setText("PWD Documents");
        contentView.setText("PDF Words Documentos\n\nA simple Android app for PWD text documents.\n\nVersion: 1.0\nStatus: Demo template");
    }
}
