package com.example.taufiq.themovies.view.view.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.taufiq.themovies.R;
import com.example.taufiq.themovies.view.adapter.AdapterMovies;
import com.example.taufiq.themovies.view.adapter.AdapterTv;
import com.example.taufiq.themovies.view.model.Movies;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TvFragment extends Fragment {

    List<Movies> movieItems = new ArrayList<>();

    public TvFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        moviesDataLoad();
        return inflater.inflate(R.layout.fragment_tv, container, false);
    }



    /*
    *
    * Load TVshows data
    * */
    private void moviesDataLoad() {

        movieItems.add(new Movies("The Flash", getResources().getString(R.string.flash_overview),
                getResources().getString(R.string.flash_date), "(2014)", "Sci-Fi", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fki3kBlwJzFp8QohL43g9ReV455.jpg", "6.7", "44m", "https://image.tmdb.org/t/p/original/jC1KqsFx8ZyqJyQa2Ohi7xgL7XC.jpg", "https://image.tmdb.org/t/p/h30/ge9hzeaU7nMtQ4PjkFlc68dGAJ9.png"," "));

        movieItems.add(new Movies("Fear the Walking Dead", "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                "August 23, 2015", "(2015)", "Horror", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lZMb3R3e5vqukPbeDMeyYGf2ZNG.jpg", "6.3", "43m,60m", "https://image.tmdb.org/t/p/original/nUXzdD2Jo3wV9Q7mIZjK46Yyty4.jpg", "https://image.tmdb.org/t/p/h30/pmvRmATOCaDykE6JrVoeYxlFHw3.png"," "));

        movieItems.add(new Movies("Arrow", "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "October 10, 2012", "(2012)", "Crime", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/mo0FP1GxOFZT4UDde7RFDz5APXF.jpg", "5.8", "42m", "https://image.tmdb.org/t/p/original/eb0JaHVCEMhFwDUrjEJ0Ac8sQV.jpg", "https://image.tmdb.org/t/p/h30/ge9hzeaU7nMtQ4PjkFlc68dGAJ9.png"," "));

        movieItems.add(new Movies("Family Guy", "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "January 31, 1999", "(1999)", "Comedy", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/q3E71oY6qgAEiw6YZIHDlHSLwer.jpg", "6.5", "22m", "https://image.tmdb.org/t/p/original/2hzLQUJu4rJfm3LG8g52IC82ooj.jpg", "https://image.tmdb.org/t/p/h30/1DSpHrWyOORkL9N2QHX7Adt31mQ.png"," "));

        movieItems.add(new Movies("The Simpsons", "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "December 17, 1989", "(1989)", "Comedy", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/yTZQkSsxUFJZJe67IenRM0AEklc.jpg", "7.1", "22m", "https://image.tmdb.org/t/p/original/f5uNbUC76oowt5mt5J9QlqrIYQ6.jpg", "https://image.tmdb.org/t/p/h30/1DSpHrWyOORkL9N2QHX7Adt31mQ.png"," "));

        movieItems.add(new Movies("13 Reasons Why", "After a teenage girl's perplexing suicide, a classmate receives a series of tapes that unravel the mystery of her tragic choice.",
                "March 31, 2017", "(2017)", "Mystery", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/nel144y4dIOdFFid6twN5mAX9Yd.jpg", "7.1", "55m", "https://image.tmdb.org/t/p/original/sZb21d6EWKAEKZ9GrLQeMwX4cWN.jpg", "https://image.tmdb.org/t/p/h30/wwemzKWzjKYJFfCeiB57q3r4Bcm.png"," "));

        movieItems.add(new Movies("Cannon Busters", "With a maintenance robot and a deadly fugitive tagging along, friendship droid S.A.M searches for its best friend, the heir to a kingdom under siege.",
                "August 15, 2019", "(2019)", "Animation", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/etU8k5nzNG0HfIIDGcM5TP4HAWS.jpg", "6.0", "24m", "https://image.tmdb.org/t/p/original/cOCaCBTlnCsCgr0i0acuE52cDvo.jpg", "https://image.tmdb.org/t/p/h30/wwemzKWzjKYJFfCeiB57q3r4Bcm.png"," "));

        movieItems.add(new Movies("Gotham", "Before there was Batman, there was GOTHAM. Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "September 22, 2014", "(2014)", "Fantasy", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4XddcRDtnNjYmLRMYpbrhFxsbuq.jpg", "6.9", "43m, 60m", "https://image.tmdb.org/t/p/original/bRFmBU0VPr9s1oeJHuS5Zb5nZQS.jpg", "https://image.tmdb.org/t/p/h30/1DSpHrWyOORkL9N2QHX7Adt31mQ.png"," "));

        movieItems.add(new Movies("Grey's Anatomy", "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "March 27, 2005", "(2005)", "Drama", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eqgIOObafPJitt8JNh1LuO2fvqu.jpg", "6.3", "43m", "https://image.tmdb.org/t/p/original/edmk8xjGBsYVIf4QtLY9WMaMcXZ.jpg", "https://image.tmdb.org/t/p/h30/ndAvF4JLsliGreX87jAc9GdjmJY.png"," "));

        movieItems.add(new Movies("Naruto Shippūden", "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "February 15, 2007", "(2017)", "Animation", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/y600umqCiIlfPo4kJM6gnzbD3EE.jpg", "7.5", "22m", "https://image.tmdb.org/t/p/original/mVMAzqnqmBRhep2H22ieYzUSdOW.jpg", "https://image.tmdb.org/t/p/h30/kGRavMqgyx4p2X4C96bjRCj50oI.png"," "));



    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        initRecyclerView(view);

    }

    /**
    * initialize RecyclerView into Fragment
    * @param view
    * */
    private void initRecyclerView(View view){
        RecyclerView recyclerView = view.findViewById(R.id.recycler_tv);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        AdapterTv adapterTv = new AdapterTv(movieItems,view.getContext());
        recyclerView.setAdapter(adapterTv);

    }


}
