package mbsoft.com.cinf;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import mbsoft.com.cinf.utils.Toaster;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener{
    private View cat1;
    private View cat2;
    private View cat3;
    private View cat4;
    private View cat5;
    private View cat6;
    private View cat7;
    private View cat8;

    private ImageView imgCat1;
    private TextView txtCat1;
    private ImageView imgCat2;
    private TextView txtCat2;
    private ImageView imgCat3;
    private TextView txtCat3;
    private ImageView imgCat4;
    private TextView txtCat4;
    private ImageView imgCat5;
    private TextView txtCat5;
    private ImageView imgCat6;
    private TextView txtCat6;
    private ImageView imgCat7;
    private TextView txtCat7;
    private ImageView imgCat8;
    private TextView txtCat8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initViews();

        this.txtCat1.setText("Veg 1");
        this.txtCat2.setText("Veg 2");
        this.txtCat3.setText("Veg 3");
        this.txtCat4.setText("Veg 4");
        this.txtCat5.setText("Veg 5");
        this.txtCat6.setText("Veg 6");
        this.txtCat7.setText("Veg 7");
        this.txtCat8.setText("Veg 8");

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }

    private void initViews() {

        this.cat1 = findViewById(R.id.inc1);
        this.cat2 = findViewById(R.id.inc2);
        this.cat3 = findViewById(R.id.inc3);
        this.cat4 = findViewById(R.id.inc4);
        this.cat5 = findViewById(R.id.inc5);
        this.cat6 = findViewById(R.id.inc6);
        this.cat7 = findViewById(R.id.inc7);
        this.cat8 = findViewById(R.id.inc8);


        // init special views
        this.imgCat1 = this.cat1.findViewById(R.id.imgLogo);
        this.txtCat1 = this.cat1.findViewById(R.id.txtTitle);
        this.imgCat2 = this.cat2.findViewById(R.id.imgLogo);
        this.txtCat2 = this.cat2.findViewById(R.id.txtTitle);
        this.imgCat3 = this.cat3.findViewById(R.id.imgLogo);
        this.txtCat3 = this.cat3.findViewById(R.id.txtTitle);
        this.imgCat4 = this.cat4.findViewById(R.id.imgLogo);
        this.txtCat4 = this.cat4.findViewById(R.id.txtTitle);
        this.imgCat5 = this.cat5.findViewById(R.id.imgLogo);
        this.txtCat5 = this.cat5.findViewById(R.id.txtTitle);
        this.imgCat6 = this.cat6.findViewById(R.id.imgLogo);
        this.txtCat6 = this.cat6.findViewById(R.id.txtTitle);
        this.imgCat7 = this.cat7.findViewById(R.id.imgLogo);
        this.txtCat7 = this.cat7.findViewById(R.id.txtTitle);
        this.imgCat8 = this.cat8.findViewById(R.id.imgLogo);
        this.txtCat8 = this.cat8.findViewById(R.id.txtTitle);

        this.cat1.setOnClickListener(this);
        this.cat2.setOnClickListener(this);
        this.cat3.setOnClickListener(this);
        this.cat4.setOnClickListener(this);
        this.cat5.setOnClickListener(this);
        this.cat6.setOnClickListener(this);
        this.cat7.setOnClickListener(this);
        this.cat8.setOnClickListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_home:
                return true;
            case R.id.navigation_dashboard:
                return true;
            case R.id.navigation_notifications:
                return true;
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent intent = new Intent(this,FoodListActivity.class);
        intent.putExtra("clickedItem",id);
        startActivity(intent);
    }
}
