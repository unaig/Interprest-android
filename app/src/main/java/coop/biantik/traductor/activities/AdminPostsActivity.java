package coop.biantik.traductor.activities;

import android.os.Bundle;

import coop.biantik.traductor.R;

public class AdminPostsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_posts);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}
