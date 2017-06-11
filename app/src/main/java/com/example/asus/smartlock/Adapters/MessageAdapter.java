package com.example.asus.smartlock.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.asus.smartlock.ObjectBySelf.MessageItemObject;
import com.example.asus.smartlock.R;
import com.example.asus.smartlock.lib.shapedimageview.ShapedImageView;

import java.util.List;

/**
 * Created by asus on 2017/6/11/011.
 */

public class MessageAdapter extends BaseAdapter {
    private Context context;
    private int item_message;
    private List<MessageItemObject> messageItemObjects;

    public MessageAdapter(Context context,int item_message,List<MessageItemObject> messageItemObjects){
        this.context=context;
        this.item_message=item_message;
        this.messageItemObjects=messageItemObjects;
    }
    @Override
    public int getCount() {
        return messageItemObjects.size();
    }

    @Override
    public Object getItem(int position) {
        return messageItemObjects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.item_message,parent,false);

        TextView messsageUser=(TextView)view.findViewById(R.id.messageUser);
        TextView messageTime=(TextView)view.findViewById(R.id.messageTime);
        TextView messageStatus=(TextView)view.findViewById(R.id.messageStatus);
        ShapedImageView shapedImageView=(ShapedImageView)view.findViewById(R.id.messageImage);


        messsageUser.setText(messageItemObjects.get(position).getUser());
        messageTime.setText(messageItemObjects.get(position).getMessageTime());
        messageStatus.setText(messageItemObjects.get(position).getMessageStatus());
        shapedImageView.setImageResource(messageItemObjects.get(position).getMessageImage());
        if(messageItemObjects.get(position).getMessageStatus()==R.string.messageStatus2){
            messageStatus.setTextColor(Color.parseColor("#FF0000"));
        }

        return view;
    }
}
