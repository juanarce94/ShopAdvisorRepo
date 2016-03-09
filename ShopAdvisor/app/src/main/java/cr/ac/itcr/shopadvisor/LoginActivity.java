package cr.ac.itcr.shopadvisor;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class LoginActivity extends AppCompatActivity {


    private Button btnLoggin;
    private EditText txtEmail;
    private EditText txtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        btnLoggin = (Button) findViewById(R.id.btnLoggin);

        btnLoggin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                btnLoggin.setText("Successful");

                txtEmail = (EditText) findViewById(R.id.txtEmail);
                txtPassword = (EditText) findViewById(R.id.txtPassword);

                if(txtEmail.getText().toString().equals("test@test.com") && txtPassword.getText().toString().equals("12345")){

                    Intent i = new Intent(getApplicationContext(),DashboardActivity.class);
                    startActivity(i);

                }
                else{

                    Toast mensajeError = Toast.makeText(getApplicationContext(),"Usuario invalido",Toast.LENGTH_SHORT);
                    mensajeError.show();

                }
            }
         });

    }

}
