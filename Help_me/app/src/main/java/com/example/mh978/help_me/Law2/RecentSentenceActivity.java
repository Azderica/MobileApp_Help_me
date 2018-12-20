package com.example.mh978.help_me.Law2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mh978.help_me.R;

public class RecentSentenceActivity extends AppCompatActivity implements RecentSentenceSearchFragment.OnRecentSentenceSelectedListener {
    static RecentSentenceActivity instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent_sentence);

        if (findViewById(R.id.searchFragment) != null)
        {
            if (savedInstanceState != null)
                return;
        }

        instance = this;

        RecentSentenceSearchFragment rssearchfragment = new RecentSentenceSearchFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.parentView, rssearchfragment).commit();
        RecentSentenceDetailFragment rsdetailfragment = new RecentSentenceDetailFragment();
    }

    @Override
    public void OnRecentSentenceSelected()
    {
        RecentSentenceDetailFragment rsdetailfragment = (RecentSentenceDetailFragment)getSupportFragmentManager().findFragmentById(R.id.detailFragment);

        if (rsdetailfragment != null)
        {
            rsdetailfragment.updateDetailView();
        }
        else
        {
            RecentSentenceDetailFragment newFragment = new RecentSentenceDetailFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.parentView, newFragment).addToBackStack(null).commit();
        }
    }

}
