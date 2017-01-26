package www.minchoba.com.stopwatch.activity.listview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import www.minchoba.com.stopwatch.R;
import www.minchoba.com.stopwatch.activity.listview.item.MainListViewItem;

public class MainListViewAdapter extends BaseAdapter {
    private ArrayList<MainListViewItem> mainArrayList; // 괄호에 어떤 자료형을 담을지 써준다

    public MainListViewAdapter(ArrayList<MainListViewItem> mainArrayList){
        this.mainArrayList = mainArrayList;
    }

    @Override
    public int getCount() {
        return mainArrayList.size();    // list 수 만큼 크기를 설정해라.
    }

    @Override
    public Object getItem(int i) {
        return mainArrayList.get(i);    // 해당 list의 아이템을 정수형으로 갯수를 받아와서 get.
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, final ViewGroup viewGroup) {
        // i: item view를 가져온다, 인자 i(index)는 몇번째의 list에 data를 가져와 넣을것인가.
        // id가 모두 같아 구분이 안되므로 index 번호로 가져옴.
        // view: 각 list에 실제로 그릴 view, viewGroup = parent: 어떤 view에 그리는지 context를 포함 중요도 낮음.
        final Context context = viewGroup.getContext();

        if (view == null){                  // 화면에 벗어난 만들어져있던 view?입니까. null: 아니다 새 것이다
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.listview_item_main,viewGroup, false);
        } //그릴 view를 가져오는 조건문.

        final MainListViewItem mainListViewItem = mainArrayList.get(i); // 함수호출을 짧게 하기위해


        TextView tvTime = (TextView) view.findViewById(R.id.tv_listview_item_time);
        final Button btnCtrl = (Button) view.findViewById(R.id.btn_listview_item_control);
        // 어댑터에서 그리기위해 아이템들을 가져옴
        tvTime.setText(mainArrayList.get(i).getTimeStr());
        //tvTime의 글자를 셋팅해주는데, mainArrayList의 해당 i(index)에 TimeStr을 get 해서 설정.

        if(mainListViewItem.getIsRunning()){
            btnCtrl.setText("중지");
        }
        else{
            btnCtrl.setText("시작");
        }
        btnCtrl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mainListViewItem.getIsRunning()){
                    btnCtrl.setText("시작");
                    mainListViewItem.setIsRunning(false);
                }
                else{
                    btnCtrl.setText("중지");
                    mainListViewItem.setIsRunning(true);
                }

            }
        });

        Button btnDelete = (Button) view.findViewById(R.id.btn_listview_item_delete);
        // To draw, get items 그리기위해 아이템들을 가져옴
        btnDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(viewGroup.getContext(),"삭제요",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
        // 완료된 그림을 보여주기위해 return.

    }
}
