package com.example.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText pass;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkData();
            }
        });
    }

    void checkData() {
        if ( !(email.getText().toString().equals("praveen@gmail.com")) )
            email.setError("Invalid email id!");
        else if ( !(pass.getText().toString().equals("123")) )
            pass.setError("Invalid password!");
        else {
            Toast t = Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT);
            t.show();
        }
    }
}
