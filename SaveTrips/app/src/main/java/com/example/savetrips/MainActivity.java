package com.example.savetrips;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick (View view){
        TextView txtfname = findViewById(R.id.txtFirstName);
        TextView txtlname = findViewById(R.id.txtLastName);
        TextView txtemail = findViewById(R.id.txtEmail);

        EditText editfname = findViewById(R.id.editTxtFname);
        EditText editlname = findViewById(R.id.editTxtLname);
        EditText editemail = findViewById(R.id.editTxtEmail);

        txtfname.setText("First Name: " + editfname.getText().toString());
        txtlname.setText("Last Name: " + editlname.getText().toString());
        txtemail.setText("Email: " + editemail.getText().toString());

    }
}