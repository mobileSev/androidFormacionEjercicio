import com.google.gson.annotations.SerializedName


data class Api (

	@SerializedName("status") val status : Int,
	@SerializedName("message") val message : String,
	@SerializedName("results") val results : Int,
	@SerializedName("filters") val filters : List<String>,
	@SerializedName("teams") val teams : List<Teams>
)