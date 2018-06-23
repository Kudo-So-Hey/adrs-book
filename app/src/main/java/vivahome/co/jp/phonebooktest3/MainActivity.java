package vivahome.co.jp.phonebooktest3;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListView();

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();

                if(position==0){
                    onClickLeftTab();
                }else if(position ==1){
                    onClickCenterTab();
                }else{
                    onClickRightTab();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void initListView(){

        // ListViewに表示するリスト項目をArrayListで準備する
        ArrayList data = new ArrayList<>();
        data.add("国語1");
        data.add("社会1");
        data.add("算数1");
        data.add("理科1");
        data.add("生活1");
        data.add("音楽1");
        data.add("図画工作1");
        data.add("家庭1");
        data.add("体育1");

        // リスト項目とListViewを対応付けるArrayAdapterを用意する
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        // ListViewにArrayAdapterを設定する
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }

    private void onClickLeftTab(){
        initListView();
    }

    private void onClickCenterTab(){
        // ListViewに表示するリスト項目をArrayListで準備する
        ArrayList data = new ArrayList<>();
        data.add("国語2");
        data.add("社会2");
        data.add("算数2");
        data.add("理科2");
        data.add("生活2");
        data.add("音楽2");
        data.add("図画工作2");
        data.add("家庭2");
        data.add("体育2");

        // リスト項目とListViewを対応付けるArrayAdapterを用意する
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        // ListViewにArrayAdapterを設定する
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }

    private void onClickRightTab(){
        // ListViewに表示するリスト項目をArrayListで準備する
        ArrayList data = new ArrayList<>();
        data.add("国語3");
        data.add("社会3");
        data.add("算数3");
        data.add("理科3");
        data.add("生活3");
        data.add("音楽3");
        data.add("図画工作3");
        data.add("家庭3");
        data.add("体育3");

        // リスト項目とListViewを対応付けるArrayAdapterを用意する
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        // ListViewにArrayAdapterを設定する
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }


}
