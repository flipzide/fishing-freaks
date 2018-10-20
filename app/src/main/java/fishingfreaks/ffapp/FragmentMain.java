package fishingfreaks.ffapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class FragmentMain extends Fragment {

    private ListView mListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        mListView = (ListView) view.findViewById(R.id.listView);

        ArrayList<Card> list = new ArrayList<>();

        list.add(new Card("drawable://" + R.drawable.fish0, "Great day fishing with friends at a new lake in Florida!"));
        list.add(new Card("drawable://" + R.drawable.fish2, "Big Bass Factory"));
        list.add(new Card("drawable://" + R.drawable.fish6, "Flounder for dinner"));
        list.add(new Card("drawable://" + R.drawable.fish7, "Great fishing today!"));
        list.add(new Card("drawable://" + R.drawable.fish8, "The Mondo\'s are biting!"));
        list.add(new Card("drawable://" + R.drawable.fish4, "Large Mouth Bass"));
        list.add(new Card("drawable://" + R.drawable.smb0, "Small Mouth Bass"));
        list.add(new Card("drawable://" + R.drawable.smb1, "Mondo Small Mouth"));
        list.add(new Card("drawable://" + R.drawable.smb2, "Biggest of the day!"));
        list.add(new Card("drawable://" + R.drawable.smb3, "My PB Small Mouth!"));
        list.add(new Card("drawable://" + R.drawable.fish5, "My PB Large Mouth!"));


        CustomListAdapter adapter = new CustomListAdapter(getActivity(), R.layout.card_layout_main, list);
        mListView.setAdapter(adapter);

        return view;
    }

}
