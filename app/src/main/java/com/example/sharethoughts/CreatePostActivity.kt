package com.example.sharethoughts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.sharethoughts.daos.PostDao

class CreatePostActivity : AppCompatActivity() {

    private lateinit var postDao: PostDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        val postButton= findViewById<Button>(R.id.postButton)
        val postInput = findViewById<EditText>(R.id.postInput)
        postDao = PostDao()
        postButton.setOnClickListener{
            val input = postInput.text.toString()
            if(input.isNotEmpty()){
                postDao.addPost(input)
                finish()
            }
        }
    }
}