import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mad314_1895757_pa2.Activity2;
import com.example.mad314_1895757_pa2.R;

import java.util.ArrayList;
import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<Activity2> {
    private LayoutInflater mInflater;
    private List<Student> mData = new ArrayList<>();

    public StudentAdapter(Context context){
        this.mInflater = LayoutInflater.from(context);
        this.mData.addAll(StudentRepository.getInstance().getStudents());
    }
    @NonNull
    @Override
    public Activity2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.activity_2,parent,false);
        return new Activity2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Activity2 holder, int position) {
        List<Student> students = StudentRepository.getInstance().getStudents();

    }

    @Override
    public int getItemCount() {
        return StudentRepository.getInstance().getStudents().name;
    }
}
