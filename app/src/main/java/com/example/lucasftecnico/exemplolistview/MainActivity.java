package com.example.lucasftecnico.exemplolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvObjetos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvObjetos = (ListView) findViewById(R.id.lvObjetos);
        final ArrayList<Objeto> objetos = buscarObjetos();
        ArrayAdapter<Objeto> adapter = new ArrayAdapter<Objeto>(getApplicationContext(), android.R.layout.simple_list_item_1, objetos);
        lvObjetos.setAdapter(adapter);

        lvObjetos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Objeto: " + objetos.get(i).getMarca(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private ArrayList<Objeto> buscarObjetos() {
        ArrayList<Objeto> objetos = new ArrayList<Objeto>();
        objetos.add(new Objeto(1246786, "Carro", "Ford", "Fiesta"));
        objetos.add(new Objeto(6772323, "Bola", "Canarinho", "Dente de leite"));
        objetos.add(new Objeto(2378123, "Martelo", "Tramontina", "BR-1241"));
        objetos.add(new Objeto(8934534, "Bicicleta", "Schwinn", "Colorado"));
        objetos.add(new Objeto(8734732, "Moto", "Yamaha", "YZ 250"));
        objetos.add(new Objeto(7834534, "Computador", "HP", "Evyn"));
        objetos.add(new Objeto(7823422, "Bolsa", "Nike", "USA"));
        objetos.add(new Objeto(8234234, "Celular", "Motorola", "Moto G"));

        return objetos;
    }
}
