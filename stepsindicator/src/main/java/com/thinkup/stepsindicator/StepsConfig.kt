package com.thinkup.stepsindicator

import android.util.AttributeSet
import android.content.Context
import com.thinkup.stepsindicator.ext.ANIM_DEFAULT_VALUE

class StepsConfig(context: Context, attrs: AttributeSet) {

    init {
        with(context) {
            val attributes = obtainStyledAttributes(attrs, R.styleable.StepsView)
            with(attributes) {
                size = getDimensionPixelSize(
                    R.styleable.StepsView_stepIndicatorSize,
                    getDefaultDimen(context, R.dimen.step_size)
                )
                selectedSize = getDimensionPixelSize(
                    R.styleable.StepsView_stepSelectedIndicatorSize,
                    getDefaultDimen(context, R.dimen.step_size_select)
                )
                completedColor = getResourceId(
                    R.styleable.StepsView_stepCompletedColor,
                    R.color.step_completed
                )
                uncompletedColor = getResourceId(
                    R.styleable.StepsView_stepUncompletedColor,
                    R.color.step_uncompleted
                )
                lineThickness = getDimensionPixelSize(
                    R.styleable.StepsView_stepProgressLineThickness,
                    getDefaultDimen(context, R.dimen.step_line_thickness)
                )
                lineCompletedColor = getResourceId(
                    R.styleable.StepsView_stepProgressLineCompletedColor,
                    R.color.step_completed
                )
                lineUncompletedColor = getResourceId(
                    R.styleable.StepsView_stepProgressLineUncompletedColor,
                    R.color.step_uncompleted
                )
                textCompletedColor = getResourceId(
                    R.styleable.StepsView_stepTextCompletedColor,
                    R.color.step_completed_text
                )
                textUncompletedColor = getResourceId(
                    R.styleable.StepsView_stepTextUncompletedColor,
                    R.color.step_uncompleted_text
                )
                duration = getInt(R.styleable.StepsView_animationDuration, ANIM_DEFAULT_VALUE.toInt())
                border = getBoolean(R.styleable.StepsView_borders, true)
            }
        }
    }

    private fun getDefaultDimen(context: Context, id: Int): Int = context.resources.getDimensionPixelSize(id)

    var uncompletedColor: Int
        internal set
    var completedColor: Int
        internal set
    var size: Int
        internal set
    var selectedSize: Int
        internal set
    var lineUncompletedColor: Int
        internal set
    var lineCompletedColor: Int
        internal set
    var lineThickness: Int
        internal set
    var textUncompletedColor: Int
        internal set
    var textCompletedColor: Int
        internal set
    var duration: Int
        internal set
    var border: Boolean
        internal set
}