package com.example.dewa.myapplication;

/**
 * Created by DEWA on 11/28/2018.
 */
public class SpalshScreenActivity extends AppCompatActivity {
    TextView tvSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_screen);
        tvSplash=findViewById(R.id.tv_splash);

        setContentView(R.layout.activity_spalsh_screen);



        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        }, 3000L);
    }
}