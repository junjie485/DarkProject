package com.example.darkproject;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.text.SimpleDateFormat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        long time=System.currentTimeMillis();
        SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm");
        String date=dateFormat.format(time);
        String[] text=date.split(":");
        if(Integer.parseInt(text[0])>18||Integer.parseInt(text[0])<7){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }

 /*       Paint paint=new Paint();
        ColorMatrix matrix=new ColorMatrix();
        matrix.setSaturation(0);
        paint.setColorFilter(new ColorMatrixColorFilter(matrix));
        getWindow().getDecorView().setLayerType(View.LAYER_TYPE_HARDWARE,paint);*/
    }

/*    @Nullable
    @Override
    public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        if(name.equals("FrameLayout")){
            int count=attrs.getAttributeCount();
            for(int i=0;i<count;i++){
                String attributeName = attrs.getAttributeName(i);
                String attributeValue = attrs.getAttributeValue(i);
                if (attributeName.equals("id")) {
                    int id = Integer.parseInt(attributeValue.substring(1));
                    String idVal = getResources().getResourceName(id);
                    if ("android:id/content".equals(idVal)) {
                        GrayFrameLayout grayFrameLayout = new GrayFrameLayout(context, attrs);
                        return grayFrameLayout;
                    }
                }
            }
        }
        return super.onCreateView(name, context, attrs);
    }*/



}
