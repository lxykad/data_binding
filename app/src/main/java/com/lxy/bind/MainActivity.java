package com.lxy.bind;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lxy.bind.BR;
import com.lxy.bind.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ViewDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mUser = new User("lxy", "22");

        binding.setVariable(BR.User, mUser);
        binding.setVariable(BR.presenter, new Persenter());

    }


    public class Persenter {

        public void onClick(View view) {

            Toast.makeText(MainActivity.this, mUser.name, Toast.LENGTH_SHORT).show();
        }
    }

}
