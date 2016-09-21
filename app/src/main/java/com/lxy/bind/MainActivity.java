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
    private ViewDataBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mUser = new User("lxy", "22");

        mBinding.setVariable(BR.User, mUser);
        mBinding.setVariable(BR.presenter, new Persenter());

    }


    public class Persenter {

        public void onClick(View view) {

            Toast.makeText(MainActivity.this, mUser.name, Toast.LENGTH_SHORT).show();
        }
    }

}
