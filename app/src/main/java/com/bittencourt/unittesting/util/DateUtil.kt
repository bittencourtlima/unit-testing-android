package com.bittencourt.unittesting.util

import java.text.SimpleDateFormat
import java.util.*


object DateUtil {
    private const val FULL_DATE_FORMAT = "MM-yyyy"
    private const val MONTH_DATE_FORMAT = "MM"
    private const val WRITTEN_MONTH_DATE_FORMAT = "MMM"

    val currentMonthYearTimeStamp: String
        get(){
            val dateFormat =
                SimpleDateFormat(
                    FULL_DATE_FORMAT,
                    Locale.ENGLISH
                )
            return dateFormat.format(Date())
        }


    fun getWrittenMonthFromTimestamp(timestamp: String): String {
        val dateFormat =
            SimpleDateFormat(
                MONTH_DATE_FORMAT,
                Locale.ENGLISH
            )

        val date = dateFormat.parse(timestamp) ?: IllegalArgumentException("Invalid timestamp")

        val monthDateFormat =
            SimpleDateFormat(
                WRITTEN_MONTH_DATE_FORMAT,
                Locale.ENGLISH
            )

        return monthDateFormat.format(date)
    }
}
