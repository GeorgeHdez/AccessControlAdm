package com.example.george_pc.accesscontroladm;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UsersActivity extends AppCompatActivity implements NewUserFragment.OnFragmentInteractionListener,
        UsersFragment.OnFragmentInteractionListener {

    Button new_userBT,usersBT;

    NewUserFragment newUserFragment;
    UsersFragment usersFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
        new_userBT = (Button) findViewById(R.id.agregar);
        usersBT = (Button) findViewById(R.id.usuarios);

        newUserFragment = new NewUserFragment();
        usersFragment = new UsersFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.frameFragment,newUserFragment)
                .commit();

        new_userBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameFragment,newUserFragment);
                transaction.commit();
            }
        });
        usersBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameFragment,usersFragment);
                transaction.commit();
            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri){

    }
}
