package com.example.c

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactsAdapter (var contactList: List<Contact>,var context:Context):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        holder.tvName.text = currentContact.contactName
        holder.tvPhonenumber.text = currentContact.contactPhoneNumber
        holder.tvEmail.text = currentContact.contactEmail

        if (currentContact.imageUrl.isNotEmpty()) {
            Picasso
                .get()
                .load(currentContact.imageUrl)
                .resize(80, 80)
                .centerCrop()
                .into(holder.imgContact)
//                .placeholder(R.drawable.person)


            holder.clContact.setOnClickListener {
                var intent = Intent(context, ViewContactsActivity::class.java)
                intent.putExtra("contactId",currentContact.id)
                intent.putExtra("name", currentContact.contactName)
                intent.putExtra("phonenumber", currentContact.contactPhoneNumber)
                intent.putExtra("email", currentContact.contactEmail)
                intent.putExtra("image", currentContact.imageUrl)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)

            }
        }
    }
    override fun getItemCount(): Int {
        return contactList.size

    }
}
class ContactViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvPhonenumber = itemView.findViewById<TextView>(R.id.tvPhonenumber)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var imgContact = itemView.findViewById<ImageView>(R.id.imgContact)
    var clContact = itemView.findViewById<CardView>(R.id.clContact)
}
