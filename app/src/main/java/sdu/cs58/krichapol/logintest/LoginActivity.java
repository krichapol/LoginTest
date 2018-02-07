package sdu.cs58.krichapol.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //1. Explicit (ประกาศตัวแปรบน Java)
    EditText NameEditText, UsernameEditText, PasswordEditText;
    Button LoginButton;
    String NameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //2. Initial view ผูกตัวแปร Java ให้รู้จักกับ Element บน XML
        NameEditText = findViewById(R.id.txtName);
        UsernameEditText = findViewById(R.id.txtUsername);
        PasswordEditText = findViewById(R.id.txtPassword);
        LoginButton = findViewById(R.id.btnLogin);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameString = NameEditText.getText().toString().trim();
                Toast.makeText(getApplicationContext(),"Hello "+NameString,Toast.LENGTH_SHORT).show();
            }
        });

    } //End Method onCreate
} //End Class
