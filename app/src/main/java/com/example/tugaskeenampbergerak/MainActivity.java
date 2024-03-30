package com.example.tugaskeenampbergerak;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemAdapter.OnItemClickListener {

    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private static List<Item> itemList; // Buat itemList menjadi statis

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisiasi itemList
        itemList = new ArrayList<>();
        itemList = new ArrayList<>();
        itemList.add(new Item("Apple Watch Nike", "Apple Watch Nike merupakan kolaborasi antara Apple dan Nike yang menggabungkan teknologi canggih dari Apple Watch dengan fitur-fitur khusus untuk pelari dari Nike.", "Tahan Air Untuk Waktu Lumayan Lama.", R.drawable.barang1));
        itemList.add(new Item("Apple Watch SE", "Apple Watch SE adalah kombinasi sempurna antara harga yang terjangkau dan fitur-fitur canggih yang dihadirkan Apple.", "Jam tangan pintar solid dengan harga bagus,tujuan utamanya adalah branding membuat Seri 6 terlihat lebih menarik.", R.drawable.barang2));
        itemList.add(new Item("Apple Watch Series 7", "Apple Watch S7 perangkat yang menggabungkan desain yang megah, teknologi canggih, dan kinerja luar biasa.", "Berpusat pada kebugaran: baik itu Move Rings sederhana yang mengisi dan mendorong Anda untuk aktif", R.drawable.barang3));
        itemList.add(new Item("Apple Watch Series 9", "Apple Watch S9 Hadir, dengan Fitur Double Tap! ; Baterai, Up to 18-hour lithium-ion battery (36 hours in low power mode) ; Konektivitas, Wi-Fi 4,", "Pembaruan kualitas hidup seperti Ketuk Dua Kali dan layar yang lebih cerah menjadikan Apple Watch Series 9 peningkatan yang bermanfaat", R.drawable.barang4));
        itemList.add(new Item("Apple Watch Ultra 2", "Apple Watch Ultra 2 Jam tangan pintar berperforma tinggi mendapat peningkatan kecepatan dan fitur aksesibilitas baru", "WatchOS 10 sangat menyenangkan untuk digunakan", R.drawable.barang5));
        itemList.add(new Item("Iphone 15", "Iphone 15 Keseruan baru. Dynamic Island. Kamera Utama 48 MP dengan Telefoto 2x.", "Notch Dynamic Island adalah salah satu inovasi menarik yang disematkan pada semua varian iPhone 15 series", R.drawable.barang6));
        itemList.add(new Item("Iphone 15 Pro", " IPhone 15 Pro menghadirkan kamera luar biasa dan performa superior dalam desain titanium yang lebih tipis dan kuat.", "Segi Design Jangan Ditanya!", R.drawable.barang7));
        itemList.add(new Item("Iphone 15 Pro Max", "iPhone 15 Pro Max bisa zoom lebih jauh, dalam bodi yang jauh lebih ringan.", "Smartphone andalan penuh sensasi.", R.drawable.barang8));
        itemList.add(new Item("Iphone 14 Pro", "IPhone 14 Pro adalah pembangkit tenaga listrik yang serius dan terjangkau. Ya, memang tebal, namun ukurannya yang relatif ringkas serta cameraable", "Perlombaan Performa Iphone yang menarik mata!", R.drawable.barang9));
        itemList.add(new Item("Iphone 14 Pro Max", "Potongan pil Pulau Dinamis dengan berbagai fungsi", "Mode Cinematik 4K dan Menjadikannya Menarik Mata!", R.drawable.barang10));
        itemList.add(new Item("Ipad 8th Gen", "Tidak ada casing keyboard yang bagus? Dukungan trackpad dan mouse adalah fitur iPad terbaik tahun 2020. Daya tahan baterai sejauh ini", "Tersedia dalam Apple Pencil generasi pertama dan Smart Keyboard.", R.drawable.barang11));
        itemList.add(new Item("Ipad 9th Gen", "layar iPad 9 mendukung multi touch, sehingga gampang dipakai. Layarnya juga memiliki tampilan layar LED.", "Mengemas Lebih Banyak Kekuatan dan Tampilan menarik.", R.drawable.barang12));
        itemList.add(new Item("Ipad 10th Gen", "menawarkan layar yang lebih besar, lebih banyak daya, dan keyboard yang lebih baik serta daya tahan baterai yang lebih baik", "Design Fresh dan Family!", R.drawable.barang13));
        itemList.add(new Item("Ipad Air 5th Gen", " IPad Air adalah komputer kreatif yang cukup menakjubkan dengan harga di bawah £600/$600", "Layar AMOLED dan Kualitas SUPER TINGGI!", R.drawable.barang14));
        itemList.add(new Item("Ipad Pro", "IPad Pro terbaru berfungsi ganda sebagai tablet untuk para seniman, dengan peningkatan spesifikasi dasar.", "Bertenaga Super dan Design Kelas Atas!", R.drawable.barang15));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ItemAdapter(itemList, this);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(this);
    }

    public static List<Item> getItemList() {
        return itemList;
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("ITEM_POSITION", position);
        intent.putExtra("ADDITIONAL_DETAIL", itemList.get(position).getAdditionalDetail());
        startActivity(intent);
    }
}