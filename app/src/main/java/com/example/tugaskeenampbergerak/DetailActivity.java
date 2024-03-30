package com.example.tugaskeenampbergerak;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get data from Intent
        int position = getIntent().getIntExtra("ITEM_POSITION", -1);

        if (position != -1) {
            Item item = MainActivity.getItemList().get(position);

            ImageView imageViewDetail = findViewById(R.id.imageViewDetail);
            TextView textViewNameDetail = findViewById(R.id.textViewNameDetail);
            TextView textViewDescriptionDetail = findViewById(R.id.textViewDescriptionDetail);
            TextView textViewPriceDetail = findViewById(R.id.textViewPriceDetail);
            TextView textViewAdditionalDetail = findViewById(R.id.textViewAdditionalDetail);


            imageViewDetail.setImageResource(item.getImageResource());
            textViewNameDetail.setText(item.getName());
            textViewDescriptionDetail.setText(item.getDescription());
            textViewPriceDetail.setText(item.getPrice());
            textViewAdditionalDetail.setText(item.getAdditionalDetail());

            String AdditionalText = "";

            switch (item.getName()) {
                case "Apple Watch Nike":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Warna: Tersedia dalam perak dan abu-abu\n" +
                            "\n" +
                            "Fitur: GPS/GNSS, kompas, altimeter yang selalu aktif, tahan air hingga 50 meter\n" +
                            "\n" +
                            "Sensor oksigen darah (aplikasi Oksigen Darah)\n" +
                            "\n" +
                            "Sensor jantung optik generasi ketiga\n" +
                            "\n" +
                            "Panggilan darurat SOS\n" +
                            "\n" +
                            "Akselerometer hingga 32 g-force dengan deteksi jatuh\n" +
                            "\n" +
                            "Giroskop\n" +
                            "\n" +
                            "Sensor cahaya sekitar\n" +
                            "\n" +
                            "Speaker.";
                    break;
                case "Apple Watch SE":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Layar: Retina LTPO OLED 1.78 inch 484 x 368 piksel\n" +
                            "\n" +
                            "Chipset: Apple S8 Dual-core\n" +
                            "\n" +
                            "GPU: PowerVR\n" +
                            "\n" +
                            "RAM: 1 GB\n" +
                            "\n" +
                            "Storage: 32 GB eMMC\n" +
                            "\n" +
                            "Sistem Operasi: WatchOS 9\n" +
                            "\n" +
                            "Daya baterai: 296 mAh\n" +
                            "\n" +
                            "Konektivitas: Wi-Fi 802.11b/g/n 2,4 GHz dan 5 GHz, Bluetooth 5.0\n" +
                            "\n" +
                            "Berat: 40 mm Aluminium: 30,5g, 44 mm Aluminium: 36,5g\n" +
                            "\n" +
                            "Tahan air: 50 meters menurut standar ISO 22810:2010\n";
                    break;
                case "Apple Watch Series 7":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Layar: Retina LTPO OLED 1.78 inch 484 x 396 piksel, kecerahan 1.000 nit\n" +
                            "\n" +
                            "Chipset: S7 SiP dengan prosesor dual-core 64 bit\n" +
                            "\n" +
                            "GPU: PowerVR\n" +
                            "\n" +
                            "RAM: 1 GB\n" +
                            "\n" +
                            "Storage: 32 GB eMMC\n" +
                            "\n" +
                            "Sistem Operasi: watchOS 8\n" +
                            "\n" +
                            "Fitur: GPS/GNSS, kompas, altimeter yang selalu aktif, tahan air hingga 50 meter, sensor oksigen darah, sensor jantung optik generasi ketiga, panggilan darurat SOS, akselerometer hingga 32 g-force dengan deteksi jatuh, giroskop, sensor cahaya sekitar, speaker, mikrofon, GymKit, dan konektivitas Wi-Fi 802.11b/g/n 2,4 GHz dan 5 GHz, Bluetooth 5.0\n" +
                            "\n" +
                            "Daya baterai: 296 mAh\n" +
                            "\n" +
                            "Berat: 40 mm Aluminium: 30,5g, 44 mm Aluminium: 36,5g\n" +
                            "\n" +
                            "Tahan air: 50 meters menurut standar ISO 22810:2010";
                    break;
                case "Apple Watch Series 9":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Layar: Retina LTPO OLED, 396 by 484 pixels, 2000 nits brightness\n" +
                            "\n" +
                            "Chipset: Apple S9 SiP, 64-bit dual-core, 4-core Neural Engine\n" +
                            "\n" +
                            "GPU: PowerVR\n" +
                            "\n" +
                            "RAM: 64 GB\n" +
                            "\n" +
                            "Baterai: Up to 18-hour lithium-ion battery (36 hours in low power mode)\n" +
                            "\n" +
                            "Sensor: GPS, compass, altimeter, high-dynamic-range gyroscope, high-G accelerometer (up to 250G with crash detection), ambient light sensor, blood oxygen sensor, electrical heart sensor, body temperature sensor\n" +
                            "\n" +
                            "Konektivitas: Wi-Fi 4, Bluetooth 5.3, LTE (cellular model only), W3 wireless chip, second generation U1 ultrawideband chip, Emergency SOS satellite connectivity, international emergency calling\n" +
                            "\n" +
                            "Bahan: Aluminum: Midnight, Starlight, Silver, Pink, (PRODUCT)RED; Stainless steel: Graphite, Silver, Gold, Space Black (Hermès only)\n" +
                            "\n" +
                            "Ketahanan: IP6X dust-resistant, water-resistant to 50 meters\n" +
                            "\n" +
                            "Berat: 41mm: Aluminum (32.1g), Stainless steel (42.3g); 45mm: Aluminum (38.7g), Stainless steel (51.5g)\n" +
                            "\n" +
                            "Fitur: Double-tap, Chip S9, fitur pemantau kesehatan, dan fitur unggulan terbaru\n" +
                            "\n";
                    break;
                case "Apple Watch Ultra 2":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Layar: 49mm, Retina LTPO OLED, 484 x 396 pixels, 2000 nits brightness\n" +
                            "\n" +
                            "Chipset: Apple S9 SiP, 64-bit dual-core, 4-core Neural Engine\n" +
                            "\n" +
                            "GPU: PowerVR\n" +
                            "\n" +
                            "RAM: 64 GB\n" +
                            "\n" +
                            "Baterai: Up to 36 hours\n" +
                            "\n" +
                            "Sensor: GPS, compass, altimeter, high-dynamic-range gyroscope, high-G accelerometer (up to 250G with crash detection), ambient light sensor, blood oxygen sensor, electrical heart sensor, body temperature sensor\n" +
                            "\n" +
                            "Konektivitas: Wi-Fi 4, Bluetooth 5.3, GPS, and NFC\n" +
                            "\n" +
                            "Bahan: Titanium\n" +
                            "\n" +
                            "Ketahanan: IP6X dust-resistant, water-resistant to 40 meters\n" +
                            "\n" +
                            "Berat: 49mm\n" +
                            "\n" +
                            "Fitur: Prosesor Apple S9 SiP berbasis Apple Bionic A15, pengukuran kadar oksigen darah, notifikasi kesehatan jantung, melacak tidur, dan kesadaran\n" +
                            "\n" +
                            "Layar: Retina Always-On, kecerahan 2000 nits";
                    break;
                case "Iphone 15":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Layar: Super Retina XDR, OLED, 6,1 inci (diagonal), resolusi 2556 x 1179 piksel pada 460 ppi, kecerahan hingga 2.000 nit\n" +
                            "\n" +
                            "Chipset: A16 Bionic, CPU 6-core dengan 2 core performa dan 4 core efisiensi\n" +
                            "\n" +
                            "GPU: 5-core\n" +
                            "\n" +
                            "RAM: 16\n" +
                            "\n" +
                            "Storage: 128 GB, 256 GB, 512 GB\n" +
                            "\n" +
                            "Kamera: Kamera utama 48 MP: 26 mm, bukaan ƒ/1.6, penstabilan gambar optik sensor bergerak, 100% Focus Pixels, dukungan untuk foto resolusi super tinggi (24 MP dan 48 MP)\n" +
                            "\n" +
                            "Baterai: Lithium-ion bawaan yang dapat diisi ulang, pengisian daya nirkabel MagSafe hingga 15 W 10, pengisian daya nirkabel Qi2 hingga 15 W 10, pengisian daya nirkabel Qi hingga 7,5 W 10\n" +
                            "\n" +
                            "Sistem operasi: iOS 17\n" +
                            "\n" +
                            "Fitur: Dynamic Island, layar yang selalu aktif, tingkat kecerahan maksimal 2.000 nit\n" +
                            "\n" +
                            "Konektivitas: Wi-Fi 6, Bluetooth 5.3, GPS, NFC, Face ID, barometer, giroskop rentang dinamis tinggi, akselerometer high-g, sensor kedekatan jarak, sensor cahaya sekitar ganda\n" +
                            "\n" +
                            "Warna: Aluminium, Ceramic Shield, kaca berwarna";
                    break;
                case "Iphone 15 Pro":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Layar: Super Retina XDR, OLED, 6.1 inci (diagonal), resolusi 2556 x 1179 piksel pada 460 ppi, ProMotion 120Hz, Always-On\n" +
                            "\n" +
                            "Chipset: A17 Bionic 6-Core up to 3.78 GHz\n" +
                            "\n" +
                            "GPU: Apple GPU (6-Core)\n" +
                            "\n" +
                            "RAM: 8GB\n" +
                            "\n" +
                            "Storage: 128 GB/256 GB/512 GB/1 TB\n" +
                            "\n" +
                            "Kamera: Kamera utama 48MP, kamera Ultrawide 12MP dengan fokus otomatis untuk fotografi makro, Scan TOF 3D LiDAR di bagian belakang untuk ambil data kedalaman subjek dan latar belakang\n" +
                            "\n" +
                            "Baterai: 3.877 mAh atau lebih\n" +
                            "\n" +
                            "Sistem operasi: iOS 17\n" +
                            "\n" +
                            "Fitur: Dynamic Island, Layar yang selalu aktif, tingkat kecerahan maksimal 1.000 nit (umum); kecerahan puncak 1.600 nit (HDR); kecerahan puncak 2.000 nit (luar ruangan)";
                    break;
                case "Iphone 15 Pro Max":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Layar: Super Retina XDR OLED, 6.7 inci, resolusi 2796 x 1290 piksel pada 460 ppi, kecerahan hingga 1.000 nit\n" +
                            "\n" +
                            "Chipset: A17 Bionic 6-Core dengan kecepatan CPU 2 core performa dan 4 core efisiensi\n" +
                            "\n" +
                            "GPU: Apple GPU (6-Core)\n" +
                            "\n" +
                            "RAM: 8GB\n" +
                            "\n" +
                            "Storage: 256 GB, 512 GB, 1 TB\n" +
                            "\n" +
                            "Kamera: Kamera utama 48MP, kamera Ultrawide 12MP dengan fokus otomatis untuk fotografi makro, Scan TOF 3D LiDAR di bagian belakang untuk ambil data kedalaman subjek dan latar belakang\n" +
                            "\n" +
                            "Baterai: 3.877 mAh atau lebih\n" +
                            "\n" +
                            "Sistem operasi: iOS 17\n" +
                            "\n" +
                            "Fitur: Dynamic Island, layar yang selalu aktif, tingkat kecerahan maksimal 1.000 nit (umum); kecerahan puncak 1.600 nit (HDR); kecerahan puncak 2.000 nit (luar ruangan)\n" +
                            "\n" +
                            "Konektivitas: Wi-Fi 6, Bluetooth 5.3, GPS, NFC, Face ID, barometer, giroskop rentang dinamis tinggi, akselerometer high-g, sensor kedekatan jarak, sensor cahaya sekitar ganda\n" +
                            "\n" +
                            "Warna: Titanium Hitam, Titanium Putih, Titanium Biru, Titanium Alami\n" +
                            "\n" +
                            "Berat: 221 gram\n" +
                            "\n" +
                            "Ketahanan: IP68 (kedalaman maksimum 6 meter hingga selama 30 menit) menurut standar IEC 60529";
                    break;
                case "Iphone 14 Pro":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Layar: Super Retina XDR OLED, 6.1 inci, resolusi 2556 x 1179 piksel pada 460 ppi, kecerahan hingga 1.000 nit\n" +
                            "\n" +
                            "Chipset: A15 Bionic 6-Core dengan kecepatan CPU 2 core performa dan 4 core efisiensi\n" +
                            "\n" +
                            "GPU: Apple GPU (6-Core)\n" +
                            "\n" +
                            "RAM: 6GB\n" +
                            "\n" +
                            "Storage: 128 GB, 256 GB, 512 GB, 1 TB\n" +
                            "\n" +
                            "Kamera: Kamera utama 12MP, kamera Ultrawide 12MP, dan kamera Tele 12MP\n" +
                            "\n" +
                            "Baterai: Li-Ion 3279 mAh\n" +
                            "\n" +
                            "Sistem operasi: iOS 17\n" +
                            "\n" +
                            "Fitur: Dynamic Island, layar yang selalu aktif, tingkat kecerahan maksimal 1.000 nit (umum); kecerahan puncak 1.600 nit (HDR); kecerahan puncak 2.000 nit (luar ruangan)";
                    break;
                case "Iphone 14 Pro Max":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Layar: Super Retina XDR OLED, 6.1 inci, resolusi 2556 x 1179 piksel pada 460 ppi, kecerahan hingga 1.000 nit\n" +
                            "\n" +
                            "Chipset: A15 Bionic 6-Core dengan dua core performa dan 4 core efisiensi\n" +
                            "\n" +
                            "GPU: Apple GPU (6-Core)\n" +
                            "\n" +
                            "RAM: 6GB\n" +
                            "\n" +
                            "Storage: 128 GB, 256 GB, 512 GB, 1 TB\n" +
                            "\n" +
                            "Kamera: Kamera utama 12MP, kamera Ultrawide 12MP, dan kamera Tele 12MP\n" +
                            "\n" +
                            "Baterai: Li-Ion 3279 mAh\n" +
                            "\n" +
                            "Sistem operasi: iOS 17\n" +
                            "\n" +
                            "Fitur: Dynamic Island, layar yang selalu aktif, tingkat kecerahan maksimal 1.000 nit (umum); kecerahan puncak 1.600 nit (HDR); kecerahan puncak 2.000 nit (luar ruangan)\n" +
                            "\n" +
                            "Konektivitas: 5G (sub-6 GHz) dengan 4×4 MIMO, Gigabit-class LTE, 802.11ax Wi-Fi 6 dengan 2×2 MIMO, Bluetooth 5.3, Ultra Wideband chip untuk ruang lingkup, NFC dengan reader mode, GPS dengan GLONASS\n" +
                            "\n" +
                            "Warna: Midnight, Purple, Starlight, Red, dan Blue";
                    break;
                case "Ipad 8th Gen":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Layar: 10.2 inci, resolusi 2160 x 1620 piksel, kecerahan 500 nit, teknologi True Tone, anti-sidik jari oleophobic\n" +
                            "\n" +
                            "Chipset: A12 Bionic, 64-bit 6-core CPU, 4-core Neural Engine\n" +
                            "\n" +
                            "GPU: Apple GPU (4-core graphics)\n" +
                            "\n" +
                            "RAM: Belum diketahui\n" +
                            "\n" +
                            "Storage: 32 GB, 128 GB\n" +
                            "\n" +
                            "Kamera: Kamera belakang 8 MP, f/2.4, 1080p video, kamera depan 1.2 MP, f/2.2, 720p video\n" +
                            "\n" +
                            "Baterai: Li-Ion 3279 mAh\n" +
                            "\n" +
                            "Sistem operasi: iPadOS 14\n" +
                            "\n" +
                            "Fitur: Apple Pencil (1st generation) support, Smart Connector, Touch ID";
                    break;
                case "Ipad 9th Gen":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Layar: 10.2 inch, Retina, 2160 x 1620 pixels, 500 nit kecerahan\n" +
                            "\n" +
                            "Chipset: A13 Bionic Chip\n" +
                            "\n" +
                            "Prosesor: Hexa-core (2x2.65 GHz Lightning + 4x1.8 GHz Thunder)\n" +
                            "\n" +
                            "GPU: Apple GPU (4-core graphics)\n" +
                            "\n" +
                            "RAM: Belum diketahui\n" +
                            "\n" +
                            "Storage: 32 GB, 128 GB\n" +
                            "\n" +
                            "Kamera: Kamera belakang 8 MP, f/2.4, 1080p video, kamera depan 1.2 MP, f/2.2, 720p video\n" +
                            "\n" +
                            "Baterai: Li-Ion 3279 mAh\n" +
                            "\n" +
                            "Sistem operasi: iPadOS 14\n" +
                            "\n" +
                            "Fitur: Touch ID, Apple Pencil (1st generation) support, Smart Connector";
                    break;
                case "Ipad 10th Gen":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Layar: Liquid Retina 10.9 inch, resolusi 2360 x 1640 piksel, kecerahan 500 nits, 264 PPI, layar True Tone\n" +
                            "\n" +
                            "Chipset: A13 Bionic Chip\n" +
                            "\n" +
                            "Prosesor: Hexa-core (2x2.65 GHz Lightning + 4x1.8 GHz Thunder)\n" +
                            "\n" +
                            "GPU: Apple GPU (4-core graphics)\n" +
                            "\n" +
                            "RAM: Belum diketahui\n" +
                            "\n" +
                            "Storage: 64 GB, 256 GB\n" +
                            "\n" +
                            "Kamera: Kamera belakang 8 MP, f/2.4, 1080p video, kamera depan 1.2 MP, f/2.2, 720p video\n" +
                            "\n" +
                            "Baterai: Li-Ion 3279 mAh\n" +
                            "\n" +
                            "Sistem operasi: iPadOS 14\n" +
                            "\n" +
                            "Fitur: Touch ID, Apple Pencil (generasi ke-1) support, Smart Connector";
                    break;
                case "Ipad Air 5th Gen":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Layar: 10.9 inch, Liquid Retina, resolusi 2360 x 1640 piksel, 264 piksel per inci, kecerahan 500 nit, lapisan oleophobic anti-sidik jari, lapisan anti-reflektif, reflektivitas 1,8%, kecerahan 500 nit, mendukung Apple Pencil (generasi ke-2)\n" +
                            "\n" +
                            "Chipset: Apple M1 Chip, CPU 8-core dengan 4 core performa dan 4 core efisiensi, GPU 8-core, Neural Engine 16-core\n" +
                            "\n" +
                            "RAM: 8 GB\n" +
                            "\n" +
                            "Storage: 64 GB, 256 GB\n" +
                            "\n" +
                            "Kamera: Kamera belakang 12 MP, bukaan ƒ/1.8, Zoom digital hingga 5x, lensa lima elemen, fokus otomatis dengan Focus Pixels, panorama (hingga 63 MP), Smart HDR 3, pengambilan foto dan Live Photos dengan rentang warna luas, penanda lokasi foto, penstabilan gambar otomatis, mode beruntun, format gambar yang diambil: HEIF dan JPEG\n" +
                            "\n" +
                            "Baterai: Li-Ion 28.6 watt-jam\n" +
                            "\n" +
                            "Sistem operasi: iPadOS 14\n" +
                            "\n" +
                            "Fitur: Touch ID, Wi-Fi, GPS/GNSS, seluler, Smart Connector, gyro tiga sumbu, akselerometer, barometer, sensor cahaya sekitar, buka kunci iPad, amankan data pribadi dalam aplikasi, lakukan pembelian dari iTunes Store dan App Store, port USB-C dengan dukungan untuk pengisian daya, DisplayPort, USB 3.1 Gen 2 (hingga 10 Gbps), Mendukung resolusi asli sepenuhnya pada layar bawaan dalam jutaan warna, Mendukung satu layar eksternal dengan resolusi hingga 6K pada 60 Hz Output video digital, Output DisplayPort asli melalui USB-C, Output VGA, HDMI, dan DVI didukung menggunakan adaptor (dijual terpisah), Video mirroring, AirPlay hingga 4K untuk mirroring, foto, dan video ke Apple TV (generasi ke-2 atau lebih baru) atau smart TV berkemampuan AirPlay 2, dukungan video mirroring dan video keluar melalui Adaptor Multiport AV Digital USB-C dan Adaptor Multiport VGA USB-C\n" +
                            "\n" +
                            "Konektivitas: 5G, UMTS/HSPA/HSPA+/DC-HSDPA (850, 900, 1700/2100, 1900, 2100 MHz), data saja5, eSIM6, Nano-SIM, eSIM6\n" +
                            "\n" +
                            "Berat: 461 gram (Wi-Fi), 462 gram (Wi-Fi + Cellular)\n" +
                            "\n" +
                            "Ketahanan: Tahan debu dan air hingga 6 meter";
                    break;
                case "Ipad Pro":
                    AdditionalText = "Spesifikasi Tambahan\n" +
                            "\n" +
                            "Layar: 10,5 inci, resolusi 2224 x 1668 piksel, 264 piksel per inci, tingkat kecerahan 500 nit, lapisan oleophobic anti-sidik jari, lapisan anti reflektif\n" +
                            "\n" +
                            "Chipset: Chip Fusion A10X dengan arsitektur 64 bit, koprosesor M10 terpasang\n" +
                            "\n" +
                            "RAM: Belum diketahui\n" +
                            "\n" +
                            "Storage: 64 GB, 256 GB, 512 GB\n" +
                            "\n" +
                            "Kamera: Kamera 12 megapiksel, bukaan ƒ/1.8, zoom digital hingga 5x, penstabilan gambar optik, lensa enam elemen, flash True Tone, panorama hingga 63 megapiksel, penutup lensa kristal safir, sensor penerangan sisi belakang, filter IR hibrida, fokus otomatis dengan Focus Pixels, Live Photo dengan penstabilan\n" +
                            "\n" +
                            "Baterai: Belum diketahui\n" +
                            "\n" +
                            "Sistem operasi: iPadOS\n" +
                            "\n" +
                            "Konektivitas: LTE Advanced dan LTE tersedia di pasar tertentu dan melalui operator tertentu\n" +
                            "\n" +
                            "Berat: 469 gram (Wi-Fi), 477 gram (Wi-Fi + Cellular)\n" +
                            "\n" +
                            "Ketahanan: Tahan debu dan air hingga 6 meter";
                    break;
                default:
            }
            textViewAdditionalDetail.setText(AdditionalText);
        }
    }
}


