package com.example.mynovel;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Novel> novelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Dummy data
        novelList = new ArrayList<>();
        novelList.add(new Novel(
                "Fate/Strange Fake 2 ",
                "Gadis Bertudung Merah Apartemen Semina” adalah legenda urban sebuah tempat bernama Fuyuki. Namun ada kelanjutan yang tidak diceritakan di legenda tersebut. Kelanjutannya dimulai di Snowfield, Amerika. Saat ini, sang protagonis legenda itu, Ayaka Sajou, tengah terlibat dalam hal yang jauh lebih tidak masuk akal dari legenda konyol mana pun, yaitu… Holy Grail War yang penuh kepalsuan. ",
                "Action",
                "Supranarutal",
                "8.4",
                R.drawable.fate_strange));
        novelList.add(new Novel(
                " Siege and Storm: Takhta dan Prahara",
                "Kesaktian Alina Starkov sebagai Pemanggil Matahari harus dibayar mahal—diburu sepanjang Laut Sejati serta dihantui nyawa-nyawa yang terenggut saat dia melarikan diri bersama Mal, sahabat yang kini menjadi kekasihnya. Namun, mereka berdua tidak bisa berlama-lama sembunyi.",
                "Adventure",
                "Fantasy",
                "8.1",
                R.drawable.siege));
        novelList.add(new Novel(
                "Fur Immer Dein Ian",
                "Apakah ada yang lebih menyebalkan dari menyembunyikan perasaan atas nama pertemanan? Saling berdekatan tetapi harus menjaga jarak aman. Semata-mata agar yang kita cintai tetap merasa nyaman.",
                "Romance",
                "Fiction",
                "9.1",
                R.drawable.valerie));
        novelList.add(new Novel(
                "The Chronicles of Narnia: The Magician`s Nephew",
                "Petualangan dimulai! Narnia… tanah tempat para Hewan yang Bisa Bicara tinggal… tempat sang penyihir menunggu… dan dunia yang baru akan terbentuk. Dalam petualangan untuk menyelamatkan seseorang, dua sahabat dipaksa masuk ke dunia lain, tempat seorang penyihir jahat berniat memperbudak mereka. Tetapi, Aslan Sang Singa menyanyikan lagu yang membuat tanah baru tercipta, tanah yang di kemudian hari dikenal sebagai Narnia. Dan di Narnia, segala hal mungkin terjadi…",
                "Action",
                "Fantasy",
                "8.4",
                R.drawable.narnia));
        novelList.add(new Novel(
                "Alya Sometimes Hides Her Feelings in Russian",
                "Masachika Kuze duduk di samping Alya, gadis blasteran cantik yang dingin tapi diam-diam berbicara manis dalam bahasa Rusia, tidak menyadari bahwa Masachika bisa mengerti bahasanya.",
                "Romance",
                "School",
                "8.3",
                R.drawable.roshidere
        ));

        NovelAdapter adapter = new NovelAdapter(novelList);
        recyclerView.setAdapter(adapter);
    }
}
