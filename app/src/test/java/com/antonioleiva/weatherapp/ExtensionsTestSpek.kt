package com.antonioleiva.weatherapp

import com.antonioleiva.weatherapp.extensions.toDateString
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import java.text.DateFormat
import java.util.Locale
import kotlin.test.assertEquals

object ExtensionsTestSpek: Spek({
    given("an extension utils class") {

        val rawDate = 1445275635000L

        on("date format test with default locale") {
            val defaultLocale = Locale.US

            it("should properly do a full date format") {
                assertEquals("Monday, October 19, 2015", rawDate.toDateString(DateFormat.FULL, defaultLocale))
            }

            it("should properly do a long date format") {
                assertEquals("October 19, 2015", rawDate.toDateString(DateFormat.LONG, defaultLocale))
            }

            it("should properly do a medium date format") {
                assertEquals("Oct 19, 2015", rawDate.toDateString(DateFormat.MEDIUM, defaultLocale))
            }

            it("should properly do a short date format") {
                assertEquals("10/19/15", rawDate.toDateString(DateFormat.SHORT, defaultLocale))
            }

            it("should properly do a default (medium) date format") {
                assertEquals("Oct 19, 2015", rawDate.toDateString(locale = defaultLocale))
            }

        }

        on("date format test with spanish locale") {
            val spanishLocale = Locale("es", "ES")

            it("should properly do a date format") {
                assertEquals("19-oct-2015", rawDate.toDateString(locale = spanishLocale))
            }

        }
    }
})