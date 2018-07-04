package com.example.a28062.listviewexam;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by 28062 on 2018/6/12.
 */

public class myAdapter extends ArrayAdapter {

    private final int ImageId;
    private String radiotext;
    public myAdapter(Context context, int headImage, List<myBean> obj){
        super(context,headImage,obj);
        ImageId = headImage;

    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        myBean myBean = (myBean) getItem(position);
        View view ;
        if (convertView == null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(getContext()).inflate(ImageId,parent,false);
            viewHolder.fruitImage = view.findViewById(R.id.headimage);
            viewHolder.fruitName = view.findViewById(R.id.headtext);
            viewHolder.fruitLayout = view.findViewById(R.id.ll_view);
            viewHolder.fruitRadio = view.findViewById(R.id.radioBtn);
            view.setTag(viewHolder);
        }else{
            view =convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
            viewHolder.fruitImage.setImageResource(myBean.getImageID());
            viewHolder.fruitName.setText(myBean.getText());


        viewHolder.fruitRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.radio1:
                        radiotext = "不打";
                        break;
                    case R.id.radio2:
                        radiotext = "打他";
                        break;
                }
            }
        });
        viewHolder.fruitLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"你点击了第"+position+"项"+"你选择"+radiotext,Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
    class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
        LinearLayout fruitLayout;
        RadioGroup fruitRadio;
    }



//
//        @NonNull
//        @Override
//        public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//            myBean myBean = (myBean) getItem(position);
//            View view;
//            if (convertView == null){
//                view = LayoutInflater.from(getContext()).inflate(ImageId,parent,false);//这个是实例化一个我们自己写的界面Item
//            }else{
//                view =convertView;
//            }
//            LinearLayout linearLayout = view.findViewById(R.id.ll_view);
//            ImageView headImage = view.findViewById(R.id.headimage);
//            TextView headText = view.findViewById(R.id.headtext);
//            RadioGroup radio = view.findViewById(R.id.radioBtn);
//            headImage.setImageResource(myBean.getImageID());
//            headText.setText(myBean.getText());
//            radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {//检查Radio Button那个被点击了
//                @Override
//                public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
//                    switch (i){
//                        case R.id.radio1:
//                            radiotext = "不打";
//                            break;
//                        case R.id.radio2:
//                            radiotext = "打他";
//                            break;
//                    }
//                }
//            });
//            linearLayout.setOnClickListener(new View.OnClickListener() {//检查哪一项被点击了
//                @Override
//                public void onClick(View view) {
//                    Toast.makeText(getContext(),"你点击了第"+position+"项"+"你选择"+radiotext,Toast.LENGTH_SHORT).show();
//                }
//            });
//            return view;
//        }
    }









