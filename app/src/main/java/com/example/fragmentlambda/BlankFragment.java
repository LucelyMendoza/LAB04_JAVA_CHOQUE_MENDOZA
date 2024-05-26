package com.example.fragmentlambda;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class BlankFragment extends Fragment {

    private static OnButtonClickListener onButtonClickListener;

    public interface OnButtonClickListener {
        void onButtonClick(Registro registro);
    }

    public static BlankFragment newInstance(OnButtonClickListener listener) {
        BlankFragment fragment = new BlankFragment();
        onButtonClickListener = listener;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        EditText edtMensaje = view.findViewById(R.id.edtMensaje);
        EditText edtApellidos = view.findViewById(R.id.edtApellidos);
        EditText edtCorreo = view.findViewById(R.id.edtCorreo);
        EditText edtCelular = view.findViewById(R.id.edtCelular);
        EditText edtUser = view.findViewById(R.id.edtUser);
        EditText edtPassword = view.findViewById(R.id.edtPassword);
        Button btnEnviarMensaje = view.findViewById(R.id.btnEnviarMensaje);

        btnEnviarMensaje.setOnClickListener(v -> {
            Registro registro = new Registro(
                    edtMensaje.getText().toString(),
                    edtApellidos.getText().toString(),
                    edtCorreo.getText().toString(),
                    edtCelular.getText().toString(),
                    edtUser.getText().toString(),
                    edtPassword.getText().toString()
            );
            if (onButtonClickListener != null) {
                onButtonClickListener.onButtonClick(registro);
            }
        });

        return view;
    }
}
