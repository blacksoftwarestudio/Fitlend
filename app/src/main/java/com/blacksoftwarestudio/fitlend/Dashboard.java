package com.blacksoftwarestudio.fitlend;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import org.jetbrains.annotations.NotNull;

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;

    private long backPressedTime;

    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout_1);

        drawerLayout.setScrimColor(getResources().getColor(android.R.color.transparent));

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);

        NestedScrollView nestedScrollView = findViewById(R.id.nested_scroll_view_1);

        BottomAppBar bottomAppBar = findViewById(R.id.bottomBar);

        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (scrollY > oldScrollY) {
                    bottomAppBar.setVisibility(View.INVISIBLE);
                } else {
                    bottomAppBar.setVisibility(View.VISIBLE);
                }
            }
        });

        ImageView imageView1 = findViewById(R.id.image_view_1);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        ImageView imageView2 = findViewById(R.id.image_view_2);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Settings.class);
                startActivity(intent);
            }
        });

        CardView cardView1 = findViewById(R.id.card_view_3);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Stats.class);
                startActivity(intent);
            }
        });

        CardView cardView2 = findViewById(R.id.card_view_4);

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Calendar.class);
                startActivity(intent);
            }
        });

        CardView cardView3 = findViewById(R.id.card_view_5);

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Timer.class);
                startActivity(intent);
            }
        });

        CardView cardView6 = findViewById(R.id.card_view_6);

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Stats.class);
                startActivity(intent);
            }
        });

        CardView cardView7 = findViewById(R.id.card_view_7);

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Calendar.class);
                startActivity(intent);
            }
        });

        CardView cardView8 = findViewById(R.id.card_view_8);

        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Timer.class);
                startActivity(intent);
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.test_1);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.test_1:
                        startActivity(new Intent(getApplicationContext(), Dashboard.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.test_2:
                        startActivity(new Intent(getApplicationContext(), Stats.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.test_3:
                        startActivity(new Intent(getApplicationContext(), Calendar.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.test_4:
                        startActivity(new Intent(getApplicationContext(), Timer.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.test_5:
                        startActivity(new Intent(getApplicationContext(), Settings.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });

    }

    @Override
    public boolean onNavigationItemSelected (@NonNull MenuItem menuItem) {


        int id = menuItem.getItemId();


        switch (id) {

            case R.id.test_1:

                Intent intent = new Intent(Dashboard.this, Dashboard.class);
                startActivity(intent);

                break;

        }

        switch (id) {

            case R.id.test_2:

                Intent intent = new Intent(Dashboard.this, Stats.class);
                startActivity(intent);

                break;

        }

        switch (id) {

            case R.id.test_3:

                Intent intent = new Intent(Dashboard.this, Calendar.class);
                startActivity(intent);

                break;

        }

        switch (id) {

            case R.id.test_4:

                Intent intent = new Intent(Dashboard.this, Timer.class);
                startActivity(intent);

                break;

        }


        switch (id) {

            case R.id.test_5:

                Intent intent = new Intent(Dashboard.this, Settings.class);
                startActivity(intent);

                break;

        }

        return true;

    }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            drawerLayout.closeDrawer(GravityCompat.START);
            moveTaskToBack(true);
            return;
        } else {
            drawerLayout.closeDrawer(GravityCompat.START);
            backToast = Toast.makeText(getBaseContext(), "Ponovo pritisnite za izlaz.", Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();

    }

}
