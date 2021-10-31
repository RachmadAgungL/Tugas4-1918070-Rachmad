package com.example.pertemuan4_1918070;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private IkanAdapter adapter;
    private ArrayList<Ikan> ikanArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recyclerview);
        adapter = new IkanAdapter(ikanArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        ikanArrayList = new ArrayList<>();
        ikanArrayList.add(new Ikan("Aligator Gar", "Asal : America Utara", "Ciri : Memiliki moncong yang mirip seperti buaya dan berbadan seperti ikan purba.",R.drawable.aligatorgar));
        ikanArrayList.add((new Ikan("Arapaima Gigas","Asal : Sungai Amazon", "Ciri : Memiliki panjang maksimal 3 meter dan memiliki bobot sekitar 200 kilogram.",R.drawable.arapaimagigas)));
        ikanArrayList.add((new Ikan("Chana Snake Head", "Asal : Kalimantan", "Ciri : Memiliki kepala seperti ular dan bisa mencapai panjang 60 cm.",R.drawable.chanasnakehead)));
        ikanArrayList.add((new Ikan("Goliath Tiger Fish","Asal : Afrika", "Ciri : Memiliki gigi seperti buaya dan panjang mencapai 1,53 meter dengan berat 70 kilogram.",R.drawable.goliathtigerfish)));
        ikanArrayList.add((new Ikan("Payara", "Asal : Brazil", "Ciri : Untuk payara dewasa memiliki gigi seperti vampir dan panjang mencapai 15m.", R.drawable.payara)));
        ikanArrayList.add((new Ikan("Piranha", "Asal : Sungai Amazon", "Ciri : Memiliki badan seperti ikan bawal namun corak hitam titik yang membedakannyadan memiliki gigi berbentuk segitiga yang berguna untuk mencabik2 mangsanya.", R.drawable.piranha)));
        ikanArrayList.add((new Ikan("Red Tail Catfish", "Asal : Sungai Amazon", "Ciri : Memiliki ekor yang berwarna merah seperti namanya dan biasanya condong memiliki kepala yang besar.", R.drawable.redtailcatfish)));
    }
}