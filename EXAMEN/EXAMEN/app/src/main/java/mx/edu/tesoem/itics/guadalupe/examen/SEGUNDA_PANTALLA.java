package mx.edu.tesoem.itics.guadalupe.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SEGUNDA_PANTALLA extends AppCompatActivity implements View.OnClickListener{
EditText txtnombre;
Button saludobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda__pantall);

        saludobtn=(Button) findViewById(R.id.btnsaludo);
        saludobtn.setOnClickListener(this);
        txtnombre = (EditText) findViewById(R.id.txtnombre);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "¡hola!,bienvenido al examen", Toast.LENGTH_LONG).show();
        saludobtn.setEnabled(false);
    }

    public void llamarpantalla(View v) {
        Intent llamar = new Intent(this, segundapantalla.class);
        llamar.putExtra("Nombre", txtnombre.getText().toString());
        startActivity(llamar);
    }
    public void llamarbtn(View v){
        Intent cargar = new Intent(this, operaciones.class);
        startActivity(cargar);
    }
}
