package com.example.usersandposts.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.usersandposts.R
import com.example.usersandposts.models.User
import com.example.usersandposts.utils.CellClickListener


class UsersListAdapter(
    private val users: List<User>
): RecyclerView.Adapter<UsersListAdapter.ViewHolder>(){


    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val userId: TextView
        val userEmail:TextView
        val userName:TextView

        init {
            userId = view.findViewById(R.id.txt_user_item_id_content)
            userEmail = view.findViewById(R.id.txt_user_item_email_content)
            userName = view.findViewById(R.id.txt_user_item_name_content)


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.users_list_item, parent, false)



        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = users[position]
        holder.userId.text = user.id.toString()
        holder.userEmail.text = user.email
        holder.userName.text = user.name

    }

    override fun getItemCount(): Int {
        return users.size
    }

}