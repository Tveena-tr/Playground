package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.requisition_items_recycler_11.R;

import java.util.List;

import Model.ListItem;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private LayoutInflater layoutInflater;
    private List<String> listItem;


    public	Adapter(Context	context, List listItem){

        this.listItem=listItem;
        this.layoutInflater = LayoutInflater.from(context);

    }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = layoutInflater.inflate(R.layout.list,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, int i) {
        String text	=	listItem.get(i);

        viewHolder.text.setText( text);



    }

    @Override
    public int getItemCount() {
        return	listItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView text;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text=(TextView)itemView.findViewById(R.id.text);
        }
    }
}
