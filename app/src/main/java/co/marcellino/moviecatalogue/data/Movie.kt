package co.marcellino.moviecatalogue.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val title: String = "",
    val year: String = "",

    val posterPath: String = "",
    val rating: String = "",

    val runtime: String = "",
    val genre: String = "",
    val plot: String = "",

    val director: String = "",
    val writer: String = "",
    val actors: String = "",
    val awards: String = ""
) : Parcelable {

    fun isEmpty(): Boolean = (title == "")
}