package com.thinkup.stepsindicator

import android.util.AttributeSet
import android.content.Context
import androidx.annotation.RestrictTo
import com.thinkup.stepsindicator.ext.ANIM_DEFAULT_VALUE

@RestrictTo(RestrictTo.Scope.LIBRARY)
class StepsConfig(context: Context, attrs: AttributeSet? = null) {

    init {
        with(context) {
            val attributes = obtainStyledAttributes(attrs, R.styleable.StepsView)
            with(attributes) {
                size = getDimensionPixelSize(R.styleable.StepsView_stepIndicatorSize, getDefaultDimen(context, R.dimen.step_size))
                selectedSize =
                    getDimensionPixelSize(R.styleable.StepsView_stepSelectedIndicatorSize, getDefaultDimen(context, R.dimen.step_size_select))
                completedColor = getResourceId(R.styleable.StepsView_stepCompletedColor, R.color.step_completed)
                uncompletedColor = getResourceId(R.styleable.StepsView_stepUncompletedColor, R.color.step_uncompleted)
                lineThickness =
                    getDimensionPixelSize(R.styleable.StepsView_stepProgressLineThickness, getDefaultDimen(context, R.dimen.step_line_thickness))
                iconPadding = getDimensionPixelSize(R.styleable.StepsView_iconPadding, getDefaultDimen(context, R.dimen.step_icon_padding))
                lineCompletedColor = getResourceId(R.styleable.StepsView_stepProgressLineCompletedColor, R.color.step_completed)
                lineUncompletedColor = getResourceId(R.styleable.StepsView_stepProgressLineUncompletedColor, R.color.step_uncompleted)
                textCompletedColor = getResourceId(R.styleable.StepsView_stepTextCompletedColor, R.color.step_completed_text)
                textUncompletedColor = getResourceId(R.styleable.StepsView_stepTextUncompletedColor, R.color.step_uncompleted_text)
                iconCompleted = getResourceId(R.styleable.StepsView_stepIconCompleted, R.drawable.tkup_completed_step)
                duration = getInt(R.styleable.StepsView_animationDuration, ANIM_DEFAULT_VALUE.toInt())
                border = getBoolean(R.styleable.StepsView_borders, true)
                shownCompletedIcon = getBoolean(R.styleable.StepsView_shownCompletedIcon, true)
                shownUncompletedResource = getBoolean(R.styleable.StepsView_shownUncompletedResource, true)
                isTouchable = getBoolean(R.styleable.StepsView_isTouchable, true)
                keepCompletedSize = getBoolean(R.styleable.StepsView_keepCompletedSize, false)
                lineMargins = getDimensionPixelSize(R.styleable.StepsView_lineMargins, getDefaultDimen(context, R.dimen.step_line_margins))
                stepTextSize = getDimension(R.styleable.StepsView_stepTextSize, getDefaultFloatDimen(context, R.dimen.step_text_size))
                stepTextFont = getResourceId(R.styleable.StepsView_stepTextFont, -1)
            }
        }
    }

    @RestrictTo(RestrictTo.Scope.LIBRARY)
    fun getDefaultDimen(context: Context, id: Int): Int = context.resources.getDimensionPixelSize(id)

    @RestrictTo(RestrictTo.Scope.LIBRARY)
    fun getDefaultFloatDimen(context: Context, id: Int): Float = context.resources.getDimension(id)

    var uncompletedColor: Int
        internal set
    var completedColor: Int
        internal set
    var size: Int
        internal set
    var selectedSize: Int
        internal set
    var iconPadding: Int
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
    var iconCompleted: Int
        internal set
    var duration: Int
        internal set
    var border: Boolean
        internal set
    var shownCompletedIcon: Boolean
        internal set
    var shownUncompletedResource: Boolean
        internal set
    var isTouchable: Boolean
        internal set
    var keepCompletedSize: Boolean
        internal set
    var stepTextSize: Float
        internal set
    var stepTextFont: Int
        internal set
    var lineMargins: Int
        internal set
}