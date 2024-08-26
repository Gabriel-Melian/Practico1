package com.practicos.practico1_mio;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.practicos.practico1_mio.databinding.ActivityMainBinding;
import com.practicos.practico1_mio.databinding.ActivityTraducidoBinding;

public class ActivityTraducido extends AppCompatActivity {

    private ActivityTraducidoBinding binding;
    private ActivityTraducidoViewModel mv;
    private Intent intent;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        intent = getIntent();
        //Log.d("intent", "onCreate: " + intent.getBundleExtra("palabraEncontrada").getSerializable("palabraEncontrada"));
        bundle = intent.getBundleExtra("palabraEncontrada");
        binding = ActivityTraducidoBinding.inflate(getLayoutInflater());//Recorre
        mv = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(ActivityTraducidoViewModel.class);

        mv.getMensaje().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String mutableMsj) {
                //Saber si cambio el mutable. Si cambio algo en la vista, aca lo hago

                binding.etId2.setText(mutableMsj);
                Palabra palabra = (Palabra) bundle.getSerializable("palabraEncontrada");
                binding.imageViewId.setImageResource(palabra.getImg());//Muestra la imagen
            }
        });
        mv.setPalabra(bundle);
        setContentView(binding.getRoot());


    }
}