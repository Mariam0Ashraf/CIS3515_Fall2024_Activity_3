package edu.temple.inclassuiacvitivity

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.BaseAdapter

class TextSizeAdapter(private val numbers: List<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return numbers.size
    }

    override fun getItem(position: Int): Any {
        return numbers[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val context = parent?.context ?: return TextView(parent?.context)
        val textView = convertView as? TextView ?: TextView(context)

        val number = numbers[position]

        textView.text = number.toString()

        textView.textSize = number.toFloat()

        return textView
    }
}
