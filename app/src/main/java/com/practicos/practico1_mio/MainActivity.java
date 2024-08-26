package com.practicos.practico1_mio;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.practicos.practico1_mio.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    //ACA NO PUEDE HABER LOGICA!!!!
    //Referenciar correctamente el binding de la clase a la que quiero obtener el binding
    private ActivityMainBinding binding;
    private MainActivityViewModel mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mv = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        binding = ActivityMainBinding.inflate(getLayoutInflater());//Recorre
        setContentView(binding.getRoot());//Equivalente al Document.

        //Esto es cuando no uso el binding.
        //setContentView(R.layout.activity_traducido);
        binding.btnId.setOnClickListener(v -> {
            mv.buscarPalabra(binding.etId.getText().toString());
            //Con el intent le digo a startActivity a quien estoy instanciando
            //Intent intent = new Intent(MainActivity.this, ActivityTraducido.class);
            //startActivity(intent);
            //String palabra = binding.etId.getText().toString();
            //Aca tengo que usar el ViewModel para traducir la palabra
            //Despues enviar la palabra traducida a la siguiente Activity
        });
    }
}