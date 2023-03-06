package com.geely.custom.chapter1

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class BasisView(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) : View(context, attrs, defStyle) {

    private lateinit var paint: Paint

    override fun draw(canvas: Canvas) {
        super.draw(canvas)

        paint = Paint()
        paint.color = Color.RED
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 50f

        canvas.drawCircle(190f, 200f, 150f, paint)
    }
}