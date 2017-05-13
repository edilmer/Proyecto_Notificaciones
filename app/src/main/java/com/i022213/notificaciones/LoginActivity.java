package com.i022213.notificaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.i022213.notificaciones.Views.ContainerActivity;
import com.i022213.notificaciones.Views.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onShowAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void goCreateContainer(View view){
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }


}