package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
static CheckBox cb[]=new CheckBox[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb[0]=findViewById(R.id.checkBox);
        cb[1]=findViewById(R.id.checkBox3);
        cb[2]=findViewById(R.id.checkBox4);
        cb[3]=findViewById(R.id.checkBox5);
        cb[4]=findViewById(R.id.checkBox6);

        cb[0].setOnCheckedChangeListener(this);
        cb[1].setOnCheckedChangeListener(this);
        cb[2].setOnCheckedChangeListener(this);
        cb[3].setOnCheckedChangeListener(this);
        cb[4].setOnCheckedChangeListener(this);


        /*cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
               /* if (b)
                {
                    Toast.makeText(MainActivity.this, "Checked ", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Unchecked", Toast.LENGTH_SHORT).show();
                } //onClick();

            }
        });*/
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId())
        {
            case R.id.checkBox :
                Toast.makeText(this, ""+cb[0].getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox3 :
                Toast.makeText(this, ""+cb[1].getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox4 :
                Toast.makeText(this, ""+cb[2].getText(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.checkBox5 :
                Toast.makeText(this, ""+cb[3].getText(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.checkBox6 :
                Toast.makeText(this, ""+cb[4].getText(), Toast.LENGTH_SHORT).show();

                break;
        }
    }
   /* public void onClick()
    {
        if (cb.isChecked())
        {
            Toast.makeText(MainActivity.this, "Checked ", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "Unchecked", Toast.LENGTH_SHORT).show();
        }
    }*/
}
