package at.fh.swengb.redjaian

import com.squareup.moshi.JsonClass

@JsonClass (generateAdapter = true)
class AuthResponse(val token: String) {
}