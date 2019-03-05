package com.example.mini_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ImageUpdate();
    }
    public void ImageUpdate(){

        int startArray[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int N = 4;
        int resultArray[] = new int [4];
        for (int i = 0; i<N; i++){

            int seed = (int)(Math.random()*(startArray.length - i));
            resultArray[i] = startArray[seed];
            Data.Choose[i] = resultArray[i];
            startArray[seed] = startArray[startArray.length-i-1];
            }

        Button btn = findViewById(R.id.button);
        switch(resultArray[0]){
            case 0 :{ btn.setBackgroundResource(R.drawable.bear);}break;
            case 1 :{ btn.setBackgroundResource(R.drawable.bird);}break;
            case 2 :{ btn.setBackgroundResource(R.drawable.cat);}break;
            case 3 :{ btn.setBackgroundResource(R.drawable.elephant);}break;
            case 4 :{ btn.setBackgroundResource(R.drawable.fish);}break;
            case 5 :{ btn.setBackgroundResource(R.drawable.flower);}break;
            case 6 :{ btn.setBackgroundResource(R.drawable.giraffe);}break;
            case 7 :{ btn.setBackgroundResource(R.drawable.honey);}break;
            case 8 :{ btn.setBackgroundResource(R.drawable.house);}break;
            case 9 :{ btn.setBackgroundResource(R.drawable.hypo);}break;
            case 10 :{ btn.setBackgroundResource(R.drawable.kangaroo);}break;
            case 11 :{ btn.setBackgroundResource(R.drawable.leo);}break;
            case 12 :{ btn.setBackgroundResource(R.drawable.lion);}break;
            case 13 :{ btn.setBackgroundResource(R.drawable.pig);}break;
            case 14 :{ btn.setBackgroundResource(R.drawable.rhino);}break;
            case 15 :{ btn.setBackgroundResource(R.drawable.sun);}break;
            case 16 :{ btn.setBackgroundResource(R.drawable.tiger);}break;
            case 17 :{ btn.setBackgroundResource(R.drawable.wolf);}break;
        }
        Button btn2 = findViewById(R.id.button2);
        switch(resultArray[1]){
            case 0 :{ btn2.setBackgroundResource(R.drawable.bear);}break;
            case 1 :{ btn2.setBackgroundResource(R.drawable.bird);}break;
            case 2 :{ btn2.setBackgroundResource(R.drawable.cat);}break;
            case 3 :{ btn2.setBackgroundResource(R.drawable.elephant);}break;
            case 4 :{ btn2.setBackgroundResource(R.drawable.fish);}break;
            case 5 :{ btn2.setBackgroundResource(R.drawable.flower);}break;
            case 6 :{ btn2.setBackgroundResource(R.drawable.giraffe);}break;
            case 7 :{ btn2.setBackgroundResource(R.drawable.honey);}break;
            case 8 :{ btn2.setBackgroundResource(R.drawable.house);}break;
            case 9 :{ btn2.setBackgroundResource(R.drawable.hypo);}break;
            case 10 :{ btn2.setBackgroundResource(R.drawable.kangaroo);}break;
            case 11 :{ btn2.setBackgroundResource(R.drawable.leo);}break;
            case 12 :{ btn2.setBackgroundResource(R.drawable.lion);}break;
            case 13 :{ btn2.setBackgroundResource(R.drawable.pig);}break;
            case 14 :{ btn2.setBackgroundResource(R.drawable.rhino);}break;
            case 15 :{ btn2.setBackgroundResource(R.drawable.sun);}break;
            case 16 :{ btn2.setBackgroundResource(R.drawable.tiger);}break;
            case 17 :{ btn2.setBackgroundResource(R.drawable.wolf);}break;
        }
        Button btn3 = findViewById(R.id.button3);
        switch(resultArray[2]){
            case 0 :{ btn3.setBackgroundResource(R.drawable.bear);}break;
            case 1 :{ btn3.setBackgroundResource(R.drawable.bird);}break;
            case 2 :{ btn3.setBackgroundResource(R.drawable.cat);}break;
            case 3 :{ btn3.setBackgroundResource(R.drawable.elephant);}break;
            case 4 :{ btn3.setBackgroundResource(R.drawable.fish);}break;
            case 5 :{ btn3.setBackgroundResource(R.drawable.flower);}break;
            case 6 :{ btn3.setBackgroundResource(R.drawable.giraffe);}break;
            case 7 :{ btn3.setBackgroundResource(R.drawable.honey);}break;
            case 8 :{ btn3.setBackgroundResource(R.drawable.house);}break;
            case 9 :{ btn3.setBackgroundResource(R.drawable.hypo);}break;
            case 10 :{ btn3.setBackgroundResource(R.drawable.kangaroo);}break;
            case 11 :{ btn3.setBackgroundResource(R.drawable.leo);}break;
            case 12 :{ btn3.setBackgroundResource(R.drawable.lion);}break;
            case 13 :{ btn3.setBackgroundResource(R.drawable.pig);}break;
            case 14 :{ btn3.setBackgroundResource(R.drawable.rhino);}break;
            case 15 :{ btn3.setBackgroundResource(R.drawable.sun);}break;
            case 16 :{ btn3.setBackgroundResource(R.drawable.tiger);}break;
            case 17 :{ btn3.setBackgroundResource(R.drawable.wolf);}break;
        }
        Button btn4 = findViewById(R.id.button4);
        switch(resultArray[3]){
            case 0 :{ btn4.setBackgroundResource(R.drawable.bear);}break;
            case 1 :{ btn4.setBackgroundResource(R.drawable.bird);}break;
            case 2 :{ btn4.setBackgroundResource(R.drawable.cat);}break;
            case 3 :{ btn4.setBackgroundResource(R.drawable.elephant);}break;
            case 4 :{ btn4.setBackgroundResource(R.drawable.fish);}break;
            case 5 :{ btn4.setBackgroundResource(R.drawable.flower);}break;
            case 6 :{ btn4.setBackgroundResource(R.drawable.giraffe);}break;
            case 7 :{ btn4.setBackgroundResource(R.drawable.honey);}break;
            case 8 :{ btn4.setBackgroundResource(R.drawable.house);}break;
            case 9 :{ btn4.setBackgroundResource(R.drawable.hypo);}break;
            case 10 :{ btn4.setBackgroundResource(R.drawable.kangaroo);}break;
            case 11 :{ btn4.setBackgroundResource(R.drawable.leo);}break;
            case 12 :{ btn4.setBackgroundResource(R.drawable.lion);}break;
            case 13 :{ btn4.setBackgroundResource(R.drawable.pig);}break;
            case 14 :{ btn4.setBackgroundResource(R.drawable.rhino);}break;
            case 15 :{ btn4.setBackgroundResource(R.drawable.sun);}break;
            case 16 :{ btn4.setBackgroundResource(R.drawable.tiger);}break;
            case 17 :{ btn4.setBackgroundResource(R.drawable.wolf);}break;
        }

        int name = (int)(Math.random()*3);
        switch (resultArray[name]){
            case 0 :{ ((TextView)findViewById(R.id.textView_name)).setText("bear");}break;
            case 1 :{ ((TextView)findViewById(R.id.textView_name)).setText("bird");}break;
            case 2 :{ ((TextView)findViewById(R.id.textView_name)).setText("cat");}break;
            case 3 :{ ((TextView)findViewById(R.id.textView_name)).setText("elephant");}break;
            case 4 :{ ((TextView)findViewById(R.id.textView_name)).setText("fish");}break;
            case 5 :{ ((TextView)findViewById(R.id.textView_name)).setText("flower");}break;
            case 6 :{ ((TextView)findViewById(R.id.textView_name)).setText("giraffe");}break;
            case 7 :{ ((TextView)findViewById(R.id.textView_name)).setText("honey");}break;
            case 8 :{ ((TextView)findViewById(R.id.textView_name)).setText("house");}break;
            case 9 :{ ((TextView)findViewById(R.id.textView_name)).setText("hypo");}break;
            case 10 :{ ((TextView)findViewById(R.id.textView_name)).setText("kangaroo");}break;
            case 11 :{ ((TextView)findViewById(R.id.textView_name)).setText("leo");}break;
            case 12 :{ ((TextView)findViewById(R.id.textView_name)).setText("lion");}break;
            case 13 :{ ((TextView)findViewById(R.id.textView_name)).setText("pig");}break;
            case 14 :{ ((TextView)findViewById(R.id.textView_name)).setText("rhino");}break;
            case 15 :{ ((TextView)findViewById(R.id.textView_name)).setText("sun");}break;
            case 16 :{ ((TextView)findViewById(R.id.textView_name)).setText("tiger");}break;
            case 17 :{ ((TextView)findViewById(R.id.textView_name)).setText("wolf");}break;
        }
        Data.Name = resultArray[name];
        String Score = String.valueOf(Data.Score);
        ((TextView)findViewById(R.id.textView_Score)).setText(Score);
    }
    public void BTN_Click(View view){
              if(Data.Choose[0] == Data.Name){
                  Toast toastCenter = Toast.makeText(FirstActivity.this,"GOOD！",Toast.LENGTH_SHORT);
                  toastCenter.setGravity(Gravity.CENTER,0,0);
                  toastCenter.show();
                  ++ Data.Score;
                  ImageUpdate();
              }else{
                  Toast toastCenter = Toast.makeText(FirstActivity.this,"GAME OVER！",Toast.LENGTH_SHORT);
                  toastCenter.setGravity(Gravity.CENTER,0,0);
                  toastCenter.show();
                  Data.Score = 0;
                  ImageUpdate();
              }
    }
    public void BTN2_Click(View view){
        if(Data.Choose[1] == Data.Name){
            Toast toastCenter = Toast.makeText(FirstActivity.this,"GOOD！",Toast.LENGTH_SHORT);
            toastCenter.setGravity(Gravity.CENTER,0,0);
            toastCenter.show();
            ++ Data.Score;
            ImageUpdate();
        }else{
            Toast toastCenter = Toast.makeText(FirstActivity.this,"GAME OVER！",Toast.LENGTH_SHORT);
            toastCenter.setGravity(Gravity.CENTER,0,0);
            toastCenter.show();
            Data.Score = 0;
            ImageUpdate();
        }
    }
    public void BTN3_Click(View view){
        if(Data.Choose[2] == Data.Name){
            Toast toastCenter = Toast.makeText(FirstActivity.this,"GOOD！",Toast.LENGTH_SHORT);
            toastCenter.setGravity(Gravity.CENTER,0,0);
            toastCenter.show();
            ++ Data.Score;
            ImageUpdate();
        }else{
            Toast toastCenter = Toast.makeText(FirstActivity.this,"GAME OVER！",Toast.LENGTH_SHORT);
            toastCenter.setGravity(Gravity.CENTER,0,0);
            toastCenter.show();
            Data.Score = 0;
            ImageUpdate();
        }
    }
    public void BTN4_Click(View view){
        if(Data.Choose[3] == Data.Name){
            Toast toastCenter = Toast.makeText(FirstActivity.this,"GOOD！",Toast.LENGTH_SHORT);
            toastCenter.setGravity(Gravity.CENTER,0,0);
            toastCenter.show();
            ++ Data.Score;
            ImageUpdate();
        }else{
            Toast toastCenter = Toast.makeText(FirstActivity.this,"GAME OVER！",Toast.LENGTH_SHORT);
            toastCenter.setGravity(Gravity.CENTER,0,0);
            toastCenter.show();
            Data.Score = 0;
            ImageUpdate();
        }
    }

}




