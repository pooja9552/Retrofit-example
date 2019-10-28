package com.example.options_menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Heroes {
    private String name;
    private String realname;
    private String team;
    private String firstappearance;
    private String createdby;
    private String publisher;
    private String imageurl;
    private String bio;

    public Heroes(String name, String realname, String team, String firstappearance, String createdby, String publisher, String imageurl, String bio) {
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firstappearance = firstappearance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageurl = imageurl;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstappearance() {
        return firstappearance;
    }

    public String getCreatedby() {
        return createdby;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageurl() {
        return imageurl;
    }

    public String getBio() {
        return bio;
    }

    public static class popup extends AppCompatActivity {
        Button button;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_popup);
            button=findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // PopupMenu popup=new PopupMenu(this,button);
                    //// popup.getMenuInflater().inflate(R.menu.example_item.getmenu);
                    //      popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    // @Override
                    //   public boolean onMenuItemClick(MenuItem item) {
                    //          Toast.makeText(popup.this, "your clicked", Toast.LENGTH_SHORT).show();
                    //   return true;
                 }
                    //  });
                    //popup.show();
    //
                   // }
                      });
                     }
    }
}
