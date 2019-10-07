package temple.edu.customadapteractivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    Context context;
    String[] text;
    int[] colors;
    LayoutInflater inflater;

    public ColorAdapter(Context context, String[] text, int[] colors)
    {
        this.context = context;
        this.text = text;
        this.colors = colors;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return text.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.spinner_items, null);
        TextView colorText = (TextView) view.findViewById(R.id.colorText);
        colorText.setBackgroundColor(colors[i]);
        colorText.setText(text[i]);
        return view;
    }
}
