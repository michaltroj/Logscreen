package com.example.logscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Surname;
    private Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.etName);
        Surname = (EditText) findViewById((R.id.etSurname));
        Next = (Button) findViewById(R.id.button);

        String strName = Name.getText().toString();
        String strSurname = Surname.getText().toString();

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(strName, strSurname);
            }
        });
    }

    private void validate(String userName, String userSurname){

        String strName = Name.getText().toString();
        String strSurname = Surname.getText().toString();

        if (!(strName.equals("")) && !(strSurname.equals(""))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        else if(!(strName.equals("")))
            Toast.makeText(MainActivity.this, "Enter a Surname", Toast.LENGTH_SHORT).show();
        else Toast.makeText(MainActivity.this, "Enter a Name", Toast.LENGTH_SHORT).show();
    }


}

/*
Next.setOnClickListener(new View.OnClickListener()
        {
@Override
public void onClick (View v){
        if ((strName.equals("")) && (strSurname.equals("")))
        {
        Toast.makeText(MainActivity.this, "You did not enter a Name", Toast.LENGTH_SHORT).show();
        return;
        }
        if (strSurname.equals(""))
        {
        Toast.makeText(MainActivity.this, "You did not enter a Surname", Toast.LENGTH_SHORT).show();
        return;
        } else
        {validate(strName, strSurname);}
        }
        });
*/

/*
if (!(strName.matches("")) && !(strSurname.matches(""))) {
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(strName, strSurname);
            }
        });
    }
        else Toast.makeText(MainActivity.this, "You did not enter a Name or Surname", Toast.LENGTH_SHORT).show();

}
*/