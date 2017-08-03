package br.com.ramonilho.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import br.com.ramonilho.mylibrary.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomToast toast = new CustomToast();

        if (BuildConfig.REPORT_CRASH) {
            toast.show(getApplicationContext(), "Report crash!",
                    CustomToast.SUCCESS, Toast.LENGTH_LONG);
        } else {
            toast.show(getApplicationContext(), "Dont report crash!",
                    CustomToast.ERROR, Toast.LENGTH_LONG);
        }

        toast.show(getApplicationContext(), "SUCCESS !",
                CustomToast.SUCCESS, Toast.LENGTH_LONG);

        toast.show(getBaseContext(), "ERROR !",
                CustomToast.ERROR, Toast.LENGTH_LONG);

        toast.show(getBaseContext(), "INFORMATION !" ,
                CustomToast.INFO, Toast.LENGTH_LONG);

        toast.show(getBaseContext(), "WARNING !",
                CustomToast.WARNING, Toast.LENGTH_LONG);

        toast.show(getBaseContext(), "DEFAULT",
                CustomToast.DEFAULT, Toast.LENGTH_LONG);

    }
}
