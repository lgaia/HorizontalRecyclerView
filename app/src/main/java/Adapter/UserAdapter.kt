package Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apprecyclerview.R
import data.User
import data.UserViewHolder

class UserAdapter(val listUsers:List<User>): RecyclerView.Adapter<UserViewHolder>() {
    // Retorna un objeto viewHolder con un layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return UserViewHolder(layoutInflater.inflate(R.layout.user_item, parent, false))
    }
    // Tamaño de la lista
    override fun getItemCount() = listUsers.size
    // Tomar cada una de las posiciones de mi lista, y se la pasa a la clase ViewHolder para que la pinte
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val item = listUsers[position]
        holder.render(item)
    }
}