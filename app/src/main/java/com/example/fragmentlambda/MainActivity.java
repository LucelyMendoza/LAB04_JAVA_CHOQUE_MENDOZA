package com.example.fragmentlambda;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnButtonClickListener {

    private TextView txtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMensaje = findViewById(R.id.txtMensaje);

        BlankFragment blankFragment = BlankFragment.newInstance(this);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, blankFragment);
        transaction.commit();
    }

    @Override
    public void onButtonClick(Registro registro) {
        txtMensaje.setText("Nombre: " + registro.getNombre() + "\n" +
                "Apellidos: " + registro.getApellidos() + "\n" +
                "Correo: " + registro.getCorreo() + "\n" +
                "Celular: " + registro.getCelular() + "\n" +
                "Usuario: " + registro.getUsuario() + "\n" +
                "Contraseña: " + registro.getContrasena());
    }
}
