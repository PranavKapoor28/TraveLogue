package om.example.travellog;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import om.example.travellog.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Travelogue");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);

        CardView cardView1 =findViewById(R.id.list1);
        CardView cardView2=findViewById(R.id.list2);
        CardView cardView3=findViewById(R.id.list3);
        CardView cardView4=findViewById(R.id.list4);
        CardView cardView5=findViewById(R.id.list5);
        CardView cardView6=findViewById(R.id.list6);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View resume) {


                Intent resumeper = new Intent(getApplicationContext(), DetailActivity.class);
                startActivity(resumeper);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View about) {


                Intent resumeedu = new Intent(getApplicationContext(), DetailActivity.class);
                startActivity(resumeedu);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View CONTACT) {


                Intent resumework = new Intent(getApplicationContext(), DetailActivity.class);
                startActivity(resumework);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View CONTACT) {


                Intent resumeskills = new Intent(getApplicationContext(), DetailActivity.class);
                startActivity(resumeskills);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View CONTACT) {


                Intent resumesummary = new Intent(getApplicationContext(), DetailActivity.class);
                startActivity(resumesummary);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RESUME) {


                Intent resume = new Intent(getApplicationContext(), DetailActivity.class);
                startActivity(resume);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), HomepageActivity.class);
        startActivityForResult(myIntent, 0);

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}


