package dev.hackwithsodiq.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.hackwithsodiq.todo.databinding.ActivityTodoListBinding

class TodoListActivity : AppCompatActivity() {

    private lateinit var binding:ActivityTodoListBinding
    private lateinit var adapter:TodoListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTodoListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = TodoListAdapter()

        binding.recyclerView.apply {
            adapter = this@TodoListActivity.adapter
        }
    }
}