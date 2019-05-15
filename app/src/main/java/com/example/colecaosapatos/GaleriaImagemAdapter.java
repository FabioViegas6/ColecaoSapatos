package com.example.colecaosapatos;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class GaleriaImagemAdapter extends PagerAdapter {


    private Context context;

    private int[] imagens = new int[] {
             R.mipmap.ic_launcher_foreground, R.mipmap.imagem2, R.mipmap.imagem4, R.mipmap.imagem3, R.mipmap.imagem6,
            R.mipmap.imagem5, R.mipmap.imagem7, R.mipmap.imagem9, R.mipmap.imagem8
    };

    GaleriaImagemAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return imagens.length;
    }

    @Override
    public boolean isViewFromObject( View view,  Object object) {
        return view.equals(object);

    }

    @Override
    public void destroyItem(ViewGroup pager, int position, Object object) {
        ((ViewPager) pager).removeView((ImageView) object);
    }


    @Override
    public Object instantiateItem(ViewGroup pager, int position) {


        ImageView imagem = new ImageView(context);

        imagem.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imagem.setImageResource(imagens[position]);
        ((ViewPager) pager).addView(imagem);

        return imagem;
    }


}
