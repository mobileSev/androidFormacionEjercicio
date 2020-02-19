import com.google.gson.annotations.SerializedName


data class Teams (

	@SerializedName("city") val city : String,
	@SerializedName("fullName") val fullName : String,
	@SerializedName("teamId") val teamId : Int,
	@SerializedName("nickname") val nickname : String,
	@SerializedName("logo") val logo : String,
	@SerializedName("shortName") val shortName : String,
	@SerializedName("allStar") val allStar : Int,
	@SerializedName("nbaFranchise") val nbaFranchise : Int,
	@SerializedName("leagues") val leagues : Leagues
)