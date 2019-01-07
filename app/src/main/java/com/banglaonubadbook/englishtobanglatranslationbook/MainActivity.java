package com.banglaonubadbook.englishtobanglatranslationbook;



import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    private AdRequest adRequest;

    private Context mContext;

    private ArrayList<String> titleText;

    private RecyclerView mRecyclerView;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-2606660907793468/6479642088");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        mContext = MainActivity.this;

        titleText = new ArrayList<String>();

        titleText.add(Constants.অগ্নিকুণ্ডলী);
        titleText.add(Constants.অজানার_উজানে);
        titleText.add(Constants.অন্য_পথ);
        titleText.add(Constants.অন্য_পৃথিবীর_সমুদ্র_পাড়ি);
        titleText.add(Constants.অবশিষ্ট);
        titleText.add(Constants.আকাশ_একেবারে_পরিষ্কার);
        titleText.add(Constants.আঠারোশো_বাষট্টি_সালের_জানুয়ারি_মাস);
        titleText.add(Constants.আবহাওয়া_পরিষ্কার_বাতাস_অনুকুল_সমুদ্রও_শান্ত);
        titleText.add(Constants.ইলোরার_গুহায়_আঁধারে);
        titleText.add(Constants.এক_বনাম_একশো);
        titleText.add(Constants.এক_বনাম_প্রকাণ্ড_তিন);
        titleText.add(Constants.এরা_এত_জটিল_জিনিস_বানায়_কেন);
        titleText.add(Constants.কথাবার্তা_জমে_উঠেছে);
        titleText.add(Constants.কর্নেল_মানরো);
        titleText.add(Constants.কানপুর_পেরিয়ে);
        titleText.add(Constants.কামানের_মুখে);
        titleText.add(Constants.কেবল_মরা_ধূলোর_মরুভূমি);
        titleText.add(Constants.ক্যাপ্টেন_হুডের_পরাক্রম);
        titleText.add(Constants.ক্রমশ_সুস্থ_হচ্ছে_বন্ড);
        titleText.add(Constants.ঘুমের_মধ্যে_স্বপ্নের_প্রকৃতি);
        titleText.add(Constants.ছেলের_নাম_সান্তিয়াগো);
        titleText.add(Constants.জিনিশপত্র_সব_ফেলে_দিয়ে_বেলুনকে_হালকা);
        titleText.add(Constants.জীবন_মৃত্যুর_সন্ধিক্ষণে);
        titleText.add(Constants.জো_ফার্গুসনের_চিরসাথী_ও_বিশ্বস্ত_অনুচর);
        titleText.add(Constants.জো_বেশ_জমকালো_ভঙ্গিতে);
        titleText.add(Constants.ডক্টর_ফার্গুসনের_একমাত্র_বন্ধু);
        titleText.add(Constants.ডাইনি_পুরতরা);
        titleText.add(Constants.ডিকের_দিকে_ঘুরে_দাঁড়ালেন_ফার্গুসন);
        titleText.add(Constants.তরাইয়ের_রানী);
        titleText.add(Constants.দু_হাজার_মোহর_পুরস্কার);
        titleText.add(Constants.দুরবিনের_ফুটোয়_চোখ_রেখে);
        titleText.add(Constants.দুসপ্তাহ_কেটে_গেল);
        titleText.add(Constants.দূরে_মিলিয়ে_গেলো_নীলনদ);
        titleText.add(Constants.নীল_আকাশে_তুলোর_পাঁজার_মতো_শাদা_মেঘ);
        titleText.add(Constants.পথের_পাঁচালী);
        titleText.add(Constants.পাতালের_পাপচক্র);
        titleText.add(Constants.প্রবল_এক_বাতাসের_বেগ);
        titleText.add(Constants.বন্ড_এখন_প্রায়_পুরো_সুস্থ);
        titleText.add(Constants.বহ্নিশিখা);
        titleText.add(Constants.বেতোয়ার_পথে);
        titleText.add(Constants.বেলুন_এবারে_কিন্তু_পাহাড়_পেরিয়ে);
        titleText.add(Constants.বেলুনের_সব_গ্যাসই_ফুরিয়ে_গেলো);
        titleText.add(Constants.বেড়ালের_শহর);
        titleText.add(Constants.বৈজ্ঞানিকের_খেয়াল);
        titleText.add(Constants.মাতিয়াস_ফান_খোইত);
        titleText.add(Constants.মাতিয়াস_ফান_খোইতের_বিদায়);
        titleText.add(Constants.মাসখানেক_হল_কাজ_করছে_সান্তিয়াগো);
        titleText.add(Constants.যখন_বেলুনকে_আকাশে_তোলা_হলো);
        titleText.add(Constants.যাত্রা_হলো_শুরু);
        titleText.add(Constants.রং_ব্যাপারীর_বিরং_ব্যাপার);
        titleText.add(Constants.রাত_কেটে_গেলো_নিরাপদেই);
        titleText.add(Constants.রাতের_খাওয়া_দাওয়ার_পর);
        titleText.add(Constants.রেজোলিউট_বেশ_দ্রুত_গতিতে_অগ্রসর_হচ্ছিলো);
        titleText.add(Constants.লেক_পুটুরিয়া);
        titleText.add(Constants.লৌহদানব_বেহেমথ);
        titleText.add(Constants.সমুদ্রতীরে_পৌঁছুতে_আর_কতদিন);
        titleText.add(Constants.সামনে_দেখা);
        titleText.add(Constants.সারারাত_ঘুম_হয়নি_তার);
        titleText.add(Constants.সারারাত_ধরে_জুয়া_খেলা_চলেছে);
        titleText.add(Constants.হুড_বনাম_ব্যাঙ্কস);
        titleText.add(Constants.হয়তো_বেঁচে_আছে_জো);
        titleText.add(Constants.সেই_পুরাতন_পৃথিবী);








        mRecyclerView = (RecyclerView) findViewById(R.id.title_layout_recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerView.setHasFixedSize(true);


        TitleAdapter adapter = new TitleAdapter(mContext, titleText, new MyCustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {

                Toast.makeText(mContext, "clicked - "+String.valueOf(titleText.get(position)), Toast.LENGTH_SHORT).show();

                Intent desIntent = new Intent(mContext,DescriptionActivity.class);

                desIntent.putExtra("titles",String.valueOf(titleText.get(position)));

                startActivity(desIntent);

            }
        });

        mRecyclerView.setAdapter(adapter);

    }
}