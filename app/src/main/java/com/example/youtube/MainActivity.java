package com.example.youtube;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private RecyclerView recyclerView;
    private ArrayList<tubeModel> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildData();
        setDataToAdapter();
    }

    private void setDataToAdapter() {
        tubeAdapter tubeAdapter = new tubeAdapter(dataList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(tubeAdapter);
    }

    private void buildData() {
        dataList.add(new tubeModel(R.drawable.mw4, "Call of Duty: Modern Warfare [Xbox Series X 4K HDR 60FPS] Fog Of War Realism Gameplay", "https://www.google.co.in/url?sa=i&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D0ztBfM0pSrU&psig=AOvVaw2iahuIHEvwBF_OBDUfiHRv&ust=1625909511803000&source=images&cd=vfe&ved=0CAwQ3YkBahcKEwiotImK19XxAhUAAAAAHQAAAAAQAw"));
        dataList.add(new tubeModel(R.drawable.nfsrivals, "NFS Rivals Lamborghini Veneno [Acceleration & Sound]", "https://www.google.co.in/url?sa=i&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DcRdaAIRC_gg&psig=AOvVaw0YhQU6ahJ9LbFPqzt6eS62&ust=1625908885876000&source=images&cd=vfe&ved=0CAwQ3YkBahcKEwiwxdDf1NXxAhUAAAAAHQAAAAAQAw"));
        dataList.add(new tubeModel(R.drawable.mafia2, "Mafia 2 | Remastered | Definitive Edition | Full Gameplay Playthrough Walkthrough Review", "https://www.youtube.com/watch?v=VvhROqL_g_8"));
        dataList.add(new tubeModel(R.drawable.mustangforza, "2018 Ford Mustang GT - Forza Horizon 4 | Logitech g29 gameplay", "https://www.youtube.com/watch?v=MrabZYpioiM"));
        dataList.add(new tubeModel(R.drawable.mw1sniper, "Call of Duty 4 Modern Warfare Remastered Sniper One Shot One Kill Mission Gameplay Veteran", "https://www.youtube.com/watch?v=AR5lLQpLE-w"));
        dataList.add(new tubeModel(R.drawable.aventadorforza, "Forza Horizon 4 Lamborghini Aventador SV LP750-4 Gameplay", "https://www.youtube.com/watch?v=o82VtwJ6Krs"));
        dataList.add(new tubeModel(R.drawable.mw3ironlady, "Call of Duty: Modern Warfare 3 - Walkthrough (Part 15) - Iron Lady", "https://www.youtube.com/watch?v=4WjoaZo08fA"));
        dataList.add(new tubeModel(R.drawable.the_crew, "The Crew - Launch Trailer", "https://www.google.co.in/url?sa=i&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DLVDUbfdfBPk&psig=AOvVaw0-vFoB63zFL6-PgoKfVdTJ&ust=1625909371213000&source=images&cd=vfe&ved=0CAwQ3YkBahcKEwjA5pjH1tXxAhUAAAAAHQAAAAAQAw"));
        dataList.add(new tubeModel(R.drawable.theunfinalrace, "Need For Speed The Run - Final Race (HD)", "https://www.youtube.com/watch?v=TOjd69py1uk"));
        dataList.add(new tubeModel(R.drawable.valhalla, "ASSASSIN'S CREED VALHALLA : Official Trailor", "https://www.youtube.com/watch?v=ssrNcwxALS4"));
    }

    private void initViews() {
        recyclerView = findViewById(R.id.RecyclerViewMain);
    }

    @Override
    public void onItemClicked(int position) {

        String playLink = dataList.get(position).getVideoLink();
        Uri uri = Uri.parse(playLink);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
