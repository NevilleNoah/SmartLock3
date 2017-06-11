package com.example.asus.smartlock;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.asus.smartlock.Adapters.MessageAdapter;
import com.example.asus.smartlock.ObjectBySelf.MessageItemObject;

import java.util.ArrayList;
import java.util.List;


public class MessageFragment extends Fragment {
    private List<MessageItemObject> messageItemObjects;
    private MessageAdapter messageAdapter;
    private ListView messageList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View messageView=inflater.inflate(R.layout.fragment_message, container, false);
        messageList=(ListView)messageView.findViewById(R.id.messageList);
        messageAdapter=new MessageAdapter(getActivity(),R.layout.item_message,getData());
        messageList.setAdapter(messageAdapter);
        return messageView;
    }

    public List<MessageItemObject> getData(){
        messageItemObjects=new ArrayList<MessageItemObject>();
        int[] users={R.string.user1,R.string.user2,R.string.user3,R.string.user4,R.string.user1,R.string.user3,R.string.user2,R.string.user4,R.string.user3};
        int[] messageTimes={R.string.messageTime1,R.string.messageTime2,R.string.messageTime3,R.string.messageTime4,R.string.messageTime5,R.string.messageTime6,R.string.messageTime7,R.string.messageTime8,R.string.messageTime9};
        int[] messageImages={R.drawable.l,R.drawable.n,R.drawable.b,R.drawable.j,R.drawable.l,R.drawable.b,R.drawable.n,R.drawable.j,R.drawable.b};
        int[] messageStatus={R.string.messageStatus1,R.string.messageStatus2,R.string.messageStatus2,R.string.messageStatus1,R.string.messageStatus2,R.string.messageStatus2,R.string.messageStatus1,R.string.messageStatus2,R.string.messageStatus1};

        for (int i = 0; i < messageTimes.length; i++) {
            MessageItemObject messageItemObject=new MessageItemObject(users[i],messageTimes[i],messageStatus[i],messageImages[i]);
            messageItemObjects.add(messageItemObject);
        }
        return messageItemObjects;
    }


}
