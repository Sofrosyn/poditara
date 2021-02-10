package com.sofrosyn.podpitara;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sofrosyn.podpitara.Modals.Show;
import com.sofrosyn.podpitara.adapter.ShowsAdapter;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView featuredShow;
    private RecyclerView category;
    private RecyclerView education;
    private RecyclerView latestEpisode;
    private CarouselView featured;
    private CarouselView campaign;

    private ShowsAdapter showsAdapter;
    private ArrayList<Show> showArrayList;

    int[] sampleImages = {R.drawable.banner_1,R.drawable.banner_2 };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initViews();
        initActions();
    }

private void initViews(){

       featuredShow = findViewById(R.id.recycler_shows);
       category = findViewById(R.id.recycler_category);
       education = findViewById(R.id.recycler_education);
       latestEpisode = findViewById(R.id.recycler_latest);

       featured = findViewById(R.id.activity_featured_banner);
       campaign = findViewById(R.id.activity_campaign_banner);


    featured.setPageCount(sampleImages.length);
    featured.setImageListener(imageListener);

    campaign.setPageCount(sampleImages.length);
    campaign.setImageListener(imageListener);

    featuredShow.setHasFixedSize(true);
    category.setHasFixedSize(true);
    education.setHasFixedSize(true);
    latestEpisode.setHasFixedSize(true);

    featuredShow.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
    category.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
    education.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
    latestEpisode.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));


    showArrayList = new ArrayList<>();

    }

    ImageListener imageListener = (position, imageView) -> imageView.setImageResource(sampleImages[position]);


    private void initActions(){
        Show show1  = new Show();
        show1.setName("Test");

        Show show2  = new Show();
        show2.setName("Test");

        Show show3  = new Show();
        show3.setName("Test");

        Show show4  = new Show();
        show4.setName("Test");

        Show show5  = new Show();
        show5.setName("Test");

        Show show6  = new Show();
        show6.setName("Test");

        Show show7  = new Show();
        show7.setName("Test");

        showArrayList.add(show1);
        showArrayList.add(show2);
        showArrayList.add(show3);
        showArrayList.add(show4);
        showArrayList.add(show5);
        showArrayList.add(show6);
        showArrayList.add(show7);

        showsAdapter = new ShowsAdapter(this,showArrayList);
        featuredShow.setAdapter(showsAdapter);
        category.setAdapter(showsAdapter);
        education.setAdapter(showsAdapter);
        latestEpisode.setAdapter(showsAdapter);


    }


}


