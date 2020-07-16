package com.bittencourt.unittesting.util

import com.bittencourt.unittesting.util.DateUtil.currentMonthYearTimeStamp
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class DateUtilTest {

    private val todayYearMonth = "07-2020"

    @Test
    internal fun getTodayTimestamp_returnedTodayTimestamp() {
        assertDoesNotThrow {
            assertEquals(todayYearMonth, currentMonthYearTimeStamp)
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["01"])
    internal fun getNameMonth_01_Jan(month: String) {
        assertEquals(DateUtil.getWrittenMonthFromTimestamp(month), "Jan")
    }

    @ParameterizedTest
    @ValueSource(strings = ["12"])
    internal fun getNameMonth_12_Dec(month: String) {
        assertEquals(DateUtil.getWrittenMonthFromTimestamp(month), "Dec")
    }

}