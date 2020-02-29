package com.example.angry_birds_shooter;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import static com.example.angry_birds_shooter.GameView.screenRatioX;
import static com.example.angry_birds_shooter.GameView.screenRatioY;

public class Bullet {
    int x,y,widht,height;
    Bitmap bullet;

    Bullet(Resources res){
        bullet = BitmapFactory.decodeResource(res,R.drawable.bullet);

         widht = bullet.getWidth();
         height = bullet.getHeight();

        widht /= 4;
        height /= 4;

        widht = (int) (widht*screenRatioX);
        height = (int) (height*screenRatioY);

        bullet = Bitmap.createScaledBitmap(bullet, widht,height,false);


    }
    Rect getCollisonShape(){

        return new Rect(x,y,x+widht, y+height);
    }
}
