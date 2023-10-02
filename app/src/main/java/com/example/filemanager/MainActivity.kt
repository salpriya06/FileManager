package com.example.filemanager

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = ArrayList<FileItem>()
    private lateinit var recyclerView: RecyclerView
    private lateinit var fileManagerAdapter: FileManagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initTasks()
        initViews()

    }

    private fun initViews() {
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        fileManagerAdapter = FileManagerAdapter(items)
//        tasksAdapter.onItemClickListener = MyOnItemClickListener()
        recyclerView.adapter = fileManagerAdapter


    }

    private fun initTasks() {

        items.add(FileItem(1,"Alarm"))
        items.add(FileItem(2,"Android"))
        items.add(FileItem(3,"DCIM"))
        items.add(FileItem(4,"Screenshots"))
        items.add(FileItem(5,"Music"))
        items.add(FileItem(6,"Movies"))
        items.add(FileItem(7,"Contacts"))
        items.add(FileItem(8,"WhatsApp"))
        items.add(FileItem(9,"Download"))
        items.add(FileItem(10,"Documents"))

    }

    }
