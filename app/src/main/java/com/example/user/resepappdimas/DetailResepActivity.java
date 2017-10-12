import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.resepappdimas.ResepAdapter;

public class DetailResepActivity extends AppCompatActivity {

    ImageView imMakanan;
    TextView resepMakanan;
    int teksResep, posisi;
    String judulMakanan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep);

        imMakanan = (ImageView) findViewById(R.id.imageView);
        resepMakanan = (TextView) findViewById(R.id.textView);
       ResepAdapter adapterMasakan = new ResepAdapter(this);

        Intent i = getIntent();
        posisi = i.getIntExtra("posisi", 0);

        switch (posisi){
            case 0: judulMakanan="Ayam Goreng";teksResep = R.string.ayam;break;
            case 1: judulMakanan="Bakso";teksResep = R.string.bakso;break;
            case 2: judulMakanan="Mie";teksResep = R.string.mie;break;
            case 3: judulMakanan="Nasi Goreng";teksResep = R.string.nasigoreng;break;
            case 4: judulMakanan="Udang";teksResep = R.string.udang;break;
        }
        getSupportActionBar().setTitle(judulMakanan);
        imMakanan.setImageResource(adapterMasakan.makanan[posisi]);
        resepMakanan.setText(teksResep);
    }
