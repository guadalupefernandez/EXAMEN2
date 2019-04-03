package mx.edu.tesoem.itics.guadalupe.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class operaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
    }
    public void suma(View v) {
        Intent cargar = new Intent(this, suma.class);
        startActivity(cargar);
    }
    public void resta(View v) {
        Intent cargar = new Intent(this, resta.class);
        startActivity(cargar);
    }
    public void potencia(View v) {
        Intent cargar = new Intent(this, potencia.class);
        startActivity(cargar);
    }
    public void finalizar(View v){
        System.exit(0);
    }


}