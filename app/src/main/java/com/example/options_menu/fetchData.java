package com.example.options_menu;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData extends AsyncTask<Void,Void,Void> {
    String data="";
    String dataParsed="";
    String singleParsed="";

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("https://api.myjson.com/bins/go9zt");
            HttpURLConnection httpURLConnection =(HttpURLConnection) url.openConnection();
            InputStream inputStream=httpURLConnection.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
            String line="";
            while (line!=null){
                line=bufferedReader.readLine();
                data=data+line;
            }
            JSONArray JA=new JSONArray(data);
            for(int i=0;i<JA.length();i++){
                JSONObject JO=(JSONObject)JA.get(i);
                singleParsed="Name"+JO.get("name")+"\n"+
                             "Password"+JO.get("password")+"\n"+
                             "Contact"+JO.get("contact")+"\n"+
                             "Country"+JO.get("country")+"\n";
                dataParsed=dataParsed+singleParsed;
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }catch(JSONException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        context_menu.main_jason.data.setText(this.dataParsed);
    }

    public static class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            return super.onCreateOptionsMenu(menu);
          //  getMenuInflater().inflate( R.menu.options_menu, menu);
           // return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            Toast.makeText(this, "selected item :", Toast.LENGTH_SHORT).show();
            switch (item.getItemId()) {
                case R.id.search_item:
                    return true;

                case R.id.upload_item:
                    return true;
                case R.id.copy_item:
                    return true;
                case R.id.print_item:
                    return true;
                case R.id.share_item:
                    return true;
                case R.id.bookmark_item:
                    return true;
                default:

                    return super.onOptionsItemSelected(item);
            }


        }
    }
}
