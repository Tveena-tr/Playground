package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.guigest.frgmentonclick.R;
import com.guigest.frgmentonclick.RecyclerInterface;

import java.util.List;

import model.Mymodel;

import static model.Mymodel.One_type;
import static model.Mymodel.Two_type;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Mymodel>list;
    private LayoutInflater layoutInflater;
    private RecyclerInterface recyclerInterface;





public MyAdapter( List<Mymodel>list ,RecyclerInterface recyclerInterface){
    this.recyclerInterface=recyclerInterface;

this.list=list;
}

    @Override
    public int getItemViewType(int position) {

    Mymodel model =list.get(position);
    if(model!=null){
        return model.getType();
    }
    return 0;
}

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
    View view;
    switch (viewType){
        case One_type:
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card1,parent,false);
            return new oneViewHolder(view);
        case Two_type:
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card2,parent,false);
            return  new twoViewHolder(view);

    }


        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    Mymodel model = list.get(position);
    switch (model.getType()){
        case One_type:
            ((oneViewHolder)holder).title.setText(model.getTitle());
            break;
        case  Two_type:
            ((twoViewHolder)holder).title.setText(model.getTitle());
            break;
    }

}

    @Override
    public int getItemCount() {
        return list.size();
    }


   class oneViewHolder extends RecyclerView.ViewHolder {
    TextView title;

        public oneViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.text_title);

            view.linearlayoutsetOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    recyclerInterface.onItemClick(getAdapterPosition());
                    return ;
                }
            });
        }
    }
   class twoViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        public twoViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.text_title);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    recyclerInterface.onItemClick1(getAdapterPosition());
                    return ;
                }
            });
        }
    }
}
