package com.example.smarthome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class login_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button bt_login,bt_signup,bt_forgetpass;
        bt_login = findViewById(R.id.bt_login);
        bt_signup = findViewById(R.id.bt_signup);
        bt_forgetpass = findViewById(R.id.bt_forgetpass);
        final EditText ed_user = findViewById(R.id.editText_username);
        final EditText ed_pass = findViewById(R.id.editText_pass);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = ed_user.getText().toString();
                String pass = ed_pass.getText().toString();
                if(user.equals("admin") && pass.equals("1704"))
                {
                    Intent intent = new Intent(login_activity.this, home_activity.class);
                    startActivity(intent);
                }
            }
        });
        bt_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               signup_dialog dialog = new signup_dialog();
               dialog.show(getSupportFragmentManager(),"signup_dialog");

            }
        });
        bt_forgetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
